package grigorev.mikhail.data;

import grigorev.mikhail.data.entity.Beer;

public interface BeerBuilder {

    BeerBuilder withFilter();

    BeerBuilder withSpices();

    BeerBuilder withFruit();

    BeerBuilder withBerries();

    BeerBuilder withFlavoring();

    Beer create();

}
