/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;


public abstract class Role {

    // 枚举10个角色
    public enum RoleType{
        RailAdmin("RailAdmin"),
        Passenger("Passenger"),
        Fixer("Fixer"),
        Ground("Ground"),
        Insurance("Insurance"),
        RailCrew("RailCrew"),
        Driver("Driver"),
        Announcer("Announcer"),
        Checker("Checker"),
        System("System");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public RoleType type;

    public RoleType getType() {
        return type;
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}