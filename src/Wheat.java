public class Wheat extends Flower{
    public Wheat(String name, double price, double neededArea, double chanceOfGrowth) {
        super(name, price, neededArea, chanceOfGrowth);
    }

    @Override
    public double watering(double number) {
        double chance = 0;
        chance += number;
        setChanceOfGrowth(chance);
        return getChanceOfGrowth();
    }

}
