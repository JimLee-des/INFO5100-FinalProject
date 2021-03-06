/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Role;

import Business.RailCompany.RailCompany;
import Business.RailCompany.Train;
import Business.EcoSystem;
import Business.RailCompany.RailNumber;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class FixerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FixerWorkAreaJPanel
     */
    private JPanel mainScreen;
    private UserAccount userAccount;
    private EcoSystem system;

    public FixerWorkAreaJPanel(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.mainScreen = mainScreen;
        this.userAccount = userAccount;
        this.system = system;
        populatetblAp();
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tblAp = new javax.swing.JTable();
        repairjButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        tblAp.setAutoCreateRowSorter(true);
        tblAp.setBackground(new java.awt.Color(255, 204, 204));
        tblAp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblAp.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        tblAp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Train_id", "Capacity", "Repair requirement", "Occupation Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAp.setGridColor(new java.awt.Color(62, 80, 170));
        tblAp.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tblAp.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tblAp.setShowGrid(true);
        jScrollPane2.setViewportView(tblAp);

        repairjButton1.setBackground(new java.awt.Color(104, 139, 241));
        repairjButton1.setFont(new java.awt.Font("??????", 0, 14)); // NOI18N
        repairjButton1.setText("fix it");
        repairjButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        repairjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repairjButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("BM Hanna 11yrs Old", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 102));
        jLabel2.setText("Hello Repairman");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/044-worker.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(242, 242, 242))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(repairjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(repairjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void repairjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repairjButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAp.getSelectedRow();
        if (selectedRow < 0) {
            return;
        }

        for (RailCompany rc : system.getRailCompanyDirectory().getRailCompanyList()) {
            for (Train train : rc.getTrainList()) {
                if (train.getTrain_id().equals((String) tblAp.getValueAt(selectedRow, 0))) {
                    train.setRepairStatus(false);
                    JOptionPane.showMessageDialog(this, "The train has been inspected and repaired!");
                    populatetblAp();
                    return;
                }
            }
        }


    }//GEN-LAST:event_repairjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton repairjButton1;
    private javax.swing.JTable tblAp;
    // End of variables declaration//GEN-END:variables

    private void populatetblAp() {
        DefaultTableModel model = (DefaultTableModel) tblAp.getModel();
        model.setRowCount(0);
        for (RailCompany rc : system.getRailCompanyDirectory().getRailCompanyList()) {
            for (Train train : rc.getTrainList()) {
                if (train.isRepairStatus()) {
                    Object[] row = new Object[4];
                    row[0] = train.getTrain_id();
                    row[1] = train.getCapacity();
                    row[2] = train.isRepairStatus() ? "Yes" : "No";
                    row[3] = train.isUsingStatus() ? "Occupied" : "Not Occupied";
                    model.addRow(row);

                }

            }
        }
    }
}
