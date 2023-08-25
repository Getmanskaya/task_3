import java.util.Objects;


// Класс Кэт
public class Cat extends Pet {
    private static int countPet;

    public Cat(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
        countPet++;
    }

    public static int getCountPet() {
        return countPet;
    }

    public Cat() {
        countPet++;
    }

    @Override
    void say() {
        System.out.println("Mяу!");
    }
}

