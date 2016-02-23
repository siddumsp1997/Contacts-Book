import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class createcourse extends JFrame {
	
	public ButtonGroup grp3;
	public JRadioButton rdbtnRelative;
	public JRadioButton rdbtnPersonalFriend;
	public JRadioButton rdbtnNewRadioButton ;
	public JRadioButton rdbtnNewRadioButton_1;
	public JButton btnNewButton;
	public JButton btnNewButton_1;
	public int indext;
	
	public createcourse() {
		
		super("New contact");
		getContentPane().setLayout(null);
		Font pf=new Font("Serif",Font.ITALIC,21);
		Font kf=new Font("Serif",Font.PLAIN,25);
		Font pkf=new Font("Serif",Font.PLAIN,23);
		
		grp3=new ButtonGroup();
		KGP1 kgp=new KGP1();
		indext=0;
		
		JLabel lblSelectTheType = new JLabel("Select the type of acquintance:");
		lblSelectTheType.setBounds(53, 41, 343, 48);
		getContentPane().add(lblSelectTheType);
		lblSelectTheType.setFont(kf);
		
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
		
		 btnNewButton = new JButton("Next>>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(indext==0)
				{
					JOptionPane.showMessageDialog(null,"Please select an option to proceed.");
					
				}
				else{
				if(indext==1)
				{   setVisible(false);
					crelative kk=new crelative();
					kk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					kk.setSize(560,496);
					kk.setVisible(true);
					
				}
				
				if(indext==2)
				{   setVisible(false);
					cpersonal k=new cpersonal();
					k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					k.setSize(560,496);
					k.setVisible(true);
					
				}
				
				if(indext==3)
				{   setVisible(false);
					cprofessional kkk=new cprofessional();
					kkk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					kkk.setSize(560,496);
					kkk.setVisible(true);
					
				}
				
				if(indext==4)
				{   setVisible(false);
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
		
	    btnNewButton_1 = new JButton("<<Back");
		btnNewButton_1.setBounds(53, 420, 169, 48);
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
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
	
	public class KGP1 implements ItemListener
	{
		
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
	//KGP end
	
}//end of class
