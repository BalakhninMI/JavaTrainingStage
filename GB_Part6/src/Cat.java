public class Cat extends Animals {
    final int maxLengthRun = 200;
    final int maxLengthSwim = 0;

    Cat (int maxLengthRun, int maxLengthSwim)
    {
        super(maxLengthRun, maxLengthSwim);
    }

    @Override
    public void swim (int lengthSwim)
    {
        System.out.println("Не умеет плавать.");
    }
}
