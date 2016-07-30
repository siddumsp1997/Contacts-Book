// Importing packages for the GUI
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;

// Class to delete a contact (frame)
public class deletecontact extends JFrame{
	
	// Components of the frame
	private JTextField textField;
	public int a;
	public String name;
	public JButton btnNewButton;
	 public JButton btnNewButton_1;
	
	// Class constructor
	public deletecontact() {
		
		super("SEARCH"); // Title of the frame
		getContentPane().setLayout(null);
		Font pkf=new Font("Serif",Font.ITALIC,17);
		
		// Labels of the frame
		JLabel lblEnterTheName = new JLabel("ENTER THE NAME OF THE CONTACT TO BE SEARCHED FOR:");
		lblEnterTheName.setBounds(12, 48, 454, 45);
		getContentPane().add(lblEnterTheName);
		lblEnterTheName.setFont(pkf);
		
		textField = new JTextField("");
		textField.setBounds(12, 106, 419, 58);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		// CLose button
		btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    setVisible(false);
				// Closing the frame
			}
		});
		btnNewButton.setBounds(12, 227, 172, 58);
		getContentPane().add(btnNewButton);
		
		// Proceed Button (to complete action)
		 btnNewButton_1 = new JButton("PROCEED>>");
		btnNewButton_1.addActionListener(new ActionListener()  { //Action listener
			public void actionPerformed(ActionEvent e) { 
				
				if(!textField.getText().equals(""))
				{   a=0;
					name=textField.getText();
					// Searching for the contact
					if(arraylists.relatives!=null){
					for(relative f:arraylists.relatives)
					{
						if(f.name.equals(name))
						{   a=1;
							drelative sids=new drelative(f);
							//Moving to another frame
							sids.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							sids.setSize(575,500);
							sids.setVisible(true);
							
						}
						
					}		}
		           
						if(a==0){
							if(arraylists.personals!=null){
						for(personal p:arraylists.personals)
						{
							if(p.name.equals(name))
							{   a=1;
								dpersonal sids=new dpersonal(p);
								// Moving to another frame
								sids.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								sids.setSize(575,500);
								sids.setVisible(true);
								
							}
						}
						}   }
						
						if(a==0){
							if(arraylists.professionals!=null){
							for(professional pu:arraylists.professionals)
							{
								if(pu.name.equals(name))
								{   a=1;
									dprofessional sids=new dprofessional(pu);
									// Moving to another frame
									sids.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
									sids.setSize(575,500);
									sids.setVisible(true);
									
								}
							}
						}  }
						

						if(a==0){
							if(arraylists.relatives!=null){
							for(casual c:arraylists.casuals)
							{
								if(c.name.equals(name))
								{   a=1;
									dcasual sids=new dcasual(c);
									// Moving to another frame
									sids.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
									sids.setSize(575,500);
									sids.setVisible(true);
									
								}
							}
						}  }
						
						
						if(a==0)
						{    // Pop box if the contact is not found
							JOptionPane.showMessageDialog(null,"Sorry, Contact not found !!");
						}
						
					
					
				}
				// pop up if the name field is empty
				else
				{
					JOptionPane.showMessageDialog(null,"Enter a name to proceed !!");
				}
				
			}
		});
		btnNewButton_1.setBounds(250, 228, 181, 57);
		getContentPane().add(btnNewButton_1);
	}
         // End of constructor
	
}
//end of the class
