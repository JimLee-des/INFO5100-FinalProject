/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RailCompany;

import Business.Passenger.Passenger;
import java.util.ArrayList;

// 高铁班次
public class RailNumber {
    private String railNum_id;
    private String departure;
    private String destination;
    private boolean status;//是否出发
    private boolean readyStatus;//乘务组是否上飞机
    private boolean customerStatus;//检票员决定顾客是否已经全部上飞机
    private boolean timeStatus;//是否延误
    private String train_id;
    private String price;
    private String departureTime;
    private ArrayList<Passenger> passengerList;
    private String arrivingTime;
    private String railCompany;

    public String getRailNum_id() {
        return railNum_id;
    }

    public void setRailNum_id(String railNum_id) {
        this.railNum_id = railNum_id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isReadyStatus() {
        return readyStatus;
    }

    public void setReadyStatus(boolean readyStatus) {
        this.readyStatus = readyStatus;
    }

    public boolean isCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(boolean customerStatus) {
        this.customerStatus = customerStatus;
    }

    public boolean isTimeStatus() {
        return timeStatus;
    }

    public void setTimeStatus(boolean timeStatus) {
        this.timeStatus = timeStatus;
    }

    public String getTrain_id() {
        return train_id;
    }

    public void setTrain_id(String train_id) {
        this.train_id = train_id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(ArrayList<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public String getArrivingTime() {
        return arrivingTime;
    }

    public void setArrivingTime(String arrivingTime) {
        this.arrivingTime = arrivingTime;
    }

    public String getRailCompany() {
        return railCompany;
    }

    public void setRailCompany(String railCompany) {
        this.railCompany = railCompany;
    }
    
    @Override
    public String toString(){
        return railNum_id;
    }
}
