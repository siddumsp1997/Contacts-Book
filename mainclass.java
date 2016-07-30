import java.util.ArrayList;
import javax.swing.*;

//Main class
public class mainclass {
	public static void main(String args[])throws Exception
	{      
		// Declaring the respective arraylists
		arraylists.casuals=new ArrayList<>();
		arraylists.personals=new ArrayList<>();
		arraylists.relatives=new ArrayList<>();
		arraylists.professionals=new ArrayList<>();
		// Creating/opening the file
		arraylists.ff=new createfile(arraylists.personals,arraylists.casuals,arraylists.professionals,arraylists.relatives); 
		
		// Opening a frame 
                startpage sids=new startpage();
		sids.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sids.setSize(706,611);
		sids.setVisible(true);
		
		arraylists.ff.closefile();  // Closing the text file
		
		
	}
	//end of main program
}
//End of main class
