//Importing swing packages for GUI
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

// Class to show contact
public class showcontact extends JFrame {
	
	// Components of the frame
	public ButtonGroup grp3;
	public JRadioButton rdbtnRelative;
	public JRadioButton rdbtnPersonalFriend;
	public JRadioButton rdbtnNewRadioButton ;
	public JRadioButton rdbtnNewRadioButton_1;
	public JRadioButton rdbtnListOfAll;
	public JButton btnNewButton;
	public JButton btnNewButton_1;
	public int index;
	
	// Class constructor
	public showcontact() {
		
		super("Contact list"); // Frame title
		getContentPane().setLayout(null);
		Font pf=new Font("Serif",Font.ITALIC,21);
		Font kf=new Font("Serif",Font.PLAIN,25);
		Font pkf=new Font("Serif",Font.PLAIN,23);
		
		// Button group for radio buttons
		grp3=new ButtonGroup();
		KGP kgp=new KGP();
		index=0;
		
		// Components of the frame
		JLabel lblSelectTheType = new JLabel("Select the category to be displayed:");
		lblSelectTheType.setBounds(53, 41, 377, 48);
		getContentPane().add(lblSelectTheType);
		lblSelectTheType.setFont(kf);
		
		 rdbtnRelative = new JRadioButton("Relative");
		rdbtnRelative.setBounds(53, 126, 127, 25);
		getContentPane().add(rdbtnRelative);
		rdbtnRelative.setFont(pf);
		 grp3.add(rdbtnRelative);
		 rdbtnRelative.addItemListener(kgp);
		
		 rdbtnPersonalFriend = new JRadioButton("Personal friend");
		rdbtnPersonalFriend.setBounds(53, 200, 287, 25);
		getContentPane().add(rdbtnPersonalFriend);
		rdbtnPersonalFriend.setFont(pf);
		 grp3.add(rdbtnPersonalFriend);
		 rdbtnPersonalFriend.addItemListener(kgp);
		
		 rdbtnNewRadioButton = new JRadioButton("Professional friend");
		rdbtnNewRadioButton.setBounds(53, 273, 230, 25);
		getContentPane().add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(pf);
		 grp3.add(rdbtnNewRadioButton);
		 rdbtnNewRadioButton.addItemListener(kgp);
		
		 rdbtnNewRadioButton_1 = new JRadioButton("Casual friend");
		rdbtnNewRadioButton_1.setBounds(53, 344, 201, 25);
		getContentPane().add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(pf);
		 grp3.add(rdbtnNewRadioButton_1);
		 rdbtnNewRadioButton_1.addItemListener(kgp);
		
		// Next Button
		 btnNewButton = new JButton("Next>>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(index==0)
				{       // Pop up when no option is selected
					JOptionPane.showMessageDialog(null,"Please select an option to proceed.");
					
				}
				
				if(index==1)
				{   setVisible(false);
					srelative kk=new srelative();  // Move to new frame
					kk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					kk.setSize(650,650);
					kk.setVisible(true);
					
				}
				
				if(index==2)
				{   setVisible(false);
					spersonal k=new spersonal();  // Move to new frame
					k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					k.setSize(650,650);
					k.setVisible(true);
					
				}
				
				if(index==3)
				{   setVisible(false);
					sprofessional kkk=new sprofessional(); // Move to new frame
					kkk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					kkk.setSize(650,650);
					kkk.setVisible(true);
					
				}
				
				if(index==4)
				{   setVisible(false);
					scasual k1=new scasual();   // Move to new frame 
					k1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					k1.setSize(650,650);
					k1.setVisible(true);
					
				}
				
				if(index==5)
				{
					setVisible(false);
					sall k1=new sall();       // Move to new frame
					k1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					k1.setSize(1053,733);
					k1.setVisible(true);
					
				}
				
			}
		});
		btnNewButton.setBounds(245, 475, 185, 68);
		getContentPane().add(btnNewButton);
		btnNewButton.setFont(pkf);
		
		//back button
		 btnNewButton_1 = new JButton("<<Back");
		btnNewButton_1.setBounds(54, 475, 169, 68);
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    setVisible(false);
				    //Exit the frame
			}
		});
		btnNewButton_1.setFont(pkf);
		
		 rdbtnListOfAll = new JRadioButton("List of all contacts");
		rdbtnListOfAll.setBounds(53, 411, 201, 25);
		getContentPane().add(rdbtnListOfAll);
		rdbtnListOfAll.setFont(pf);
		grp3.add(rdbtnListOfAll);
		rdbtnListOfAll.addItemListener(kgp);
		
		
		
	}
	
	// To make sure you select only one option
	public class KGP implements ItemListener
	{
		
	  public void itemStateChanged(ItemEvent ee)
	  {
		  if(ee.getItem()==rdbtnRelative){
			  
			  index=1;
		  }
		  
          if(ee.getItem()==rdbtnPersonalFriend){
			  
			  index=2;
		  }
		  
         if(ee.getItem()==rdbtnNewRadioButton){
			  
			  index=3;
		  }
         
         if(ee.getItem()==rdbtnNewRadioButton_1){
			  
			  index=4;
		  }
         
         if(ee.getItem()==rdbtnListOfAll)
         {
        	 index=5;
         }
       }
     } //End of KGP class
	
}//end of class

