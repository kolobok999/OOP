package Lessons;

public class Dog extends Animal implements Speakable, Runnable {
    public Dog(String name, String owner, String diagnosis, boolean isVaccinated) {
        super(name, owner, diagnosis, isVaccinated);
    }

    public Dog(String name, String owner) {
        super(name, owner);
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", isVaccinated=" + isVaccinated +
                '}';
    }

    @Override
    public void speak() {
        System.out.println("ГАВ");
    }

    @Override
    public void run(int speed) {
        System.out.printf("Я бегу со скоростью %d", speed);
    }
}
