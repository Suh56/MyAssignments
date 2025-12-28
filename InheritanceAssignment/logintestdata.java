package InheritanceAssignment;

public class logintestdata extends testdata {
	
	 public void enterUsername() {
	        System.out.println("Entering Username");
	    }

	    public void enterPassword() {
	        System.out.println("Entering Password");
	    }
	    
	    public static void main(String[] args) {
	    	
	    	logintestdata obj1=new logintestdata();
	    	obj1.enterCredentials();
	    	obj1.navigateToHomePage();
	    	obj1.enterUsername();
	    	obj1.enterPassword();
	    

}
}