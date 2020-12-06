package grigorev.mikhail.data.builders;

import grigorev.mikhail.data.KvassBuilder;
import grigorev.mikhail.data.entity.Kvass;
import grigorev.mikhail.data.entity.ZhiguliKvass;

public class ZhiguliKvassBuilder implements KvassBuilder {

    private ZhiguliKvass kvass = new ZhiguliKvass();

    public KvassBuilder withSugar() {
        kvass.add("With palm sugar. ");
        return this;
    }

    public KvassBuilder withFlavoring() {
        kvass.add("With barley flavoring. ");
        return this;
    }

    public KvassBuilder withDye() {
        kvass.add("Diluted with water :) ");
        return this;
    }

    public KvassBuilder withApples() {
        kvass.add("With McIntosh apples. ");
        return this;
    }

    public KvassBuilder withMushrooms() {
        kvass.add("With champignon mushroom. ");
        return this;
    }

    public Kvass create() {
        return kvass;
    }


}
