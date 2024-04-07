public class Truck extends Vehicle{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышки у грузовика.");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель автомобиля.");
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп грузовика.");
    }
}
