public class Person {

    private String fullName;
    private String post;
    private String email;
    private String phone;
    private Integer salary;
    private Integer age;

    public Person ( String fullName, String post, String email, String phone, Integer salary, Integer age)
    {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void infoPrint()
    {
        System.out.println("Имя сотрудника   : " + this.fullName);
        System.out.println("Должность        : " + this.post);
        System.out.println("Электронная почта: " + this.email);
        System.out.println("Телефон          : " + this.phone);
        System.out.println("Зарплата         : " + this.salary);
        System.out.println("Возраст          : " + this.age);
    }

    public Integer getAge()
    {
        return this.age;
    }

}

