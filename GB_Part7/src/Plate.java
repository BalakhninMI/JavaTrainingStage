public class Plate {
    private int food;

    public Plate (int food)
    {
        this.food=food;
    }

    public void info()
    {
        System.out.println("Plate: " + food);
    }

    public void decreaseFood(int appetite)
    {
        if (appetite> food)
            return;
        this.food -= appetite;
    }

    public int getFood()
    {
        return food;
    }

    public void setFood(int food)
    {
        this.food = food;
    }
}
