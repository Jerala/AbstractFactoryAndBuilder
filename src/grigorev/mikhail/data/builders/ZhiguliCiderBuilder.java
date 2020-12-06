package grigorev.mikhail.data.builders;

import grigorev.mikhail.data.CiderBuilder;
import grigorev.mikhail.data.entity.Cider;
import grigorev.mikhail.data.entity.ZhiguliCider;

public class ZhiguliCiderBuilder implements CiderBuilder {

    private ZhiguliCider cider = new ZhiguliCider();

    public CiderBuilder withSugar() {
        cider.add("With palm sugar. ");
        return this;
    }

    public CiderBuilder withBerries() {
        cider.add("With cloudberry. ");
        return this;
    }

    public CiderBuilder withSpices() {
        cider.add("With anise. ");
        return this;
    }

    public CiderBuilder withAccessory() {
        cider.add("With lime accessory. ");
        return this;
    }

    public CiderBuilder withNutritionalSupplements() {
        cider.add("With yellow dye. ");
        return this;
    }

    public Cider create() {
        return cider;
    }



}
