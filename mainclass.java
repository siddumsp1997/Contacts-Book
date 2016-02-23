import java.util.ArrayList;
import javax.swing.*;



public class mainclass {
	public static void main(String args[])throws Exception
	{    
		arraylists.casuals=new ArrayList<>();
		arraylists.personals=new ArrayList<>();
		arraylists.relatives=new ArrayList<>();
		arraylists.professionals=new ArrayList<>();
		arraylists.ff=new createfile(arraylists.personals,arraylists.casuals,arraylists.professionals,arraylists.relatives); 
		
		
		
        startpage sids=new startpage();
		sids.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sids.setSize(706,611);
		sids.setVisible(true);
		
	/*	try {
			arraylists.ff.updatefile(arraylists.personals,arraylists.casuals,arraylists.professionals,arraylists.relatives);
		  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		    }  */
		
		arraylists.ff.closefile();
		
		
	}
	//end of main program
}
