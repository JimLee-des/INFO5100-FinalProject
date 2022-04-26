/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Passenger;

import java.util.ArrayList;

public class PassengerDirectory {

    private ArrayList<Passenger> passengerList;

    public PassengerDirectory() {
        this.passengerList = new ArrayList<Passenger>();
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(ArrayList<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public Passenger findPassengerByUsername(String username) {
        for (Passenger p : passengerList) {
            if (p.getUs().getUsername().equals(username)) {
                return p;
            }
        }
        return null;
    }

    // 添加新的乘客
    public Passenger createPassenger(String passengerName, String passengerId, String phoneNum) {
        Passenger passenger = new Passenger(passengerName, passengerId, phoneNum);
        passengerList.add(passenger);
        return passenger;
    }

    // 更新乘客的信息
    public void updatePassenger(String passengerName, String newPassengerName, String passengerId, String phoneNum) {
        for (int i = 0; i < passengerList.size(); i++) {
            if (passengerList.get(i).getPassengerName().equals(passengerName)) {
                passengerList.get(i).setPassengerName(newPassengerName);
                passengerList.get(i).setPassengerId(passengerId);
                passengerList.get(i).setPhoneNum(phoneNum);
            }
        }
    }

    //  删除乘客信息
    public void deletePassenger(String passengerName) {
        for (int i = 0; i < passengerList.size(); i++) {
            if (passengerList.get(i).getPassengerName().equals(passengerName)) {
                passengerList.remove(i);
            }
        }
    }
}
