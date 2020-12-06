package grigorev.mikhail.data;

import grigorev.mikhail.data.entity.Cider;

public interface CiderBuilder {

    CiderBuilder withSugar();

    CiderBuilder withBerries();

    CiderBuilder withSpices();

    CiderBuilder withAccessory();

    CiderBuilder withNutritionalSupplements();

    Cider create();

}
