package weekfour.day1;

public interface DatabseConnection {

	
	     public default void connect() {
	    		System.out.println("Database connected successfully.");
	     }
	     public default void disconnect() {
	    	 System.out.println("Database disconnected successfully.");
	     }
	     public default void executeUpdate() {
	    	 System.out.println("Update executed on the database.");
	     }

}
