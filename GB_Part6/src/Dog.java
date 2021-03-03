public class Dog extends Animals {


    Dog (int maxLengthRun, int maxLengthSwim)
    {
        super(maxLengthRun, maxLengthSwim);
    }

    @Override
    public void swim (int lengthSwim)
    {
        if (lengthSwim<=maxLengthSwim)
            System.out.println("Проплыл(а): "+ lengthSwim + " м.");
        else
            System.out.println("Не может проплыть: "+ lengthSwim + " м.");
    }
}
