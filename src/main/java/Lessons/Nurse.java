package Lessons;

public class Nurse {
    String name;

    public Nurse(String name) {
        this.name = name;
    }

    public void vaccinate(Animal animal){
        animal.setVaccinated(true);
    }

}
