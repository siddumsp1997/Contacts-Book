// Importing packages for the GUI
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

// Frame to show all contacts
public class sall extends JFrame {
	public JButton btnNewButton; // Frame component
	
	// Class constructor
	public sall()
	{       super("List of all acquintances");   // Frame Title 
		getContentPane().setLayout(null);
		
		Font kf=new Font("Serif",Font.ITALIC,25);
		
		// Labels of the frame
		JLabel lblRelatives = new JLabel("RELATIVES");
		lblRelatives.setBounds(67, 13, 77, 16);
		getContentPane().add(lblRelatives);
		
		JLabel lblPersonalFriends = new JLabel("PERSONAL FRIENDS");
		lblPersonalFriends.setBounds(282, 13, 128, 16);
		getContentPane().add(lblPersonalFriends);
		
		JLabel lblProfessionalFriends = new JLabel("PROFESSIONAL FRIENDS");
		lblProfessionalFriends.setBounds(537, 13, 161, 16);
		getContentPane().add(lblProfessionalFriends);
		
		JLabel lblCasualFriends = new JLabel("CASUAL FRIENDS");
		lblCasualFriends.setBounds(820, 13, 114, 16);
		getContentPane().add(lblCasualFriends);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 42, 203, 565);
		getContentPane().add(textArea);
		textArea.setEditable(false);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(249, 42, 203, 565);
		getContentPane().add(textArea_1);
		textArea_1.setEditable(false);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(514, 42, 203, 565);
		getContentPane().add(textArea_2);
		textArea_2.setEditable(false);
		
		JTextArea textArea_3 = new JTextArea();
		textArea_3.setBounds(785, 42, 184, 565);
		getContentPane().add(textArea_3);
		textArea_3.setEditable(false);
		
		// Button to go to main menu
		btnNewButton = new JButton("BACK TO MAIN MENU");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
				// Move to show previous frame
				showcontact gf=new showcontact();
				gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				gf.setSize(476,617);
				gf.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(33, 620, 948, 36);
		getContentPane().add(btnNewButton);
	        btnNewButton.setFont(kf);
		
		            int i;
		           // Displaying the contacts in the respective text areas
			    i=1;	
				for(relative f:arraylists.relatives)
				{
					textArea.append(i+") "+f.name+"\n"); // writing on the text area
					i++;
				}		

		        i=1;
				for(personal p:arraylists.personals)
				{
					textArea_1.append(i+") "+p.name+"\n"); // writing on the text area
					i++;
				}
				
			   i=1;
				for(professional pu:arraylists.professionals)
				{
					textArea_2.append(i+") "+pu.name+"\n"); // writing on the text area
					i++;
				}
			
		       i=1;
				for(casual c:arraylists.casuals)
				{
					textArea_3.append(i+") "+c.name+"\n"); // writing on the text area
					i++;
				}
			
	} 
	//End of constructor
}
//End of class
