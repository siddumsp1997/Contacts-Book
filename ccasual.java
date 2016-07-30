//Headers for GUI
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;

// Frame of Casual friends 
public class ccasual extends JFrame {
	
	// Required elements for the frame
	private JTextField textField;
	private JTextArea textField_1;
	private JTextField textField_2;
	private JTextArea textField_3;
	private JTextField textField_4;
	 public int a,t,t1,t2,t3,t4;
	 public casual rk;
	 public JButton btnNewButton_1;
	 public JButton btnNewButton;
	 
	 //Constructor
	   public ccasual() {
		super("New casual friend");
		getContentPane().setLayout(null);
		
		// Test field elements
		rk=new casual();
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
	
	   // Button element	
	   btnNewButton = new JButton(" DONE !!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {  // Will complete action only if all the text fields are filled
				 a=0;
				  t=t1=t2=t3=t4=0;
				if(!textField.getText().equals(""))
				{  
					rk.name= textField.getText();
					t=1;
				}
				  
				if(!textField_1.getText().equals(""))
				{  
					rk.whenwherehow=(textField_1.getText());
					t1=1;
				}
				
				if(!textField_2.getText().equals(""))
				{   if(textField_2.getText().length()!=10)
				  { a=1;
				  }
				
				else{
					rk.mobileno=textField_2.getText();
					t2=1;}
			    }
				
				if(!textField_3.getText().equals(""))
				{   rk.other=textField_3.getText();
					t3=1;
				}
				
				if(!textField_4.getText().equals(""))
				{   rk.email=textField_4.getText();
					t4=1;
				}
				
				if(t==1&&t1==1&&t2==1&&t3==1&&t4==1)
				{  
				JOptionPane.showMessageDialog(null,"Contact successfully added !!");
				setVisible(false);
				arraylists.casuals.add(rk);
				
				// Updating the new member to the text file
				try {
					arraylists.ff.updatefile(arraylists.personals,arraylists.casuals,arraylists.professionals,arraylists.relatives);
				  } catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				    }
				
				createcourse fd=new createcourse();
				fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fd.setSize(500,553);
				fd.setVisible(true);
				
				//update file
				}
				
				else
				{     // Message box showing that some text field hasn't been filled
					if(a!=1){
					JOptionPane.showMessageDialog(null,"Please don't leave any field empty.");}
				else{
					JOptionPane.showMessageDialog(null,"Mobile number should be a 10 digit integer!!");
				}}
				
			}
		});
		btnNewButton.setBounds(276, 384, 249, 37);
		getContentPane().add(btnNewButton);
		
		//Back Button
	   btnNewButton_1 = new JButton("<<BACK");
		btnNewButton_1.setBounds(22, 384, 227, 37);
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
				createcourse fd=new createcourse();
				fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fd.setSize(500,553);
				fd.setVisible(true);
			}
		});
		
		// At first, all the text fields are empty
		textField = new JTextField("");
		textField.setBounds(93, 35, 432, 37);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setUI(new HintTextFieldUI("Enter full name",true));
		
		textField_1 = new JTextArea("");
		textField_1.setColumns(10);
		textField_1.setBounds(25, 127, 500, 77);
		getContentPane().add(textField_1);
		textField_1.setUI(new HintTextFieldUI(" dd-mm-yyyy format",true));
		
		textField_2 = new JTextField("");
		textField_2.setColumns(10);
		textField_2.setBounds(103, 217, 422, 37);
		getContentPane().add(textField_2);
		textField_2.setUI(new HintTextFieldUI("+91",true));
		
		textField_3 = new JTextArea("");
		textField_3.setColumns(10);
		textField_3.setBounds(146, 262, 379, 56);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField("");
		textField_4.setColumns(10);
		textField_4.setBounds(93, 331, 432, 37);
		getContentPane().add(textField_4);
		textField_4.setUI(new HintTextFieldUI("@gmail.com",true));
		
	} //End of the constructor
}
// End of the class
