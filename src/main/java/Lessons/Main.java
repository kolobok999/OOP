package Lessons;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Барсик", "Максим", "Простуда", false);
        Animal dog = new Dog("Reks", "Egor", null, false);
        Animal duck = new Duck("Donald", "Olga", null, false);
        Animal sparrow = new Sparrow("Neo", "Petr", null, true);
        Fish fish = new Fish("Nemo", "Jack");

        VetClinic clinic = new VetClinic();
        clinic.addNewAnimal(cat).addNewAnimal(dog).addNewAnimal(duck).addNewAnimal(sparrow).addNewAnimal(fish);
        Nurse nurse = new Nurse("Elizabeth");
        Doctor doctor = new Doctor("James", nurse);

        printAnimalStatus(clinic);

        medExam(clinic, doctor);
        System.out.println("--------------------------");

        printAnimalStatus(clinic);


    }

    private static void medExam(VetClinic clinic, Doctor doctor) {
        for (Animal animal : clinic.getAnimals()) {
            doctor.doMedicalExamination(animal);
        }
    }

    private static void printAnimalStatus(VetClinic clinic) {
        for (Animal animal : clinic.getAnimals()) {
            if (animal.isVaccinated) {
                System.out.printf("Животное %s вакцинировано\n", animal.name);
            } else System.out.printf("Животное %s не вакцинировано\n", animal.name);
        }
    }


}
