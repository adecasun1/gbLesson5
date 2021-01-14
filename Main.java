package gbHomework5;

public class Main {

    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ivan Ivanov", "Driver", "прррt@mail.com", "89565656", 5000, 28);
        empArray[1] = new Employee("Evgen Birusov", "Engeneer", "qwert@mail.com", "89565365656", 500, 30);
        empArray[2] = new Employee("Nataly Poklonska", "Politik", "q34@mail.com", "89565656", 500, 29);
        empArray[3] = new Employee("Brad Pitt", "Actor", "wваt@mail.com", "89568885656", 5400, 55);
        empArray[4] = new Employee("Eva Green", "Actress", "прt@mail.com", "89565666656", 800, 35);

        for (int i = 0; i < empArray.length; i++) {
            empArray[i].empInfoMoreThan40();
        }

    }


}

