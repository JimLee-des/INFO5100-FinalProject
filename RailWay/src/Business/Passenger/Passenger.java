/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Passenger;

import Business.Order.Order;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;


public class Passenger {
    private String passengerName;
    private ArrayList<Order> orderList;
    private String passengerId;
    private String phoneNum;
    private UserAccount us;

    public UserAccount getUs() {
        return us;
    }

    public void setUs(UserAccount us) {
        this.us = us;
    }

    public Passenger(String passengerName, String passengerId, String phoneNum) {
        this.passengerName = passengerName;
        this.passengerId = passengerId;
        this.phoneNum = phoneNum;
        orderList = new ArrayList<Order>();
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(String passengerId) {
        this.passengerId = passengerId;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    
    
    // 添加订单
    public Order addOrder(Order order){
        orderList.add(order);
        return order;
    }
    // 删除订单
    public void deleteOrder(Order order){
        for(int i=0; i<orderList.size(); i++){
            if(orderList.get(i).getOrder_id().equals(order.getOrder_id())){
                orderList.remove(i);
            }
        }
    }
    // 检查订单是否唯一
    public boolean checkIfOrderIsUnique(Order order){
        for(Order od : orderList){
            if(od.getRailNum_id().equals(order.getRailNum_id())){
                return true;
            }
        }
        return false;
    }
    
}
