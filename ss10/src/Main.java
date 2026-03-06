import btgioi1.Duck;
import btgioi1.Fish;
import btgioi2.RemoteControl;
import btkha1.Circle;
import btkha1.Rectangle;
import btkha2.Bicycle;
import btkha2.Car;
import btkha2.Vehicle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //BÀI KHÁ 1
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5,10);

        System.out.println("btkha1.Circle:");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("Retangle: ");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());


        // BÀI KHÁ 2
        Vehicle car = new Car("Toyota");
        Vehicle bicycle = new Bicycle("Giant");

        car.move();
        bicycle.move();

        //BÀI GIỎI 1
        Duck duck = new Duck("Vịt");
        Fish fish = new Fish("Cá");

        duck.swim();
        duck.fly();

        System.out.println();
        fish.swim();

        //BÀI GIỎI 2
        RemoteControl smartLight = new RemoteControl() {
            @Override
            public void powerOn() {
                System.out.println("Đèn đã bật");
            }
        };

        smartLight.powerOn();
        smartLight.checkBattery();
    }
}