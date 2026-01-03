# Selenium Automation Framework (Java + TestNG)

A clean, interview-ready Selenium automation framework built using Java,
TestNG, and Page Object Model, demonstrating real-world testing practices
and complete authentication workflow automation.

---

## Why This Project?

This project was built to demonstrate how a scalable and maintainable
UI automation framework is designed in real-world scenarios.

The focus is not on maximum test coverage, but on:
- Clean architecture
- Correct responsibility separation
- Explainable design decisions
- Real application testing (not demo sites)

---

## Tech Stack

- Java
- Selenium 4
- TestNG
- Maven
- WebDriverManager
- IntelliJ IDEA
---

## Framework Structure

src/test/java
- base      → Test lifecycle and browser setup/teardown
- pages     → Page Object Model (UI behavior & page state)
- tests     → Business-level test validations
- utils     → Configuration handling

docs/
- architecture → Design decisions and framework evolution
---

## Design Principles

- Page Object Model (POM) introduced only when duplication appeared
- Explicit waits used instead of implicit waits
- Tests validate behavior, not UI mechanics
- Each page owns its own readiness and interactions
- No premature abstractions (e.g., BasePage avoided intentionally)
---

## Test Coverage

### Authentication Workflow
- Valid login (positive scenario)
- Invalid login (negative scenario)
- Dashboard validation after login
- Logout flow and session termination
- The project focuses on critical flows rather than exhaustive edge-case coverage.
Remaining scenarios are documented as future enhancements.

---

## What This Project Demonstrates

- Building an automation framework from scratch
- Applying Page Object Model correctly
- Handling synchronization using explicit waits
- Designing multi-page workflows
- Writing clean, readable, and maintainable tests
- Making justified design trade-offs
---

## Future Enhancements

- Additional negative login scenarios (empty username/password)
- Test grouping (smoke vs regression)
- Logging integration
- Parallel execution support


