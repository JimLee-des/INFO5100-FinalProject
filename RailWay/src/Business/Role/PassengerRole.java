/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import ui.Role.PassengerAreaJPanel;
import javax.swing.JPanel;


public class PassengerRole extends Role{

    public PassengerRole(){
        this.type = RoleType.Passenger;
    }
    
    @Override
    public JPanel createWorkArea(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        this.type = RoleType.Passenger;
        return new PassengerAreaJPanel(mainScreen, userAccount, system);
    }

    
    
}
