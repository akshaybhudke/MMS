import java.security.KeyStore.Entry;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import com.gears.aadish.model.InvardQuantitySheet;
import com.gears.aadish.model.OutwardQuantitySheet;
import com.gears.aadish.model.QuantitySheet;


public class QuantitySheetRunnner {
	
	public static void main(String[] args) throws SQLException {
		
		/*QuantitySheet quantitySheet = new InvardQuantitySheet("1111", "gear1", 500, new Date(2017,12,15),new Date(2018,01,15));
		quantitySheet.getListOfSheets("INVARD",new Date(2017,12,15),new Date(2018,01,15));
		quantitySheet.addJobDetailsToInvardQuantity("111221", "gear21", 5020, new Date(2017,12,18),new Date(2018,01,18));
		
		QuantitySheet quantitySheet2 = new OutwardQuantitySheet("1111", "gear1", 500, new Date(2017,12,15),new Date(2018,01,15));
		quantitySheet2.getListOfSheets("Outward",new Date(2017,12,15),new Date(2018,01,15));
		*/
		
		//Vector v = new Vector();
		/*List v = new ArrayList();
		Date startTime = new Date();
		
		    while (true)
		    {
		      byte b[] = new byte[1048576];
		      v.add(b);
		      Runtime rt = Runtime.getRuntime();		      
		      System.out.println( "free memory: " + rt.freeMemory() );		
		      Date endTime = new Date();
			System.out.println(endTime.getTime()-startTime.getTime());
		    }
		    */
		    
		Map<String, String> map = new HashMap<String, String>();
		map.put("first_name", "Alvin");
		map.put("last_name",  "Alexander");

		// java 8
		map.forEach((k,v)->System.out.println("key: " + k + ", value: " + v));		
		for(Map.Entry<String,String> entry : map.entrySet()){
			System.out.println("Key is :"+entry.getKey() + " Value is : "+ entry.getValue());	
			} 
		
		 
	}
	
}
