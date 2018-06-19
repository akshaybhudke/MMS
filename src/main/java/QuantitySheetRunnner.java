import java.sql.SQLException;
import java.util.Date;

import com.gears.aadish.model.InvardQuantitySheet;
import com.gears.aadish.model.OutwardQuantitySheet;
import com.gears.aadish.model.QuantitySheet;


public class QuantitySheetRunnner {
	
	public static void main(String[] args) throws SQLException {
		
		QuantitySheet quantitySheet = new InvardQuantitySheet("1111", "gear1", 500, new Date(2017,12,15),new Date(2018,01,15));
		quantitySheet.getListOfSheets("INVARD",new Date(2017,12,15),new Date(2018,01,15));
		quantitySheet.addJobDetailsToInvardQuantity("111221", "gear21", 5020, new Date(2017,12,18),new Date(2018,01,18));
		
		QuantitySheet quantitySheet2 = new OutwardQuantitySheet("1111", "gear1", 500, new Date(2017,12,15),new Date(2018,01,15));
		quantitySheet2.getListOfSheets("Outward",new Date(2017,12,15),new Date(2018,01,15));
		
		
	}

}
