// Packages imported for the GUI
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

// Class to create a new course (frame)
public class createcourse extends JFrame {
	//Elements of the frame
	public ButtonGroup grp3;
	public JRadioButton rdbtnRelative;
	public JRadioButton rdbtnPersonalFriend;
	public JRadioButton rdbtnNewRadioButton ;
	public JRadioButton rdbtnNewRadioButton_1;
	public JButton btnNewButton;
	public JButton btnNewButton_1;
	public int indext;
	
	// Constructor
	public createcourse() {
		
		super("New contact");  // Title of the frame
		getContentPane().setLayout(null);
		Font pf=new Font("Serif",Font.ITALIC,21);
		Font kf=new Font("Serif",Font.PLAIN,25);
		Font pkf=new Font("Serif",Font.PLAIN,23);
		
		// Button group to avoid more than radio button to be selected
		grp3=new ButtonGroup();
		KGP1 kgp=new KGP1();
		indext=0;
		
		// Label of the frame
		JLabel lblSelectTheType = new JLabel("Select the type of acquintance:");
		lblSelectTheType.setBounds(53, 41, 343, 48);
		getContentPane().add(lblSelectTheType);
		lblSelectTheType.setFont(kf);
		
		// Radio buttons
	         rdbtnRelative = new JRadioButton("Relative");
		rdbtnRelative.setBounds(53, 126, 127, 25);
		getContentPane().add(rdbtnRelative);
		rdbtnRelative.setFont(pf);
		 grp3.add(rdbtnRelative);
		 rdbtnRelative.addItemListener(kgp);
		
	        rdbtnPersonalFriend = new JRadioButton("Personal friend");
		rdbtnPersonalFriend.setBounds(53, 199, 287, 25);
		getContentPane().add(rdbtnPersonalFriend);
		rdbtnPersonalFriend.setFont(pf);
		 grp3.add(rdbtnPersonalFriend);
		 rdbtnPersonalFriend.addItemListener(kgp);
		
		 rdbtnNewRadioButton = new JRadioButton("Professional friend");
		rdbtnNewRadioButton.setBounds(53, 279, 230, 25);
		getContentPane().add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(pf);
		 grp3.add(rdbtnNewRadioButton);
		 rdbtnNewRadioButton.addItemListener(kgp);
		
		 rdbtnNewRadioButton_1 = new JRadioButton("Casual friend");
		rdbtnNewRadioButton_1.setBounds(53, 355, 201, 25);
		getContentPane().add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(pf);
		 grp3.add(rdbtnNewRadioButton_1);
		 rdbtnNewRadioButton_1.addItemListener(kgp);
		
		// Next Button
		 btnNewButton = new JButton("Next>>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(indext==0)
				{     // Pop box when none is selected
					JOptionPane.showMessageDialog(null,"Please select an option to proceed.");
					
				}
				else{
				if(indext==1)
				{   setVisible(false);
				     //Moving to a relatives frame
					crelative kk=new crelative();
					kk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					kk.setSize(560,496);
					kk.setVisible(true);
					
				}
				
				if(indext==2)
				{   setVisible(false);
				     //Moving to a personal friends frame
					cpersonal k=new cpersonal();
					k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					k.setSize(560,496);
					k.setVisible(true);
					
				}
				
				if(indext==3)
				{   setVisible(false);
				      //Moving to a professional friends frame
					cprofessional kkk=new cprofessional();
					kkk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					kkk.setSize(560,496);
					kkk.setVisible(true);
					
				}
				
				if(indext==4)
				{   setVisible(false);
				       //Moving to a casual friends frame
					ccasual k1=new ccasual();
					k1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					k1.setSize(560,496);
					k1.setVisible(true);
					
				}
				}
				
			}
		});
		btnNewButton.setBounds(251, 420, 185, 48);
		getContentPane().add(btnNewButton);
		btnNewButton.setFont(pkf);
		
		// BAck button
	    btnNewButton_1 = new JButton("<<Back");
		btnNewButton_1.setBounds(53, 420, 169, 48);
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() { // Action listener
			public void actionPerformed(ActionEvent e) {
				    setVisible(false);
				    mainpage sids=new mainpage();
					sids.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					sids.setSize(550,590);
					sids.setVisible(true);
			}
		});
		btnNewButton_1.setFont(pkf);
		
	}
        // A new class to implement single selection in the radio button group	
	public class KGP1 implements ItemListener
	{
          // Selected item changed		
	  public void itemStateChanged(ItemEvent ee)
	  {
		
		  if(ee.getItem()==rdbtnRelative){
			  
			  indext=1;
		  }
		  
          if(ee.getItem()==rdbtnPersonalFriend){
			  
			  indext=2;
		  }
		  
         if(ee.getItem()==rdbtnNewRadioButton){
			  
			  indext=3;
		  }
         
         if(ee.getItem()==rdbtnNewRadioButton_1){
			  
			  indext=4;
		  }
	  }
	  
	}
	//end of KGP class 
	
}//end of class
