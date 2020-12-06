package grigorev.mikhail.data.entity;

public class Kvass {
    private StringBuilder composition = new StringBuilder().append("Default Kvass...");

    public StringBuilder getComposition() {
        return composition;
    }

    public StringBuilder add(String ingredient) {
        return composition.append(ingredient);
    }
}
