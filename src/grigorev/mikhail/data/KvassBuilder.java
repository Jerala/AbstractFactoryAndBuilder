package grigorev.mikhail.data;

import grigorev.mikhail.data.entity.Kvass;

public interface KvassBuilder {

    KvassBuilder withSugar();

    KvassBuilder withFlavoring();

    KvassBuilder withDye();

    KvassBuilder withApples();

    KvassBuilder withMushrooms();

    Kvass create();

}
