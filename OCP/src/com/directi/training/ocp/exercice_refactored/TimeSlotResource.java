package com.directi.training.ocp.exercice_refactored;

public class TimeSlotResource implements Resources{

    public TimeSlotResource(){}

    @Override
    public void markSlotFree(int resourceId) {
    }

    @Override
    public void markSlotBusy(int resourceId) {
    }

    @Override
    public int findFreeSlot() {
        return 0;
    }
    
    @Override
    public int allocate(){
        int resourceId;
        resourceId = findFreeSlot();
        markSlotBusy(resourceId);
        return resourceId;
    }

    @Override
    public void free(int resourceId){
        markSlotFree(resourceId);
    }
}
