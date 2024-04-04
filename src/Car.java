public class Car extends Vehicle{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkTrailer() {
        super.checkTrailer();
        System.out.println("У автомобиля нет проверки прицепа.");
    }
}
