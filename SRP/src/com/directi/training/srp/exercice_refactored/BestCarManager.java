package com.directi.training.srp.exercice_refactored;

public class BestCarManager implements BestCar{
    private CarsDB _carsDb;
    
    public BestCarManager(CarsDB _carsDb){
        this._carsDb = _carsDb;
    }

    @Override
    public Car getBestCar() {
        Car bestCar = null;
        for (Car car : _carsDb.getCars()) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }

}
