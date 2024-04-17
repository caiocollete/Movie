package com.caiocollete.modules;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class HTMLGenerator {
        private PrintWriter writer = new PrintWriter(System.out);
        private final String head =
            """
            <head>
                <lan
                <link rel="stylesheet" href="style.css">
                <meta charset="utf-8">
                <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
                <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"\s
                    + "integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
                <style>
                    .inline-cards {
                        display: flex;
                        flex-wrap: wrap;
                        justify-content: center; /* Alinha os cards ao centro */
                    }
        
                    .inline-cards .card {
                        flex: 0 0 auto; /* Tamanho flexível, não cresce nem encolhe */
                        margin: 10px; /* Espaçamento entre os cards */
                    }
                </style>
                <title>TOP 100 MOVIES</title>
            </head>
            <body>
                <div class="inline-cards">
            """;
        private final String divTemplate=
            """
                    <div class="card text-white bg-dark mb-3" style="max-width: 18rem;">
                        <h4 class="card-header">%s</h4>
                        <div class="card-body">
                            <img class="card-img" src="%s" alt="%s">
                            <p class="card-text mt-2">Nota: %s - Ano: %s</p>
                        </div>
                    </div>
            """;
        private final String endsBody=
            """
                </div>
            </body>
            """;

    public HTMLGenerator(PrintWriter writer) {
        this.writer=writer;
    }

    // Methods
    public void generate(List<Movie> movie){
        writer.println(head);
        for(Movie element : movie){
            writer.printf((divTemplate) + "%n", element.getTitle(), element.getImg(), element.getTitle(), element.getRating(), element.getYear());
        }
        writer.println(endsBody);
    }

    public static void generatePage(List<Movie> movies){
        try (PrintWriter writer = new PrintWriter(new FileWriter("index.html"))) {
            // Gerar a página HTML
            HTMLGenerator htmlGenerator = new HTMLGenerator(writer);
            htmlGenerator.generate(movies);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
