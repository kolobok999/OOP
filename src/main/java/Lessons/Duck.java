package Lessons;

public class Duck extends Animal implements Flyable, Speakable {
    public Duck(String name, String owner, String diagnosis, boolean isVaccinated) {
        super(name, owner, diagnosis, isVaccinated);
    }

    public Duck(String name, String owner) {
        super(name, owner);
    }


    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", isVaccinated=" + isVaccinated + '\'' +
                '}';
    }

    @Override
    public void fly(int speed) {
        System.out.printf("Я лечу со скоростью %d", speed);
    }

    @Override
    public void speak() {
        System.out.println("КРЯ");
    }
}
