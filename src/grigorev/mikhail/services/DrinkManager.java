package grigorev.mikhail.services;

import grigorev.mikhail.data.BalticaDrinkFactory;
import grigorev.mikhail.data.DrinkFactory;
import grigorev.mikhail.data.OchakovoDrinkFactory;
import grigorev.mikhail.data.ZhiguliDrinkFactory;
import grigorev.mikhail.data.entity.Beer;
import grigorev.mikhail.data.entity.Cider;
import grigorev.mikhail.data.entity.Kvass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DrinkManager {

    private DrinkFactory drinkFactory;

    public DrinkManager() {
        this.drinkFactory = getFactory();
    }

    public DrinkFactory getFactory() {
        try {
            Path path = Paths.get("src\\grigorev\\mikhail\\configuration.txt");

            String factory = Files.readAllLines(path).get(0);
            switch (factory.toLowerCase()) {
                case "baltica":
                    return new BalticaDrinkFactory();
                case "zhiguli":
                    return new ZhiguliDrinkFactory();
                case "ochakovo":
                    return new OchakovoDrinkFactory();
                default:
                    throw new RuntimeException("There is no factory");
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public Beer getFavoriteBeer(DrinkFactory drinkFactory) {
        return drinkFactory.getBeerBuilder().withBerries().withSpices().create();
    }

    public Cider getFavoriteCider(DrinkFactory drinkFactory) {
        return drinkFactory.getCiderBuilder().withSugar().withAccessory().create();
    }

    public Kvass getFavoriteKvass(DrinkFactory drinkFactory) {
        return drinkFactory.getKvassBuilder().withApples().withFlavoring().create();
    }

}
