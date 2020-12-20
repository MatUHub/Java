package lesson7;

public class Main7 {
    public static void main(String[] args) {
        Cat [] cats = new Cat[3];
        cats [0] = new Cat("Кот1", 3);
        cats [1] = new Cat("Кот2",5);
        cats [2] = new Cat("Кот3",4);
        /*Cat cat1 = new Cat("Кот1", 2,4, false);
        Cat cat2 = new Cat("Кот2",3,6,false);
        Cat cat3 = new Cat("Кот3",4,8,false);*/

        Plate plate = new Plate();

        plate.addFood(7);
        plate.printInfo();
        cats[0].eat(plate);
        plate.printInfo();
        cats[1].eat(plate);
        plate.printInfo();
        cats[2].eat(plate);
        plate.printInfo();
    }
}
