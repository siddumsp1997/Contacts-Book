import java.util.*;
import java.io.*;


public class createfile {
	
	File file;
	FileReader fr;
	BufferedReader br;
	PrintStream fileStream;
    
	
	//constructor
	public createfile(ArrayList<personal> m,ArrayList<casual> n,ArrayList<professional> i,ArrayList<relative> p)throws Exception
	{    int flag=1;
	    
		String arr[]=new String[4];
		arr[0]="Relatives";
		arr[1]="Personal friends";
		arr[2]="Professional friends";
		arr[3]="Casual friends";

		try {

			file = new File("database.txt");

			// if file doesnt exists, then create it
			if (!file.exists()) 
			{
				file.createNewFile();
		    }
			
			
			else
			{
				fr=new FileReader("database.txt");
				br=new BufferedReader(fr);
				
				String line;
				
				while((line=br.readLine())!=null)
				{   
					
					
					for(int j=0;j<4;j++)
					{   
						if(line!=null){
						if(line.equals(arr[j]))
						{  
						   line=br.readLine();
						   
						 if(line!=null){
						   if(j<3 && line.equals(arr[j+1]))
						   {  
							  continue; 
						   }

						   else{
							   
							   flag=1;
							   while(flag==1)
							   {  
								  flag=0;
								   if(j==0)
								   {   relative p1=new relative();
									   p1.name=line;
									   line=br.readLine();
									   p1.mobileno=line;
									   line=br.readLine();
									   p1.email=line;
									   line=br.readLine();
									   p1.birthday=line;
									   line=br.readLine();
									   p1.lastmeet=line;  
									   p.add(p1);
									   
								   }
								   
								   if(j==1)
								   {   personal m1=new personal();
									   m1.name=line;
									   line=br.readLine();
									   m1.mobileno=line;
									   line=br.readLine();
									   m1.email=line;
									   line=br.readLine();
									   m1.datecontext=line;
									   line=br.readLine();
									   m1.events=line;  
									   m.add(m1);
								   }
								   
								   if(j==2)
								   {   professional i1=new professional();
									   i1.name=line;
									   line=br.readLine();
									   i1.mobileno=line;
									   line=br.readLine();
									   i1.email=line;
									   line=br.readLine();
									   i1.commoninterest=line;
									   i.add(i1);
								   }
								   
								   if(j==3)
								   {   casual n1=new casual();
									   n1.name=line;
									   line=br.readLine();
									   n1.mobileno=line;
									   line=br.readLine();
									   n1.email=line;
									   line=br.readLine();
									   n1.whenwherehow=line;
									   line=br.readLine();
									   n1.other=line;  
									   n.add(n1);
								   }
								   
									   
								   line=br.readLine();
								   
								   if(j<3&&line.equals(arr[j+1]))
								   {   
									   break;
								   }
								   else
								   {   if(line==null)
								       {
									     break;
								       }
								     else
								     {
									   flag=1;
								     }
								   }
								  
								   
							   }//end of while
							   
							   
						   }//end of else
					   
						 }//middle if
						}//end of outer if
						
						}
					}//for loop end
					
	
				} //end of while	
				
			}
			//end of retrieving data from the file (else)
			
			 
			 
		} //end of try
		 
		 catch (IOException e) {
			e.printStackTrace();
		}
		
	}//end of constructor

	
	//function to update file
	public void updatefile(ArrayList<personal> m,ArrayList<casual> n,ArrayList<professional> i,ArrayList<relative> p )throws Exception 
	{    
		
		 
		  fileStream = new PrintStream("database.txt");
		  
		     fileStream.println("Relatives");
		     
		     if(p!=null){
		     for(relative r:p)
		     {

		    	 fileStream.println(r.name);
		    	 fileStream.println(r.mobileno);
		    	 fileStream.println(r.email);
		    	 fileStream.println(r.birthday);
		    	 fileStream.println(r.lastmeet);
		 
		     }
		     }
		     
             fileStream.println("Personal friends");
		     
             if(m!=null){
		     for(personal r:m)
		     {

		    	 fileStream.println(r.name);
		    	 fileStream.println(r.mobileno);
		    	 fileStream.println(r.email);
		    	 fileStream.println(r.datecontext);
		    	 fileStream.println(r.events);
		
		     }
             }
		
		     
            fileStream.println("Professional friends");
		     if(i!=null){
		     for(professional r:i)
		     {

		    	 fileStream.println(r.name);
		    	 fileStream.println(r.mobileno);
		    	 fileStream.println(r.email);
		    	 fileStream.println(r.commoninterest);
		
		     }
		     }
		     
	            fileStream.println("Casual friends");
			     if(n!=null){
			     for(casual r:n)
			     {

			    	 fileStream.println(r.name);
			    	 fileStream.println(r.mobileno);
			    	 fileStream.println(r.email);
			    	 fileStream.println(r.whenwherehow);
			    	 fileStream.println(r.other);
			
			     }
			     }
					fileStream.close(); 
			     
	}//end of updatefile	     
		
	
	//to close the file
	public void closefile()throws Exception
	
	{   if(fr!=null&&br!=null){
		fr.close();
		br.close();
	    }
	}
		 

	
}
//end of class createfile