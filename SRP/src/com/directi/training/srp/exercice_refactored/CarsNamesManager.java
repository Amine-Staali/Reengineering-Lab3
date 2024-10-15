package com.directi.training.srp.exercice_refactored;

public class CarsNamesManager implements carsNames{
    CarsDB _carsDb;

    public CarsNamesManager(CarsDB _carsDb){
        this._carsDb = _carsDb;
    }

    @Override
    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb.getCars()) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);

    }
    
}
