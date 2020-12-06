package grigorev.mikhail.data.entity;

public class Beer {
    private StringBuilder composition = new StringBuilder().append("Default Beer...");

    public StringBuilder getComposition() {
        return composition;
    }

    public StringBuilder add(String ingredient) {
        return composition.append(ingredient);
    }
}
