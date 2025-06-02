package BillsBurgerChallenge;

public class Main {

    public static void main(String[] args) {

//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        System.out.println("=".repeat(60));
//
//        Item avocado = new Item("topping","avocado",1.5);
//        avocado.printItem();
//
//        System.out.println("=".repeat(60));
//
//        Burger burger = new Burger("regular",4.00);
//        burger.addToppings("CORN", "CHEESE", "MAYO");
//        burger.printItem();
//
//        System.out.println("=".repeat(60));


//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("CORN", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();


//        MealOrder secondMeal = new MealOrder("turkey", "7-up",
//                "chili");
//        secondMeal.addBurgerToppings("LETTUCE", "CHEESE", "MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();
        // deluxe Meal
        MealOrder deluxeMeal = new MealOrder("deluxe", "7-up", "chili");
        deluxeMeal.addBurgerToppings("AVOCADO", "CORN", "LETTUCE",
                "CHEESE", "MAYO");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();

        // Custom Meal
//        MealOrder customMeal = new MealOrder("custom", "iced tea", "coleslaw");
//        customMeal.addBurgerToppings("LETTUCE", "TOMATO", "MAYO");
//        customMeal.printItemizedList();

        // regular Meal
//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("CORN", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();
    }

}
