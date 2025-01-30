public class Wheat extends Flower{
    /**
     * Constructs a new flower
     * @param name
     * @param price
     * @param neededArea
     * @param chanceOfGrowth
     */
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
