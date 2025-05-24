package CompositionChallenge;

public class Main {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWordToDo(true);
//        kitchen.getIceBox().setHasWordToDo(true);
//        kitchen.getBrewMaster().setHasWordToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();
    }
}
