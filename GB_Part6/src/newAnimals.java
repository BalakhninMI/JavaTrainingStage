public class newAnimals {
    private int countCat;
    private int countDog;

    public Cat addCat(int maxLengthRun, int maxLengthSwim)
    {
        Cat cat = new Cat(maxLengthRun, maxLengthSwim);
        countCat++;
        return cat;
    }

    public Dog addDog(int maxLengthRun, int maxLengthSwim)
    {
        Dog dog = new Dog(maxLengthRun, maxLengthSwim);
        countDog++;
        return dog;
    }

    public int getCountCat()
    {
        return countCat;
    }

    public int getCountDog()
    {
        return countDog;
    }

    public int getCountAnimals()
    {
        return countDog + countCat;
    }
}
