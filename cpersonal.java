
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;


public class cpersonal extends JFrame {
	private JTextField textField;
	private JTextArea textField_1;
	private JTextField textField_2;
	private JTextArea textField_3;
	private JTextField textField_4;
	 public int a,t,t1,t2,t3,t4;
	 public personal rt;
	 public JButton btnNewButton;
	 public JButton btnNewButton_1;
	
	public cpersonal() {
		super("New personal friend");
		getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("NAME:");
		lblName.setBounds(25, 45, 56, 16);
		getContentPane().add(lblName);
		
		JLabel lblBirthday = new JLabel("DATE AND CONTEXT OF ACQUINTANCE:");
		lblBirthday.setBounds(25, 98, 320, 27);
		getContentPane().add(lblBirthday);
		
		rt=new personal();
		JLabel lblMobileNo = new JLabel("MOBILE NO:");
		lblMobileNo.setBounds(25, 227, 99, 16);
		getContentPane().add(lblMobileNo);
		
		JLabel lblNewLabel = new JLabel("EVENTS TO BE NOTED:"); //MAX 100 chars
		lblNewLabel.setBounds(25, 267, 237, 27);
		getContentPane().add(lblNewLabel);
		
		JLabel lblEmailId = new JLabel("EMAIL ID:");
		lblEmailId.setBounds(25, 341, 56, 16);
		getContentPane().add(lblEmailId);
		
		btnNewButton = new JButton(" DONE !!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				  a=0;
				  t=t1=t2=t3=t4=0;
				if(!textField.getText().equals(""))
				{  
					rt.name= textField.getText();
					t=1;
				}
				  
				if(!textField_1.getText().equals(""))
				{  
					rt.datecontext=(textField_1.getText());
					t1=1;
				}
				
				if(!textField_2.getText().equals(""))
				{   if(textField_2.getText().length()!=10)
				  { a=1;
					
				  }
				
				else{
					rt.mobileno=textField_2.getText();
					t2=1;}
			    }
				
				if(!textField_3.getText().equals(""))
				{   rt.events=textField_3.getText();
					t3=1;
				}
				
				if(!textField_4.getText().equals(""))
				{   rt.email=textField_4.getText();
					t4=1;
				}
				
				if(t==1&&t1==1&&t2==1&&t3==1&&t4==1)
				{  
				JOptionPane.showMessageDialog(null,"Contact successfully added !!");
				setVisible(false);
				arraylists.personals.add(rt);
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
				{   
					if(a!=1){
					JOptionPane.showMessageDialog(null,"Please don't leave any field empty.");}
				else{
					JOptionPane.showMessageDialog(null,"Mobile number should be a 10 digit integer!!");
				}}
				
				
				
			}
		});		
		btnNewButton.setBounds(276, 384, 249, 37);
		getContentPane().add(btnNewButton);
		
		
	 btnNewButton_1 = new JButton("<<BACK");
		btnNewButton_1.setBounds(22, 384, 227, 37);
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
				createcourse fd=new createcourse();
				fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fd.setSize(500,553);
				fd.setVisible(true);
			}
		});
		
		textField = new JTextField("");
		textField.setBounds(93, 35, 432, 37);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setUI(new HintTextFieldUI("Enter full name",true));
		
		textField_1 = new JTextArea("");
		textField_1.setColumns(10);
		textField_1.setBounds(25, 127, 500, 77);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField("");
		textField_2.setColumns(10);
		textField_2.setBounds(103, 217, 422, 37);
		getContentPane().add(textField_2);
		textField_2.setUI(new HintTextFieldUI("+91",true));
		
		textField_3 = new JTextArea("");
		textField_3.setColumns(10);
		textField_3.setBounds(174, 262, 351, 56);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField("");
		textField_4.setColumns(10);
		textField_4.setBounds(93, 331, 432, 37);
		getContentPane().add(textField_4);
		textField_4.setUI(new HintTextFieldUI("@gmail.com",true));
	}
}
