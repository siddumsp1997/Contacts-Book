
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;


public class cprofessional extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextArea textField_3;
	 public int a,t,t1,t2,t3;
    public professional rr;
    public JButton btnNewButton;
	 public JButton btnNewButton_1;
    
	public cprofessional() {
		super("New professional friend");
		getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("NAME:");
		lblName.setBounds(25, 45, 56, 16);
		getContentPane().add(lblName);
		
		rr=new professional();
		
		JLabel lblBirthday = new JLabel("MOBILE NO:");
		lblBirthday.setBounds(22, 98, 84, 16);
		getContentPane().add(lblBirthday);
		
		JLabel lblMobileNo = new JLabel("EMAIL ID:");
		lblMobileNo.setBounds(25, 160, 99, 16);
		getContentPane().add(lblMobileNo);
		
		JLabel lblNewLabel = new JLabel("COMMON PROFESSIONAL INTERESTS:");
		lblNewLabel.setBounds(25, 211, 237, 27);
		getContentPane().add(lblNewLabel);
		
	    btnNewButton = new JButton(" DONE !!");
		btnNewButton.setBounds(270, 350, 227, 37);
		getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				  a=0;
				  t=t1=t2=t3=0;
				if(!textField.getText().equals(""))
				{  
					rr.name= textField.getText();
					t=1;
				}
				  
				if(!textField_2.getText().equals(""))
				{  
					rr.email=(textField_2.getText());
					t2=1;
				}
				
				if(!textField_1.getText().equals(""))
				{   if(textField_1.getText().length()!=10)
				  { a=1;
				  }
				
				else{
					rr.mobileno=textField_1.getText();
					t1=1;}
			    }
				
				if(!textField_3.getText().equals(""))
				{   rr.commoninterest=textField_3.getText();
					t3=1;
				}
				
		     
				if(t==1&&t1==1&&t2==1&&t3==1)
				{  
				JOptionPane.showMessageDialog(null,"Contact successfully added !!");
				setVisible(false);
				arraylists.professionals.add(rr);
				
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
				}}}
		});	
		
		 btnNewButton_1 = new JButton("<<BACK");
		btnNewButton_1.setBounds(25, 350, 227, 37);
		getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setVisible(false);
				createcourse fad=new createcourse();
				fad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fad.setSize(500,553);
				fad.setVisible(true);
			}
		});
		
		textField = new JTextField("");
		textField.setBounds(93, 35, 404, 37);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.setUI(new HintTextFieldUI("Enter full name",true));
		
		textField_1 = new JTextField("");
		textField_1.setColumns(10);
		textField_1.setBounds(93, 88, 404, 37);
		getContentPane().add(textField_1);
		textField_1.setUI(new HintTextFieldUI("+91",true));
		
		textField_2 = new JTextField("");
		textField_2.setColumns(10);
		textField_2.setBounds(103, 150, 394, 37);
		getContentPane().add(textField_2);
		textField_2.setUI(new HintTextFieldUI("@gmail.com",true));
		
		textField_3 = new JTextArea("");
		textField_3.setColumns(10);
		textField_3.setBounds(25, 247, 472, 90);
		getContentPane().add(textField_3);
		
	}
}
