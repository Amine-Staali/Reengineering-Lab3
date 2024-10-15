package com.directi.training.ocp.exercice_refactored;

public interface Resources {
    public void markSlotFree(int resourceId);
    public void markSlotBusy(int resourceId);
    public int findFreeSlot();
    public int allocate();
    public void free(int resourceId);
}
