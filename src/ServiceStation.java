public class ServiceStation implements ServiceTransport {



    @Override
    public void updateTyre(Truck truck) {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void updateTyre(Car car) {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void updateTyre(Bicycle bicycle) {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine(Truck truck) {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkEngine(Car car) {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer(Truck truck) {
        System.out.println("Проверяем прицеп");
    }

    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
        }
    }
}
