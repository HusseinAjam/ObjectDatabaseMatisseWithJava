

import com.matisse.MtDatabase;
import com.matisse.MtException;

public class MatisseConnector {

	private String hostname = "localhost";
	private String dbname = "hhh";
	private MtDatabase db = new MtDatabase(hostname, dbname);
	
	public void connect() throws MtException
	{
	    db.open();
	    db.startTransaction();
	    //System.out.println("Transaction Started");
	}
	
	public void disconnect() throws MtException
	{
		db.commit();
		db.close();
	    //System.out.println("Transaction Closed");
	}
	
	public MtDatabase getDB()
	{
		return db;
	}
	

}
