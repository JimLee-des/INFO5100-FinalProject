/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RailCompany;

// 火车
public class Train {
    private String train_id;
    private String capacity;
    private boolean repairStatus;
    private boolean usingStatus;
    
    public Train(String train_id, String capacity, boolean repairStatus){
        this.train_id = train_id;
        this.capacity = capacity;
        this.repairStatus = repairStatus;
        this.usingStatus = false;
    }

    public String getTrain_id() {
        return train_id;
    }

    public void setTrain_id(String train_id) {
        this.train_id = train_id;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public boolean isRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(boolean repairStatus) {
        this.repairStatus = repairStatus;
    }

    public boolean isUsingStatus() {
        return usingStatus;
    }

    public void setUsingStatus(boolean usingStatus) {
        this.usingStatus = usingStatus;
    }
    
    @Override
    public String toString() {
        return train_id;
    }
}
