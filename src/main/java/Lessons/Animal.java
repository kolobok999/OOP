package Lessons;

public class Animal {
    protected String nameAnimal;
    protected String nameOwner;
    protected String diagnosis;
    protected boolean isVaccinated;
    protected final String TYPE = getClass().getSimpleName();

    public Animal(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated) {
        this.nameAnimal = nameAnimal;
        this.nameOwner = nameOwner;
        this.diagnosis = diagnosis;
        this.isVaccinated = isVaccinated;
    }
    public Animal() {}

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public String getTYPE() {
        return TYPE;
    }

    protected void toGo() {
        System.out.println("Я бегу");
    }

    protected void fly() {
        System.out.println("Я лечу");
    }

    protected void swim() {
        System.out.println("Я плыву");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "nameAnimal='" + nameAnimal + '\'' +
                ", nameOwner='" + nameOwner + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", isVaccinated=" + isVaccinated +
                '}';
    }
}
