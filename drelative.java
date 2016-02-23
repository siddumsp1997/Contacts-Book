
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;



public class drelative extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
    public relative r;
    public JButton btnNewButton;
	 public JButton btnNewButton_1;
	 
	public drelative(relative x) {
		super("Relative- "+x.name);
		getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("NAME:");
		lblName.setBounds(25, 45, 56, 16);
		getContentPane().add(lblName);
		
		r=new relative(); 
		r=x;
		
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
		
		btnNewButton = new JButton("DELETE CONTACT");
		btnNewButton.setBounds(270, 350, 227, 37);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
				for(int i=0;i<arraylists.relatives.size();i++)
				{
					if(r.name.equals(arraylists.relatives.get(i).name))
					{
						
						arraylists.relatives.remove(i);
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
				/*
				deletecontact fd=new deletecontact();
				fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fd.setSize(625,666);
				fd.setVisible(true);
				*/
				
			}
		});	
		

		
		btnNewButton_1 = new JButton("CLOSE");
		btnNewButton_1.setBounds(25, 350, 227, 37);
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
				/*deletecontact fd=new deletecontact();
				fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fd.setSize(625,666);
				fd.setVisible(true);*/
			}
		});
		
		textField = new JTextField(x.name); //name
		textField.setBounds(93, 35, 404, 37);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setEditable(false);
		
		textField_1 = new JTextField(x.birthday); //birthday
		textField_1.setColumns(10);
		textField_1.setBounds(93, 88, 404, 37);
		getContentPane().add(textField_1);
		textField_1.setEditable(false);
		
		textField_2 = new JTextField(x.mobileno); //mobileno
		textField_2.setColumns(10);
		textField_2.setBounds(103, 150, 394, 37);
		getContentPane().add(textField_2);
		textField_2.setEditable(false);
		
		textField_3 = new JTextField(x.lastmeet); //last meet
		textField_3.setColumns(10);
		textField_3.setBounds(180, 217, 298, 37);
		getContentPane().add(textField_3);
		textField_3.setEditable(false);
		
		textField_4 = new JTextField(x.email); //email
		textField_4.setColumns(10);
		textField_4.setBounds(93, 270, 404, 37);
		getContentPane().add(textField_4);
		textField_4.setEditable(false);
		
	}
}
