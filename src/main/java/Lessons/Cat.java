package Lessons;

public class Cat extends Animal implements Speakable, Runnable {

    public Cat() {
        this("Max", null, null, false );
    }

    public Cat(String name, String owner, String diagnosis, boolean isVaccinated) {
        super(name, owner, diagnosis, isVaccinated);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", isVaccinated=" + isVaccinated +
                '}';
    }

    @Override
    public void run(int speed) {
        System.out.printf("Я бегу со скоростью %d", speed);
    }

    @Override
    public void speak() {
        System.out.println("МЯУ");
    }

}
