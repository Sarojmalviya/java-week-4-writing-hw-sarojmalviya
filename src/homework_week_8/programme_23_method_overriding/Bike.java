package homework_week_8.programme_23_method_overriding;
/**
 * Creating a child class
 */
public class Bike extends Vehical{
    //defining the same method as in the parent class
    public void run(){
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();//calling method
    }
}
