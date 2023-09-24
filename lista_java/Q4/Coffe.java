package Q4;

abstract class Coffee {
    protected String name;
    protected double coffeeRequired;
    protected double milkRequired;
    protected double waterRequired;

    public Coffee(String name, double waterRequired, double milkRequired, double coffeeRequired) {
        this.name = name;
        this.coffeeRequired = coffeeRequired;
        this.milkRequired = milkRequired;
        this.waterRequired = waterRequired;
    }

    public abstract void prepare();
}