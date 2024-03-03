package lesson6;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog();
        Cat catBarsik = new Cat();

        dogBobik.run(150); // Собака пробежала 150 м.
        dogBobik.swim(10); // Животное проплыло 10 м. (наследованный метод)

        catBarsik.run(100); // Кот пробежал 100 м.
        catBarsik.swim(5); // Кот не умеет плавать.
    }
}