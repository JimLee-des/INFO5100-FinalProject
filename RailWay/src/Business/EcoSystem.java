/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Passenger.PassengerDirectory;
import Business.RailCompany.RailCompanyDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;


public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private RailCompanyDirectory railCompanyDirectory;
    private PassengerDirectory passengerDirectory;

    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    
    private EcoSystem(){
        super(null);
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }

    public PassengerDirectory getPassengerDirectory() {
        if(passengerDirectory == null){
            passengerDirectory = new PassengerDirectory();
        }
        return passengerDirectory;
    }

    public void setPassengerDirectory(PassengerDirectory customerDirectory) {
        this.passengerDirectory = customerDirectory;
    }

    public RailCompanyDirectory getRailCompanyDirectory() {
        if(railCompanyDirectory == null){
            railCompanyDirectory = new RailCompanyDirectory();
        }
        return railCompanyDirectory;
    }

    public void setRailCompanyDirectory(RailCompanyDirectory railLineDirectory) {
        this.railCompanyDirectory = railLineDirectory;
    }

}
