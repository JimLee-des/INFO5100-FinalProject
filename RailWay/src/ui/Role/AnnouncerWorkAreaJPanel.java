/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Role;

import Business.RailCompany.RailCompany;
import Business.EcoSystem;
import Business.RailCompany.RailNumber;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class AnnouncerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnnouncerWorkAreaJPanel
     */
    private JPanel mainScreen;
    private UserAccount userAccount;
    private EcoSystem system;
    public AnnouncerWorkAreaJPanel(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
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
        btnAnnounce = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        tblFlt.setAutoCreateRowSorter(true);
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
        tblFlt.setGridColor(new java.awt.Color(51, 0, 153));
        tblFlt.setSelectionForeground(java.awt.SystemColor.controlHighlight);
        jScrollPane3.setViewportView(tblFlt);

        btnAnnounce.setBackground(new java.awt.Color(204, 204, 255));
        btnAnnounce.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        btnAnnounce.setForeground(new java.awt.Color(255, 255, 255));
        btnAnnounce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/play_副本.png"))); // NOI18N
        btnAnnounce.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAnnounce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnounceActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/广播 Small.png"))); // NOI18N

        jTextField1.setBackground(new java.awt.Color(204, 204, 255));
        jTextField1.setFont(new java.awt.Font("BM Hanna 11yrs Old", 0, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 153, 102));
        jTextField1.setText("Broadcast Station");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAnnounce, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAnnounce)
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnnounceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnounceActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFlt.getSelectedRow();
        
        JOptionPane.showMessageDialog(this,"The Train"+(String) tblFlt.getValueAt(selectedRow, 0)+" will departure at "+(String) tblFlt.getValueAt(selectedRow, 3));
    }//GEN-LAST:event_btnAnnounceActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnounce;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblFlt;
    // End of variables declaration//GEN-END:variables

    private void populatetblFlt() {
        DefaultTableModel model = (DefaultTableModel) tblFlt.getModel();
        model.setRowCount(0);
        for (RailCompany rc : system.getRailCompanyDirectory().getRailCompanyList()) {
            for(RailNumber rn : rc.getRailNumberList()){
                if(rn.isReadyStatus()){
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

