package grigorev.mikhail.data;

import grigorev.mikhail.data.builders.BalticaBeerBuilder;
import grigorev.mikhail.data.builders.BalticaCiderBuilder;
import grigorev.mikhail.data.builders.BalticaKvassBuilder;

public class BalticaDrinkFactory implements DrinkFactory {

    public BeerBuilder getBeerBuilder() {
        return new BalticaBeerBuilder();
    }

    public KvassBuilder getKvassBuilder() {
        return new BalticaKvassBuilder();
    }

    public CiderBuilder getCiderBuilder() {
        return new BalticaCiderBuilder();
    }

}
