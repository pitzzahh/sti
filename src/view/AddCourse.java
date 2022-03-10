/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import controller.Process;
import java.awt.*;
import java.util.ArrayList;
import model.Course;
import model.Subject;

/**
 *
 * @author 19
 */
public class AddCourse extends javax.swing.JFrame {

    /**
     * Creates new form addCourse
     */
    public AddCourse() {
        JOptionPane.showMessageDialog(null, "ONLY CLICK THE SAVE ICON WHEN YOU ARE DONE ADDING SUBJECTS TO THE COURSE");
        
        initComponents();
        courseSubjectsList.setEditable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/add_course_small.png")));
        Process.subjects = new ArrayList<>();
        Process.courses = new ArrayList<>();
        Process.listOfAddedSubjects = new ArrayList<>();

        Process.populateCourses();
        Process.populateSubjects();

        if(Process.isDarkTheme()) {
            addCoursePanel.setBackground(Process.DARK_COLOR);
            addCourseHeader.setForeground(Process.LIGHT_COLOR);
            courseCodeLabel.setForeground(Process.LIGHT_COLOR);
            courseDescriptionLabel.setForeground(Process.LIGHT_COLOR);
            selectSubjectsLabel.setForeground(Process.LIGHT_COLOR);
            addedSubjectsLabel.setForeground(Process.LIGHT_COLOR);
        }
        else {
            addCoursePanel.setBackground(Process.LIGHT_COLOR);
        }
        subjectsComboBox.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18));
        subjectsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(Process.getSubjects()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        addCoursePanel = new javax.swing.JPanel();
        addCourseHeader = new javax.swing.JLabel();
        courseCodeLabel = new javax.swing.JLabel();
        courseCodeInput = new javax.swing.JTextField();
        courseDescriptionLabel = new javax.swing.JLabel();
        courseDescriptionInput = new javax.swing.JTextField();
        selectSubjectsLabel = new javax.swing.JLabel();
        subjectsComboBox = new javax.swing.JComboBox<>();
        addSubjectButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();
        scrollPanel = new javax.swing.JScrollPane();
        courseSubjectsList = new javax.swing.JTextArea();
        addedSubjectsLabel = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Course");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        addCoursePanel.setBackground(new java.awt.Color(255, 255, 255));

        addCourseHeader.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addCourseHeader.setText("Add Course");

        courseCodeLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        courseCodeLabel.setText("Course Code:");

        courseCodeInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        courseCodeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseCodeInputActionPerformed(evt);
            }
        });

        courseDescriptionLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        courseDescriptionLabel.setText("Course Description:");

        courseDescriptionInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        selectSubjectsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        selectSubjectsLabel.setText("Select Subjects:");

        subjectsComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        subjectsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        subjectsComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectsComboBoxActionPerformed(evt);
            }
        });

        addSubjectButton.setBackground(new java.awt.Color(255, 255, 255));
        addSubjectButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addSubjectButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-add-48.png"))); // NOI18N
        addSubjectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubjectButtonActionPerformed(evt);
            }
        });

        doneButton.setBackground(new java.awt.Color(255, 255, 255));
        doneButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        doneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save_medium.png"))); // NOI18N
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        courseSubjectsList.setColumns(20);
        courseSubjectsList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        courseSubjectsList.setRows(5);
        scrollPanel.setViewportView(courseSubjectsList);

        addedSubjectsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addedSubjectsLabel.setText("Added Subjects");

        javax.swing.GroupLayout addCoursePanelLayout = new javax.swing.GroupLayout(addCoursePanel);
        addCoursePanel.setLayout(addCoursePanelLayout);
        addCoursePanelLayout.setHorizontalGroup(
            addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCoursePanelLayout.createSequentialGroup()
                .addGroup(addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCoursePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(courseDescriptionLabel)
                            .addComponent(courseCodeLabel)
                            .addComponent(selectSubjectsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subjectsComboBox, 0, 414, Short.MAX_VALUE)
                            .addComponent(courseCodeInput)
                            .addComponent(courseDescriptionInput)
                            .addComponent(addSubjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addCoursePanelLayout.createSequentialGroup()
                        .addGap(462, 462, 462)
                        .addComponent(addCourseHeader)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCoursePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCoursePanelLayout.createSequentialGroup()
                        .addComponent(addedSubjectsLabel)
                        .addGap(216, 216, 216))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCoursePanelLayout.createSequentialGroup()
                        .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        addCoursePanelLayout.setVerticalGroup(
            addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addCoursePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addCourseHeader)
                .addGap(13, 13, 13)
                .addComponent(addedSubjectsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCoursePanelLayout.createSequentialGroup()
                        .addGroup(addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(courseCodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courseCodeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(courseDescriptionInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courseDescriptionLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addCoursePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(selectSubjectsLabel)
                            .addComponent(subjectsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addSubjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(addCoursePanelLayout.createSequentialGroup()
                        .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                        .addGap(19, 19, 19)
                        .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addCoursePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addCoursePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void courseCodeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseCodeInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseCodeInputActionPerformed

    private void addSubjectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSubjectButtonActionPerformed
        Subject subject = new Subject();
        
        if(courseCodeInput.getText().trim().isEmpty() && courseDescriptionInput.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "PLEASE INSERT THE FIELDS PROPERLY");
        }
        else {
            subject.setSubjectCode(Process.subjects.get(subjectsComboBox.getSelectedIndex()).getSubjectCode());
            subject.setSubjectDescription(Process.subjects.get(subjectsComboBox.getSelectedIndex()).getSubjectDescription());
            subject.setUnits(Process.subjects.get(subjectsComboBox.getSelectedIndex()).getUnits());
            
            Process.exist = false;
            
            for(String addedSubject : Process.listOfAddedSubjects) {
                if (addedSubject.contains(subject.getSubjectCode())) {
                    Process.exist = true;
                    break;
                }
            }
            if(Process.exist) {
                JOptionPane.showMessageDialog(null, "SUBJECT ALREADY ADDED");
            }
            else {
                courseSubjectsList.append(" " + subject.getSubjectDescription() + "\n");
                JOptionPane.showMessageDialog(null, "SUBJECT ADDED");
                Process.listOfAddedSubjects.add(subject.getSubjectCode());
            }
        }
    }//GEN-LAST:event_addSubjectButtonActionPerformed

    private void subjectsComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectsComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectsComboBoxActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        if(courseCodeInput.getText().trim().isEmpty() && courseDescriptionInput.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "PLEASE INSERT THE FIELDS PROPERLY");
        }
        else {
            Process.exist = false;
            for(Course course : Process.courses) {
                if (course.getCourseCode().equalsIgnoreCase(courseCodeInput.getText().trim())) {
                    Process.exist = true;
                }
            }
            if(Process.exist){
                JOptionPane.showMessageDialog(null, "COURSE ALREADY EXIST");
            }
            else {
                Course course = new Course(courseCodeInput.getText().trim(), courseDescriptionInput.getText().trim(), Process.subjects);
                Process.courses.add(course);
                Process.saveCoursesToAFile();
                JOptionPane.showMessageDialog(null, "COURSE ADDED SUCCESSFULLY");
                this.dispose();
            }
        }
    }//GEN-LAST:event_doneButtonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddCourse().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addCourseHeader;
    private javax.swing.JPanel addCoursePanel;
    private javax.swing.JButton addSubjectButton;
    private javax.swing.JLabel addedSubjectsLabel;
    private javax.swing.JTextField courseCodeInput;
    private javax.swing.JLabel courseCodeLabel;
    private javax.swing.JTextField courseDescriptionInput;
    private javax.swing.JLabel courseDescriptionLabel;
    private javax.swing.JTextArea courseSubjectsList;
    private javax.swing.JButton doneButton;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JLabel selectSubjectsLabel;
    private javax.swing.JComboBox<String> subjectsComboBox;
    // End of variables declaration//GEN-END:variables
}
