package grigorev.mikhail.data;

public interface DrinkFactory {

    BeerBuilder getBeerBuilder();

    KvassBuilder getKvassBuilder();

    CiderBuilder getCiderBuilder();

}
