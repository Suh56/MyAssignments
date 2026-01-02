package weekfour.day1;

public class JavaConnection implements DatabseConnection {

		
		 public static void main(String[] args) {

			 JavaConnection db = new JavaConnection();

		        db.connect();
		        db.executeUpdate();
		        db.disconnect();
		
	}

}

