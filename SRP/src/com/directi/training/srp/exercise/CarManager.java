package com.directi.training.srp.exercise;

public class CarManager
{
    CarsDB _carsDb;
    CarsDBManager requestFromDB;
    CarsNamesManager carsNamesManager;
    BestCarManager bestCarManager;

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

