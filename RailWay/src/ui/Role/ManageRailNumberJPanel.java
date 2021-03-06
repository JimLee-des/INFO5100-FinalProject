/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Role;

import Business.RailCompany.RailCompany;
import Business.RailCompany.RailNumber;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageRailNumberJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRailNumberJPanel
     */
    private JPanel mainScreen;
    private UserAccount userAccount;
    private EcoSystem system;
    public ManageRailNumberJPanel(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.mainScreen = mainScreen;
        this.userAccount = userAccount;
        this.system = system;
        populatetblFlt();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtDes = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        txtDep = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtOri = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtArr = new javax.swing.JTextField();
        btnBack1 = new javax.swing.JButton();
        txtCos = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblFlt = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel10.setFont(new java.awt.Font("??????", 0, 14)); // NOI18N
        jLabel10.setText("Departure Time:");

        btnConfirm.setBackground(new java.awt.Color(108, 139, 241));
        btnConfirm.setFont(new java.awt.Font("??????", 0, 14)); // NOI18N
        btnConfirm.setText("Confirm Update");
        btnConfirm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        txtDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(108, 139, 241));
        btnUpdate.setFont(new java.awt.Font("??????", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("??????", 0, 14)); // NOI18N
        jLabel13.setText("Arriving Time:");

        jLabel14.setFont(new java.awt.Font("??????", 0, 14)); // NOI18N
        jLabel14.setText("Cost:");

        jLabel2.setFont(new java.awt.Font("BM Hanna 11yrs Old", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Train Information");

        btnBack1.setFont(new java.awt.Font("??????", 0, 14)); // NOI18N
        btnBack1.setText("<< Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("??????", 0, 14)); // NOI18N
        jLabel8.setText("Departure:");

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
        tblFlt.setGridColor(new java.awt.Color(0, 51, 153));
        jScrollPane3.setViewportView(tblFlt);

        jLabel6.setFont(new java.awt.Font("??????", 0, 14)); // NOI18N
        jLabel6.setText("RailNumber_id:");

        btnCreate.setBackground(new java.awt.Color(108, 139, 241));
        btnCreate.setFont(new java.awt.Font("??????", 0, 14)); // NOI18N
        btnCreate.setText("Create Train");
        btnCreate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("??????", 0, 14)); // NOI18N
        jLabel9.setText("Destination:");

        btnDelete.setBackground(new java.awt.Color(108, 139, 241));
        btnDelete.setFont(new java.awt.Font("??????", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDep, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtOri, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13)
                                .addGap(12, 12, 12)
                                .addComponent(txtArr, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCreate)
                .addGap(18, 18, 18)
                .addComponent(btnConfirm)
                .addGap(73, 73, 73))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDep, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOri, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtArr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnCreate))
                .addContainerGap(47, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        String rainNum_id = txtId.getText();
        String departure = txtOri.getText();
        String destination = txtDes.getText();
        String dTime = txtDep.getText();
        String aTime = txtArr.getText();
        String price = txtCos.getText();
        int selectRow = tblFlt.getSelectedRow();
        
        if(rainNum_id.length() == 0 || departure.length() == 0 || destination.length()==0 || dTime.length() == 0 ||aTime.length() ==0 || price.length() == 0){
            JOptionPane.showMessageDialog(null, "Please check the blank space");
            return;
        }
        
        if(price.toCharArray()[0] == '0'){
            JOptionPane.showMessageDialog(null, "Please check the format of price");
            return;
        }

        try {
            int pr = Integer.parseInt(price);
            if (pr <= 0){
                JOptionPane.showMessageDialog(null, "Price can not less than 0");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please check the price format");
            return;
        }
        
        for(RailCompany rc : system.getRailCompanyDirectory().getRailCompanyList()){
            if(rc.getRailCompanyName().equals(userAccount.getName())){
                for(int i = 0; i < rc.getRailNumberList().size();i++){
                    if(rc.getRailNumberList().get(i).getRailNum_id().equals((String) tblFlt.getValueAt(selectRow, 0))){
//                        if(rc.checkIfRailNumberIsUnique(rainNum_id) == false){
//                            JOptionPane.showMessageDialog(null," The RailNumber already exists ");
//                        }else{
                            rc.getRailNumberList().get(i).setRailNum_id(rainNum_id);
                            rc.getRailNumberList().get(i).setDeparture(departure);
                            rc.getRailNumberList().get(i).setDestination(destination);
                            rc.getRailNumberList().get(i).setDepartureTime(dTime);
                            rc.getRailNumberList().get(i).setArrivingTime(aTime);
                            rc.getRailNumberList().get(i).setPrice(price);
                            populatetblFlt();
                            txtId.setEnabled(true);
                            btnCreate.setEnabled(true);
                            btnDelete.setEnabled(true);
                            btnUpdate.setEnabled(true);
                            btnConfirm.setEnabled(false);
                            txtId.setText("");
                            txtOri.setText("");
                            txtDes.setText("");
                            txtDep.setText("");
                            txtArr.setText("");
                            txtCos.setText("");
//                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblFlt.getSelectedRow();

        if(selectRow>=0){
            String rainNum_id = (String) tblFlt.getValueAt(selectRow, 0);
            String departure = (String) tblFlt.getValueAt(selectRow, 1);
            String destination = (String) tblFlt.getValueAt(selectRow, 2);
            String dTime = (String) tblFlt.getValueAt(selectRow, 3);
            String aTime = (String) tblFlt.getValueAt(selectRow, 4);
            String price = (String) tblFlt.getValueAt(selectRow, 6);
            txtId.setEnabled(false);
            txtId.setText(rainNum_id+"");
            txtOri.setText(departure+"");
            txtDes.setText(destination+"");
            txtDep.setText(dTime+"");
            txtArr.setText(aTime+"");
            txtCos.setText(price+"");
        }else {
            JOptionPane.showMessageDialog(this,"Please select a row");
        }
        btnCreate.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnConfirm.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        mainScreen.remove(this);
        Component[] componentArray = mainScreen.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) mainScreen.getLayout();
        layout.previous(mainScreen);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed

        String rainNum_id = txtId.getText();
        String departure = txtOri.getText();
        String destination = txtDes.getText();
        String dTime = txtDep.getText();
        String aTime = txtArr.getText();
        String price = txtCos.getText();
        
        if(rainNum_id.length() == 0 || departure.length() == 0 || destination.length()==0 || dTime.length() == 0 ||aTime.length() ==0 || price.length() == 0){
            JOptionPane.showMessageDialog(null, "Please check the blank space");
            return;
        }
        if(price.toCharArray()[0] == '0'){
            JOptionPane.showMessageDialog(null, "Please check the format of price");
            return;
        }
        try {
            int pr = Integer.parseInt(price);
            if (pr <= 0){
                JOptionPane.showMessageDialog(null, "Price can not less than 0");
                return;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please check the price format");
            return;
        }
        
        char[] dTimeArray = dTime.toCharArray();
        char[] aTimeArray = aTime.toCharArray();
        if(dTimeArray.length < 10 || aTimeArray.length < 10){
            JOptionPane.showMessageDialog(null, "Date formate should be yyyy-mm-dd");
            return;
        }
        if( dTimeArray[4] != '-' && dTimeArray[7] != '-' && dTimeArray[10] != '-'){
            JOptionPane.showMessageDialog(null, "Date formate should be yyyy-mm-dd");
            return;
        }
        
        if( aTimeArray[4] != '-' && aTimeArray[7] != '-' && aTimeArray[10] != '-'){
            JOptionPane.showMessageDialog(null, "Date formate should be yyyy-mm-dd");
            return;
        }
        
        try {
            int dTimeYear = Integer.parseInt(dTime.substring(0, 4));
            int aTimeYear = Integer.parseInt(aTime.substring(0, 4));
            if(dTimeYear > aTimeYear){
                JOptionPane.showMessageDialog(null, "Departure should be earlier than arriving time.");
            return;
            }else{
                int dTimeMonth = Integer.parseInt(dTime.substring(5, 7));
                int aTimeMonth = Integer.parseInt(aTime.substring(5, 7));
                if(dTimeMonth > aTimeMonth){
                    JOptionPane.showMessageDialog(null, "Departure should be earlier than arriving time.");
                    return;
            }else{
                    int dTimeDay = Integer.parseInt(dTime.substring(8, 10));
                    int aTimeDay = Integer.parseInt(aTime.substring(8, 10));
                    if(dTimeDay > aTimeDay){
                        JOptionPane.showMessageDialog(null, "Departure should be earlier than arriving time.");
                    return;
                }
        }
        }} catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Please change the format in Date.");
                return;
                }

        
        for(RailCompany rc : system.getRailCompanyDirectory().getRailCompanyList()){
            if(rc.getRailCompanyName().equals(userAccount.getName())){
                if(rc.checkIfRailNumberIsUnique(rainNum_id) == false){
                    JOptionPane.showMessageDialog(this,"It is already existing ");
                }else{
                    rc.addRailNumber(rainNum_id, departure, destination, dTime, aTime, price,rc.getRailCompanyName());
                    populatetblFlt();
                    txtId.setText("");
                    txtOri.setText("");
                    txtDes.setText("");
                    txtDep.setText("");
                    txtArr.setText("");
                    txtCos.setText("");
                }
            }
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFlt.getSelectedRow();
        if(selectedRow>=0){
            String id = (String) tblFlt.getValueAt(selectedRow, 0);
            for(RailCompany rc : system.getRailCompanyDirectory().getRailCompanyList()){
                if(rc.getRailCompanyName().equals(userAccount.getName())){
                    rc.deleteRailNumber(id);
                }
            }
            populatetblFlt();
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblFlt;
    private javax.swing.JTextField txtArr;
    private javax.swing.JTextField txtCos;
    private javax.swing.JTextField txtDep;
    private javax.swing.JTextField txtDes;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtOri;
    // End of variables declaration//GEN-END:variables

    private void populatetblFlt() {
        DefaultTableModel model = (DefaultTableModel) tblFlt.getModel();
        model.setRowCount(0);
        for(RailCompany rc : system.getRailCompanyDirectory().getRailCompanyList()){
            if(rc.getRailCompanyName().equals(userAccount.getName())){
                for(RailNumber rn : rc.getRailNumberList()){
                    if(rn.isStatus() == false){
                        Object[] row = new Object[8];
                        row[0] = rn.getRailNum_id();
                        row[1] = rn.getDeparture();
                        row[2] = rn.getDestination();
                        row[3] = rn.getDepartureTime();
                        row[4] = rn.getArrivingTime();
                        row[5] = (rn.getTrain_id()==null)? "Not Assigned Yet" : rn.getTrain_id();
                        row[6] = rn.getPrice();
                        row[7] = rc.getRailCompanyName();
                        model.addRow(row);
                    }
                }
            }
        }
    }
}
