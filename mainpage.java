//Importing the swing packages for the GUI
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

// Class for the main page (Frame)
public class mainpage extends JFrame{
        //Components of the frame
	public JButton btnNewButton_2;
	public JButton btnNewButton_3;
	public JButton btnNewButton_4;
	public JButton btnNewButton;
	
	//Class constructor
	public mainpage() {
		super("CONTACTS BOOK");    //Title of the frame
		getContentPane().setLayout(null);
		Font pf=new Font("Serif",Font.ITALIC,18);
		Font pf2=new Font("Serif",Font.ITALIC,23);
		
		//Button to create a new contact
		btnNewButton = new JButton("CREATE A NEW CONTACT");
		btnNewButton.setBounds(66, 77, 390, 90);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
				// Move to create course frame
				createcourse fd=new createcourse();
				fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fd.setSize(500,553);
				fd.setVisible(true);
			}
		});
		btnNewButton.setFont(pf);
	
		// Button to search for a contact
		btnNewButton_2 = new JButton("SEARCH FOR A CONTACT");
		btnNewButton_2.setBounds(66, 192, 390, 90);
		getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg4) {
				
				//Move to delete contact frame
				deletecontact fd1=new deletecontact();
				fd1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fd1.setSize(500,360);
				fd1.setVisible(true);
			}
		});
		btnNewButton_2.setFont(pf);
		
		// Check out the entire list of contacts
		btnNewButton_3 = new JButton("CONTACTS' LIST");
		btnNewButton_3.setBounds(66, 311, 390, 90);
		getContentPane().add(btnNewButton_3);
		btnNewButton_3.setFont(pf);
		btnNewButton_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg1) {
			
			//setVisible(false);
			showcontact gf=new showcontact();
			// Go to Show contact frame
			gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gf.setSize(476,617);
			gf.setVisible(true);
			
		}
	});
		// Button to exit the program
	        btnNewButton_4 = new JButton("EXIT");
		btnNewButton_4.setBounds(66, 425, 390, 94);
		getContentPane().add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg2) {
				// Close the frame
				setVisible(false);
			}
		});
		btnNewButton_4.setFont(pf);
		
		// Frame label
		JLabel lblContactList = new JLabel("SELECT ANY OF THE BELOW CHOICES");
		lblContactList.setBounds(51, 31, 469, 33);
		getContentPane().add(lblContactList);
		lblContactList.setFont(pf2);
		
	} //End of constructor
}
//End of the class
