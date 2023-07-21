package Lessons;

public class Sparrow extends Animal {
    private int wingLength;

    public Sparrow(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated, int wingLength) {
        super(nameAnimal, nameOwner, diagnosis, isVaccinated);
        this.wingLength = wingLength;
    }

    @Override
    protected void swim() {
        System.out.println("Я не умею плавать");
    }

    @Override
    protected void toGo() {
        System.out.println("Я скачу на двух лапках");
    }

    @Override
    public String toString() {
        return "Sparrow{" +
                "nameAnimal='" + nameAnimal + '\'' +
                ", nameOwner='" + nameOwner + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", isVaccinated=" + isVaccinated +
                ", wingLength=" + wingLength + '\'' +
                '}';
    }
}
