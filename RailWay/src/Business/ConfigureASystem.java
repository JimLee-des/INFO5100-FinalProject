package Business;

import Business.Employee.Employee;
import Business.Role.FixerRole;
import Business.Role.AnnouncerRole;
import Business.Role.DriverRole;
import Business.Role.GroundRole;
import Business.Role.InsuranceRole;
import Business.Role.SystemAdminRole;
import Business.Role.TicketCheckerRole;
import Business.UserAccount.UserAccount;


public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        Employee employee = system.getEmployeeDirectory().createEmployee("System");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        Employee e1 = system.getEmployeeDirectory().createEmployee("Fixer");
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("fixer", "fixer", employee, new FixerRole());
        
        Employee e2 = system.getEmployeeDirectory().createEmployee("Driver");
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("driver", "driver", employee, new DriverRole());
        
        Employee e3 = system.getEmployeeDirectory().createEmployee("Announcer");
        UserAccount ua3 = system.getUserAccountDirectory().createUserAccount("announcer", "announcer", employee, new AnnouncerRole());
        
        Employee e4 = system.getEmployeeDirectory().createEmployee("Checker");
        UserAccount ua4 = system.getUserAccountDirectory().createUserAccount("checker", "checker", employee, new TicketCheckerRole());
        
        Employee e5 = system.getEmployeeDirectory().createEmployee("Insurance");
        UserAccount ua5 = system.getUserAccountDirectory().createUserAccount("insurance", "insurance", employee, new InsuranceRole());
        
        Employee e6 = system.getEmployeeDirectory().createEmployee("Ground");
        UserAccount ua6 = system.getUserAccountDirectory().createUserAccount("ground", "ground", employee, new GroundRole());
        
        return system;
    }
    
}
