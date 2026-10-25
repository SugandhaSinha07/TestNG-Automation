# TestNG Automation

A Java + TestNG practice project that demonstrates the core TestNG features used in real-world test automation frameworks: annotations, suite configuration through XML, parameterization, data-driven testing, groups and listeners.

## Tech Stack

- Java
- TestNG
- Eclipse IDE

## Features Covered

| Feature | Where |
|---|---|
| Lifecycle annotations (`@BeforeSuite`, `@BeforeClass`, `@AfterClass`, `@AfterTest`, `@AfterSuite`) | `Day1.java`, `Day3.java` |
| Test groups (`groups = {"Smoke"}`) | `Day2.java`, `day4.java` |
| Parameterization from XML (`@Parameters`) | `Day3.java`, `day4.java` |
| Data-driven testing (`@DataProvider`) | `Day3.java` |
| Disabling tests (`enabled = false`) | `Day3.java` |
| Assertions (`Assert`) | `Day3.java` |
| Custom listener (`ITestListener`) to log pass/fail results | `Listeners.java` |

## Project Structure

```
TestNG-Automation
├── src/test
│   ├── Day1.java        # Lifecycle annotations
│   ├── Day2.java        # Smoke group test
│   ├── Day3.java        # Parameters, DataProvider, assertions
│   ├── day4.java        # Parameters and groups
│   └── Listeners.java   # ITestListener implementation
├── testng.xml           # Suite with listeners, parameters and multiple tests
├── testng2.xml          # Runs every class in the "test" package
└── testng3.xml          # Regression run that excludes the Smoke group
```

## Test Suites

- **testng.xml**: "Loan Department" suite with two tests (Personal Loan, Car Loan), suite- and test-level parameters, and the custom listener.
- **testng2.xml**: runs all tests in the `test` package.
- **testng3.xml**: regression run across all classes, excluding the `Smoke` group.

## How to Run

1. Clone the repository:
   `git clone https://github.com/SugandhaSinha07/TestNG-Automation.git`
2. Import it into Eclipse (File → Import → Existing Projects into Workspace).
3. Make sure the TestNG plugin/library is installed.
4. Right-click any `testng*.xml` file → **Run As → TestNG Suite**.

Reports are generated in the `test-output/` folder after each run (excluded from Git).

## Author

**Sugandha Sinha**, QA Automation & Performance Engineer
