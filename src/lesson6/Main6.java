package lesson6;

public class Main6 {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Кот1",200,2);
        Dog dog1 = new Dog("Пес1", 500,0.5,100);
        Dog dog2 = new Dog("Пес2", 600, 1,150);

        System.out.println(cat1);
        System.out.println(dog1);
        System.out.println(dog2);

       cat1.run(150);
       dog1.run(550);
       dog2.run(90);

        cat1.swim(10);
        dog1.swim(90);
        dog2.swim(160);

        cat1.jump(1.4);
        dog1.jump(0.5);
        dog2.jump(0.7);

    }



}
