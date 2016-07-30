// Importing swing packages for GUI implementation
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.util.*;

// Start page frame
public class startpage extends JFrame {
	
	// class constructor
	public startpage() {
		
		 super("CONTACT BOOK");  // Frame title
		 getContentPane().setLayout(null);
		 Font pf=new Font("Serif",Font.ITALIC,23);
		 Font pf1=new Font("Serif",Font.PLAIN,19);
		 Font pf2=new Font("Serif",Font.ITALIC,16);
		 
		 //Components of the frame
		 JButton btnNewButton_1 = new JButton(" OKAY, GOT IT !!");
		btnNewButton_1.setBounds(372, 445, 250, 70);
		getContentPane().add(btnNewButton_1);
	
		JLabel lblWelcomeToIitkharagpur = new JLabel("   WELCOME TO CONTACT BOOK !!");
		lblWelcomeToIitkharagpur.setBounds(12, 0, 624, 55);
		getContentPane().add(lblWelcomeToIitkharagpur);
		lblWelcomeToIitkharagpur.setFont(pf);
		
		JTextArea txtrDasda = new JTextArea();
		txtrDasda.setText("This software helps you to store and manage your contacts so that you wont find it difficult to stay in \ntouch with your loved ones !!\nYou can categorise your contact into any one of these fields:\n(i) Relative\n(ii) Personal friend\n(iii) Professional friend\n(iv) Casual friend\nLet us check what the buttons in main mneu means:\n1)CREATE A NEW CONTACT - helps you create a new contact\n2)SEARCH FOR A CONTACT- helps you search for a contact and view/delete that contact.\n3)CONTACTS' LIST-to view the list of contacts under the above mentioned 4 categories.\nA kind remainder that closing any window using CLOSE(X) button will terminate the entire program.\nThanks for downloading our software !!\nCOPYRIGHT © 2016 SIDDHARRTH_PRIYADHARSAN_M ALL RIGHTS RESERVED\n");
		txtrDasda.setBounds(0, 111, 778, 310);
		txtrDasda.setEditable(false);
		txtrDasda.setFont(pf2);
		getContentPane().add(txtrDasda);
		
		// Button to exit program
		JButton btnNewButton = new JButton("EXIT PROGRAM");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Exit program
				setVisible(false);
			}
		});
		btnNewButton.setBounds(33, 445, 298, 70);
		getContentPane().add(btnNewButton);
		btnNewButton.setFont(pf1);
	
		
		JLabel lblNoteToThe = new JLabel("NOTE TO THE USER :");
		lblNoteToThe.setBounds(22, 55, 200, 50);
		getContentPane().add(lblNoteToThe);
		lblNoteToThe.setFont(pf1);
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
				// Move to main page frame
				mainpage sid=new mainpage();
				sid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				sid.setSize(550,589);
				sid.setVisible(true);
			}
		});
		btnNewButton_1.setFont(pf1);
		
	} //End of constructor
}
//End of Class
