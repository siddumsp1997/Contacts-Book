

import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;


public class dprofessional extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextArea textField_3;
    public professional rr;
    public JButton btnNewButton;
	 public JButton btnNewButton_1;
	public dprofessional(professional kj) {
		
		super("Professional friend- "+kj.name);
		getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("NAME:");
		lblName.setBounds(25, 45, 56, 16);
		getContentPane().add(lblName);
		
		rr=new professional();
		rr=kj;
		
		JLabel lblBirthday = new JLabel("MOBILE NO:");
		lblBirthday.setBounds(22, 98, 84, 16);
		getContentPane().add(lblBirthday);
		
		JLabel lblMobileNo = new JLabel("EMAIL ID:");
		lblMobileNo.setBounds(25, 160, 99, 16);
		getContentPane().add(lblMobileNo);
		
		JLabel lblNewLabel = new JLabel("COMMON PROFESSIONAL INTERESTS:");
		lblNewLabel.setBounds(25, 211, 237, 27);
		getContentPane().add(lblNewLabel);
		
		 btnNewButton = new JButton("DELETE CONTACT");
		btnNewButton.setBounds(270, 350, 227, 37);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				for(int i=0;i<arraylists.professionals.size();i++)
				{
					if(rr.name.equals(arraylists.professionals.get(i).name))
					{
						
						arraylists.professionals.remove(i);
						try {
							arraylists.ff.updatefile(arraylists.personals,arraylists.casuals,arraylists.professionals,arraylists.relatives);
						  } catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						    }
					}
					
				}
				

				JOptionPane.showMessageDialog(null,"Contact successfully deleted !!");
				setVisible(false);
			/*	deletecontact fd=new deletecontact();
				fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fd.setSize(625,666);
				fd.setVisible(true);*/
				 
				}
		});	
		
		 btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.setBounds(25, 350, 227, 37);
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
			/*	createcourse fad=new createcourse();
				fad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fad.setSize(625,666);
				fad.setVisible(true);*/
			}
		});
		
		textField = new JTextField(kj.name);
		textField.setBounds(93, 35, 404, 37);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		textField_1 = new JTextField(kj.mobileno);
		textField_1.setColumns(10);
		textField_1.setBounds(93, 88, 404, 37);
		getContentPane().add(textField_1);
		textField_1.setEditable(false);
		
		textField_2 = new JTextField(kj.email);
		textField_2.setColumns(10);
		textField_2.setBounds(103, 150, 394, 37);
		getContentPane().add(textField_2);
		textField_2.setEditable(false);
		
		textField_3 = new JTextArea(kj.commoninterest);
		textField_3.setColumns(10);
		textField_3.setBounds(25, 247, 472, 90);
		getContentPane().add(textField_3);
		textField_3.setEditable(false);
	}
}
