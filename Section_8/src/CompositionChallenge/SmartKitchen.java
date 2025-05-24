package CompositionChallenge;

public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag ,
                                boolean dishWasherFlag) {
        brewMaster.setHasWordToDo(coffeeFlag);
        iceBox.setHasWordToDo(fridgeFlag);
        dishWasher.setHasWordToDo(dishWasherFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}

class CoffeeMaker {
    private boolean hasWordToDo;

    public void setHasWordToDo(boolean hasWordToDo) {
        this.hasWordToDo = hasWordToDo;
    }

    public void brewCoffee() {
        if (hasWordToDo) {
            System.out.println("Brewing Coffee");
            hasWordToDo = false;
        }
    }
}

class Refrigerator {

    private boolean hasWordToDo;

    public void setHasWordToDo(boolean hasWordToDo) {
        this.hasWordToDo = hasWordToDo;
    }

    public void orderFood() {
        if (hasWordToDo) {
            System.out.println("Brewing Refrigerator");
            hasWordToDo = false;
        }
    }
}

class DishWasher {

    private boolean hasWordToDo;

    public void setHasWordToDo(boolean hasWordToDo) {
        this.hasWordToDo = hasWordToDo;
    }

    public void doDishes() {
        if (hasWordToDo) {
            System.out.println("Washing Dishes");
            hasWordToDo = false;
        }
    }
}