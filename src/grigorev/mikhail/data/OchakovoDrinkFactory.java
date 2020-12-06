package grigorev.mikhail.data;

import grigorev.mikhail.data.builders.OchakovoBeerBuilder;
import grigorev.mikhail.data.builders.OchakovoCiderBuilder;
import grigorev.mikhail.data.builders.OchakovoKvassBuilder;

public class OchakovoDrinkFactory implements DrinkFactory {

    public BeerBuilder getBeerBuilder() {
        return new OchakovoBeerBuilder();
    }

    public KvassBuilder getKvassBuilder() {
        return new OchakovoKvassBuilder();
    }

    public CiderBuilder getCiderBuilder() {
        return new OchakovoCiderBuilder();
    }

}
