// Import packages for the GUI
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;

// Frame to delete casual friend contact
public class dcasual extends JFrame {
	//Components of the frame
	private JTextField textField;
	private JTextArea textField_1;
	private JTextField textField_2;
	private JTextArea textField_3;
	private JTextField textField_4;
	 public casual rk;
	 public JButton btnNewButton;
	 public JButton btnNewButton_1;
	 
	 // Class constructor
	public dcasual(casual k) {
		super("Casual friend- "+k.name); // Title of the frame
		getContentPane().setLayout(null);
		
		// Creating a casual friend object
		rk=new casual();
		rk=k;
		
		// Frame labels
		JLabel lblName = new JLabel("NAME:");
		lblName.setBounds(25, 45, 56, 16);
		getContentPane().add(lblName);
		
		JLabel lblBirthday = new JLabel("WHEN,WHERE AND UNDER WHAT CIRCUMSTANCES DID YOU MEET:");
		lblBirthday.setBounds(25, 98, 467, 27);
		getContentPane().add(lblBirthday);
		
		JLabel lblMobileNo = new JLabel("MOBILE NO:");
		lblMobileNo.setBounds(25, 227, 99, 16);
		getContentPane().add(lblMobileNo);
		
		JLabel lblNewLabel = new JLabel("OTHER USEFUL INFO:"); //MAX 100 chars
		lblNewLabel.setBounds(12, 277, 237, 27);
		getContentPane().add(lblNewLabel);
		
		JLabel lblEmailId = new JLabel("EMAIL ID:");
		lblEmailId.setBounds(25, 341, 56, 16);
		getContentPane().add(lblEmailId);
		
		// Button to delete contact
		 btnNewButton = new JButton("DELETE CONTACT");
		btnNewButton.addActionListener(new ActionListener() { // Action listener
			public void actionPerformed(ActionEvent arg0) {
				
				// Searching for the contacct to be deleted
				for(int i=0;i<arraylists.casuals.size();i++)
				{
					if(rk.name.equals(arraylists.casuals.get(i).name))
					{
						// Deleting the contact
						arraylists.casuals.remove(i);
						// Updating the changes to the file
						try {
							arraylists.ff.updatefile(arraylists.personals,arraylists.casuals,arraylists.professionals,arraylists.relatives);
						  } catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						    }
					}
				}
				
				JOptionPane.showMessageDialog(null,"Contact successfully deleted !!");
				setVisible(false);
				// exiting frame..
			/*	deletecontact fd=new deletecontact();
				fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fd.setSize(625,666);
				fd.setVisible(true);*/
				
			}
		});
		btnNewButton.setBounds(276, 384, 249, 37);
		getContentPane().add(btnNewButton);
		
		// Close button to close the frame
		 btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.setBounds(22, 384, 227, 37);
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() { // Action listener
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
			/*	createcourse fd=new createcourse();
				fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fd.setSize(625,666);
				fd.setVisible(true);  */
			}
		});
		
		// Text fields of the frame
		textField = new JTextField(rk.name);
		textField.setBounds(93, 35, 432, 37);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		textField_1 = new JTextArea(rk.whenwherehow);
		textField_1.setColumns(10);
		textField_1.setBounds(25, 127, 500, 77);
		getContentPane().add(textField_1);
		textField_1.setEditable(false);
		
		textField_2 = new JTextField(rk.mobileno);
		textField_2.setColumns(10);
		textField_2.setBounds(103, 217, 422, 37);
		getContentPane().add(textField_2);
		textField_2.setEditable(false);
		
		textField_3 = new JTextArea(rk.other);
		textField_3.setColumns(10);
		textField_3.setBounds(146, 262, 379, 56);
		getContentPane().add(textField_3);
		textField_3.setEditable(false);
		
		textField_4 = new JTextField(rk.email);
		textField_4.setColumns(10);
		textField_4.setBounds(93, 331, 432, 37);
		getContentPane().add(textField_4);
		textField_4.setEditable(false);
	}
	// end of the constructor
}
// end of the class
