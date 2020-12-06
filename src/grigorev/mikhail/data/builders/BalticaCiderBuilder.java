package grigorev.mikhail.data.builders;

import grigorev.mikhail.data.CiderBuilder;
import grigorev.mikhail.data.entity.BalticaCider;
import grigorev.mikhail.data.entity.Cider;

public class BalticaCiderBuilder implements CiderBuilder {

    private BalticaCider cider = new BalticaCider();

    public CiderBuilder withSugar() {
        cider.add("With malted sugar. ");
        return this;
    }

    public CiderBuilder withBerries() {
        cider.add("With blueberry. ");
        return this;
    }

    public CiderBuilder withSpices() {
        cider.add("With pepper. ");
        return this;
    }

    public CiderBuilder withAccessory() {
        cider.add("With mint accessory. ");
        return this;
    }

    public CiderBuilder withNutritionalSupplements() {
        cider.add("With blue dye. ");
        return this;
    }

    public Cider create() {
        return cider;
    }

}
