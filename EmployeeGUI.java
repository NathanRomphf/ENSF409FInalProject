package edu.ucalgary.ensf409.ENSF409_Group69_FinalProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;
import java.util.*;

public class EmployeeGUI extends JFrame implements ActionListener, MouseListener{
  private ArrayList<String> familyMemberTypes;
  private ArrayList<JLabel> fmLabel;
  private ArrayList<JTextField> fmType;
  private JLabel instructions;
  private ArrayList<Integer> peopleInFamily;
  private int numberFamilies;


  // constructor
  public EmployeeGUI(){
    super("Food Bank Menu");
    setupGUI();
    setSize(800, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public void setupGUI(){
    familyMemberTypes = new ArrayList<String>();
    fmLabel = new ArrayList<JLabel>();
    fmType = new ArrayList<JTextField>();
    peopleInFamily = new ArrayList<Integer>();

    peopleInFamily.add(1);
    instructions = new JLabel("Please enter the information for the family.");
    fmLabel.add(new JLabel("Family member category:"));
    fmType.add(new JTextField("Select the type of family member from dropdown menu"));

    // Set up all buttons
    JButton addNewFamily = new JButton("Add Family");
    addNewFamily.addActionListener(this);
    JButton addNewFamilyMember = new JButton("Add Family Member");
    addNewFamilyMember.addActionListener(this);
    JButton createHampers = new JButton("Create Hampers");
    createHampers.addActionListener(this);

    JPanel headerPanel = new JPanel();
    headerPanel.setLayout(new FlowLayout());

    JPanel clientPanel = new JPanel();
    clientPanel.setLayout(new FlowLayout());

    JPanel submitPanel = new JPanel();
    submitPanel.setLayout(new FlowLayout());

    headerPanel.add(instructions);
    clientPanel.add(fmLabel.get(0));
    clientPanel.add(fmType.get(0));
    clientPanel.add(addNewFamilyMember);
    submitPanel.add(addNewFamily);
    submitPanel.add(createHampers);

    this.add(headerPanel, BorderLayout.NORTH);
    this.add(clientPanel, BorderLayout.CENTER);
    this.add(submitPanel, BorderLayout.PAGE_END);

  }

  public void actionPerformed(ActionEvent event){

  }

  public void mouseClicked(MouseEvent event){

  }

  public void mouseEntered(MouseEvent event){

  }

  public void mouseExited(MouseEvent event){

  }

  public void mousePressed(MouseEvent event){

  }

  public void mouseReleased(MouseEvent event){

  }

  // main just used for testing the class should be removed
  public static void main(String[] args) {
    EventQueue.invokeLater(() -> {
        new EmployeeGUI().setVisible(true);
    });
  }
}
