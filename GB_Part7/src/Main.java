public class Main {
    public static void main(String[] args)
    {
        Cat[] cat = new Cat[5];
        cat[0]=new Cat("Муся", 2);
        cat[1]=new Cat("Дуся", 5);
        cat[2]=new Cat("Борис", 7);
        cat[3]=new Cat("Мурзик", 8);
        cat[4]=new Cat("Пушок", 1);
        Plate plate = new Plate(15);

        for (int i=0; i<5; i++)
        {
            cat[i].eat(plate);
        }

        for (int i=0; i<5; i++)
        {
            System.out.println(cat[i].name + " поел(а)? " + cat[i].fed);
        }

    }
}
