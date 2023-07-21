package Lessons;

public class Cat extends Animal {
    private int countPaws;

    public Cat() {
        this("Max", null, null, false, 4 );
    }

    public Cat(String nameAnimal, String nameOwner, String diagnosis, boolean isVaccinated, int countPaws) {
        super(nameAnimal, nameOwner, diagnosis, isVaccinated);
        this.countPaws = countPaws;
    }

    @Override
    protected void fly() {
        System.out.println("Я не умею летать, я кот");
    }

    @Override
    protected void swim() {
        System.out.println("Мяу, я не хочу");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nameAnimal='" + nameAnimal + '\'' +
                ", nameOwner='" + nameOwner + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", isVaccinated=" + isVaccinated +
                ", countPaws=" + countPaws +
                '}';
    }
}
