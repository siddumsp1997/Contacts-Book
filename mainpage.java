import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class mainpage extends JFrame{
	public JButton btnNewButton_2;
	public JButton btnNewButton_3;
	public JButton btnNewButton_4;
	public JButton btnNewButton;
	
	
	public mainpage() {
		
		super("CONTACTS BOOK");
		getContentPane().setLayout(null);
		Font pf=new Font("Serif",Font.ITALIC,18);
		Font pf2=new Font("Serif",Font.ITALIC,23);
		btnNewButton = new JButton("CREATE A NEW CONTACT");
		btnNewButton.setBounds(66, 77, 390, 90);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
				createcourse fd=new createcourse();
				fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fd.setSize(500,553);
				fd.setVisible(true);
			}
		});
		btnNewButton.setFont(pf);
	
		
		 btnNewButton_2 = new JButton("SEARCH FOR A CONTACT");
		btnNewButton_2.setBounds(66, 192, 390, 90);
		getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg4) {
				
				//setVisible(false);
				deletecontact fd1=new deletecontact();
				fd1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fd1.setSize(500,360);
				fd1.setVisible(true);
			}
		});
		btnNewButton_2.setFont(pf);
		
		
		 btnNewButton_3 = new JButton("CONTACTS' LIST");
		btnNewButton_3.setBounds(66, 311, 390, 90);
		getContentPane().add(btnNewButton_3);
		btnNewButton_3.setFont(pf);
		btnNewButton_3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg1) {
			
			//setVisible(false);
			showcontact gf=new showcontact();
			gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gf.setSize(476,617);
			gf.setVisible(true);
			
		}
	});
		
	  btnNewButton_4 = new JButton("EXIT");
		btnNewButton_4.setBounds(66, 425, 390, 94);
		getContentPane().add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg2) {
				
				setVisible(false);
			}
		});
		btnNewButton_4.setFont(pf);
		
		JLabel lblContactList = new JLabel("SELECT ANY OF THE BELOW CHOICES");
		lblContactList.setBounds(51, 31, 469, 33);
		getContentPane().add(lblContactList);
		lblContactList.setFont(pf2);
		
		
	}
}
