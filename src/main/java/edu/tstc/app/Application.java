package edu.tstc.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This is the entry point of your app. Running it starts a small web server,
// and your welcome page (src/main/resources/static/index.html) shows up at
// http://localhost:8080. You'll add real features to this project as the
// course goes on.
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
