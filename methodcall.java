package practiceprograms;

public class methodcall {
	
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a=12;
			int b=10;
	       add();
	       int s = add( a ,  b);
	       System.out.println("this is called method 2 :" +s);
	       
		}
	    public static int  add() {
     	 System.out.println("this is called method 1");
	  	 return 0;
	    }

	     public static int  add(int a ,int b) {
	     int r=a+b;
	     return r;
	          
	}
	}
	 

