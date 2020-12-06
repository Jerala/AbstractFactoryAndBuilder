package grigorev.mikhail.data;

import grigorev.mikhail.data.builders.ZhiguliBeerBuilder;
import grigorev.mikhail.data.builders.ZhiguliCiderBuilder;
import grigorev.mikhail.data.builders.ZhiguliKvassBuilder;

public class ZhiguliDrinkFactory implements DrinkFactory {

    public BeerBuilder getBeerBuilder() {
        return new ZhiguliBeerBuilder();
    }

    public KvassBuilder getKvassBuilder() {
        return new ZhiguliKvassBuilder();
    }

    public CiderBuilder getCiderBuilder() {
        return new ZhiguliCiderBuilder();
    }


}
