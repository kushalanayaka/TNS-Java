package EnumKeyword;

public class Demo {
      public static void main(String args[]) {
    	  Status s  = Status.Completed;
    	  Status t = Status.Success;
    	  System.out.println(s);
//    	  System.out.println(t.ordinal()); //ordinal keyword helps to get the index.
    	  
    	  Status[] ar = Status.values(); //we also create the array
    	  
    	  for(Status a : ar) {
//    		  System.out.println(a + " : " + a.ordinal());
    	  }
    	  
    	  
    	  if (s == Status.Running) 
    		  System.out.println("All good");
    	  else if(s == Status.Completed)
    	      System.out.println("All Done");
    	  else if(s == Status.Failed)
    		  System.out.println("Its Bad");
    	  else
    		  System.out.print("Its Successful");
    	  
      }
}

enum Status { //Enum is a special kind of data type that represents a fixed set of constants (weeks, direction, states)
	Running, Failed, Success, Completed;
}