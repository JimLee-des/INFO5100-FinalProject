/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Role.RailCrewWorkAreaJPanel;


public class RailCrewRole extends Role {
    
    // 继承role class
    public RailCrewRole(){
        this.type = RoleType.RailCrew;
    }

    @Override
    public JPanel createWorkArea(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        this.type = RoleType.RailCrew;
        return new RailCrewWorkAreaJPanel(mainScreen,userAccount,system);
    }
    
}
