/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RailCompany;

import Business.UserAccount.UserAccount;

public class RailCrew {

    private String crewName;
    private String status;
    private String railNumber;
    private UserAccount us;

    public UserAccount getUs() {
        return us;
    }

    public void setUs(UserAccount us) {
        this.us = us;
    }

    public RailCrew(String crewName) {
        this.crewName = crewName;
        this.status = "Not Working";
        this.railNumber = "Not Assigned";
    }

    public String getCrewName() {
        return crewName;
    }

    public void setCrewName(String crewName) {
        this.crewName = crewName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRailNumber() {
        return railNumber;
    }

    public void setRailNumber(String train) {
        this.railNumber = train;
    }

}
