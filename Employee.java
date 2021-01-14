package gbHomework5;

public class Employee {
    private String fio;
    private String post;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fio, String post, String email, String phoneNumber, int salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void empInfo() {
        System.out.println("ФИО: " + fio + " Должность: " + post + " email: " + email + " № телефона:" + phoneNumber + " Зарплата: " + salary + " Возраст: " + age);
    }

    public void empInfoMoreThan40() {
        if (age > 40)
            System.out.println("ФИО: " + fio + " Должность: " + post + " email: " + email + " № телефона:" + phoneNumber + " Зарплата: " + salary + " Возраст: " + age);
    }

}
