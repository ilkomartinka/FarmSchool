import java.util.ArrayList;

public class Farm {
    private int counofFlowers;
    private int countOfSmallAnimals;
    private int countOfLargeAnimals;
    private ArrayList<Flower> flowers;
    private ArrayList<Animal> animals;
    private double landArea;

    /**
     * Constructs a new farmer with default parameters
     * @param counofFlowers
     * @param countOfSmallAnimals
     * @param countOfLargeAnimals
     * @param flowers
     * @param animals
     * @param landArea
     */
    public Farm(int counofFlowers, int countOfSmallAnimals, int countOfLargeAnimals, ArrayList<Flower> flowers, ArrayList<Animal> animals, int landArea) {
        this.counofFlowers = 5;
        this.countOfSmallAnimals = 10;
        this.countOfLargeAnimals = 10;
        this.flowers = new ArrayList<>();
        this.animals = new ArrayList<>();
        this.landArea = 100;
    }

    /**
     * Method which add flowers
     * @param flower
     */
    public void addFlower(Flower flower) {
        if (flower.getNeededArea() < landArea && counofFlowers < 5) {
            flowers.add(flower);
            landArea =- flower.getNeededArea();
        } else {
            System.out.println("Error");
        }
    }

    /**
     * Method for deleting flowers
     * @param flower
     */
    public void deleteFlower(Flower flower){
        flowers.remove(flower);
        landArea += flower.getNeededArea();
    }

}
