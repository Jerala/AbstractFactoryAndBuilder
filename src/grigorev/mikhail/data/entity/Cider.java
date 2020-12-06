package grigorev.mikhail.data.entity;

public class Cider {
    private StringBuilder composition = new StringBuilder().append("Default Cider...");

    public StringBuilder getComposition() {
        return composition;
    }

    public StringBuilder add(String ingredient) {
        return composition.append(ingredient);
    }
}
