public class Cat {
    String name;
    private int appetite;
    boolean fed;

    public Cat (String name, int appetite)
    {
        this.name = name;
        this.appetite = appetite;
        fed = false;
    }

    void eat (Plate plate)
    {
        fed = checkLevelFood(plate.getFood());
        plate.decreaseFood(appetite);
    }

    private boolean checkLevelFood (int food)
    {
        return appetite <= food;
    }

}
