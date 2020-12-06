package grigorev.mikhail.data.builders;

import grigorev.mikhail.data.BeerBuilder;
import grigorev.mikhail.data.entity.Beer;
import grigorev.mikhail.data.entity.OchakovoBeer;

public class OchakovoBeerBuilder implements BeerBuilder {

    private OchakovoBeer beer = new OchakovoBeer();

    public BeerBuilder withFilter() {
        beer.add("With filtering. ");
        return this;
    }

    public BeerBuilder withSpices() {
        beer.add("With black pepper. ");
        return this;
    }

    public BeerBuilder withFruit() {
        beer.add("With kiwi. ");
        return this;
    }

    public BeerBuilder withBerries() {
        beer.add("With cherry. ");
        return this;
    }

    public BeerBuilder withFlavoring() {
        beer.add("With kiwi flavoring. ");
        return this;
    }

    public Beer create() {
        return beer;
    }

}
