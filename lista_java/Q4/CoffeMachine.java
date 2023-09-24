package Q4;

class CoffeeMachine {
    private double water;
    private double milk;
    private double coffee;

    public CoffeeMachine(double water, double milk, double coffee) {
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
    }

    public void makeCoffee(Coffee coffeeType) {
        if (water >= coffeeType.waterRequired && milk >= coffeeType.milkRequired && coffee >= coffeeType.coffeeRequired) {
            System.out.println("Iniciando a preparação de um " + coffeeType.name + "...");
            coffeeType.prepare();
            System.out.println("Café " + coffeeType.name + " pronto!");

            water -= coffeeType.waterRequired;
            milk -= coffeeType.milkRequired;
            coffee -= coffeeType.coffeeRequired;
        } else {
            System.out.println("Recursos insuficientes para fazer um " + coffeeType.name + ".");
        }
    }
}