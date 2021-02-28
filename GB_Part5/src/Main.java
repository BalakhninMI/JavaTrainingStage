public class Main {

    public static void main(String[] args)
    {
	    Person user1 = new Person("Кирилов Петр Николаевич","Специалист","Kirilov@mail.ru","+79501112233",20000,20);
	    user1.infoPrint();
        System.out.println(" ");

        Person[] userFull = new Person[5];
        userFull[0] = new Person("Иванов Петр Николаевич","Специалист","IvanovPN@mail.ru","+79501112230",20000,20);
        userFull[1] = new Person("Сидоров Никита Николаевич","Менеджер","SidorovNN@mail.ru","+79501112231",30000,28);
        userFull[2] = new Person("Лавров Николай Петрович","Охранник","LavrovNP@mail.ru","+79501112232",25000,42);
        userFull[3] = new Person("Никитин Петр Петрович","Директор","NikitinPP@mail.ru","+79501112233",50000,35);
        userFull[4] = new Person("Киселева Наталья Викторовная","Секретарь","KiselevaNV@mail.ru","+79501112234",20000,40);

        for (Integer i =0; i<=4; i++)
        {
            if (userFull[i].getAge() > 40) {
                userFull[i].infoPrint();
                System.out.println(" ");
            }
        }
    }
}
