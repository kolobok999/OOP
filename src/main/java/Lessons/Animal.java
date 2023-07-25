package Lessons;

public abstract class Animal implements Illable {
    protected String name;
    protected String owner;
    protected String diagnosis;
    protected boolean isVaccinated;
    protected final String TYPE = getClass().getSimpleName();

    public Animal(String name, String owner, String diagnosis, boolean isVaccinated) {
        this.name = name;
        this.owner = owner;
        this.diagnosis = diagnosis;
        this.isVaccinated = isVaccinated;
    }

    public Animal(String name, String owner) {
        this(name, owner, null, false);
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public String getTYPE() {
        return TYPE;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", isVaccinated=" + isVaccinated +
                '}';
    }

    @Override
    public void ill() {
        System.out.println("Животное болеет");
    }
}
