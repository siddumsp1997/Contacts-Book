//Importing swing packages for GUI
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

// Class to show all the relatives (Frame)
public class srelative extends JFrame {
	
       //Components of the Frame
	public ButtonGroup grp3;
	public JRadioButton a3[]=new JRadioButton[25];
	public int index2;
	public JButton btnNewButton;
	 public JButton btnNewButton1;
       
	// Class constructor
	public srelative() {

		super("Relatives ");  // Tilte of the frame
		getContentPane().setLayout(null);
		Font pf=new Font("Serif",Font.PLAIN,25);
		KGP kgp=new KGP();
		Font pf1=new Font("Serif",Font.PLAIN,22);
		grp3=new ButtonGroup();
		int t=104;
		index2=-1;
                
                //Frame label
		JLabel lblAvailableCourses = new JLabel("LIST OF RELATIVES:");
		lblAvailableCourses.setFont(pf);
		lblAvailableCourses.setBounds(12, 13, 451, 88);
		getContentPane().add(lblAvailableCourses);
		lblAvailableCourses.setFont(pf1);
       
                //Checking if there are relatives
		if(arraylists.relatives.size()>0){
		for(int i=0;i<arraylists.relatives.size();i++)
		{  a3[i] = new JRadioButton(arraylists.relatives.get(i).name);
		   a3[i].setFont(pf);
		   a3[i].setBounds(55,t, 263, 25);
		   getContentPane().add(a3[i]);
		   grp3.add(a3[i]);
		   t=t+45;
		   a3[i].addItemListener(kgp);
			
		}}
		
		else
	      {  //If there are no relatives
	    	JLabel lblAvailableCourses1 = new JLabel("No relatives found in database..!!");
	   		lblAvailableCourses1.setFont(pf);
	   		lblAvailableCourses1.setBounds(122,201,437,38); //15,139,263,38
	   		getContentPane().add(lblAvailableCourses1);
	   		lblAvailableCourses1.setFont(pf1);
	       } 
		
                 //Button to view contact
		btnNewButton = new JButton("VIEW CONTACT>>");
		btnNewButton.setBounds(314, 530, 283, 44);
		getContentPane().add(btnNewButton);
		btnNewButton.setFont(pf);
		btnNewButton.addActionListener(
				new ActionListener(){
				public void actionPerformed(ActionEvent es)
				{  if(index2==-1)
				{      //If no option is selected
					JOptionPane.showMessageDialog(null,"Please select a contact to view its contents.");
				}
					
					
				else{
					setVisible(false);        //Move to next frame
					drelative fd=new drelative(arraylists.relatives.get(index2));
					fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					fd.setSize(575,500);
					fd.setVisible(true);
				    }
					
				}
				
				});
		
                 //Back button
		 btnNewButton1 = new JButton("<<BACK");     
		btnNewButton1.setBounds(19, 530, 283, 44);
		getContentPane().add(btnNewButton1);
		btnNewButton1.setFont(pf);
		btnNewButton1.addActionListener(
				new ActionListener(){
				public void actionPerformed(ActionEvent es)
				{  
					setVisible(false);           //Move to show contact frame
					showcontact mans14=new showcontact();
					mans14.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					mans14.setSize(476,617);
					mans14.setVisible(true);
					
				}
				
				});
		
		
	}//end of constructor
	
	
       //Class to implement item listener so that no more than one option is selected
	public class KGP implements ItemListener
	{
	  public void itemStateChanged(ItemEvent ee)
	  {
		 for(int i=0;i<arraylists.relatives.size();i++)
		 {
			 if(ee.getItem()==a3[i])
			 {
				 index2=i;
			 }
			 
		 }
		  		  
	  }
	}//end of KGP class
}
//End of class
