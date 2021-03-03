public class Main {

    public static void main(String[] args) {
        // 1. Создать классы Собака и Кот с наследованием от класса Животное.
        // 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        // 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
        Cat cat = new Cat(200, 0);
        Dog dog = new Dog(500, 10);

        System.out.println("Кот:");
        cat.run(50);
        cat.swim(10);
        System.out.println();

        System.out.println("Собака:");
        dog.run(150);
        dog.swim(5);
        System.out.println();

        //4. * Добавить подсчет созданных котов, собак и животных.
        newAnimals newAnim = new newAnimals();
        Animals cat1 = newAnim.addCat(200, 0);
        Animals dog1 = newAnim.addDog(500, 10);
        Animals dog2 = newAnim.addDog(500, 10);

        System.out.println("Кот:");
        cat1.run(55);
        cat1.swim(5);
        System.out.println();

        System.out.println("Собака:");
        dog1.run(125);
        dog1.swim(8);
        System.out.println();

        System.out.println("Собака:");
        dog2.run(300);
        dog2.swim(15);
        System.out.println();

        System.out.println("Создано котов: " + newAnim.getCountCat());
        System.out.println("Создано собак: " + newAnim.getCountDog());
        System.out.println("Создано животных: " + newAnim.getCountAnimals());

    }


}
