package lesson7;

public class Plate {
    private int food;

    public void addFood(int food) {
        this.food += food;
    }

    public void printInfo() {
        System.out.println("В тарелке " + food + " ед. корма");
    }

    public void decreaseFood(int food, String name) {
        if(this.food < food) System.out.println("Слишком мало еды для " + name);
        else {this.food -= food; System.out.println(name + " насытился");}

        if(this.food <= 0) {
            System.out.println("В тарелке закончилась еда, пора подсыпать");
            this.food = 0;
        }
    }
}
