 
package org.nlt.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.nlt.include.Config;
import org.nlt.include.DatabaseConnection;
import org.nlt.model.Objectives;

import org.nlt.model.Users;
import org.nlt.services.EmailServices;
import org.nlt.services.ObjectiveServices;
import org.nlt.services.UserServices;


public class MainFrame extends javax.swing.JFrame {
    

    
    public MainFrame() {
        try
        {
        
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        Config.mainframe=this;
        Config.loginframe=new LoginFrame();
        Config.signupframe=new SignupFrame();
        Config.studentframe=new StudentFrame();
        Config.instructionframe=new InstructionFrame();
        Config.objectiveframe=new ObjectiveFrame();
        Config.settingframe=new SettingFrame();
        Config.examinationframe=new TestExaminationFrame();
        Config.practiceexamination=new PracticeExaminationFrame();
        Config.mainframe.setUserMap(); 
        Config.mainframe.setTestObjectiveMap();
        Config.mainframe.setPracticeObjectiveMap();

        //this method will display list of student in student frame table
        Config.studentframe.setTable();
        Config.objectiveframe.setTestTableData();
        Config.objectiveframe.setPracticeTableData();

        getSettingProperties();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex, "Main frame", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Upperpanel = new javax.swing.JPanel();
        LoginButton = new javax.swing.JButton();
        SignupButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        forgotButton = new javax.swing.JButton();
        Changepassword = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        StudentButton = new javax.swing.JButton();
        QuestionButton = new javax.swing.JButton();
        ResultButton = new javax.swing.JButton();
        SettingButton = new javax.swing.JButton();
        InstructionButton = new javax.swing.JButton();
        ExaminationButton = new javax.swing.JButton();
        practiceExamButtton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        desktopPaneMaster = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Upperpanel.setBackground(new java.awt.Color(51, 51, 51));
        Upperpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Upperpanel.setPreferredSize(new java.awt.Dimension(523, 100));

        LoginButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LoginButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/view/log.png"))); // NOI18N
        LoginButton.setText("LOGIN");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        SignupButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SignupButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/view/user.png"))); // NOI18N
        SignupButton.setText("SIGN UP");
        SignupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("ONLINE EXAMINATION");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Devloped by Gaurav");

        forgotButton.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        forgotButton.setText("FORGOT PASSWORD");
        forgotButton.setEnabled(false);
        forgotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotButtonActionPerformed(evt);
            }
        });

        Changepassword.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Changepassword.setText("CHANGE PASSWORD");
        Changepassword.setEnabled(false);
        Changepassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangepasswordActionPerformed(evt);
            }
        });

        logoutButton.setText("LOGOUT");
        logoutButton.setToolTipText("click here to logout");
        logoutButton.setEnabled(false);
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UpperpanelLayout = new javax.swing.GroupLayout(Upperpanel);
        Upperpanel.setLayout(UpperpanelLayout);
        UpperpanelLayout.setHorizontalGroup(
            UpperpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperpanelLayout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(UpperpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UpperpanelLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(LoginButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SignupButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(forgotButton))
                    .addGroup(UpperpanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UpperpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Changepassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(UpperpanelLayout.createSequentialGroup()
                        .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        UpperpanelLayout.setVerticalGroup(
            UpperpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpperpanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpperpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(UpperpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginButton)
                    .addComponent(SignupButton)
                    .addComponent(forgotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Changepassword, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UpperpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton))
                .addGap(35, 35, 35))
        );

        getContentPane().add(Upperpanel, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setEnabled(false);
        jPanel3.setMaximumSize(new java.awt.Dimension(120, 32767));
        jPanel3.setMinimumSize(new java.awt.Dimension(120, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(120, 323));
        jPanel3.setLayout(new java.awt.GridLayout(10, 1, 0, 10));

        StudentButton.setText("STUDENT");
        StudentButton.setEnabled(false);
        StudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentButtonActionPerformed(evt);
            }
        });
        jPanel3.add(StudentButton);

        QuestionButton.setText("QUESTIONS");
        QuestionButton.setEnabled(false);
        QuestionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionButtonActionPerformed(evt);
            }
        });
        jPanel3.add(QuestionButton);

        ResultButton.setText("RESULT");
        ResultButton.setEnabled(false);
        jPanel3.add(ResultButton);

        SettingButton.setText("SETTINGS");
        SettingButton.setEnabled(false);
        SettingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingButtonActionPerformed(evt);
            }
        });
        jPanel3.add(SettingButton);

        InstructionButton.setText("INSTRUCTION");
        InstructionButton.setEnabled(false);
        InstructionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstructionButtonActionPerformed(evt);
            }
        });
        jPanel3.add(InstructionButton);

        ExaminationButton.setText("EXAMINATION");
        ExaminationButton.setEnabled(false);
        ExaminationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExaminationButtonActionPerformed(evt);
            }
        });
        jPanel3.add(ExaminationButton);

        practiceExamButtton.setText("PRACTICE EXAM");
        practiceExamButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                practiceExamButttonActionPerformed(evt);
            }
        });
        jPanel3.add(practiceExamButtton);

        jSplitPane1.setLeftComponent(jPanel3);

        jPanel4.setLayout(new java.awt.GridLayout(1, 1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/nlt/images/LOGO5.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        desktopPaneMaster.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneMasterLayout = new javax.swing.GroupLayout(desktopPaneMaster);
        desktopPaneMaster.setLayout(desktopPaneMasterLayout);
        desktopPaneMasterLayout.setHorizontalGroup(
            desktopPaneMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desktopPaneMasterLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        desktopPaneMasterLayout.setVerticalGroup(
            desktopPaneMasterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.add(desktopPaneMaster);

        jSplitPane1.setRightComponent(jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1346, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignupButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupButtonActionPerformed
        // TODO add your handling code here:
        setSignupFrame();
    }//GEN-LAST:event_SignupButtonActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        setLoginframe();
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void StudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentButtonActionPerformed
        // TODO add your handling code here:
        setStudentFrame();
    }//GEN-LAST:event_StudentButtonActionPerformed

    private void SettingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingButtonActionPerformed
        // TODO add your handling code here:
        setSettingFrame();
    }//GEN-LAST:event_SettingButtonActionPerformed

    private void ChangepasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangepasswordActionPerformed
        // TODO add your handling code here
         try {
          String currentpassword = JOptionPane.showInputDialog(this, "Enter your current password", "Change Password", JOptionPane.INFORMATION_MESSAGE);
          if(currentpassword.equals(Config.user.getPassword())){
              String ChangePassword=JOptionPane.showInputDialog(this, "Enter your new password", "change password", JOptionPane.INFORMATION_MESSAGE);
              String confirmChangePassword=JOptionPane.showInputDialog(this, "Confirm your new password", "Change password",JOptionPane.INFORMATION_MESSAGE);
              
              if(ChangePassword.equals(confirmChangePassword)){
                  Config.user.setPassword(ChangePassword);
                  Config.user.setModified(new Date());
                  UserServices.UpdateUser(Config.user);
                  JOptionPane.showMessageDialog(this, "password change successfully", "ChangePassword", JOptionPane.YES_NO_OPTION);
              
              }
              else
              {
               JOptionPane.showMessageDialog(this, "confirm password mismatch", "MainFrame", JOptionPane.ERROR_MESSAGE);
              }
          }
          else
          {
             JOptionPane.showMessageDialog(this, "current password mismatch", "MainFrame", JOptionPane.ERROR_MESSAGE);

          }
          
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,ex, "Main Frame", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_ChangepasswordActionPerformed

    private void forgotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotButtonActionPerformed
        // TODO add your handling code here:
        try
        {
            String emailId = JOptionPane.showInputDialog(this, "Enteryour registered emailId", "Forgot password", JOptionPane.INFORMATION_MESSAGE);
            if(emailId!=null || !emailId.isEmpty())
            {
                if(!Config.userMap.containsKey(emailId))
                {
                  JOptionPane.showMessageDialog(this, "This emailId is not registred", "Main frame-ForgotPassword", JOptionPane.ERROR_MESSAGE);
                  
                }
                else
                {
                    Users user =Config.userMap.get(emailId);
                    new EmailServices().sendMail(emailId, "Your password is:"+user.getPassword(), "forgot Password");
                    JOptionPane.showMessageDialog(this, "Your password sent on your email ID Please check it", "Main frame-Forgot passsword", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        catch(Exception ex)
        {
           JOptionPane.showMessageDialog(this, ex, "Main frame-ForgotButton", JOptionPane.ERROR_MESSAGE);

        }
        
    }//GEN-LAST:event_forgotButtonActionPerformed

    private void InstructionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstructionButtonActionPerformed
        // TODO add your handling code here
        setInstructionFrame();
    }//GEN-LAST:event_InstructionButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
      int ans = JOptionPane.showConfirmDialog(this, "Are you sure to exit?", "logout", JOptionPane.YES_NO_OPTION);
      if(ans==JOptionPane.YES_OPTION)
      {
      Config.mainframe.setLogout();
        Config.mainframe.setLoginframe();
      }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void QuestionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionButtonActionPerformed
        // TODO add your handling code here:
        ObjectiveFrame();
    }//GEN-LAST:event_QuestionButtonActionPerformed

    private void ExaminationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExaminationButtonActionPerformed
        // TODO add your handling code here:
        setExaminationFrame();
    }//GEN-LAST:event_ExaminationButtonActionPerformed

    private void practiceExamButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_practiceExamButttonActionPerformed
        // TODO add your handling code here:
        setPracticeExamFrame();
    }//GEN-LAST:event_practiceExamButttonActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Changepassword;
    private javax.swing.JButton ExaminationButton;
    private javax.swing.JButton InstructionButton;
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton QuestionButton;
    private javax.swing.JButton ResultButton;
    private javax.swing.JButton SettingButton;
    private javax.swing.JButton SignupButton;
    private javax.swing.JButton StudentButton;
    private javax.swing.JPanel Upperpanel;
    private javax.swing.JDesktopPane desktopPaneMaster;
    private javax.swing.JButton forgotButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton practiceExamButtton;
    // End of variables declaration//GEN-END:variables

public void setLoginframe()
{
    try
    {
        desktopPaneMaster.removeAll();
        desktopPaneMaster.add(Config.loginframe);
        Config.loginframe.setVisible(true);
        Config.loginframe.setPreferredSize(getMinimumSize());
        Config.loginframe.setClosable(true);
        Config.loginframe.setMaximum(true);
        
    }
    catch(Exception ex)
    {
        JOptionPane.showMessageDialog(this, ex, "Main frame-Login Frame", JOptionPane.ERROR_MESSAGE);
    }

}

public void setSignupFrame()
{
    try
    {
        desktopPaneMaster.removeAll();
        desktopPaneMaster.add(Config.signupframe);
        Config.signupframe.setVisible(true);
        Config.signupframe.setPreferredSize(getMinimumSize());
        Config.signupframe.setClosable(true);
        Config.signupframe.setMaximum(true);
    
    }
    catch(Exception ex)
    {
        JOptionPane.showMessageDialog(this, ex, "Main frame-Signup Frame", JOptionPane.ERROR_MESSAGE);
    }

}
public void setPracticeExamFrame()
{
    try
    {
        desktopPaneMaster.removeAll();
        desktopPaneMaster.add(Config.practiceexamination);
        Config.practiceexamination.setVisible(true);
        Config.practiceexamination.setPreferredSize(getMinimumSize());
        Config.practiceexamination.setClosable(true);
        Config.practiceexamination.setMaximum(true);
    
    }
    catch(Exception ex)
    {
        JOptionPane.showMessageDialog(this, ex, "Main frame-PracticeExam Frame", JOptionPane.ERROR_MESSAGE);
    }

}

public void setSettingFrame()
{
    try
    {
        desktopPaneMaster.removeAll();
        desktopPaneMaster.add(Config.settingframe);
        Config.settingframe.setVisible(true);
        Config.settingframe.setPreferredSize(getMinimumSize());
        Config.settingframe.setClosable(true);
        Config.settingframe.setMaximum(true);
    
    }
    catch(Exception ex)
    {
        JOptionPane.showMessageDialog(this, ex, "Main frame-setting Frame", JOptionPane.ERROR_MESSAGE);
    }

}




public void setExaminationFrame()
{
    try
    {
        desktopPaneMaster.removeAll();
        desktopPaneMaster.add(Config.examinationframe);
        Config.examinationframe.setVisible(true);
        Config.examinationframe.setPreferredSize(getMinimumSize());
        Config.examinationframe.setClosable(true);
        Config.examinationframe.setMaximum(true);
    
    }
    catch(Exception ex)
    {
        JOptionPane.showMessageDialog(this, ex, "Main frame-Examination Frame", JOptionPane.ERROR_MESSAGE);
    }

}

public void setInstructionFrame()
{
    
    try
    {
        desktopPaneMaster.removeAll();
        desktopPaneMaster.add(Config.instructionframe);
        Config.instructionframe.setVisible(true);
        Config.instructionframe.setPreferredSize(getMinimumSize());
        Config.instructionframe.setClosable(true);
        Config.instructionframe.setMaximum(true);
    
    }
    catch(Exception ex)
    {
        JOptionPane.showMessageDialog(this, ex, "Main frame-instruction Frame", JOptionPane.ERROR_MESSAGE);
    }
}  

public void setUserMap()
{
    try
    {
        Config.userMap.clear();
        
        List<Users> userList = UserServices.getUserList();
        for(Users user:userList)
        {
            Config.userMap.put(user.getEmail(),user);
            
        }
       
    }
    catch(Exception ex)
    {
     JOptionPane.showMessageDialog(this, ex,"Main Frame ",JOptionPane.ERROR_MESSAGE);

    }
}
public void setTestObjectiveMap()
{
    try
    {
        Config.testQuestionobjectiveMap.clear();
        
        List<Objectives> objectiveList = ObjectiveServices.getTestObjectiveQuestionList();
        for(Objectives objective:objectiveList)
        {
            Config.testQuestionobjectiveMap.put(objective.getQuestion(),objective);
            
        }
       
    }
    catch(Exception ex)
    {
     JOptionPane.showMessageDialog(this, ex,"Main Frame ",JOptionPane.ERROR_MESSAGE);

    }
}
public void setPracticeObjectiveMap()
{
    try
    {
        Config.practicequestionobjectiveMap.clear();
        
        List<Objectives> objectiveList = ObjectiveServices.getPracticeObjectiveQuestionList();
        for(Objectives objective:objectiveList)
        {
            Config.practicequestionobjectiveMap.put(objective.getQuestion(),objective);
            
        }
       
    }
    catch(Exception ex)
    {
     JOptionPane.showMessageDialog(this, ex,"Main Frame ",JOptionPane.ERROR_MESSAGE);

    }
}
public void setAdminLogin()
{
    StudentButton.setEnabled(true);
    QuestionButton.setEnabled(true);
    ResultButton.setEnabled(true);
    SettingButton.setEnabled(true);
    Changepassword.setEnabled(true);
    logoutButton.setEnabled(true);
    LoginButton.setEnabled(false);
    
    
}
public void setStudentLogin()
{
    InstructionButton.setEnabled(true);
    ExaminationButton.setEnabled(true);
    Changepassword.setEnabled(true);
      logoutButton.setEnabled(true);
    LoginButton.setEnabled(false);
    
    this.setTitle("Login: " + Config.user.getName());
}
public void setStudentFrame()
{
    
    try
    {
        desktopPaneMaster.removeAll();
        desktopPaneMaster.add(Config.studentframe);
        Config.studentframe.setVisible(true);
        Config.studentframe.setPreferredSize(getMinimumSize());
        Config.studentframe.setClosable(true);
        Config.studentframe.setMaximum(true);
    
        this.setTitle("Login: " + Config.user.getName());
    }
    catch(Exception ex)
    {
        JOptionPane.showMessageDialog(this, ex, "Main frame-instruction Frame", JOptionPane.ERROR_MESSAGE);
    }
}
public void ObjectiveFrame()
{
    
    try
    {
        desktopPaneMaster.removeAll();
        desktopPaneMaster.add(Config.objectiveframe);
        Config.objectiveframe.setVisible(true);
        Config.objectiveframe.setPreferredSize(getMinimumSize());
        Config.objectiveframe.setClosable(true);
        Config.objectiveframe.setMaximum(true);
    
    }
    catch(Exception ex)
    {
        JOptionPane.showMessageDialog(this, ex, "Main frame-objective Frame", JOptionPane.ERROR_MESSAGE);
    }
}  
public void setLogout()
{
    StudentButton.setEnabled(false);
    QuestionButton.setEnabled(false);
    ResultButton.setEnabled(false);
    SettingButton.setEnabled(false);
    Changepassword.setEnabled(false);
    logoutButton.setEnabled(false);
    InstructionButton.setEnabled(false);
    ExaminationButton.setEnabled(false);
    LoginButton.setEnabled(true);
    
}
 public void setSettingProperties() {
        try {
            File f = new File("conf.properties");
            //this code will create new file if file not exist in current path
            FileOutputStream fout = null;
            fout = new FileOutputStream(f);
            Config.props.store(fout, "NLT INFOTECH");
            fout.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e, "Main Frame Setting", JOptionPane.ERROR_MESSAGE);
        }
    }
public void getSettingProperties()
{
    try
    {
         File f=new File("conf.properties"); 
         FileInputStream fin=null;
         if(f.exists())
         {
             fin=new FileInputStream(f);
             Config.props.load(fin);
            
             if(Config.props.containsKey("email"))
             {
                 Config.settingframe.emailTextField.setText(Config.props.getProperty("email"));
             }
             if(Config.props.containsKey("email password"))
             {
                 Config.settingframe.passwordTextField.setText(Config.props.getProperty("email password"));
             }
             
                if (Config.props.containsKey("exam time")) {
                    Config.settingframe.examTimeTextField.setText(Config.props.getProperty("exam time"));
                }

                if (Config.props.containsKey("exam marks")) {
                    Config.settingframe.examMarkTextField.setText(Config.props.getProperty("exam marks"));
                }
                  if (Config.props.containsKey("instruction1")) {
                    Config.settingframe.instruction1TextField.setText(Config.props.getProperty("instruction1"));
                    Config.instructionframe.instruction1Label.setText(Config.props.getProperty("instruction1"));
                }
                if (Config.props.containsKey("instruction2")) {
                    Config.settingframe.instruction2TextField.setText(Config.props.getProperty("instruction2"));
                    Config.instructionframe.instruction2Label.setText(Config.props.getProperty("instruction2"));

                }
                
             fin.close();
 
         }     
        
    }
    catch(Exception ex)
    {
      JOptionPane.showMessageDialog(this, ex, "Main frame-Setting ", JOptionPane.ERROR_MESSAGE);
 
    }
}
}