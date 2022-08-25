package name;

public class PrintName {
	
	public static void main(String[] args) {
       String name = "shaik sameera";
       int count = 0;
       for(int i=0;i<name.length();i++) {
    	   for(int j=0;j<name.length();j++) {
    		   if(name.charAt(i)==name.charAt(j) && name.charAt(i)!=' ') {
    			   count++;
    		   }
    	   }
    	   
    	   System.out.println(name.charAt(i)+" : "+count);
    	   count = 0;
       }
	}
   }