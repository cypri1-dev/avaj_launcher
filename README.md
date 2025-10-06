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
![UML Diagram](doc/avaj_uml.png)

## Design Patterns

The project applies the following design patterns:
- Observer: For managing notifications between objects
- Singleton: To ensure a single instance of a class
- Factory: For creating objects without specifying the exact class

## Output example

scenario.txt example:
```bash
Tower says: Baloon#B1(1) registered to weather tower.
Tower says: Baloon#B2(2) registered to weather tower.
Tower says: JetPlane#J1(3) registered to weather tower.
Tower says: Helicopter#H1(4) registered to weather tower.
Tower says: Helicopter#H2(5) registered to weather tower.
Tower says: Helicopter#H3(6) registered to weather tower.
Tower says: Baloon#B3(7) registered to weather tower.
Tower says: JetPlane#J2(8) registered to weather tower.
Tower says: Helicopter#H4(9) registered to weather tower.
Baloon#B1(1): Can't see a thing... hope this isn't a mountain ahead!
Baloon#B1(1): It's snowing like crazy! Turning into a flying popsicle!
Baloon#B2(2): It's snowing like crazy! Turning into a flying popsicle!
JetPlane#J1(3): It's snowing like crazy! Turning into a flying popsicle!
Helicopter#H1(4): It's snowing like crazy! Turning into a flying popsicle!
Helicopter#H2(5): It's snowing like crazy! Turning into a flying popsicle!
Helicopter#H3(6): Can't see a thing... hope this isn't a mountain ahead!
Baloon#B3(7): Sun's blazing! Perfect day for a tan at 10,000 feet!
JetPlane#J2(8): Sun's blazing! Perfect day for a tan at 10,000 feet!
Helicopter#H4(9): It's pouring! Should've brought a bigger windshield wiper!
Baloon#B1(1): It's snowing like crazy! Turning into a flying popsicle!
Baloon#B1(1): Landed.
Tower says: Baloon#B1(1) unregistered from weather tower.
Baloon#B2(2): It's pouring! Should've brought a bigger windshield wiper!
JetPlane#J1(3): It's pouring! Should've brought a bigger windshield wiper!
Helicopter#H1(4): It's snowing like crazy! Turning into a flying popsicle!
Helicopter#H1(4): Landed.
Tower says: Helicopter#H1(4) unregistered from weather tower.
Helicopter#H2(5): It's snowing like crazy! Turning into a flying popsicle!
Helicopter#H3(6): Sun's blazing! Perfect day for a tan at 10,000 feet!
Baloon#B3(7): It's pouring! Should've brought a bigger windshield wiper!
JetPlane#J2(8): Sun's blazing! Perfect day for a tan at 10,000 feet!
Helicopter#H4(9): Can't see a thing... hope this isn't a mountain ahead!
Baloon#B2(2): It's snowing like crazy! Turning into a flying popsicle!
JetPlane#J1(3): Can't see a thing... hope this isn't a mountain ahead!
Helicopter#H2(5): It's snowing like crazy! Turning into a flying popsicle!
Helicopter#H3(6): Can't see a thing... hope this isn't a mountain ahead!
Baloon#B3(7): It's snowing like crazy! Turning into a flying popsicle!
JetPlane#J2(8): Sun's blazing! Perfect day for a tan at 10,000 feet!
Helicopter#H4(9): Sun's blazing! Perfect day for a tan at 10,000 feet!
Baloon#B2(2): It's pouring! Should've brought a bigger windshield wiper!
JetPlane#J1(3): Sun's blazing! Perfect day for a tan at 10,000 feet!
Helicopter#H2(5): It's snowing like crazy! Turning into a flying popsicle!
Helicopter#H2(5): Landed.
Tower says: Helicopter#H2(5) unregistered from weather tower.
Helicopter#H3(6): Sun's blazing! Perfect day for a tan at 10,000 feet!
Baloon#B3(7): It's pouring! Should've brought a bigger windshield wiper!
JetPlane#J2(8): Sun's blazing! Perfect day for a tan at 10,000 feet!
Helicopter#H4(9): Sun's blazing! Perfect day for a tan at 10,000 feet!
Baloon#B2(2): It's snowing like crazy! Turning into a flying popsicle!
JetPlane#J1(3): Sun's blazing! Perfect day for a tan at 10,000 feet!
Helicopter#H3(6): It's pouring! Should've brought a bigger windshield wiper!
Baloon#B3(7): It's snowing like crazy! Turning into a flying popsicle!
Baloon#B3(7): Landed.
Tower says: Baloon#B3(7) unregistered from weather tower.
JetPlane#J2(8): Sun's blazing! Perfect day for a tan at 10,000 feet!
Helicopter#H4(9): Sun's blazing! Perfect day for a tan at 10,000 feet!
Baloon#B2(2): It's pouring! Should've brought a bigger windshield wiper!
JetPlane#J1(3): Sun's blazing! Perfect day for a tan at 10,000 feet!
Helicopter#H3(6): Can't see a thing... hope this isn't a mountain ahead!
JetPlane#J2(8): Sun's blazing! Perfect day for a tan at 10,000 feet!
Helicopter#H4(9): Sun's blazing! Perfect day for a tan at 10,000 feet!
Baloon#B2(2): It's snowing like crazy! Turning into a flying popsicle!
Baloon#B2(2): Landed.
Tower says: Baloon#B2(2) unregistered from weather tower.
JetPlane#J1(3): Sun's blazing! Perfect day for a tan at 10,000 feet!
Helicopter#H3(6): Sun's blazing! Perfect day for a tan at 10,000 feet!
JetPlane#J2(8): Sun's blazing! Perfect day for a tan at 10,000 feet!
Helicopter#H4(9): Sun's blazing! Perfect day for a tan at 10,000 feet!
JetPlane#J1(3): Sun's blazing! Perfect day for a tan at 10,000 feet!
Helicopter#H3(6): It's pouring! Should've brought a bigger windshield wiper!
JetPlane#J2(8): Sun's blazing! Perfect day for a tan at 10,000 feet!
Helicopter#H4(9): Sun's blazing! Perfect day for a tan at 10,000 feet!
JetPlane#J1(3): Sun's blazing! Perfect day for a tan at 10,000 feet!
Helicopter#H3(6): Can't see a thing... hope this isn't a mountain ahead!
JetPlane#J2(8): Sun's blazing! Perfect day for a tan at 10,000 feet!
Helicopter#H4(9): Sun's blazing! Perfect day for a tan at 10,000 feet!
JetPlane#J1(3): Sun's blazing! Perfect day for a tan at 10,000 feet!
Helicopter#H3(6): Sun's blazing! Perfect day for a tan at 10,000 feet!
JetPlane#J2(8): Sun's blazing! Perfect day for a tan at 10,000 feet!
Helicopter#H4(9): Sun's blazing! Perfect day for a tan at 10,000 feet!
...
```

