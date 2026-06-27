package com.example.mycollections.controllers;

import com.example.mycollections.models.Movies;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MoviesController {

    private List<Movies> movies = new ArrayList<>() {{
        add(new Movies("Inception", "Christopher Nolan", 2010, 148));
        add(new Movies("Avatar", "James Cameron", 2009, 162));
        add(new Movies("The Dark Knight", "Christopher Nolan", 2008, 152));
    }};

    @GetMapping("/json")
    public List<Movies> getMovies() {
        return movies;
    }

    @GetMapping("/html")
    public String getMoviesHtml() {

        String html = """
                <html>
                    <body>
                        <h2>Movie Collection</h2>
                        <ul>
                """;

        for (Movies movie : movies) {
            html += "<li>"
                    + movie.getName()
                    + " directed by "
                    + movie.getDirector()
                    + " ("
                    + movie.getYear()
                    + "), Runtime: "
                    + movie.getRuntime()
                    + " minutes</li>";
        }

        html += """
                        </ul>
                    </body>
                </html>
                """;

        return html;
    }
}