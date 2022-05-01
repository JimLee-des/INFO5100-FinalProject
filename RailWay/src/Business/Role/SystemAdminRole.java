/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import ui.Role.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;


public class SystemAdminRole extends Role{

    // 继承role claass
    public SystemAdminRole(){
        this.type = RoleType.System;
    }
    
    @Override
    public JPanel createWorkArea(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        this.type = RoleType.System;
        return new SystemAdminWorkAreaJPanel(mainScreen, userAccount, system);
    }
    
}
