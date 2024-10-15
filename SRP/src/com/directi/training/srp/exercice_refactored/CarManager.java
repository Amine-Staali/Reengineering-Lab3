package com.directi.training.srp.exercice_refactored;

public class CarManager
{
    CarsDB _carsDb;
    CarsDBManager requestFromDB;
    CarsNamesManager carsNamesManager;
    BestCarManager bestCarManager;

    public CarManager(){}

    public Car getFromDb(final String carId){
        return requestFromDB.getFromDb(carId);
    }

    public String getCarsNames(){
        return carsNamesManager.getCarsNames();
    }

    public Car getBestCar() {
        return bestCarManager.getBestCar();
    }
}

