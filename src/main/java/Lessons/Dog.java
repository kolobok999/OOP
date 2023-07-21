package Lessons;

public class Dog extends Animal {
    public Dog(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated) {
        super(nameAnimal, nameOwner, diagnosis, isVaccinated);
    }

    @Override
    protected void fly() {
        System.out.println("Я не умею летать, я собака");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nameAnimal='" + nameAnimal + '\'' +
                ", nameOwner='" + nameOwner + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", isVaccinated=" + isVaccinated +
                '}';
    }
}
