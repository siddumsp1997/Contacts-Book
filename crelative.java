// Importing packages for the GUi
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;

// Class to create new relative (Frame)
public class crelative extends JFrame {
	//Components of the frame
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
    public int a,t,t1,t2,t3,t4;
    public relative r;
    public JButton btnNewButton;
	 public JButton btnNewButton_1;
       
       //Class constructor
	public crelative() {
		super("New relative");   // Title of the frame
		getContentPane().setLayout(null);
		
		// Labels of the frame
		JLabel lblName = new JLabel("NAME:");
		lblName.setBounds(25, 45, 56, 16);
		getContentPane().add(lblName);
		
		// Creating a new relative object
		r=new relative(); 
		
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
		
		// Done Button
		 btnNewButton = new JButton(" DONE !!");
		btnNewButton.setBounds(270, 350, 227, 37);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {  // Action listener
			public void actionPerformed(ActionEvent arg0) {
				
				  a=0;
				  t=t1=t2=t3=t4=0;
				if(!textField.getText().equals(""))
				{  
					r.name= textField.getText();
					t=1;
				}
				  
				if(!textField_1.getText().equals(""))
				{  
					r.birthday=(textField_1.getText());
					t1=1;
				}
				
				if(!textField_2.getText().equals(""))
				{   if(textField_2.getText().length()!=10)
				  { a=1;
					
				  }
				
				else{
					r.mobileno=textField_2.getText();
					t2=1;}
			    }
				
				if(!textField_3.getText().equals(""))
				{   r.lastmeet=textField_3.getText();
					t3=1;
				}
				
				if(!textField_4.getText().equals(""))
				{   r.email=textField_4.getText();
					t4=1;
				}
			 //Will complete action only if all the textfields are filled	
				if(t==1&&t1==1&&t2==1&&t3==1&&t4==1)
				{  
				JOptionPane.showMessageDialog(null,"Contact successfully added !!");
				setVisible(false);
				if(r!=null){
				arraylists.relatives.add(r);}
				
				// Updating the new contact to the text file
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
				{    // Pop box if any text field is not filled
					if(a!=1){
					JOptionPane.showMessageDialog(null,"Please don't leave any field empty.");}
				else{
					JOptionPane.showMessageDialog(null,"Mobile number should be a 10 digit integer!!");
				}}
				
				
			}
		});	
		

		// Back button
		 btnNewButton_1 = new JButton("<<BACK");
		btnNewButton_1.setBounds(25, 350, 227, 37);
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {  // Action listener
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
				// Moving to create course frame
				createcourse fd=new createcourse();
				fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fd.setSize(500,553);
				fd.setVisible(true);
			}
		});
		
		// Initially, all text fields are empty
		textField = new JTextField(""); //name
		textField.setBounds(93, 35, 404, 37);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setUI(new HintTextFieldUI("Enter full name",true));
		
		textField_1 = new JTextField(""); //birthday
		textField_1.setColumns(10);
		textField_1.setBounds(93, 88, 404, 37);
		getContentPane().add(textField_1);
		textField_1.setUI(new HintTextFieldUI("dd-mm-yyyy format",true));
		
		textField_2 = new JTextField(""); //mobileno
		textField_2.setColumns(10);
		textField_2.setBounds(103, 150, 394, 37);
		getContentPane().add(textField_2);
		textField_2.setUI(new HintTextFieldUI("+91",true));
		
		textField_3 = new JTextField(""); //last meet
		textField_3.setColumns(10);
		textField_3.setBounds(180, 217, 298, 37);
		getContentPane().add(textField_3);
		textField_3.setUI(new HintTextFieldUI("dd-mm-yyyy format",true));
		
		textField_4 = new JTextField(""); //email
		textField_4.setColumns(10);
		textField_4.setBounds(93, 270, 404, 37);
		getContentPane().add(textField_4);
		textField_4.setUI(new HintTextFieldUI("@gmail.com",true));
		
	}
	//End of constructor
}
// End of relatives class
