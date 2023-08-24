// Класс Дог
public class Dog extends Pet {
    private static int countPet;

    public Dog(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
        countPet++;
    }

    public static int getCountPet() {
        return countPet;
    }

    public Dog() {
        countPet++;
    }

    @Override
    void say() {
        System.out.println("Гав!");
    }
}
