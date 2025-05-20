# Bill's Burger Challenge 🍔

A Java implementation of a fast-food restaurant management system for burger meals, following Object-Oriented Programming principles.

## Table of Contents
- [Class Hierarchy](#class-hierarchy)
- [Design Overview](#design-overview)
- [Features](#features)
- [Usage](#usage)
- [Example Output](#example-output)
- [Key Design Patterns](#key-design-patterns)
- [Improvement Ideas](#improvement-ideas)

## Class Hierarchy

BillsBurgerChallenge
│
├── Item (Base Class)
│
├── Burger (extends Item)
│   └── DeluxeBurger (extends Burger)
│
├── MealOrder (Composition)
│
└── Main (Entry Point)



## Design Overview

The system models a burger restaurant with:
- **Base Item class**: Handles common properties for all items
- **Burger hierarchy**: Regular (3 toppings) and Deluxe (5 toppings) variants
- **Meal composition**: Combines burger, drink, and side items
- **Flexible pricing**: Size adjustments and topping costs

## Features

✔ Create custom burger meals with toppings  
✔ Size-based pricing for drinks  
✔ Deluxe burgers with fixed pricing (free toppings)  
✔ Detailed itemized receipts  
✔ Default and custom meal constructors  

## Usage

1. **Create a default meal**:
```java
MealOrder regularMeal = new MealOrder();
regularMeal.addBurgerToppings("CORN", "CHEESE", "MAYO");
regularMeal.setDrinkSize("LARGE");
regularMeal.printItemizedList();

2. **Create a custom meal**:
```java
MealOrder customMeal = new MealOrder("turkey", "7-up", "chili");
customMeal.addBurgerToppings("LETTUCE", "PICKLES", "KETCHUP");


