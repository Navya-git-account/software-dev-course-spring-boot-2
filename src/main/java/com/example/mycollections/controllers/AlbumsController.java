package com.example.mycollections.controllers;

import com.example.mycollections.models.Albums;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/albums")
public class AlbumsController {

    private List<Albums> albums = new ArrayList<>() {{
        add(new Albums("Thriller", "Michael Jackson", 1982, 9));
        add(new Albums("Back in Black", "AC/DC", 1980, 10));
        add(new Albums("25", "Adele", 2015, 11));
    }};

    @GetMapping("/json")
    public List<Albums> getAlbums() {
        return albums;
    }

    @GetMapping("/html")
    public String getAlbumsHtml() {

        String html = """
                <html>
                    <body>
                        <h2>Album Collection</h2>
                        <ul>
                """;

        for (Albums album : albums) {
            html += "<li>"
                    + album.getName()
                    + " by "
                    + album.getArtist()
                    + " ("
                    + album.getYear()
                    + "), Tracks: "
                    + album.getTracks()
                    + "</li>";
        }

        html += """
                        </ul>
                    </body>
                </html>
                """;

        return html;
    }
}
