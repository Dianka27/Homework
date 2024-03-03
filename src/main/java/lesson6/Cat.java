package lesson6;

// Создаем класс Кот из класса животные
public class Cat extends Animal {
    // Ограничение на длину бега для кота
    private static final int MAX_RUN_DISTANCE = 200;

    // Ограничение на длину плавания для кота
    private static final int MAX_SWIM_DISTANCE = 0;

    // Переопределение метода для бега
    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println("Кот пробежал " + distance + " м.");
        } else {
            System.out.println("Кот не может пробежать так далеко.");
        }
    }

    // Переопределение метода для плавания
    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать.");
    }
}