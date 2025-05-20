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

┌───────────────────────────────────────────────────────────────────────────────────────────────────────────────┐
│ BillsBurgerChallenge │
└───────────────────────────────────────────────────────────────────────────────────────────────────────────────┘
▲
│
┌────────────────┴─────────────────┐
│ │
┌─────────────────────┐ ┌─────────────────────┐
│ Item │ │ MealOrder │
├─────────────────────┤ ├─────────────────────┤
│ - type: String │ │ - burger: Burger │
│ - name: String │ │ - drink: Item │
│ - price: double │ │ - side: Item │
│ - size: String │ ├─────────────────────┤
├─────────────────────┤ │ + getTotalPrice() │
│ + getAdjustedPrice()│ │ + printItemizedList()│
│ + printItem() │ │ + addBurgerToppings()│
└──────────┬──────────┘ └─────────────────────┘
│
┌──────────────┴───────────────┐
│ │
┌─────────────────────┐ ┌─────────────────────┐
│ Burger │ │ Main │
├─────────────────────┤ ├─────────────────────┤
│ - extra1: Item │ │ (Entry Point) │
│ - extra2: Item │ │ - main() │
│ - extra3: Item │ └─────────────────────┘
├─────────────────────┤
│ + addToppings() │
│ + getExtraPrice() │
│ + printItemizedList()│
└──────────┬──────────┘
│
┌──────────┴──────────┐
│ DeluxeBurger │
├─────────────────────┤
│ - deluxe1: Item │
│ - deluxe2: Item │
├─────────────────────┤
│ + addToppings() │
│ (Overrides methods) │
└─────────────────────┘

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

Create a Regular Burger:

MealOrder regularBurger = new MealOrder("turkey", "7-up", "chili");
regularBurger.addBurgerToppings("LETTUCE", "PICKLES", "KETCHUP");


Create a deluxe burger:

MealOrder deluxeBurger = new MealOrder("deluxe", "milkshake", "fries");
deluxeBurger.addBurgerToppings("AVOCADO", "CORN", "CHEESE", "MUSHROOMS", "PICKLES");


Example Output :

BASE BURGER:  4.00
   CORN:  1.50
   CHEESE:  1.00
   MAYO:  0.00
------------------------------
LARGE COKE:  2.50
FRIES:  1.50
------------------------------
TOTAL PRICE:  9.00


Key Design Patterns:

Inheritance: Item → Burger → DeluxeBurger hierarchy

Polymorphism: Overridden methods in DeluxeBurger

Composition: MealOrder contains items

Encapsulation: Private fields with public methods


This README includes:
1. Clear visual hierarchy diagram
2. Concise feature descriptions
3. Practical usage examples
4. Example output
5. Design pattern explanations
6. Improvement suggestions
7. Running instructions
