package grigorev.mikhail.data.builders;

import grigorev.mikhail.data.CiderBuilder;
import grigorev.mikhail.data.entity.Cider;
import grigorev.mikhail.data.entity.OchakovoCider;

public class OchakovoCiderBuilder implements CiderBuilder {

    private OchakovoCider cider = new OchakovoCider();

    public CiderBuilder withSugar() {
        cider.add("With cage sugar. ");
        return this;
    }

    public CiderBuilder withBerries() {
        cider.add("With strawberry. ");
        return this;
    }

    public CiderBuilder withSpices() {
        cider.add("With carnation. ");
        return this;
    }

    public CiderBuilder withAccessory() {
        cider.add("With mint accessory. ");
        return this;
    }

    public CiderBuilder withNutritionalSupplements() {
        cider.add("With red dye. ");
        return this;
    }

    public Cider create() {
        return cider;
    }

}
