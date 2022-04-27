/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.UUID;


public class Order {
    private String order_id;
    private String passengerName;
    private String railNum_id;;// 火车班次的编号
    private String departure;
    private String destination;
    private String departureTime;
    private String arrivingTime;
    private String train_id; // 火车的编号
    private String price;
    private String status; 
    private String railCompany;
    private boolean insurance; 
    private String claim;

    public Order(String passengerName, String railNum_id, 
            String departure, String destination, String departureTime, 
            String arrivingTime, String train_id, String price,
            String railCompany, boolean insurance) {
        this.order_id = getRandomID();
        this.passengerName = passengerName;
        this.railNum_id = railNum_id;
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivingTime = arrivingTime;
        this.train_id = train_id;
        this.price = price;
        this.railCompany = railCompany;
        this.insurance = insurance;
        this.status = "Processing";
        
    }
    // 生成随机的order 订单号
    public String getRandomID(){
        UUID uuid=UUID.randomUUID();
        String str = uuid.toString().substring(0,6); 
        String uuidStr=str.replace("-", "");
        return uuidStr;
      }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

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

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivingTime() {
        return arrivingTime;
    }

    public void setArrivingTime(String arrivingTime) {
        this.arrivingTime = arrivingTime;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRailCompany() {
        return railCompany;
    }

    public void setRailCompany(String railCompany) {
        this.railCompany = railCompany;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    public String getClaim() {
        return claim;
    }

    public void setClaim(String claim) {
        this.claim = claim;
    }
    
    @Override
    public String toString() {
        return order_id;
    }
}
