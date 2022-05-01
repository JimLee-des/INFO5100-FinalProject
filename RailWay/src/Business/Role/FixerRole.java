/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Role.FixerWorkAreaJPanel;


public class FixerRole extends Role{
    
    public FixerRole(){
        this.type = Role.RoleType.Fixer;
    }
    
    @Override
    public JPanel createWorkArea(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        this.type = Role.RoleType.Fixer;
        return new FixerWorkAreaJPanel(mainScreen, userAccount, system);
    }
}
