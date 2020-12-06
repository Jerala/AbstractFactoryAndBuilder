package grigorev.mikhail.data.builders;

import grigorev.mikhail.data.BeerBuilder;
import grigorev.mikhail.data.entity.BalticaBeer;
import grigorev.mikhail.data.entity.Beer;

public class BalticaBeerBuilder implements BeerBuilder {

    private BalticaBeer beer = new BalticaBeer();

    public BeerBuilder withFilter() {
        beer.add("With filtering and pasteurization. ");
        return this;
    }

    public BeerBuilder withSpices() {
        beer.add("With red pepper. ");
        return this;
    }

    public BeerBuilder withFruit() {
        beer.add("With apple. ");
        return this;
    }

    public BeerBuilder withBerries() {
        beer.add("With blueberry. ");
        return this;
    }

    public BeerBuilder withFlavoring() {
        beer.add("With blueberry flavoring. ");
        return this;
    }

    public Beer create() {
        return beer;
    }

}
