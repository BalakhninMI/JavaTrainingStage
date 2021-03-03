public abstract class  Animals {
    int lengthRun;
    int lengthSwim;
    int maxLengthRun;
    int maxLengthSwim;

    Animals (int maxLengthRun, int maxLengthSwim)
    {
        this.maxLengthRun=maxLengthRun;
        this.maxLengthSwim=maxLengthSwim;

    }

    void run (int LengthRun)
    {
        if (LengthRun<=maxLengthRun)
            System.out.println("Пробежал(а) "+ LengthRun + " м.");
        else
            System.out.println("Не может пробежать "+ LengthRun + " м.");
    }

    public abstract void swim (int lengthSwim);
}
