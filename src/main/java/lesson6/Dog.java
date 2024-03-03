package lesson6;

// Создаем класс Собака из класса животные
public class Dog extends Animal {
    // Ограничение на длину бега для собаки
    private static final int MAX_RUN_DISTANCE = 500;

    // Ограничение на длину плавания для собаки
    private static final int MAX_SWIM_DISTANCE = 10;

    // Переопределение метода для бега
    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println("Собака пробежала " + distance + " м.");
        } else {
            System.out.println("Собака не может пробежать так далеко.");
        }
    }

    // Переопределение метода для плавания
    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM_DISTANCE) {
            System.out.println("Собака проплыла " + distance + " м.");
        } else {
            System.out.println("Собака не может проплыть так далеко.");
        }
    }
}