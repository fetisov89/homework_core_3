public class Bicycle extends Transport implements ServiceTransport{


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre(){
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check(ServiceTransport object) {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
