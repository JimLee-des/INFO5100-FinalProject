/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Role;

import Business.RailCompany.RailCrew;
import Business.RailCompany.RailCompany;
import Business.EcoSystem;
import Business.RailCompany.RailNumber;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class RailCrewWorkAreaJPanel extends javax.swing.JPanel {

    JPanel mainScreen;
    EcoSystem system;
    UserAccount userAccount;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public RailCrewWorkAreaJPanel(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.mainScreen = mainScreen;
        this.userAccount = userAccount;
        this.system = system;
        populatetblFlt();
        System.out.println(userAccount.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        tblFlt = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        btnAssign = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblFlt.setBackground(new java.awt.Color(255, 204, 204));
        tblFlt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblFlt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "RailNumber_id", "Departure", "Destination", "Departure time", "Arriving time", "Train_id.", "Price", "Rail Company"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFlt.setGridColor(new java.awt.Color(0, 0, 153));
        jScrollPane3.setViewportView(tblFlt);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 700, 210));

        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setFont(new java.awt.Font("BM Hanna 11yrs Old", 0, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 153, 102));
        jTextField1.setText("Assignment");
        jTextField1.setBorder(null);
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 200, -1));

        btnAssign.setBackground(new java.awt.Color(204, 204, 255));
        btnAssign.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(51, 51, 255));
        btnAssign.setText("Assign to me");
        btnAssign.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFlt.getSelectedRow();
        for (RailCompany rc : system.getRailCompanyDirectory().getRailCompanyList()) {
            for (RailCrew crew : rc.getRailCrewList()) {
                if (crew.getCrewName().equals(userAccount.getName())) {
                    if (selectedRow >= 0) {
                        if (crew.getStatus().equals("Working")) {
                            JOptionPane.showMessageDialog(this, "This crew is already working!");
                            return;
                        }
                        crew.setStatus("Working");
                        for (RailNumber rn : rc.getRailNumberList()) {
                            if (rn.getRailNum_id().equals((String) tblFlt.getValueAt(selectedRow, 0))) {
                                rn.setReadyStatus(true);
                                crew.setRailNumber(rn.getRailNum_id());
                                JOptionPane.showMessageDialog(this, "The crew has boarded!");
                                populatetblFlt();
                                return;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Please select a row!");
                        return;
                    }

                }
            }
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblFlt;
    // End of variables declaration//GEN-END:variables

    private void populatetblFlt() {
        DefaultTableModel model = (DefaultTableModel) tblFlt.getModel();
        model.setRowCount(0);
        for (RailCompany rc : system.getRailCompanyDirectory().getRailCompanyList()) {
            for (RailNumber rn : rc.getRailNumberList()) {
                if (rn.getTrain_id() != null && rn.isReadyStatus() == false) {
                    Object[] row = new Object[8];
                    row[0] = rn.getRailNum_id();
                    row[1] = rn.getDeparture();
                    row[2] = rn.getDestination();
                    row[3] = rn.getDepartureTime();
                    row[4] = rn.getArrivingTime();
                    row[5] = rn.getTrain_id();
                    row[6] = rn.getPrice();
                    row[7] = rc.getRailCompanyName();
                    model.addRow(row);
                }
            }
        }
    }
}
