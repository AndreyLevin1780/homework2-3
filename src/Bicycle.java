public class Bicycle extends Vehicle{


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        super.checkEngine();
        System.out.println("У велосипеда нет проверки двигателя.");
    }

    @Override
    public void checkTrailer() {
        super.checkTrailer();
        System.out.println("У велосипеда нет проверки прицепа.");
    }
}
