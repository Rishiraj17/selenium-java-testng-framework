## Project Context (Days 1–5)

Goal:
Build a clean, interview-ready Selenium + Java + TestNG automation framework
with strong fundamentals and explainable design decisions.

Constraints:
- No GitHub access on work laptop
- IntelliJ bundled Maven used (no system Maven)
- Focus on correctness and understanding, not speed

## Day-wise Summary

Day 1:
- Created Maven project using IntelliJ
- Configured Java version compatibility (JDK 24, compile to Java 11)

Day 2:
- Added Selenium, TestNG, WebDriverManager dependencies
- Faced Selenium BOM resolution issue and fixed it by using direct dependencies

Day 3:
- Designed basic project structure (base, tests, utils)
- Understood purpose of each package

Day 4:
- Implemented BaseTest with browser setup and teardown
- Integrated TestNG lifecycle annotations
- Executed first successful test using testng.xml

Day 5:
- Reconstructed Days 1–4 on personal laptop
- Initialized Git repository
- Created proper .gitignore
- Created baseline commit

## Key Technical Decisions

1. Used Selenium with Java instead of low-code tools
    - Reason: Industry standard, interview-friendly, long-term value

2. Did not use Selenium BOM
    - Reason: BOM caused dependency resolution issues
    - Direct dependencies gave better control and stability

3. Used WebDriverManager
    - Reason: Avoid manual driver management
    - Keeps framework clean and modern

4. Used TestNG instead of JUnit
    - Reason: Better lifecycle control, XML configuration, industry usage

5. Used IntelliJ bundled Maven
    - Reason: Avoid system-level dependency issues
    - Works in restricted corporate environments

## Issues Faced and Fixes

### Issue 1: Selenium BOM dependency error
Problem:
- Maven could not resolve selenium-bom dependency

Root Cause:
- Incorrect usage of BOM without proper dependencyManagement setup

Fix:
- Removed BOM
- Used direct selenium-java dependency with fixed version

Learning:
- BOMs are optional and require correct configuration

### Issue 2: mvn command not found
Problem:
- mvn test failed in Git Bash and IntelliJ terminal

Root Cause:
- Maven not installed system-wide
- IntelliJ uses bundled Maven internally

Fix:
- Used IntelliJ Maven tool window to run lifecycle goals

Learning:
- IDE-bundled tools behave differently from system tools
- This is common in enterprise setups

### Issue 3: SLF4J and CDP warnings
Problem:
- SLF4J logger warning
- Chrome DevTools Protocol version mismatch warning

Root Cause:
- No logging implementation configured
- Chrome version ahead of Selenium devtools mapping

Fix:
- No immediate fix applied (warnings are non-blocking)

Learning:
- Not all warnings require action
- Fix only when there is a real use case

## Folder Structure (After Day 5)

selenium-framework/
├── docs/
│   └── week-1/
│       └── day-1-to-5-foundation.md
├── src/
│   └── test/
│       └── java/
│           ├── base/
│           │   └── BaseTest.java
│           └── tests/
│               └── SmokeTest.java
├── pom.xml
├── testng.xml
└── .gitignore

## What This Phase Demonstrates

- Understanding of Selenium + TestNG fundamentals
- Ability to debug Maven and environment issues
- Clean project structuring
- Discipline in version control
- Focus on explainability over shortcuts