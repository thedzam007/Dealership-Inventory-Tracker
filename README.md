# Dealership Inventory Tracker

A Java console application that collects car details from user input and
manages them as an inventory using encapsulated objects.

## What It Does

The program prompts the user to enter details (make, model, year, price)
for a set number of cars, stores each as a `Car` object, and then displays
the full inventory back in a clean, formatted report.

## Key Concepts Demonstrated

- **Encapsulation** — all `Car` fields are private, with public getters and
  setters controlling access.
- **Object modeling** — real-world entities (cars) are represented as
  structured objects rather than loose variables.
- **Arrays of objects** — the dealership's inventory is stored and looped
  over as an array of `Car` objects.
- **User input handling** — uses `Scanner` to collect and parse multiple
  data types (String, int, double) from console input.

## Files

| File | Purpose |
|---|---|
| `Car.java` | Represents a single car with fields, getters, and setters |
| `Dealership.java` | Main class — collects input and displays the inventory |

## How to Run

```bash
javac *.java
java Dealership
```

You'll be prompted to enter the make, model, year, and price for each car,
then the program prints a formatted summary of the full inventory.

## Sample Output

```
===== Dealership Inventory =====
----- Car Info -----
Make:  Toyota
Model: Camry
Year:  2022
Price: $24999.00
---------------------
```
