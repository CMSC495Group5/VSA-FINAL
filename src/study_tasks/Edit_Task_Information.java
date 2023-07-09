/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package study_tasks;

import arraylist_handler.ArrayListHandler;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JLabel;


/**
 *
 * @author jdev1
 */
public class Edit_Task_Information extends javax.swing.JFrame {

    /**
     * Creates new form Edit_Course_Information
     */
    private String classTextField;

 
    public Edit_Task_Information() {
        initComponents();
    }
    
    public Edit_Task_Information(String classTextField) {
        this.classTextField = classTextField;
        initComponents();
    }
    
     public String getClassTextField() {
        return classTextField;
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
        enterClassInfo_label = new javax.swing.JLabel();
        enterClassStartDate_label = new javax.swing.JLabel();
        enterEndDate_label = new javax.swing.JLabel();
        javax.swing.JTextField enterClassInfor_textfield = new javax.swing.JTextField();
        submit_button = new javax.swing.JButton();
        backToEditSchedule_button = new javax.swing.JButton();
        task_complete_checkbox = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        startDateChooser = new com.toedter.calendar.JDateChooser();
        endDateChooser = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title_label.setForeground(new java.awt.Color(242, 242, 242));
        title_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_label.setText("Edit Task Infomation");
        getContentPane().add(title_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 366, -1));

        enterClassInfo_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enterClassInfo_label.setForeground(new java.awt.Color(242, 242, 242));
        enterClassInfo_label.setText("Task Information");
        getContentPane().add(enterClassInfo_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 372, 22));

        enterClassStartDate_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enterClassStartDate_label.setForeground(new java.awt.Color(242, 242, 242));
        enterClassStartDate_label.setText("Enter Task Start Date");
        getContentPane().add(enterClassStartDate_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 136, 372, -1));

        enterEndDate_label.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        enterEndDate_label.setForeground(new java.awt.Color(242, 242, 242));
        enterEndDate_label.setText("Enter Task End Date");
        getContentPane().add(enterEndDate_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 206, 372, 22));

        enterClassInfor_textfield.setBackground(new java.awt.Color(23, 20, 20));
        enterClassInfor_textfield.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        enterClassInfor_textfield.setForeground(new java.awt.Color(242, 242, 242));
        enterClassInfor_textfield.setText(this.getClassTextField());
        enterClassInfor_textfield.setToolTipText("");
        enterClassInfor_textfield.setEditable(false);

        enterClassInfor_textfield.setText(this.getClassTextField());
        getContentPane().add(enterClassInfor_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 372, 28));

        submit_button.setBackground(new java.awt.Color(23, 20, 20));
        submit_button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        submit_button.setForeground(new java.awt.Color(242, 242, 242));
        submit_button.setText("Submit");
        submit_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submit_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(submit_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 268, -1, -1));

        backToEditSchedule_button.setBackground(new java.awt.Color(23, 20, 20));
        backToEditSchedule_button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backToEditSchedule_button.setForeground(new java.awt.Color(242, 242, 242));
        backToEditSchedule_button.setText("Back to Edit Task");
        backToEditSchedule_button.setToolTipText("");
        backToEditSchedule_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backToEditSchedule_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(backToEditSchedule_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 268, -1, -1));

        task_complete_checkbox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        task_complete_checkbox.setForeground(new java.awt.Color(242, 242, 242));
        task_complete_checkbox.setText("Task Complete");
        getContentPane().add(task_complete_checkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 269, -1, -1));

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(startDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
            .addComponent(endDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submit_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submit_buttonMouseClicked
        // TODO add your handling code here:
         
        //start date
        Date startDate = startDateChooser.getDate();
        SimpleDateFormat start_dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String startText = start_dateFormat.format( startDate);
        
        
        
        // end date 
        Date endDate = endDateChooser.getDate();
        SimpleDateFormat end_dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String endText = end_dateFormat.format(endDate);
        
        
        
        String startdate = startText;
        String enddate = endText; 
        
        
         int element = ArrayListHandler.findTaskElement(this.getClassTextField());
         ArrayListHandler.editTaskEndAndStartDate(element, startdate, enddate);
          JDialog dialog = new JDialog(this, "Task Edited Notice");
                dialog.add(new JLabel("Your edits have been made."));
                dialog.setSize(250, 100);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
                dialog.setResizable(false);
         if(task_complete_checkbox.isSelected()){
             ArrayListHandler.editTaskComplete(element);
             
         }
        //enterClassStartDate_textfield.setText("");
        //enteClassEndDate_textfield.setText("");
    }//GEN-LAST:event_submit_buttonMouseClicked

    private void backToEditSchedule_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backToEditSchedule_buttonMouseClicked
        // TODO add your handling code here:
             Edit_Task edit_schedule = new Edit_Task();
            this.setVisible(false);
            edit_schedule.setVisible(true);
    }//GEN-LAST:event_backToEditSchedule_buttonMouseClicked

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
            java.util.logging.Logger.getLogger(Edit_Task_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Task_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Task_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Task_Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Task_Information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToEditSchedule_button;
    private com.toedter.calendar.JDateChooser endDateChooser;
    private javax.swing.JLabel enterClassInfo_label;
    private javax.swing.JLabel enterClassStartDate_label;
    private javax.swing.JLabel enterEndDate_label;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser startDateChooser;
    private javax.swing.JButton submit_button;
    private javax.swing.JCheckBox task_complete_checkbox;
    private javax.swing.JLabel title_label;
    // End of variables declaration//GEN-END:variables
}
