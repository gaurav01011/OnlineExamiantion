package org.nlt.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.nlt.include.Config;
import org.nlt.model.Examinations;
import org.nlt.model.Objectives;
import org.nlt.services.ExaminationServices;

public class PracticeExaminationFrame extends javax.swing.JInternalFrame implements Runnable {

    private Thread examThread;
    private int questionIndex = 0;
    private ArrayList<String> questionArrayList;

    public PracticeExaminationFrame() {
        try {
            initComponents();
            questionArrayList = new ArrayList();
            examThread = new Thread(this);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Examination Frame", JOptionPane.ERROR_MESSAGE);

        }
    }

    //when any thread will start execution
    //this method will execute
    public void run() {
        startButton.setEnabled(false);//button will be deactive
        endExamButton.setEnabled(true);//button will be active
        nextButton.setEnabled(true);
        getQuestion();//will display question & option1
        //infinite loop
        int s = 59;

        int m = Integer.parseInt(Config.props.getProperty("exam time"));
        m--;
        while (true) {
            timeLabel.setText("Remaining Time  " + m + ":" + s);
            s--;
            if (s == 0) {
                m--;
                s = 59;
                if (m < 0) {
                    JOptionPane.showMessageDialog(this, "Examination Over", "Exam", JOptionPane.ERROR_MESSAGE);
                    endExamButton.setEnabled(false);
                    nextButton.setEnabled(false);
                    previousButton.setEnabled(false);
                    submitButton.setEnabled(false);
                    break;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                JOptionPane.showMessageDialog(this, ex, "Examination Frame", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        startButton = new javax.swing.JButton();
        endExamButton = new javax.swing.JButton();
        totalQuestionLabel = new javax.swing.JLabel();
        solvedQuestionLabel = new javax.swing.JLabel();
        resultButton = new javax.swing.JButton();
        remainingQuestionLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        option1TextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        option2TextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        option3TextArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        option4TextArea = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        option1RadioButton = new javax.swing.JRadioButton();
        option2RadioButton = new javax.swing.JRadioButton();
        option3RadioButton = new javax.swing.JRadioButton();
        option4RadioButton = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        sp = new javax.swing.JScrollPane();
        questionTextArea = new javax.swing.JTextArea();
        nextButton = new javax.swing.JButton();
        previousButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(678, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Examination");

        timeLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        timeLabel.setForeground(new java.awt.Color(0, 153, 153));
        timeLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        usernameLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(0, 153, 153));
        usernameLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        startButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        startButton.setText("START");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        endExamButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        endExamButton.setForeground(new java.awt.Color(255, 0, 0));
        endExamButton.setText("END EXAM");
        endExamButton.setToolTipText("Dont Click On This Until & Unless You Do Not Want To End Your Exam");
        endExamButton.setEnabled(false);
        endExamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endExamButtonActionPerformed(evt);
            }
        });

        totalQuestionLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalQuestionLabel.setText("TOTAL QUE:");

        solvedQuestionLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        solvedQuestionLabel.setText("SOLVED QUE:");

        resultButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        resultButton.setText("RESULT");
        resultButton.setEnabled(false);
        resultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultButtonActionPerformed(evt);
            }
        });

        remainingQuestionLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        remainingQuestionLabel.setText("REMAINING QUE:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(totalQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(solvedQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(endExamButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(remainingQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(endExamButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(startButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resultButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solvedQuestionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remainingQuestionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Options Available"));
        jPanel3.setLayout(new java.awt.GridLayout(2, 2, 5, 5));

        option1TextArea.setColumns(20);
        option1TextArea.setRows(5);
        jScrollPane1.setViewportView(option1TextArea);

        jPanel3.add(jScrollPane1);

        option2TextArea.setColumns(20);
        option2TextArea.setRows(5);
        jScrollPane2.setViewportView(option2TextArea);

        jPanel3.add(jScrollPane2);

        option3TextArea.setColumns(20);
        option3TextArea.setRows(5);
        jScrollPane3.setViewportView(option3TextArea);

        jPanel3.add(jScrollPane3);

        option4TextArea.setColumns(20);
        option4TextArea.setRows(5);
        jScrollPane4.setViewportView(option4TextArea);

        jPanel3.add(jScrollPane4);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Choose Your Option"));
        jPanel4.setLayout(new java.awt.GridLayout(1, 4, 5, 0));

        buttonGroup1.add(option1RadioButton);
        option1RadioButton.setText("Option1");
        jPanel4.add(option1RadioButton);

        buttonGroup1.add(option2RadioButton);
        option2RadioButton.setText("Option2");
        jPanel4.add(option2RadioButton);

        buttonGroup1.add(option3RadioButton);
        option3RadioButton.setText("Option3");
        jPanel4.add(option3RadioButton);

        buttonGroup1.add(option4RadioButton);
        option4RadioButton.setText("Option4");
        jPanel4.add(option4RadioButton);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Question"));
        jPanel5.setLayout(new java.awt.GridLayout(1, 1));

        questionTextArea.setEditable(false);
        questionTextArea.setColumns(20);
        questionTextArea.setRows(5);
        sp.setViewportView(questionTextArea);

        jPanel5.add(sp);

        nextButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nextButton.setText("NEXT");
        nextButton.setEnabled(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        previousButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        previousButton.setText("PREVIOUS");
        previousButton.setEnabled(false);
        previousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousButtonActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.setEnabled(false);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(previousButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(360, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed

        usernameLabel.setText("Login: " + Config.user.getName());
        if (Config.props.containsKey("exam time")) {
            timeLabel.setText("Time Minutes: " + Config.props.getProperty("exam time"));
        }

        //now it will start the execution of run method
        examThread.start();

        if (questionArrayList.contains(questionTextArea.getText())) {
            submitButton.setEnabled(false);
        } else//unsloved question
        {
            submitButton.setEnabled(true);
        }
        //return number of values object length which are present
        int questionsize = Config.practicequestionobjectiveMap.values().size();
        totalQuestionLabel.setText("Total Que: "+questionsize);
         remainingQuestionLabel.setText("Remaining Que: "+questionsize);
         solvedQuestionLabel.setText("Solved Que: 0");

        
//  new Thread(this);
    }//GEN-LAST:event_startButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        getQuestion();

        //solved question
        if (questionArrayList.contains(questionTextArea.getText())) {
            submitButton.setEnabled(false);
        } else//unsloved question
        {
            submitButton.setEnabled(true);
        }

    }//GEN-LAST:event_nextButtonActionPerformed

    private void previousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousButtonActionPerformed
        questionIndex--;//if 2 then 2-- = 1
        questionIndex--; //if 1 then 1-- =0
        getQuestion();
        if (questionIndex == 1) {
            previousButton.setEnabled(false);
            nextButton.setEnabled(true);
        }

        if (questionArrayList.contains(questionTextArea.getText())) {
            submitButton.setEnabled(false);
        } else//unsloved question
        {
            submitButton.setEnabled(true);
        }

    }//GEN-LAST:event_previousButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        //atleat any option we need to select
        if (option1RadioButton.isSelected() || option2RadioButton.isSelected() || option3RadioButton.isSelected() || option4RadioButton.isSelected()) {
            //create empty object
            Examinations examination=new Examinations();
            
            //the objectives object which we are going to solve
            Objectives objective=Config.practicequestionobjectiveMap.get(questionTextArea.getText());
            int marks=0;
            boolean result=false;
            if(option1RadioButton.isSelected()&&objective.getOption1().equals(objective.getAnswer()))
            {
              marks=objective.getMarks();
              result=true;
            }
            else if(option2RadioButton.isSelected()&&objective.getOption2().equals(objective.getAnswer()))
            {
              marks=objective.getMarks();
               result=true;
            }
              else if(option3RadioButton.isSelected()&&objective.getOption3().equals(objective.getAnswer()))
            {
              marks=objective.getMarks();
               result=true;
            }
            else if(option4RadioButton.isSelected()&&objective.getOption4().equals(objective.getAnswer()))
            {
              marks=objective.getMarks();
               result=true;
            }
            
            //examination.setAnswer(title);
            
            String givenAnswer="";
            if(option1RadioButton.isSelected())
            {
               givenAnswer=option1TextArea.getText();
            }
            else if(option1RadioButton.isSelected())
            {
               givenAnswer=option2TextArea.getText();
            }
            else if(option1RadioButton.isSelected())
            {
               givenAnswer=option3TextArea.getText();
            }
           else if(option1RadioButton.isSelected())
            {
               givenAnswer=option4TextArea.getText();
            }
            
            examination.setAnswer(givenAnswer);
            examination.setCreated(new Date());
            examination.setMarks(marks);
            examination.setModified(new Date());
            examination.setObjective(objective);
            examination.setResult(result);
            examination.setStatus(1);
            examination.setUser(Config.user);
            
            ExaminationServices.addExaminationQuestion(examination);
            questionArrayList.add(questionTextArea.getText());
            submitButton.setEnabled(false);
            if(questionArrayList.size()==Config.practicequestionobjectiveMap.values().size())
            {
                resultButton.setEnabled(true);
            }
            JOptionPane.showMessageDialog(this,"Your Answer Submiited!\n Click To Next/Previos", "Examination",JOptionPane.INFORMATION_MESSAGE);
            
            solvedQuestionLabel.setText("Solved Que:"+questionArrayList.size());
            remainingQuestionLabel.setText("Remaining Que:"+(Config.practicequestionobjectiveMap.values().size()-questionArrayList.size()));
        } else {
            JOptionPane.showMessageDialog(this, "Please Select Any Option", "Examination Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    private void endExamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endExamButtonActionPerformed
        // TODO add your handling code here:
           
    }//GEN-LAST:event_endExamButtonActionPerformed

    private void resultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultButtonActionPerformed
        // TODO add your handling code here:
        try {
            //this login user
            List<Examinations> examinationList = ExaminationServices.getExaminations(Config.user);
            int marks = 0;//total marks
            int totalMarks = 0;//correct question marks
            int correctAnswer=0;
            int incorrectAnswer=0;

            for (Examinations examination : examinationList) {
                marks = marks + examination.getObjective().getMarks();
                //submitted ans if correct
                if (examination.isResult()) {
                    totalMarks = totalMarks + examination.getMarks();
                    correctAnswer++;
                }
                else
                {
                    incorrectAnswer++;
                }
            }

            //if more than= 50%
            if (totalMarks >= marks / 2) {
                JOptionPane.showMessageDialog(this, "Congratulations!\nYour Result Is Passed\nCorrect Answer : "+correctAnswer+"\nIncrrection Answer : "+incorrectAnswer, "Examination Frame", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Sorry!\nYour Result Is Failed\nBetter Luck Next Time", "Examination Frame", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex, "Examination Frame", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_resultButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton endExamButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton nextButton;
    private javax.swing.JRadioButton option1RadioButton;
    private javax.swing.JTextArea option1TextArea;
    private javax.swing.JRadioButton option2RadioButton;
    private javax.swing.JTextArea option2TextArea;
    private javax.swing.JRadioButton option3RadioButton;
    private javax.swing.JTextArea option3TextArea;
    private javax.swing.JRadioButton option4RadioButton;
    private javax.swing.JTextArea option4TextArea;
    private javax.swing.JButton previousButton;
    private javax.swing.JTextArea questionTextArea;
    private javax.swing.JLabel remainingQuestionLabel;
    private javax.swing.JButton resultButton;
    private javax.swing.JLabel solvedQuestionLabel;
    private javax.swing.JScrollPane sp;
    private javax.swing.JButton startButton;
    private javax.swing.JButton submitButton;
    public javax.swing.JLabel timeLabel;
    private javax.swing.JLabel totalQuestionLabel;
    public javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

    private void getQuestion() {
        Collection<Objectives> objectieValues = Config.practicequestionobjectiveMap.values();
        ArrayList<Objectives> objectiveArrayList = new ArrayList(objectieValues);
        Objectives objective = objectiveArrayList.get(questionIndex);
        questionIndex++;
        questionTextArea.setText(objective.getQuestion());
        option1TextArea.setText(objective.getOption1());
        option2TextArea.setText(objective.getOption2());
        option3TextArea.setText(objective.getOption3());
        option4TextArea.setText(objective.getOption4());

        //it means last question is over
        if (questionIndex == objectiveArrayList.size()) {
            nextButton.setEnabled(false);
        }

        //if questionindex>=2 && questions more than= 2
        if (questionIndex > 1 && objectiveArrayList.size() > 1) {
            previousButton.setEnabled(true);
        }
    }

}
