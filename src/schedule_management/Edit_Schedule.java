/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package schedule_management;

import arraylist_handler.ArrayListHandler;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author jdev1
 */
public class Edit_Schedule extends javax.swing.JFrame {

    /**
     * Creates new form Edit_Schedule
     */
    
    public Edit_Schedule() {
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
        enter_course_prompt = new javax.swing.JLabel();
        search_textField = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title_label.setForeground(new java.awt.Color(242, 242, 242));
        title_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_label.setText("Edit Schedule ");
        title_label.setToolTipText("");
        getContentPane().add(title_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 393, 29));

        enter_course_prompt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        enter_course_prompt.setForeground(new java.awt.Color(242, 242, 242));
        enter_course_prompt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enter_course_prompt.setText("Enter Course Name");
        enter_course_prompt.setToolTipText("");
        getContentPane().add(enter_course_prompt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 53, 399, -1));

        search_textField.setBackground(new java.awt.Color(23, 20, 20));
        search_textField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        search_textField.setForeground(new java.awt.Color(242, 242, 242));
        search_textField.setToolTipText("Enter Class Name");
        getContentPane().add(search_textField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 103, 393, 31));

        search_button.setBackground(new java.awt.Color(23, 20, 20));
        search_button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        search_button.setForeground(new java.awt.Color(242, 242, 242));
        search_button.setText("Search");
        search_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 244, 92, 44));

        jButton1.setBackground(new java.awt.Color(23, 20, 20));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(242, 242, 242));
        jButton1.setText("Back to Schedule Management");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 244, -1, 50));

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

    private void search_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_buttonMouseClicked
        // TODO add your handling code here:
        ArrayListHandler.editSchedule(search_textField.getText());
        if(ArrayListHandler.getClassMatched() == true){
            Edit_Course_Information edit_course = new Edit_Course_Information(search_textField.getText());
            this.setVisible(false);
            edit_course.setVisible(true);
            
        }
        else if(ArrayListHandler.getClassMatched() == false){
             JDialog dialog = new JDialog(this, "Course not in schedule");
                dialog.add(new JLabel("Your course is not in your schedule."));
                dialog.setSize(350, 100);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
                dialog.setResizable(false);
            
        }
        else if (ArrayListHandler.getscheduleEmpty() == true){
            JDialog dialog = new JDialog(this, "Schedule is empty");
                dialog.add(new JLabel("Your schedule is empty."));
                dialog.setSize(250, 100);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
                dialog.setResizable(false);
            
        }
    }//GEN-LAST:event_search_buttonMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        Schedule_Management schedule_management = new  Schedule_Management();
        this.setVisible(false);
        schedule_management.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(Edit_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Schedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enter_course_prompt;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField search_textField;
    private javax.swing.JLabel title_label;
    // End of variables declaration//GEN-END:variables
}
