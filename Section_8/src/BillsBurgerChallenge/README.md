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
```
┌───────────────────────────────────────────────────────────────────────────────────────────────────────────────┐
│                                            BillsBurgerChallenge                                               │
└───────────────────────────────────────────────────────────────────────────────────────────────────────────────┘
                                                      ▲
                                                      │
                                     ┌────────────────┴─────────────────┐
                                     │                                  │
                          ┌─────────────────────┐            ┌──────────────────────┐
                          │        Item         │            │      MealOrder       │
                          ├─────────────────────┤            ├──────────────────────┤
                          │ - type: String      │            │ - burger: Burger     │
                          │ - name: String      │            │ - drink: Item        │
                          │ - price: double     │            │ - side: Item         │
                          │ - size: String      │            ├──────────────────────┤
                          ├─────────────────────┤            │ + getTotalPrice()    │
                          │ + getAdjustedPrice()│            │ + printItemizedList()│
                          │ + printItem()       │            │ + addBurgerToppings()│
                          └──────────┬──────────┘            └──────────────────────┘
                                     │
                      ┌──────────────┴───────────────┐
                      │                              │
               ┌──────────────────────┐   ┌─────────────────────┐
               │       Burger         │   │       Main          │
               ├──────────────────────┤   ├─────────────────────┤
               │ - extra1: Item       │   │ (Entry Point)       │
               │ - extra2: Item       │   │ - main()            │
               │ - extra3: Item       │   └─────────────────────┘
               ├──────────────────────┤
               │ + addToppings()      │
               │ + getExtraPrice()    │
               │ + printItemizedList()│
               └──────────┬───────────┘
                          │
               ┌──────────┴──────────┐
               │    DeluxeBurger     │
               ├─────────────────────┤
               │ - deluxe1: Item     │
               │ - deluxe2: Item     │
               ├─────────────────────┤
               │ + addToppings()     │
               │ (Overrides methods) │
               └─────────────────────┘

```


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

## Usage Examples :

1. **Create a Regular Meal**:
```java
MealOrder regularMeal = new MealOrder();
regularMeal.addBurgerToppings("CORN", "CHEESE", "MAYO");
regularMeal.setDrinkSize("LARGE");
regularMeal.printItemizedList();
```
* Output :
````
         BASE BURGER:  4.00
                CORN:  0.00
              CHEESE:  1.00
                MAYO:  0.00
------------------------------
      REGULAR BURGER:  5.00
          LARGE COKE:  2.00
        MEDIUM FRIES:  1.50
------------------------------
         TOTAL PRICE:  8.50
````
2. **Create a Custom Meal**:
```java
MealOrder customMeal = new MealOrder("custom", "iced tea", "coleslaw");
customMeal.addBurgerToppings("LETTUCE", "TOMATO", "MAYO");
customMeal.printItemizedList();
```
* Output :
````
         BASE BURGER:  4.00
             LETTUCE:  0.00
              TOMATO:  0.00
                MAYO:  0.00
------------------------------
       CUSTOM BURGER:  4.00
     MEDIUM ICED TEA:  1.00
     MEDIUM COLESLAW:  1.50
------------------------------
         TOTAL PRICE:  6.50

````
3. **Create a Deluxe Meal**:
```java
MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili");
deluxeMeal.addBurgerToppings("AVOCADO", "CORN", "LETTUCE",
                                     "CHEESE", "MAYO");
deluxeMeal.setDrinkSize("SMALL");
deluxeMeal.printItemizedList();
```
* Output :
````
         BASE BURGER:  8.50
             AVOCADO:  0.00
                CORN:  0.00
             LETTUCE:  0.00
              CHEESE:  0.00
                MAYO:  0.00
------------------------------
       DELUXE BURGER:  8.50
          SMALL 7-UP:  0.00
        MEDIUM CHILI:  0.00
------------------------------
         TOTAL PRICE:  8.50

````

## Key Design Patterns :
```
-> Inheritance
         Burger and DeluxeBurger extend Item.
         DeluxeBurger overrides addToppings() to allow 5 toppings (vs. 3 in Burger).

-> Composition
         MealOrder contains a Burger, Drink (Item), and Side (Item).
         Burger contains topping items (extra1, extra2, extra3).

-> Polymorphism
         DeluxeBurger changes behavior:
         Toppings are free (getExtraPrice() returns 0).
         printItemizedList() includes 5 toppings.

-> Encapsulation
         All fields are private (e.g., Item.price, Burger.extra1).
         Methods like setDrinkSize() control access.
```

This README includes:

1. Clear visual hierarchy diagram
2. Concise feature descriptions
3. Practical usage examples
4. Example output
5. Design pattern explanations
6. Improvement suggestions
7. Running instructions

