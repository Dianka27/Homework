package lesson5;

public class Employee {
        private String fullName;
        private String position;
        private String email;
        private String phoneNumber;
        private double salary;
        private int age;

    // Конструктор для инициализации объектов класса Employee
    public Employee(String fullName, String position, String email, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // Метод для вывода информации о сотруднике в консоль
    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }

    public static void main(String[] args) {
        // Создание массива из 5 сотрудников
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович", "Программист", "ivanov@example.com", "+123456789", 50000, 30);
        employees[1] = new Employee("Петров Петр Петрович", "Менеджер", "petrov@example.com", "+987654321", 60000, 45);
        employees[2] = new Employee("Сидоров Сидор Сидорович", "Аналитик", "sidorov@example.com", "+111222333", 55000, 35);
        employees[3] = new Employee("Семенов Семено Семенович", "Тестировщик", "kozlov@example.com", "+444555666", 48000, 40);
        employees[4] = new Employee("Андреев Андрей Андреевич", "Дизайнер", "novikova@example.com", "+777888999", 52000, 50);

        // Вывод информации о сотрудниках старше 40 лет
        System.out.println("Информация о сотрудниках старше 40 лет:");
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }

    // Геттеры и сеттеры для доступа к полям класса
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
