// Importing swing packages for the HUI
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;

// Class to delete a relative (Frame)
public class drelative extends JFrame {
	//Components of the frame
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
        public relative r;
        public JButton btnNewButton;
	public JButton btnNewButton_1;
	 
	 // Class constructor
	public drelative(relative x) {
		
		super("Relative- "+x.name);  // Title of the frame
		getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("NAME:");
		lblName.setBounds(25, 45, 56, 16);
		getContentPane().add(lblName);
		
		r=new relative();  // Creating a new relative object
		r=x;
		
		// Labels of the class
		JLabel lblBirthday = new JLabel("BIRTHDAY:");
		lblBirthday.setBounds(22, 98, 84, 16);
		getContentPane().add(lblBirthday);
		
		JLabel lblMobileNo = new JLabel("MOBILE NO:");
		lblMobileNo.setBounds(25, 160, 99, 16);
		getContentPane().add(lblMobileNo);
		
		JLabel lblNewLabel = new JLabel("DATE OF LAST MEETING:");
		lblNewLabel.setBounds(22, 222, 237, 27);
		getContentPane().add(lblNewLabel);
		
		JLabel lblEmailId = new JLabel("EMAIL ID:");
		lblEmailId.setBounds(25, 280, 56, 16);
		getContentPane().add(lblEmailId);
		
		//Button to delete the contact
		btnNewButton = new JButton("DELETE CONTACT");
		btnNewButton.setBounds(270, 350, 227, 37);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// Searchig for the contact to be deleted
				for(int i=0;i<arraylists.relatives.size();i++)
				{
					if(r.name.equals(arraylists.relatives.get(i).name))
					{
						// Removing the concerned contact
						arraylists.relatives.remove(i);
						try {  // Updating the changes to the txt file
							arraylists.ff.updatefile(arraylists.personals,arraylists.casuals,arraylists.professionals,arraylists.relatives);
						  } catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						    }
					}
					
				}
				
				// Exiting the frame
				JOptionPane.showMessageDialog(null,"Contact successfully deleted !!");
				setVisible(false);
			    
			}
		});	
		
		// Button to close the frame 
		btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.setBounds(25, 350, 227, 37);
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
				//close the frame
			}
		});
		
		// Text fields of the frame
		textField = new JTextField(x.name); //name
		textField.setBounds(93, 35, 404, 37);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		textField_1 = new JTextField(x.birthday); //birthday
		textField_1.setColumns(10);
		textField_1.setBounds(93, 88, 404, 37);
		getContentPane().add(textField_1);
		textField_1.setEditable(false);
		
		textField_2 = new JTextField(x.mobileno); //mobileno
		textField_2.setColumns(10);
		textField_2.setBounds(103, 150, 394, 37);
		getContentPane().add(textField_2);
		textField_2.setEditable(false);
		
		textField_3 = new JTextField(x.lastmeet); //last meet
		textField_3.setColumns(10);
		textField_3.setBounds(180, 217, 298, 37);
		getContentPane().add(textField_3);
		textField_3.setEditable(false);
		
		textField_4 = new JTextField(x.email); //email
		textField_4.setColumns(10);
		textField_4.setBounds(93, 270, 404, 37);
		getContentPane().add(textField_4);
		textField_4.setEditable(false);
		
	} // End of the constructor 
}
//End of the class
