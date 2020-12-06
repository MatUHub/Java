package lesson5;

public class Main5 {
    public static void main(String[] args) {
        int numAge = 40;
        Employee[] persArray = new Employee[5];
    persArray[0] = new Employee("Petrov A.E.", "postman","petrov@mail.ru", 5647895, 2000, 50);
    persArray[1] = new Employee("Ivanov B.D.", "banker","ivanov@mail.ru", 8985312, 10000, 25);
    persArray[2] = new Employee("Horlov C.B.", "driver","horlov@mail.ru", 1235497, 5000, 20);
    persArray[3] = new Employee("Losinskiy D.C.", "engineer","losinskiy@mail.ru", 3692584, 9000, 45);
    persArray[4] = new Employee("Kapnic E.A.", "programmer","kapnic@mail.ru", 7539512, 12000, 30);
        System.out.println("Информация о сотрудниках старше " + numAge +" лет");
    for(Employee a: persArray){
        if(a.age > numAge) a.printInfo();
    }
    }
}
