package lesson6;

public class Animal {
    private String name;
    private int ranDistance;
    private int swimDistance;
    private double jumpHeight;

    public void run(int a) {
        boolean b;
        if(a <= ranDistance) b = true;
        else b =false;
        System.out.println("run: " + b);
    }
    public void swim(int a) {
        boolean b;
        if(a <= swimDistance) b = true;
        else b =false;
        System.out.println("swim: " + b);
    }
    public void jump(double a) {
        boolean b;
        if(a <= jumpHeight) b = true;
        else b =false;
        System.out.println("jump: " + b);
    }
    public Animal(String name, int ranDistance, double jumpHeight){
        this(name, ranDistance, jumpHeight, 0);
    }

    @Override
    public String toString() {
        return
                " Максимальная дистанция бега " + name + " " + ranDistance + "м" +
                "\n Максимальная дистанция заплыва "+ name + " " + swimDistance + "м" +
                "\n Максимальная высота прыжка "+ name + " " + jumpHeight + "м" +"\n";
    }

    public Animal(String name, int ranDistance, double jumpHeight, int swimDistance){
        this.ranDistance = ranDistance;
        this.swimDistance = swimDistance;
        this.jumpHeight = jumpHeight;
        this.name = name;
    }


}
