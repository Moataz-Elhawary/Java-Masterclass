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
               

Key Relationships

Class	        Extends	           Contains(Composition)	                     Key Methods
Item	          -	                        -	                          getAdjustedPrice(),printItem()
Burger	         Item	             3x Item (toppings)	                 addToppings(),printItemizedList()
DeluxeBurger	Burger	           2x Item (extra toppings)	             Overrides addToppings() (5 toppings)
MealOrder	      -	               Burger,Item (drink/side)	             getTotalPrice(), printItemizedList()
Main	          -	                        -	                                 main() (demo usage)


Key Features:

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
		 

Flow of Control :

1. Meal Creation

     MealOrder constructs a Burger (or DeluxeBurger), Drink, and Side.

     Toppings are added via addBurgerToppings().

2. Pricing

     getAdjustedPrice() in Item adjusts for size (SMALL/LARGE).

     getTotalPrice() in MealOrder sums items (unless DeluxeBurger).

3. Output

     printItemizedList() shows itemized breakdown + total.
	 
	 