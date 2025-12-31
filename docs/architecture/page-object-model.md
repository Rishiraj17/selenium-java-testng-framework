# Page Object Model (POM)

## Context
As real application flows were introduced (OrangeHRM login),
test classes started containing UI locators and interaction logic.
This led to tight coupling and reduced readability.

## Problem Observed
- Locator duplication across tests
- Tests knowing too much about UI structure
- Reduced readability as flows grew

## Decision
Introduced Page Object Model to:
- Separate business intent from UI implementation
- Centralize locators and actions
- Improve maintainability and scalability

## Implementation
- Created a `pages` package
- Introduced `LoginPage` as the first page object
- Moved locators, actions, and page readiness logic into the page
- Tests now interact with pages via meaningful methods

## Outcome
- Tests read like business flows
- UI changes are isolated to page classes
- Framework is prepared for multi-page workflows
