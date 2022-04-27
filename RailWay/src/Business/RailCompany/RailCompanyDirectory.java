/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RailCompany;

import java.util.ArrayList;


public class RailCompanyDirectory {
    private ArrayList<RailCompany> RailCompanyList;

    public RailCompanyDirectory(){
        this.RailCompanyList=new ArrayList<RailCompany>();
    }

    public ArrayList<RailCompany> getRailCompanyList() {
        return RailCompanyList;
    }

    public void setRailCompanyList(ArrayList<RailCompany> RailCompanyList) {
        this.RailCompanyList = RailCompanyList;
    }

    // 添加一个高铁公司
    public RailCompany createRailCompany(String railCompanyName){
        RailCompany companyName= new RailCompany(railCompanyName);
        RailCompanyList.add(companyName);
        return companyName;
    }
    
     // 删除一个高铁公司
    public void deleteRailCompany(String companyName){
        for(int i=0;i<RailCompanyList.size();i++){
            if(RailCompanyList.get(i).getRailCompanyName().equals(companyName)){
                RailCompanyList.remove(i);
            }
        }
    }
    
    // 更新高铁公司的信息
    public void updateRailCompany(RailCompany railCompany,String compamyName){
 
                railCompany.setRailCompanyName(compamyName);
    
    }
    
    // 查找高铁公司
    public RailCompany  findRailLine (String compamyName){
        for(int i=0;i<RailCompanyList.size();i++){
            if(RailCompanyList.get(i).getRailCompanyName().equals(compamyName)){
                return RailCompanyList.get(i);
            }
        }
        return null;
    }
    
    // 添加一列火车
    public Train AddTrain(RailCompany railCompany,String train_id, String capacity, boolean repairStatus){
        Train train=new Train(train_id, capacity, false);
        railCompany.addTrain(train);
        return train;
    }
    
    // 删除一列火车
    public void DeleteTrain(RailCompany railCompany,Train train){
        for(int i=0; i<railCompany.getTrainList().size();i++){
            if(railCompany.getTrainList().get(i).getTrain_id().equals(train.getTrain_id())){
                railCompany.getTrainList().remove(i);
            }
        }
    }
}
