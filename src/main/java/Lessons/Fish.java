package Lessons;

public class Fish extends Animal implements Swimable {

    public Fish(String name, String owner, String diagnosis, boolean isVaccinated) {
        super(name, owner, diagnosis, isVaccinated);
    }

    public Fish(String name, String owner) {
        super(name, owner);
    }

    @Override
    public void swim(int speed) {
        System.out.printf("Я плыву со скоростью %d", speed);
    }
}
