//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Мерседес", 4);
        Car car2 = new Car("Жигули", 4);

        Truck truck1 = new Truck("Вольво", 8);
        Truck truck2 = new Truck("Камаз",6);

        Bicycle bicycle1 = new Bicycle("Орленок",2);
        Bicycle bicycle2 = new Bicycle("Школьник", 2);

        ServiceStation serviceStation = new ServiceStation();

        System.out.println();
        serviceStation.check(car1,null,null);
        System.out.println();
        serviceStation.check(null,truck1,null);
        System.out.println();
        serviceStation.check(null,null,bicycle1);

    }
}