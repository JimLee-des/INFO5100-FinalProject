/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.Role.CheckerWorkAreaJPanel;


public class TicketCheckerRole extends Role{
    
    public TicketCheckerRole(){
        this.type = RoleType.Checker;
    }
    
    @Override
    public JPanel createWorkArea(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        this.type = RoleType.Checker;
        return new CheckerWorkAreaJPanel(mainScreen, userAccount, system);
    }
    
}
