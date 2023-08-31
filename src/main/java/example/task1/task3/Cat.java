package example.task1.task3;

public class Cat {

    private double weight;
    private String colour;
    private boolean isFull;
    private int foodForFullness;

    public Cat(double weight, String colour, boolean isFull, int foodForFullness) {
        this.weight = weight;
        this.colour = colour;
        this.isFull = isFull;
        this.foodForFullness = foodForFullness;
    }

    public double getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public boolean isFull() {
        return isFull;
    }

    public int getFoodForFullness() {
        return foodForFullness;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    public void setFoodForFullness(int foodForFullness) {
        this.foodForFullness = foodForFullness;
    }
}
