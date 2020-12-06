package grigorev.mikhail;

import grigorev.mikhail.data.DrinkFactory;
import grigorev.mikhail.data.entity.Beer;
import grigorev.mikhail.data.entity.Cider;
import grigorev.mikhail.services.DrinkManager;

public class Main {

    public static void main(String[] args) {
        DrinkManager drinkManager = new DrinkManager();
        DrinkFactory drinkFactory = drinkManager.getFactory();
        Beer favoriteBeer = drinkManager.getFavoriteBeer(drinkFactory);
        Cider favoriteCider = drinkManager.getFavoriteCider(drinkFactory);
        System.out.println("Favorite beer: " + favoriteBeer.getComposition());
        System.out.println("Favorite cider: " + favoriteCider.getComposition());
    }
}
