import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {


	public static void main(String[] args) {
		 Date date = Calendar.getInstance().getTime();

		    // Display a date in day, month, year format
		    /*DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");*/
		    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		    String today = formatter.format(date);
		    System.out.println("Today : " + today);
		    
		    Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);
			calendar.add(Calendar.MONTH, 1);
			String nextMonth = formatter.format(calendar.getTime());
			System.out.println("Next Month "+nextMonth);

	}

}
