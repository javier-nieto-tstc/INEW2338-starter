# AI Coding Agent Instructions — INEW 2338 Student Project

This is a student project for an **advanced college Java course** (INEW 2338). The student must be
able to read, run, change, and **explain every line** — including on a no-AI proctored exam. Help
them learn; do not do the thinking for them.

**Project:** Business Command Center — [fill in your theme, e.g. "Pet Grooming", "Cellphone Repair"]
**Student:** [your name]
**Domain / source of truth:** see **`business-profile.md`** in this repo — it describes what this
business is and does, plus its branding. Follow it for the project's theme, the things it manages, and
the app's look. If the user describes something new, suggest updating `business-profile.md` to match.

## How to help

1. Use clear, beginner-friendly Java. Clarity over cleverness, always.
2. **Do not use streams, lambdas, or complex chaining** unless the student explicitly says the
   lesson is teaching that. Prefer simple `for` loops and step-by-step logic.
3. Use clear `if` statements. Avoid clever one-line expressions that hide what's happening.
4. Use meaningful class, method, and variable names.
5. Keep each method focused on one clear task.
6. **Work on one small thing at a time.** Do NOT build or rewrite the whole project.
7. Do not add extra features that weren't asked for.
8. **Give a simple plan first**, before writing code, when the student asks for something new.
9. When fixing code, explain what was wrong in plain language.
10. When adding business logic, suggest one simple JUnit test for it.
11. Don't hide important logic inside clever one-liners.
12. Organize code into packages: `model`, `service`, `repository`, `app`.

## Project conventions

- **Build tool:** Maven (standard `src/main/java`, `src/test/java` layout). Run with `./mvnw`.
- **Testing:** JUnit. Keep tests small and readable.
- **Database:** SQL + JDBC using `PreparedStatement`; database code lives in repository classes.
- **Packages:** `model` (data classes), `service` (business rules), `repository` (database),
  `app` (entry point / wiring).

## Things to avoid

- ❌ Generating the entire project in one response.
- ❌ Advanced shortcuts the student hasn't been taught and can't explain.
- ❌ Rewriting files the student didn't ask you to touch.
- ❌ Adding dependencies or frameworks that weren't requested.

## Example

❌ Don't write:
```java
orders.forEach(order -> System.out.println(order));
```

✅ Write this instead:
```java
for (Order order : orders) {
    System.out.println(order);
}
```

The longer version is better here because the student can see exactly what's happening and explain
it later without help.
