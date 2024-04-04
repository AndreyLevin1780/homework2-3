public abstract class Vehicle implements VehicleMaintenance {

   private String modelName;

   private int wheelsCount;

   public Vehicle(String modelName, int wheelsCount) {
      this.modelName = modelName;
      this.wheelsCount = wheelsCount;
   }

   public String getModelName() {
      return modelName;
   }

   public int getWheelsCount() {
      return wheelsCount;
   }

    @Override
    public void updateTyre() {
       System.out.println("Меняем покрышку");
    }

   @Override
   public void checkEngine() {
      System.out.println("Проверяем двигатель");
   }

   @Override
   public void checkTrailer() {
      System.out.println("Проверяем прицеп");
   }

}

