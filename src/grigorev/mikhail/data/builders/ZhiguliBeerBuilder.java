package grigorev.mikhail.data.builders;

import grigorev.mikhail.data.BeerBuilder;
import grigorev.mikhail.data.entity.Beer;
import grigorev.mikhail.data.entity.OchakovoBeer;
import grigorev.mikhail.data.entity.ZhiguliBeer;

public class ZhiguliBeerBuilder implements BeerBuilder {

    private ZhiguliBeer beer = new ZhiguliBeer();

    public BeerBuilder withFilter() {
        beer.add("With filtering without pasteurization. ");
        return this;
    }

    public BeerBuilder withSpices() {
        beer.add("With anise. ");
        return this;
    }

    public BeerBuilder withFruit() {
        beer.add("With orange. ");
        return this;
    }

    public BeerBuilder withBerries() {
        beer.add("With strawberry. ");
        return this;
    }

    public BeerBuilder withFlavoring() {
        beer.add("With orange flavoring. ");
        return this;
    }

    public Beer create() {
        return beer;
    }

}
