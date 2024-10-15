package com.directi.training.ocp.exercice_refactored;

public class ResourceManager {
    Resources resources;

    public ResourceManager(Resources resources){
        this.resources = resources;
    }

    public int TimeSlotAllocate(){
        return resources.allocate();
    }

    public int SpaceSlotAllocate(){
        return resources.allocate();
    }

    //Continue The implementation of other methods... 
}
