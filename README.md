# Avaj Launcher

Avaj Launcher is a Java project designed as an introduction to object-oriented programming (OOP).  
It aims to simulate aircraft flights according to predefined scenarios while applying UML diagrams and design patterns such as **Observer**, **Singleton**, and **Factory**.

## Table of Contents

- [Description](#description)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Scenarios](#scenarios)
- [UML Diagrams](#uml-diagrams)
- [Design Patterns](#design-patterns)
- [Contributing](#contributing)
- [License](#license)

## Description

This project demonstrates the application of OOP principles through the simulation of aircraft flights.  
Classes are organized to represent different types of aircraft, their states, and interactions, following solid object-oriented design principles.

## Prerequisites

- Java 8 or higher
- A Java-compatible IDE or text editor (e.g., IntelliJ IDEA, Eclipse, NetBeans)
- Terminal or command prompt

## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/cypri1-dev/avaj_launcher.git
   cd avaj_launcher
   ```
2. **Compile the project:**
   ```bash
    make
    ```

## Project Structure

The project is organized as follow:
```bash
avaj_launcher/
├── mypackage/              # Contains Java classes
├── sources/                # Compiled source code
├── .gitignore              # Git ignore file
├── Makefile                # Build instructions
├── README.md               # This file
├── empty_scenario.txt      # Example empty scenario
├── scenario.txt            # Simulation scenario
└── simulation.txt          # Simulation results
```
## Usage

To run the project, follow the installation steps above and launch the main class.
The program reads the scenario.txt file to simulate aircraft flights and writes the results to simulation.txt.
 ```bash
 java sources.Simulator scenario.txt
 ```
## Scenarios

The scenario.txt file contains instructions for the simulation.
Each line defines an aircraft to be created and flown according to the scenario.

Example:
```bash
25
Baloon B1 2 3 20
Baloon B2 1 8 66
JetPlane J1 23 44 32
Helicopter H1 654 33 20
Helicopter H2 22 33 44
Helicopter H3 98 68 99
Baloon B3 102 22 34
JetPlane J2 11 99 68
Helicopter H4 223 23 54
```

## UML Diagrams

UML diagrams illustrate the class structure and interactions, showing the system architecture and relationships between entities.
