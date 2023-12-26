package by.yudzin72.lesson1.model.abstracted;

public abstract class Flower {
    private final String name;
    private final Double price;

    private final Integer levelFresh;
    private final Double lenStem;

    public Flower(String name, Double price, Integer levelFresh, Double lenStem) {
        this.name = name;
        this.price = price;
        this.levelFresh = levelFresh;
        this.lenStem = lenStem;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getLevelGresh() {
        return levelFresh;
    }

    public Double getLenStem() {
        return lenStem;
    }

    @Override
    public String toString() {
        return "Цветок:" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", levelFresh=" + levelFresh +
                ", lenStem=" + lenStem;
    }
}
