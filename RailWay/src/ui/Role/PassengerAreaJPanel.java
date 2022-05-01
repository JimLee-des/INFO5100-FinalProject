/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Role;

import Business.RailCompany.RailCompany;
import Business.RailCompany.RailNumber;
import Business.Passenger.Passenger;
import Business.EcoSystem;
import Business.Order.Order;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class PassengerAreaJPanel extends javax.swing.JPanel {

    private JPanel mainScreen;
    private UserAccount userAccount;
    private EcoSystem system;
    private Passenger customer ;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public PassengerAreaJPanel(JPanel mainScreen, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.mainScreen = mainScreen;
        this.userAccount = userAccount;
        this.system = system;
        this.customer = system.getPassengerDirectory().findPassengerByUsername(userAccount.getUsername());
         passengerLabel.setText(customer.getPassengerName());
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

        btnView = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        enterpriseLabel = new javax.swing.JLabel();
        enterpriseLabel1 = new javax.swing.JLabel();
        passengerLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblFlt = new javax.swing.JTable();
        btnOrder = new javax.swing.JButton();
        cbInsurance = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 219, 227));

        btnView.setFont(new java.awt.Font("Tsukushi A Round Gothic", 1, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(62, 80, 170));
        btnView.setText("View History Order");
        btnView.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        enterpriseLabel.setFont(new java.awt.Font("Tsukushi A Round Gothic", 1, 18)); // NOI18N
        enterpriseLabel.setText("Passenger:");

        enterpriseLabel1.setFont(new java.awt.Font("BM Hanna 11yrs Old", 1, 36)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(255, 153, 102));
        enterpriseLabel1.setText("Order Your Rail Trip");

        passengerLabel.setFont(new java.awt.Font("Monaco", 0, 13)); // NOI18N
        passengerLabel.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passengerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passengerLabel)
                    .addComponent(enterpriseLabel1))
                .addGap(27, 27, 27))
        );

        tblFlt.setBackground(new java.awt.Color(204, 204, 255));
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
                "RailNumber_id", "Departure", "Destination", "Departure time", "Arriving time", "Trail_id", "Price", "Rail Company"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblFlt);

        btnOrder.setFont(new java.awt.Font("Tsukushi A Round Gothic", 1, 18)); // NOI18N
        btnOrder.setForeground(new java.awt.Color(62, 80, 170));
        btnOrder.setText("Order");
        btnOrder.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        cbInsurance.setText("Buy Insurance?");
        cbInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInsuranceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cbInsurance)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbInsurance)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnOrder))
                .addGap(124, 124, 124))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        PassengerOrderListJPanel rltjp = new PassengerOrderListJPanel(mainScreen, userAccount, system,customer);
        mainScreen.add("RequestLabTestJPanel", rltjp);
        CardLayout layout = (CardLayout) mainScreen.getLayout();
        layout.next(mainScreen);
    }//GEN-LAST:event_btnViewActionPerformed

    private void cbInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInsuranceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbInsuranceActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblFlt.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row first!",
                    "Thank You", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String rainNum_id = (String) tblFlt.getValueAt(selectedRow, 0);
        String departure = (String) tblFlt.getValueAt(selectedRow, 1);
        String destination = (String) tblFlt.getValueAt(selectedRow, 2);
        String dTime = (String) tblFlt.getValueAt(selectedRow, 3);
        String aTime = (String) tblFlt.getValueAt(selectedRow, 4);
        String train_id = (String) tblFlt.getValueAt(selectedRow, 5);
        String price = (String) tblFlt.getValueAt(selectedRow, 6);
        if (selectedRow >= 0) {
            for (int i = 0; i < system.getRailCompanyDirectory().getRailCompanyList().size(); i++) {
                if (system.getRailCompanyDirectory().getRailCompanyList().get(i).
                        getRailCompanyName().equals((String) tblFlt.getValueAt(selectedRow, 7))) {

                    RailCompany rc = system.getRailCompanyDirectory().getRailCompanyList().get(i);
                    RailNumber rn = rc.findRailNumber(rainNum_id);

                    Passenger cust = system.getPassengerDirectory().findPassengerByUsername(userAccount.getUsername());
                    if (rn.getPassengerList().contains(cust)) {
                        JOptionPane.showMessageDialog(this, "You have already bought the ticket for this train!",
                                "Thank You", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    Order order1 = new Order(userAccount.getName(), rainNum_id,
                            departure, destination, dTime, aTime, train_id, price,
                            rc.getRailCompanyName(), cbInsurance.isSelected());
                    if(cbInsurance.isSelected()){
                        order1.setClaim("Available");
                    }else{
                        order1.setClaim("Not available");
                    }

                    cust.getOrderList().add(order1);
                    rc.getOrderList().add(order1);

                    rn.getPassengerList().add(cust);

                    JOptionPane.showMessageDialog(this, "Your Order is placed, order id is:"
                            + order1.getOrder_id(), "Thank You", JOptionPane.WARNING_MESSAGE);
                    return;

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }

    }//GEN-LAST:event_btnOrderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnView;
    private javax.swing.JCheckBox cbInsurance;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel passengerLabel;
    private javax.swing.JTable tblFlt;
    // End of variables declaration//GEN-END:variables

    private void populatetblFlt() {
        DefaultTableModel model = (DefaultTableModel) tblFlt.getModel();
        model.setRowCount(0);
        for (RailCompany rc : system.getRailCompanyDirectory().getRailCompanyList()) {
            for (RailNumber rn : rc.getRailNumberList()) {
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
