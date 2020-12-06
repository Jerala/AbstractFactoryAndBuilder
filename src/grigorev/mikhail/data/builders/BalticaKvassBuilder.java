package grigorev.mikhail.data.builders;

import grigorev.mikhail.data.KvassBuilder;
import grigorev.mikhail.data.entity.BalticaKvass;
import grigorev.mikhail.data.entity.Kvass;

public class BalticaKvassBuilder implements KvassBuilder {

    private BalticaKvass kvass = new BalticaKvass();

    public KvassBuilder withSugar() {
        kvass.add("With malted sugar. ");
        return this;
    }

    public KvassBuilder withFlavoring() {
        kvass.add("With rye flavoring. ");
        return this;
    }

    public KvassBuilder withDye() {
        kvass.add("With brown dye. ");
        return this;
    }

    public KvassBuilder withApples() {
        kvass.add("With Fuji apples. ");
        return this;
    }

    public KvassBuilder withMushrooms() {
        kvass.add("With tea mushroom. ");
        return this;
    }

    public Kvass create() {
        return kvass;
    }


}
