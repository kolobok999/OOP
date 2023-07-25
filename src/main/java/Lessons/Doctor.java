package Lessons;

public class Doctor {
    private final String name;
    private Nurse nurse;

    public Doctor(String name, Nurse nurse) {
        this.name = name;
        this.nurse = nurse;
    }

    public String getName() {
        return name;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public void doMedicalExamination(Animal animal) {
        if (!animal.isVaccinated) {
            nurse.vaccinate(animal);
        }
    }
}
