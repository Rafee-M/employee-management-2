package GUI;

import GUI.Login;

/**
 *
 * @author Rafee-M
 */

public class AdminHomePage extends javax.swing.JFrame {

    private boolean toggle = true;
    private String username;
    
    public AdminHomePage() {
        initComponents();
    }
    
    public AdminHomePage(String username){
        this.username = username;
        initComponents();
    }
    
    public AdminHomePage(String username, int x, int y){
        this.username = username;
        initComponents();
        this.setLocation(x, y);
        this.setResizable(false); // Make the frame not resizable
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        AdminHomeInfoPanel = new javax.swing.JPanel();
        ProfileLogo1 = new javax.swing.JLabel();
        AccountTypeLabel1 = new javax.swing.JLabel();
        positionLabel1 = new javax.swing.JLabel();
        salaryLabel1 = new javax.swing.JLabel();
        accountValue = new javax.swing.JLabel();
        positionValue = new javax.swing.JLabel();
        salaryValue = new javax.swing.JLabel();
        usernameLabel1 = new javax.swing.JLabel();
        nameLabel1 = new javax.swing.JLabel();
        nameValue = new javax.swing.JLabel();
        usernameValue = new javax.swing.JLabel();
        AdminSignOut = new javax.swing.JButton();
        MenuButton = new javax.swing.JButton();
        AdminMenuPanel = new javax.swing.JPanel();
        AdminViewTaskButton = new javax.swing.JButton();
        AdminViewEmployeeButton = new javax.swing.JButton();
        AdminRemoveEmployeeButton = new javax.swing.JButton();
        AdminAssignTaskButton = new javax.swing.JButton();
        AdminAddEmployeeButton = new javax.swing.JButton();
        AdminChangePassButton = new javax.swing.JButton();
        HomeLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        AdminHomeInfoPanel.setBackground(new java.awt.Color(204, 204, 204));
        AdminHomeInfoPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));

        ProfileLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin-profile-pic.png"))); // NOI18N

        AccountTypeLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        AccountTypeLabel1.setForeground(new java.awt.Color(39, 39, 39));
        AccountTypeLabel1.setText("User Type:");

        positionLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        positionLabel1.setForeground(new java.awt.Color(39, 39, 39));
        positionLabel1.setText("Position:");

        salaryLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        salaryLabel1.setForeground(new java.awt.Color(39, 39, 39));
        salaryLabel1.setText("Salary:");

        accountValue.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        accountValue.setForeground(new java.awt.Color(23, 23, 23));
        accountValue.setText("Admin");

        positionValue.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        positionValue.setForeground(new java.awt.Color(23, 23, 23));
        positionValue.setText("TBA");

        salaryValue.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        salaryValue.setForeground(new java.awt.Color(23, 23, 23));
        salaryValue.setText("TBA");

        usernameLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        usernameLabel1.setForeground(new java.awt.Color(39, 39, 39));
        usernameLabel1.setText("Username:");

        nameLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        nameLabel1.setForeground(new java.awt.Color(39, 39, 39));
        nameLabel1.setText("Name:");

        nameValue.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        nameValue.setForeground(new java.awt.Color(23, 23, 23));
        nameValue.setText("null");
        if(!(username==(null))){
            nameValue.setText(username);
        }

        usernameValue.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        usernameValue.setForeground(new java.awt.Color(23, 23, 23));
        usernameValue.setText("null");
        if(!(username==(null))){
            usernameValue.setText(username);
        }

        javax.swing.GroupLayout AdminHomeInfoPanelLayout = new javax.swing.GroupLayout(AdminHomeInfoPanel);
        AdminHomeInfoPanel.setLayout(AdminHomeInfoPanelLayout);
        AdminHomeInfoPanelLayout.setHorizontalGroup(
            AdminHomeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminHomeInfoPanelLayout.createSequentialGroup()
                .addGroup(AdminHomeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminHomeInfoPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ProfileLogo1)
                        .addGap(18, 18, 18)
                        .addGroup(AdminHomeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AccountTypeLabel1)
                            .addComponent(positionLabel1)
                            .addComponent(salaryLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(AdminHomeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salaryValue)
                            .addComponent(positionValue)
                            .addComponent(accountValue)))
                    .addGroup(AdminHomeInfoPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(AdminHomeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel1)
                            .addComponent(usernameLabel1))
                        .addGap(28, 28, 28)
                        .addGroup(AdminHomeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameValue)
                            .addComponent(nameValue))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        AdminHomeInfoPanelLayout.setVerticalGroup(
            AdminHomeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminHomeInfoPanelLayout.createSequentialGroup()
                .addGroup(AdminHomeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminHomeInfoPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(ProfileLogo1))
                    .addGroup(AdminHomeInfoPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(AdminHomeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AccountTypeLabel1)
                            .addComponent(accountValue))
                        .addGap(35, 35, 35)
                        .addGroup(AdminHomeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(positionLabel1)
                            .addComponent(positionValue))
                        .addGap(37, 37, 37)
                        .addGroup(AdminHomeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salaryLabel1)
                            .addComponent(salaryValue))))
                .addGap(26, 26, 26)
                .addGroup(AdminHomeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel1)
                    .addComponent(nameValue))
                .addGap(31, 31, 31)
                .addGroup(AdminHomeInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel1)
                    .addComponent(usernameValue))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        AdminSignOut.setBackground(new java.awt.Color(122, 122, 0));
        AdminSignOut.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        AdminSignOut.setForeground(new java.awt.Color(0, 0, 0));
        AdminSignOut.setText("Sign Out");
        AdminSignOut.setBorderPainted(false);
        AdminSignOut.setFocusPainted(false);
        AdminSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminSignOutActionPerformed(evt);
            }
        });

        MenuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu-button.png"))); // NOI18N
        MenuButton.setToolTipText("");
        MenuButton.setBorderPainted(false);
        MenuButton.setContentAreaFilled(false);
        MenuButton.setFocusPainted(false);
        MenuButton.setRolloverEnabled(false);
        MenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuButtonActionPerformed(evt);
            }
        });

        AdminMenuPanel.setBackground(new java.awt.Color(204, 204, 204));
        AdminMenuPanel.setVisible(false);

        AdminViewTaskButton.setBackground(new java.awt.Color(51, 51, 51));
        AdminViewTaskButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AdminViewTaskButton.setForeground(new java.awt.Color(204, 204, 204));
        AdminViewTaskButton.setText("View Tasks");
        AdminViewTaskButton.setBorderPainted(false);
        AdminViewTaskButton.setFocusPainted(false);
        AdminViewTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminViewTaskButtonActionPerformed(evt);
            }
        });

        AdminViewEmployeeButton.setBackground(new java.awt.Color(51, 51, 51));
        AdminViewEmployeeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AdminViewEmployeeButton.setForeground(new java.awt.Color(204, 204, 204));
        AdminViewEmployeeButton.setText("View Employee");
        AdminViewEmployeeButton.setBorderPainted(false);
        AdminViewEmployeeButton.setFocusPainted(false);
        AdminViewEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminViewEmployeeButtonActionPerformed(evt);
            }
        });

        AdminRemoveEmployeeButton.setBackground(new java.awt.Color(51, 51, 51));
        AdminRemoveEmployeeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AdminRemoveEmployeeButton.setForeground(new java.awt.Color(204, 204, 204));
        AdminRemoveEmployeeButton.setText("Remove Employee");
        AdminRemoveEmployeeButton.setBorderPainted(false);
        AdminRemoveEmployeeButton.setFocusPainted(false);
        AdminRemoveEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminRemoveEmployeeButtonActionPerformed(evt);
            }
        });

        AdminAssignTaskButton.setBackground(new java.awt.Color(51, 51, 51));
        AdminAssignTaskButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AdminAssignTaskButton.setForeground(new java.awt.Color(204, 204, 204));
        AdminAssignTaskButton.setText("Assign Task");
        AdminAssignTaskButton.setBorderPainted(false);
        AdminAssignTaskButton.setFocusPainted(false);
        AdminAssignTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminAssignTaskButtonActionPerformed(evt);
            }
        });

        AdminAddEmployeeButton.setBackground(new java.awt.Color(51, 51, 51));
        AdminAddEmployeeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AdminAddEmployeeButton.setForeground(new java.awt.Color(204, 204, 204));
        AdminAddEmployeeButton.setText("Add Employee");
        AdminAddEmployeeButton.setBorderPainted(false);
        AdminAddEmployeeButton.setFocusPainted(false);
        AdminAddEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminAddEmployeeButtonActionPerformed(evt);
            }
        });

        AdminChangePassButton.setBackground(new java.awt.Color(51, 51, 51));
        AdminChangePassButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AdminChangePassButton.setForeground(new java.awt.Color(204, 204, 204));
        AdminChangePassButton.setText("Change Password");
        AdminChangePassButton.setBorderPainted(false);
        AdminChangePassButton.setFocusPainted(false);
        AdminChangePassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminChangePassButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdminMenuPanelLayout = new javax.swing.GroupLayout(AdminMenuPanel);
        AdminMenuPanel.setLayout(AdminMenuPanelLayout);
        AdminMenuPanelLayout.setHorizontalGroup(
            AdminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminMenuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AdminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminMenuPanelLayout.createSequentialGroup()
                        .addGroup(AdminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AdminAddEmployeeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdminViewEmployeeButton))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminMenuPanelLayout.createSequentialGroup()
                        .addComponent(AdminAssignTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))))
            .addGroup(AdminMenuPanelLayout.createSequentialGroup()
                .addGroup(AdminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AdminChangePassButton)
                    .addGroup(AdminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(AdminMenuPanelLayout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(AdminRemoveEmployeeButton))
                        .addGroup(AdminMenuPanelLayout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(AdminViewTaskButton))))
                .addGap(0, 46, Short.MAX_VALUE))
        );
        AdminMenuPanelLayout.setVerticalGroup(
            AdminMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminMenuPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(AdminViewEmployeeButton)
                .addGap(36, 36, 36)
                .addComponent(AdminAddEmployeeButton)
                .addGap(33, 33, 33)
                .addComponent(AdminRemoveEmployeeButton)
                .addGap(31, 31, 31)
                .addComponent(AdminViewTaskButton)
                .addGap(35, 35, 35)
                .addComponent(AdminAssignTaskButton)
                .addGap(39, 39, 39)
                .addComponent(AdminChangePassButton)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        HomeLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homepage-logo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(AdminHomeInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(AdminSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(MenuButton)
                        .addGap(63, 63, 63))
                    .addComponent(AdminMenuPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(344, 344, 344)
                .addComponent(HomeLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(MenuButton)
                        .addGap(18, 18, 18)
                        .addComponent(AdminMenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(HomeLogo)
                        .addGap(31, 31, 31)
                        .addComponent(AdminHomeInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(AdminSignOut, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuButtonActionPerformed

        AdminMenuPanel.setVisible(toggle); //Toggles the employee menu button
        toggle = !toggle;
    }//GEN-LAST:event_MenuButtonActionPerformed

    private void AdminViewTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminViewTaskButtonActionPerformed
        AdminTaskView viewTask = new AdminTaskView(this);
        this.setVisible(false);
        viewTask.setVisible(true);
    }//GEN-LAST:event_AdminViewTaskButtonActionPerformed

    private void AdminSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminSignOutActionPerformed
        this.setVisible(false);
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_AdminSignOutActionPerformed

    private void AdminViewEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminViewEmployeeButtonActionPerformed
        this.setVisible(false);
        AdminViewEmployeeInfo view = new AdminViewEmployeeInfo(this, this.getX(), this.getY());
        view.setVisible(true);
    }//GEN-LAST:event_AdminViewEmployeeButtonActionPerformed

    private void AdminAssignTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminAssignTaskButtonActionPerformed
        AdminTaskAssignment assign = new AdminTaskAssignment(this);
        this.setVisible(false);
        assign.setVisible(true);
        
    }//GEN-LAST:event_AdminAssignTaskButtonActionPerformed

    private void AdminChangePassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminChangePassButtonActionPerformed
        
    }//GEN-LAST:event_AdminChangePassButtonActionPerformed

    private void AdminAddEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminAddEmployeeButtonActionPerformed
        this.setVisible(false);
        AdminAddEmployee add = new AdminAddEmployee(this, this.getX(), this.getY());
        add.setVisible(true);
    }//GEN-LAST:event_AdminAddEmployeeButtonActionPerformed

    private void AdminRemoveEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminRemoveEmployeeButtonActionPerformed
        this.setVisible(false);
        AdminEmployeeRemoval remove = new AdminEmployeeRemoval(this, this.getX(), this.getY());
        remove.setVisible(true);
    }//GEN-LAST:event_AdminRemoveEmployeeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountTypeLabel1;
    private javax.swing.JButton AdminAddEmployeeButton;
    private javax.swing.JButton AdminAssignTaskButton;
    private javax.swing.JButton AdminChangePassButton;
    private javax.swing.JPanel AdminHomeInfoPanel;
    private javax.swing.JPanel AdminMenuPanel;
    private javax.swing.JButton AdminRemoveEmployeeButton;
    private javax.swing.JButton AdminSignOut;
    private javax.swing.JButton AdminViewEmployeeButton;
    private javax.swing.JButton AdminViewTaskButton;
    private javax.swing.JLabel HomeLogo;
    private javax.swing.JButton MenuButton;
    private javax.swing.JLabel ProfileLogo1;
    private javax.swing.JLabel accountValue;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel1;
    private javax.swing.JLabel nameValue;
    private javax.swing.JLabel positionLabel1;
    private javax.swing.JLabel positionValue;
    private javax.swing.JLabel salaryLabel1;
    private javax.swing.JLabel salaryValue;
    private javax.swing.JLabel usernameLabel1;
    private javax.swing.JLabel usernameValue;
    // End of variables declaration//GEN-END:variables
}
