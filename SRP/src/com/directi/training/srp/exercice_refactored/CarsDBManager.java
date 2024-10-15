package com.directi.training.srp.exercice_refactored;

public class CarsDBManager implements RequestFromDB{
    private CarsDB _carsDb;
    
    public CarsDBManager(CarsDB _carsDb){
        this._carsDb = _carsDb;
    }

    @Override
    public Car getFromDb(final String carId) {
        for (Car car : _carsDb.getCars()) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }
    
}
