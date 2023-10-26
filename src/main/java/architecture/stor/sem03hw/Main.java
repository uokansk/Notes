package architecture.stor.sem03hw;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        RefuelingStation refuelingStation1 = new RefuelingStation();

        TyreFittingStation tyreFittingStation1 = new TyreFittingStation();
        tyreFittingStation1.setTyreFitPrice(CarType.Sedan, 1000);
        tyreFittingStation1.setTyreFitPrice(CarType.Sport, 1500);
        tyreFittingStation1.setTyreFitPrice(CarType.Special, 2000);

        CarWashStation carWashStation1 = new CarWashStation();
        carWashStation1.setCarWashPrice(CarType.Sedan, 1500);
        carWashStation1.setCarWashPrice(CarType.Sport, 2500);
        carWashStation1.setCarWashPrice(CarType.Special, 5000);

        SportCar sportCar1 = new SportCar("BMW", "M8", Color.BLUE, FuelType.Gasoline);
        SedanCar sedanCar1 = new SedanCar("Volkswagen", "Polo", Color.WHITE, FuelType.Gasoline);
        HarvesterCar harvesterCar1 = new HarvesterCar("CAT", "Pillar 180", Color.BLACK);

        sportCar1.setRefuelingStation(refuelingStation1);
        sportCar1.fuel();
        sedanCar1.setRefuelingStation(refuelingStation1);
        sedanCar1.fuel();
        harvesterCar1.setRefuelingStation(refuelingStation1);
        harvesterCar1.fuel();

        sportCar1.setTyreFittingStation(tyreFittingStation1);
        sportCar1.fitTyres();
        sedanCar1.setTyreFittingStation(tyreFittingStation1);
        sedanCar1.fitTyres();
        harvesterCar1.setTyreFittingStation(tyreFittingStation1);
        harvesterCar1.fitTyres();

        sportCar1.setCarWashingStation(carWashStation1);
        sportCar1.washCar();
        sedanCar1.setCarWashingStation(carWashStation1);
        sedanCar1.washCar();
        harvesterCar1.setCarWashingStation(carWashStation1);
        harvesterCar1.washCar();

    }
}
