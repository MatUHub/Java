package lesson7;

public class Cat {

    boolean satiety = false;
    String name;
    int voracity;

    public void eat(Plate plate) {
        plate.decreaseFood(voracity, name);
    }

    public Cat(String name, int voracity) {
        this.name = name;
        this.voracity = voracity;
    }
}
