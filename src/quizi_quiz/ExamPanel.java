/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizi_quiz;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SAM
 */
public class ExamPanel extends javax.swing.JFrame {

    /**
     * Creates new form ExamPanel
     */
    
    public ExamPanel() {
        initComponents();
        showUser();
    }

    /**
     *
     * @return
     */
    public ArrayList<User> userList(){
        ArrayList<User> userList=new ArrayList<>();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String database="jdbc:mysql://localhost:3306/QuiziQuizSwing";
            Connection con= (Connection) DriverManager.getConnection(database, "root", "");
            String query="select * from java ";
            Statement stat=(Statement)con.createStatement();
            ResultSet rs=stat.executeQuery(query);
            User user;
            
            while(rs.next()){
                user=new User(rs.getInt("ID"), rs.getString("Question"), rs.getString("OptionA"), rs.getString("OptionB"), rs.getString("OptionC"), rs.getString("OptionD"), rs.getString("Answer"));
                userList.add(user);   
            }        
        }
        catch(ClassNotFoundException | SQLException e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
        return userList;
    }
    
    public void showUser(){
        ArrayList<User> list=userList();
        DefaultTableModel Model=(DefaultTableModel)jTable_Display_User.getModel();
        Object [] row=new Object[7];
        for(int i=0;i<list.size();i++)
        {
            row[0]=list.get(i).getID();
            row[1]=list.get(i).getQuestion();
            row[2]=list.get(i).getOptionA();
            row[3]=list.get(i).getOptionB();
            row[4]=list.get(i).getOptionC();
            row[5]=list.get(i).getOptionD();
            row[6]=list.get(i).getAnswer();
            Model.addRow(row);
            
        }
    }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Display_User = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_Display_User.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Question", "OptionA", "OptionB", "OptionC", "OptionD", "Answer"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Display_User);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ExamPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExamPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExamPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExamPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Display_User;
    // End of variables declaration//GEN-END:variables
}
