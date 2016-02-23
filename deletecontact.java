
import java.awt.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;


public class deletecontact extends JFrame{
	private JTextField textField;
	public int a;
	public String name;
	public JButton btnNewButton;
	 public JButton btnNewButton_1;
	
	public deletecontact() {
		
		super("SEARCH");
		getContentPane().setLayout(null);
		Font pkf=new Font("Serif",Font.ITALIC,17);
		
		JLabel lblEnterTheName = new JLabel("ENTER THE NAME OF THE CONTACT TO BE SEARCHED FOR:");
		lblEnterTheName.setBounds(12, 48, 454, 45);
		getContentPane().add(lblEnterTheName);
		lblEnterTheName.setFont(pkf);
		
		textField = new JTextField("");
		textField.setBounds(12, 106, 419, 58);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("Close");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    setVisible(false);
				/*    mainpage sids=new mainpage();
					sids.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					sids.setSize(550,590);
					sids.setVisible(true); */
				
				
			}
		});
		btnNewButton.setBounds(12, 227, 172, 58);
		getContentPane().add(btnNewButton);
		
		 btnNewButton_1 = new JButton("PROCEED>>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(!textField.getText().equals(""))
				{   a=0;
					name=textField.getText();
					
					if(arraylists.relatives!=null){
					for(relative f:arraylists.relatives)
					{
						if(f.name.equals(name))
						{   a=1;
							drelative sids=new drelative(f);
							sids.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
							sids.setSize(575,500);
							sids.setVisible(true);
							
						}
						
					}		}
		           
						if(a==0){
							if(arraylists.personals!=null){
						for(personal p:arraylists.personals)
						{
							if(p.name.equals(name))
							{   a=1;
								dpersonal sids=new dpersonal(p);
								sids.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								sids.setSize(575,500);
								sids.setVisible(true);
								
							}
						}
						}   }
						
						if(a==0){
							if(arraylists.professionals!=null){
							for(professional pu:arraylists.professionals)
							{
								if(pu.name.equals(name))
								{   a=1;
									dprofessional sids=new dprofessional(pu);
									sids.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
									sids.setSize(575,500);
									sids.setVisible(true);
									
								}
							}
						}  }
						

						if(a==0){
							if(arraylists.relatives!=null){
							for(casual c:arraylists.casuals)
							{
								if(c.name.equals(name))
								{   a=1;
									dcasual sids=new dcasual(c);
									sids.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
									sids.setSize(575,500);
									sids.setVisible(true);
									
								}
							}
						}  }
						
						
						if(a==0)
						{
							JOptionPane.showMessageDialog(null,"Sorry, Contact not found !!");
						}
						
					
					
				}
				
				else
				{
					JOptionPane.showMessageDialog(null,"Enter a name to proceed !!");
				}
				
			}
		});
		btnNewButton_1.setBounds(250, 228, 181, 57);
		getContentPane().add(btnNewButton_1);
	}

	
}
