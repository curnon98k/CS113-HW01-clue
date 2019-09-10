import java.util.*;
public class AssistantJack
{
	private int timesAsked; 
	private Theory correctTheory;
	
	private AssistantJack() 
	{ 
	       this.timesAsked = 0; 
	       this.correctTheory = null;
	} 
	
	public AssistantJack(int answerSet) 
	{ 
	       this();
	       if (answerSet == 1) 
	       { 
	            this.correctTheory = new Theory(1, 1, 1);
	       } 
	       else if (answerSet == 2) 
	       { 
	            this.correctTheory = new Theory(6, 10, 6); 
	       } 
	       else 
	       { 
	            Random random = new Random(); 
	            int weapon = random.nextInt (6) + 1; 
	            int location = random.nextInt (10) + 1; 
	            int person = random.nextInt(6) + 1; 
	            this.correctTheory = new Theory (weapon, location, person); 
	       }
	  }
	  
	  public AssistantJack (Theory theory) 
	  { 
	        this(); 
	        this.correctTheory = new Theory(theory);
	  }
	  
	  public int checkAnswer(int weapon, int location, int person) 
	  { 
	       ArrayList<Integer> wrongItems = new ArrayList<Integer>();
	       this.timesAsked++; 
	       //check each part and add to array list appropriately 
	       if (this.correctTheory.getWeapon() != weapon) 
	       { 
	             wrongItems.add(1);
	       } 
	       if (this.correctTheory.getLocation() != location) 
	       { 
	             wrongItems.add(2);  
	       }      
	       if (this.correctTheory.getPerson() != person) 
	       {    
	             wrongItems.add(3);
	       } 
	       // return based on incorrect items, if any, in array list 
	       if (wrongItems.size() == 0) 
	       { 
	             return 0; 
	       } 
	       else if (wrongItems.size() == 1) 
	       { 
	             return wrongItems.get(0); 
	       } 
	       else 
	       { 
	             Random random = new Random();
	             int randomSelected = random.nextInt (wrongItems.size()); 
	             return wrongItems.get (randomSelected); 
	       }
	       
	   }
	   
	   public int checkAnswer(Theory theory)
	   {
	   	return this.checkAnswer(theory.getWeapon(), theory.getLocation(), theory.getPerson());
	   }
	   
	   public int getTimesAsked()
	   {
	   	return this.timesAsked;
	   }
}