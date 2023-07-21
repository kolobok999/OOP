package Lessons;

public class Duck extends Animal {
    private int wingLength;

    public Duck(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated, int wingLength) {
        super(nameAnimal, nameOwner, diagnosis, isVaccinated);
        this.wingLength = wingLength;
    }

    @Override
    protected void toGo() {
        System.out.println("Я хожу");
    }

    @Override
    public String toString() {
        return "Duck{" +
                "nameAnimal='" + nameAnimal + '\'' +
                ", nameOwner='" + nameOwner + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", isVaccinated=" + isVaccinated + '\'' +
                ", wingLength=" + wingLength +
                '}';
    }
}
