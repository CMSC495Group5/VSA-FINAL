/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package study_tasks;


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
public class Create_Task extends javax.swing.JFrame {

    /**
     * Creates new form Create_Schedule
     */
    public Create_Task() {
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

        title_label = new javax.swing.JLabel();
        enterEndDate_label = new javax.swing.JLabel();
        enterTaskInfor_label = new javax.swing.JLabel();
        enterStartDate_label = new javax.swing.JLabel();
        enter_classInformation = new javax.swing.JTextField();
        submit_button = new javax.swing.JButton();
        back_to_task_mgmt = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title_label.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        title_label.setForeground(new java.awt.Color(242, 242, 242));
        title_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_label.setText("Create Task");
        getContentPane().add(title_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        enterEndDate_label.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        enterEndDate_label.setForeground(new java.awt.Color(242, 242, 242));
        enterEndDate_label.setText("Enter End Date");
        getContentPane().add(enterEndDate_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 162, 134, 28));

        enterTaskInfor_label.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        enterTaskInfor_label.setForeground(new java.awt.Color(242, 242, 242));
        enterTaskInfor_label.setText("Enter Task Information");
        getContentPane().add(enterTaskInfor_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 134, 28));

        enterStartDate_label.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        enterStartDate_label.setForeground(new java.awt.Color(242, 242, 242));
        enterStartDate_label.setText("Enter Start Date");
        getContentPane().add(enterStartDate_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 116, 134, 28));

        enter_classInformation.setBackground(new java.awt.Color(23, 20, 20));
        enter_classInformation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        enter_classInformation.setForeground(new java.awt.Color(242, 242, 242));
        enter_classInformation.setToolTipText("Enter Class Information");
        getContentPane().add(enter_classInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 73, 242, -1));

        submit_button.setBackground(new java.awt.Color(23, 20, 20));
        submit_button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        submit_button.setForeground(new java.awt.Color(242, 242, 242));
        submit_button.setText("Submit");
        submit_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submit_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(submit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 277, -1, -1));

        back_to_task_mgmt.setBackground(new java.awt.Color(23, 20, 20));
        back_to_task_mgmt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        back_to_task_mgmt.setForeground(new java.awt.Color(242, 242, 242));
        back_to_task_mgmt.setText("Back to Task Management");
        back_to_task_mgmt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_to_task_mgmtMouseClicked(evt);
            }
        });
        getContentPane().add(back_to_task_mgmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 277, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void back_to_task_mgmtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_to_task_mgmtMouseClicked
        // TODO add your handling code here:
        Task_Management schedule_management = new Task_Management();
        this.setVisible(false);
        schedule_management.setVisible(true);
    }//GEN-LAST:event_back_to_task_mgmtMouseClicked

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
        
        
   
        ArrayListHandler.addTask(classinformation, startdate, enddate);
         JDialog dialog = new JDialog(this, "Task entered");
                dialog.add(new JLabel("Your task has been entered into your task management."));
                dialog.setSize(250, 100);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
                dialog.setResizable(false);
        // Informs the user that they have entered a duplicate class
        if(ArrayListHandler.getTaskMatched()== true){
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
            java.util.logging.Logger.getLogger(Create_Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Create_Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Create_Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Create_Task.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Create_Task().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_to_task_mgmt;
    private javax.swing.JLabel enterEndDate_label;
    private javax.swing.JLabel enterStartDate_label;
    private javax.swing.JLabel enterTaskInfor_label;
    private javax.swing.JTextField enter_classInformation;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton submit_button;
    private javax.swing.JLabel title_label;
    // End of variables declaration//GEN-END:variables
}
