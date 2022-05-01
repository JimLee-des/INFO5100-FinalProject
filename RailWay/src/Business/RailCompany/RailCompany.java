/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RailCompany;

import Business.Passenger.Passenger;
import Business.Order.Order;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

public class RailCompany {

    private ArrayList<Train> trainList;
    private ArrayList<RailNumber> railNumberList;
    private ArrayList<Order> orderList;
    private ArrayList<RailCrew> railCrewList;
    private String railCompanyName;

    public RailCompany(String railCompanyName) {
        this.railCompanyName = railCompanyName;
        trainList = new ArrayList<Train>();
        railNumberList = new ArrayList<RailNumber>();
        orderList = new ArrayList<Order>();
        railCrewList = new ArrayList<RailCrew>();
    }

    public ArrayList<Train> getTrainList() {
        return trainList;
    }

    public void setTrainList(ArrayList<Train> trainList) {
        this.trainList = trainList;
    }

    public ArrayList<RailNumber> getRailNumberList() {
        return railNumberList;
    }

    public void setRailNumberList(ArrayList<RailNumber> railNumberList) {
        this.railNumberList = railNumberList;
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public ArrayList<RailCrew> getRailCrewList() {
        return railCrewList;
    }

    public void setRailCrewList(ArrayList<RailCrew> railCrewList) {
        this.railCrewList = railCrewList;
    }

    public String getRailCompanyName() {
        return railCompanyName;
    }

    public void setRailCompanyName(String railCompanyName) {
        this.railCompanyName = railCompanyName;
    }

    // 添加一个新的班次
    public void addRailNumber(String railNum_id, String departure, String destination,
            String departureTime, String arrivingTime, String price, String railCompany) {
        RailNumber railNum = new RailNumber();
        railNum.setRailNum_id(railNum_id);
        railNum.setDeparture(departure);
        railNum.setDestination(destination);
        railNum.setDepartureTime(departureTime);
        railNum.setArrivingTime(arrivingTime);
        railNum.setPrice(price);
        railNum.setStatus(false);
        railNum.setReadyStatus(false);
        railNum.setCustomerStatus(false);
        railNum.setRailCompany(railCompany);
        railNum.setPassengerList(new ArrayList<Passenger>());
        railNum.setTimeStatus(false);
        railNumberList.add(railNum);
    }

    // 添加一个新的乘务组
    public void addRailCrew(String crewName,UserAccount user) {
        RailCrew rc = new RailCrew(crewName);
        rc.setUs(user);
        railCrewList.add(rc);
    }

    // 添加一个新的火车
    public void addTrain(Train train) {
        trainList.add(train);
    }

    //通过对象删除火车
    public void removeTrain(Train train) {
        trainList.remove(train);
    }

    // 添加一个order
    public Order addOrder(String passengerName, String railNum_id,
            String departure, String destination, String departureTime,
            String arrivingTime, String train_id, String price, boolean status,
            String railCompany, boolean insurance) {
        Order order = new Order(passengerName, railNum_id, departure,
                destination, departureTime, arrivingTime, train_id, price, railCompany, insurance);
        orderList.add(order);
        return order;
    }

//    public String getUUID(){
//        UUID uuid=UUID.randomUUID();
//        String str = uuid.toString(); 
//        String uuidStr=str.replace("-", "");
//        return uuidStr;
//      }
    // 删除订单
    public void deleteOrder(String order_id) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getOrder_id().equals(order_id)) {
                orderList.remove(i);
            }
        }
    }

    // 通过train id 删除一列火车
    public void deleteTrain(String train_id) {
        for (int i = 0; i < trainList.size(); i++) {
            if (trainList.get(i).getTrain_id().equals(train_id)) {
                trainList.remove(i);
            }
        }
    }

    // 删除火车班次
    public void deleteRailNumber(String railNum_id) {
        for (int i = 0; i < railNumberList.size(); i++) {
            if (railNumberList.get(i).getRailNum_id().equals(railNum_id)) {
                railNumberList.remove(i);
            }
        }
    }

    // 删除乘务组
    public void deleteRailCrew(String crewName) {
        for (int i = 0; i < railCrewList.size(); i++) {
            if (railCrewList.get(i).getCrewName().equals(crewName)) {
                railCrewList.remove(i);
            }
        }
    }

    //  检查乘务组人员是否唯一
    public boolean checkIfRailCrewIsUnique(String crewName) {
        for (RailCrew rc : railCrewList) {
            if (rc.getCrewName().equals(crewName)) {
                return false;
            }
        }
        return true;
    }


    public RailNumber findRailNumber(String railNum_id) {
        for (RailNumber rn : railNumberList) {
            if (rn.getRailNum_id().equals(railNum_id)) {
                return rn;
            }
        }
        return null;
    }
    // 检查班次是否唯一
    public boolean checkIfRailNumberIsUnique(String railNum_id) {
        for (RailNumber rn : railNumberList) {
            if (rn.getRailNum_id().equals(railNum_id)) {
                return false;
            }
        }
        return true;
    }

    // 检查火车是否唯一
    public boolean checkIfTrainIsUnique(String train_id) {
        for (Train t : trainList) {
            if (t.getTrain_id().equals(train_id)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return railCompanyName;
    }
}
