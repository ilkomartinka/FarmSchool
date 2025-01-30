public class Corn extends Flower {
    public Corn(String name, double price, double neededArea, double chanceOfGrowth) {
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
