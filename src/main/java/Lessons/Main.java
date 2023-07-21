package Lessons;

public class Main {
    public static void main(String[] args) {
        Animal barsik = new Cat("Барсик", "Максим", "Простуда", false, 4);
        Animal dog = new Dog("Reks", "Egor", null, false);
        Animal duck = new Duck("Donald", "Olga", null, false, 30);
        Animal sparrow = new Sparrow("Neo", "Petr", null, true,10);
        System.out.println(barsik);
        barsik.fly();
        barsik.toGo();
        barsik.swim();

        System.out.println(dog);
        dog.toGo();
        dog.fly();
        dog.swim();

        System.out.println(duck);
        duck.toGo();
        duck.fly();
        duck.swim();

        System.out.println(sparrow);
        sparrow.toGo();
        sparrow.fly();
        sparrow.swim();

    }
}
