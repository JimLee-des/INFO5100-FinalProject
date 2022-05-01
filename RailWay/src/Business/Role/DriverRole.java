/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Role.DriverWorkAreaJPanel;


public class DriverRole extends Role{
    
        // 继承role class
    public DriverRole(){
        this.type = Role.RoleType.Driver;
    }
    
    @Override
    public JPanel createWorkArea(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        this.type = Role.RoleType.Driver;
        return new DriverWorkAreaJPanel(mainScreen, userAccount, system);
    }
    
}
