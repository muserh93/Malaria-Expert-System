# Malaria Expert System

A JavaFX-based expert system that checks malaria likelihood based on symptoms.

## Features
- GUI using JavaFX
- Modular design
- Exception handling
- Assertions
- Javadoc documentation

## How it works
The system asks users for symptoms and infers whether malaria is likely.
Malaria Expert System

A JavaFX GUI application that diagnoses the likelihood of malaria based on symptoms selected by the user.

Group Information

Group 7

S/N| Name.                 |RegistrationNumber
 1| Anas Kurashiyyu.        | CIS/STE/23/1067
 2| Ahmad Nasir.            | CIS/STE/23/1069
 3| Muhammad Aliyu Ahmad.   | CIS/STE/23/1071
 4| Sadiq Hamza Abbas.      | CIS/STE/23/1072
 5| Abdulsalam Maru Muhammad| CIS/STE/23/1073
 6| Sulaiman Usman.         | CIS/STE/23/1074
 7| Musa Hassan Musa.       | CIS/STE/23/1075
 8| Abubakar Sadiq Ahmad.   | CIS/STE/23/1076
 9| Abubakar Turare Muhammed| CIS/STE/23/1077
10| Umar Mikha'il. Idris    | CIS/STE/23/1078

---

Features

Feature| Description
JavaFX GUI| Provides a graphical user interface for users to interact with the system
Expert System Logic| Uses rule-based reasoning to determine the likelihood of malaria
Exception Handling| Handles invalid user inputs and prevents program crashes
Assertions| Ensures program correctness through runtime checks
JavaDoc Documentation| Provides complete documentation for classes and methods
Modular Design| Organized into separate classes with specific responsibilities

---

Symptoms Used

Symptom No.| Symptom
1| Fever
2| Headache
3| Chills
4| Fatigue
5| Nausea
6| Sweating

---

System Diagnosis Rules

Symptom Score| Diagnosis
5 - 6| High Possibility of Malaria
3 - 4| Moderate Possibility of Malaria
0 - 2| Low Possibility of Malaria

---

Project Structure

Malaria-Expert-System/
│
├── src/
│   └── malaria/
│       ├── Main.java
│       ├── App.java
│       ├── DiagnosisEngine.java
│       └── UserInputValidator.java
│
├── docs/
├── README.md
├── LICENSE
└── .gitignore

Requirements

- Java JDK 17 or higher
- JavaFX SDK
- Visual Studio Code

Running the Application

1. Clone the repository.
2. Open the project in Visual Studio Code.
3. Configure JavaFX SDK.
4. Run "Main.java".
5. Select symptoms and click Diagnose.

Documentation

Generate JavaDoc using:

javadoc -d docs src/malaria/*.java

The generated documentation will be available in the "docs" folder.

License

This project is licensed under the MIT License.

Repository

https://github.com/muserh93/Malaria-Expert-System
