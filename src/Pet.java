import java.util.Objects;

abstract class Pet {
    String name;
    int hunger;
    abstract void say();

    //В классе Pet переопределить метоюы equals() и hashcode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet myClass = (Pet) o;
        return hunger == myClass.hunger &&
                Objects.equals(name, myClass.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, hunger);
    }
}