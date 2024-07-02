
import javax.swing.JOptionPane;

public class home extends javax.swing.JFrame {

    public home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem11 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1590, 850));
        setPreferredSize(new java.awt.Dimension(1590, 850));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/l.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mh.jpg"))); // NOI18N
        jLabel1.setAlignmentX(1.0F);
        jLabel1.setIconTextGap(1);
        jLabel1.setPreferredSize(new java.awt.Dimension(1200, 740));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2250, 0, 3920, 1670));

        jMenuBar1.setMargin(new java.awt.Insets(10, 10, 10, 10));

        jMenu1.setBackground(new java.awt.Color(204, 204, 255));
        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search user.png"))); // NOI18N
        jMenu1.setText("Donor");
        jMenu1.setToolTipText("");
        jMenu1.setAlignmentX(3.0F);
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenu1.setIconTextGap(15);
        jMenu1.setMaximumSize(new java.awt.Dimension(180, 32767));

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem1.setText("Add New");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem2.setText("Update Details");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem3.setText("All Donor Details");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        jMenu2.setText("Search Blood Donar ");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenu2.setIconTextGap(15);
        jMenu2.setMaximumSize(new java.awt.Dimension(330, 32767));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.add(jSeparator3);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock.png"))); // NOI18N
        jMenu3.setText("Stock");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenu3.setIconTextGap(15);
        jMenu3.setMargin(new java.awt.Insets(10, 10, 10, 100));
        jMenu3.setMaximumSize(new java.awt.Dimension(190, 32767));

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem6.setText("Increase");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);
        jMenu3.add(jSeparator4);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem7.setText("Decrease");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);
        jMenu3.add(jSeparator5);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem8.setText("Details");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close.png"))); // NOI18N
        jMenu4.setText("Delete Donar");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenu4.setIconTextGap(15);
        jMenu4.setMaximumSize(new java.awt.Dimension(270, 32767));

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem9.setText("Delete Donar");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        jMenu5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
        jMenu5.setText("Exit");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jMenu5.setIconTextGap(15);
        jMenu5.setMaximumSize(new java.awt.Dimension(150, 32767));

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem10.setText("Logout");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);
        jMenu5.add(jSeparator6);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem11.setText("Exit application");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     
        new addNewDonor().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
    int a = JOptionPane.showConfirmDialog(null," Do yoy really want to logout","Select",JOptionPane.YES_NO_OPTION);
    if(a==0)
    {
        setVisible(false);
        new Firstw().setVisible(true);
    }
  
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
      int a = JOptionPane.showConfirmDialog(null," Do yoy really want to Close Application","Select",JOptionPane.YES_NO_OPTION);
    if(a==0)
    {
       System.exit(0); 
    }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    new updateDetailsDonor().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new allDonorDetails().setVisible(true);   // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        new stockDetails().setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
   new deleteDonor().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
  new stockIncrease().setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
   new stockDecrease().setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
   new searchBlood().setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2MouseClicked

  
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    // End of variables declaration//GEN-END:variables
}
