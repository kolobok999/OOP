package Lessons;

public class Sparrow extends Animal implements Flyable, Speakable {

    public Sparrow(String name, String owner, String diagnosis, boolean isVaccinated) {
        super(name, owner, diagnosis, isVaccinated);
    }

    public Sparrow(String name, String owner) {
        super(name, owner);
    }



    @Override
    public String toString() {
        return "Sparrow{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", isVaccinated=" + isVaccinated +
                '}';
    }

    @Override
    public void fly(int speed) {
        System.out.printf("Я лечу со скоростью %d", speed);
    }

    @Override
    public void speak() {
        System.out.println("Tweet");
    }
}
