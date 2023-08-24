public class App {
    public static void main(String[] args) {
        Cat timon = new Cat("Timon", 18);
        Cat tihon = new Cat("Tihon", 15);
        Cat tom = new Cat("Tom", 15);

        Cat dysya = new Cat();
        Cat mysya = new Cat();
        timon.say();

        System.out.println(Cat.getCountPet());


        Dog kuzya = new Dog("Кузя", 18);
        Dog myhtar = new Dog();

        myhtar.say();

        System.out.println(Dog.getCountPet());

    }
}