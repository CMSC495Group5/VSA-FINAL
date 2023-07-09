/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package progress_tracking;

import arraylist_handler.ArrayListHandler;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author jdev1
 */
public class Edit_Progress extends javax.swing.JFrame {

    /**
     * Creates new form Edit_Schedule
     */
    
    public Edit_Progress() {
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
        back_to_progress_management_button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title_label.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title_label.setForeground(new java.awt.Color(242, 242, 242));
        title_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title_label.setText("Edit Progress");
        title_label.setToolTipText("");
        getContentPane().add(title_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 394, 29));

        enter_course_prompt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        enter_course_prompt.setForeground(new java.awt.Color(242, 242, 242));
        enter_course_prompt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enter_course_prompt.setText("Enter Task Name");
        enter_course_prompt.setToolTipText("");
        getContentPane().add(enter_course_prompt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 53, 400, -1));

        search_textField.setBackground(new java.awt.Color(23, 20, 20));
        search_textField.setForeground(new java.awt.Color(242, 242, 242));
        search_textField.setToolTipText("Enter Class Name");
        search_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_textFieldActionPerformed(evt);
            }
        });
        getContentPane().add(search_textField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 103, 394, 31));

        search_button.setBackground(new java.awt.Color(23, 20, 20));
        search_button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        search_button.setForeground(new java.awt.Color(242, 242, 242));
        search_button.setText("Search");
        search_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_buttonMouseClicked(evt);
            }
        });
        getContentPane().add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 250, 92, 44));

        back_to_progress_management_button.setBackground(new java.awt.Color(23, 20, 20));
        back_to_progress_management_button.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        back_to_progress_management_button.setForeground(new java.awt.Color(242, 242, 242));
        back_to_progress_management_button.setText("Back to Progress Management");
        back_to_progress_management_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                back_to_progress_management_buttonMouseClicked(evt);
            }
        });
        back_to_progress_management_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_to_progress_management_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(back_to_progress_management_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, -1, 50));

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
        ArrayListHandler.editTask_Percentage(search_textField.getText());
        if(ArrayListHandler.getTaskMatched() == true){
            Edit_Progress_Information edit_progress = new Edit_Progress_Information(search_textField.getText());
            this.setVisible(false);
            edit_progress.setVisible(true);
            
        }
        else if(ArrayListHandler.getTaskMatched() == false){
             JDialog dialog = new JDialog(this, "Task not in Task Management");
                dialog.add(new JLabel("Your task is not in your task management."));
                dialog.setSize(250, 100);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
                dialog.setResizable(false);
            
        }
       
        else if ( ArrayListHandler.getTaskEmpty() == true){
            JDialog dialog = new JDialog(this, "Progress Management is empty");
                dialog.add(new JLabel("Your task list is empty."));
                dialog.setSize(250, 100);
                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setVisible(true);
                dialog.setResizable(false);
            
        }
    }//GEN-LAST:event_search_buttonMouseClicked

    private void back_to_progress_management_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_back_to_progress_management_buttonMouseClicked
        // TODO add your handling code here:
        Progress_Management progress_management = new  Progress_Management();
        this.setVisible(false);
        progress_management.setVisible(true);
    }//GEN-LAST:event_back_to_progress_management_buttonMouseClicked

    private void search_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_textFieldActionPerformed

    private void back_to_progress_management_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_to_progress_management_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_back_to_progress_management_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Edit_Progress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Progress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Progress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Progress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Progress().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_to_progress_management_button;
    private javax.swing.JLabel enter_course_prompt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField search_textField;
    private javax.swing.JLabel title_label;
    // End of variables declaration//GEN-END:variables
}
