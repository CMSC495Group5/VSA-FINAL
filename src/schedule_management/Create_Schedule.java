/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schedule_management;


import arraylist_handler.ArrayListHandler;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author jdev1
 */
public class Create_Schedule extends javax.swing.JFrame {

    /**
     * Creates new form Create_Schedule
     */
    public Create_Schedule() {
        initComponents();
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
        enterClassInfor_label = new javax.swing.JLabel();
        enter_classInformation = new javax.swing.JTextField();
        enterStartDate_label = new javax.swing.JLabel();
        startDateChooser = new com.toedter.calendar.JDateChooser();
        enterEndDate_label = new javax.swing.JLabel();
        endDateChooser = new com.toedter.calendar.JDateChooser();
        back_to_Sched_mgmt = new javax.swing.JButton();
        submit_button = new javax.swing.JButton();
        title_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 102, 255));
        setForeground(java.awt.Color.blue);

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        enterClassInfor_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enterClassInfor_label.setForeground(new java.awt.Color(255, 255, 255));
        enterClassInfor_label.setText("Enter Class Information");

        enter_classInformation.setBackground(new java.awt.Color(0, 0, 0));
        enter_classInformation.setForeground(new java.awt.Color(242, 242, 242));
        enter_classInformation.setToolTipText("Enter Class Information");

        enterStartDate_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enterStartDate_label.setForeground(new java.awt.Color(255, 255, 255));
        enterStartDate_label.setText("Enter Start Date");

        enterEndDate_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enterEndDate_label.setForeground(new java.awt.Color(255, 255, 255));
        enterEndDate_label.setText("Enter End Date");

        back_to_Sched_mgmt.setBackground(new java.awt.Color(0, 0, 0));
        back_to_Sched_mgmt.setForeground(new java.awt.Color(255, 255, 255));
        back_to_Sched_mgmt.setText("Back to Schedule Management");
        back_to_Sched_mgmt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_to_Sched_mgmtMouseClicked(evt);
            }
        });

        submit_button.setBackground(new java.awt.Color(0, 0, 0));
        submit_button.setForeground(new java.awt.Color(255, 255, 255));
        submit_button.setText("Submit");
        submit_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submit_buttonMouseClicked(evt);
            }
        });

        title_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title_label.setForeground(new java.awt.Color(255, 255, 255));
        title_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_label.setText("Create Schedule");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(366, 366, 366))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back_to_Sched_mgmt)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(enterClassInfor_label, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enter_classInformation)
                            .addComponent(enterStartDate_label, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enterEndDate_label, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(title_label, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title_label)
                .addGap(18, 18, 18)
                .addComponent(enterClassInfor_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enter_classInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(enterStartDate_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(enterEndDate_label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back_to_Sched_mgmt)
                    .addComponent(submit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_to_Sched_mgmtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_to_Sched_mgmtMouseClicked
        // TODO add your handling code here:
        Schedule_Management schedule_management = new  Schedule_Management();
        this.setVisible(false);
        schedule_management.setVisible(true);
    }//GEN-LAST:event_back_to_Sched_mgmtMouseClicked

    private void submit_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submit_buttonMouseClicked
        // Add the text fromt he text boxes to the arraylists handled in ArrayListHandler
        
        //start date
        Date startDate = startDateChooser.getDate();
        SimpleDateFormat start_dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String startText = start_dateFormat.format( startDate);
        
        
        
        // end date 
        Date endDate = endDateChooser.getDate();
        SimpleDateFormat end_dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String endText = end_dateFormat.format(endDate);
        
        
        String classinformation = enter_classInformation.getText();
        String startdate = startText;
        String enddate = endText;
        
        
   
        ArrayListHandler.addClass(classinformation, startdate, enddate);
         JDialog dialog = new JDialog(this, "Class entered");
                dialog.add(new JLabel("Your class has been entered into your schedule."));
                dialog.setSize(350, 100);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
                dialog.setResizable(false);
        // Informs the user that they have entered a duplicate class
        if(ArrayListHandler.getClassMatched()== true){
            JDialog dialog1 = new JDialog(this, "Class Duplicated");
                dialog1.add(new JLabel("Your have entered a duplicated class."));
                dialog1.setSize(250, 100);
                dialog1.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog1.setVisible(true);
                dialog1.setResizable(false);
        }
        
         // clear the text box when press submit
         
        enter_classInformation.setText("");
        /*
         enter_classStartDate.setText("");
        enter_classEndDate.setText("");
        */
        
    }//GEN-LAST:event_submit_buttonMouseClicked

    
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
            java.util.logging.Logger.getLogger(Create_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_Schedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_to_Sched_mgmt;
    private com.toedter.calendar.JDateChooser endDateChooser;
    private javax.swing.JLabel enterClassInfor_label;
    private javax.swing.JLabel enterEndDate_label;
    private javax.swing.JLabel enterStartDate_label;
    private javax.swing.JTextField enter_classInformation;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser startDateChooser;
    private javax.swing.JButton submit_button;
    private javax.swing.JLabel title_label;
    // End of variables declaration//GEN-END:variables
}
