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

---

## Negative Login Validation

### Scenario Covered
- Invalid password login attempt
- Expected behavior: login fails with error message

### Design Decisions
- Negative validation logic is implemented via Page Object methods
- Error message locator and wait logic reside inside LoginPage
- Test asserts only the business outcome, not UI mechanics

### Why This Matters
- Verifies system behavior under incorrect input
- Improves confidence beyond happy-path testing
- Demonstrates correct assertion strategy for failure cases

---

## Dashboard Page Validation

### Objective
Verify that a successful login results in a valid dashboard state,
not just a URL change.

### Implementation
- Introduced `DashboardPage` as a separate Page Object
- Defined dashboard readiness using a unique UI identifier
- Moved post-login validation logic out of tests

### Why This Matters
- Confirms application state, not navigation alone
- Demonstrates multi-page workflow automation
- Strengthens Page Object Model scalability

---

## Logout Flow (Authentication Lifecycle Completion)

### Objective
Verify that a logged-in user can successfully log out
and is redirected back to the login page.

### Implementation
- Logout behavior implemented inside DashboardPage
- User dropdown interaction handled at page level
- LoginPage reused for post-logout validation

### Why This Matters
- Completes full authentication lifecycle (login → dashboard → logout)
- Demonstrates clean page responsibility boundaries
- Shows real-world workflow automation, not isolated tests

