# Business Command Center — Starter

This is your starting point for the INEW 2338 project. Right now it's a tiny web app with a welcome
page. Over the course, **you'll turn it into your own themed Business Command Center** (auto shop, pet
grooming, cellphone repair, tutoring center — your choice) and deploy it to a live URL.

## Run it

You do **not** need to install Maven — this project includes the Maven Wrapper (`mvnw`).

```
./mvnw spring-boot:run
```

Then open **http://localhost:8080** — you should see the welcome page. Stop the server with `Ctrl+C`.

> Prefer buttons? In VS Code (with the Extension Pack for Java installed), open
> `src/main/java/edu/tstc/app/Application.java` and click **▶ Run** above `main`, or use the
> **Spring Boot Dashboard**.

## Where things live

- `pom.xml` — Maven + Spring Boot settings (Java version, dependencies).
- `mvnw` / `mvnw.cmd` — the Maven Wrapper (so you don't install Maven).
- `src/main/java/edu/tstc/app/Application.java` — starts the app.
- `src/main/resources/static/index.html` — the page you see in the browser.
- `AGENTS.md` — tells your AI agent how to help (open it and fill in your name + theme).

## Next

Head back to the course and follow **Module 1**. Build one piece at a time, with your agent, and
commit your progress to GitHub as you go.
