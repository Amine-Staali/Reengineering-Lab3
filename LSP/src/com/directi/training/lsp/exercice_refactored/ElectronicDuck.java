package com.directi.training.lsp.exercice_refactored;

public class ElectronicDuck implements DuckType{
    private boolean _on = false;

    public ElectronicDuck(boolean status){
        this._on = status;
    }
    
    @Override
    public void quack()
    {
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new RuntimeException("Can't quack when off");
        }
    }

    @Override
    public void swim()
    {
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            throw new RuntimeException("Can't swim when off");
        }
    }

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }
}
