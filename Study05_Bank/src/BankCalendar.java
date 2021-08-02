import java.util.Calendar;

public class BankCalendar {
	public static String DateString(Calendar cal) {
		//월단위 0 붙이기///////////////////////////////
		String month="";
		if((cal.get(Calendar.MONTH)+1) <10) {
			month = "0" +(cal.get(Calendar.MONTH)+1);
		}else {
			month = String.valueOf(cal.get(Calendar.MONTH)+1);
		}
		//일단위 0 붙이기///////////////////////////////
		String day = "";
		if(cal.get(Calendar.DATE) <10) {
			day = "0" +(cal.get(Calendar.MONTH)+1);
		}else {
			day = String.valueOf(cal.get(Calendar.MONTH)+1);
		}
		//취합//////////////////////////////////////
		return cal.get(Calendar.YEAR)+"-"+
				month+"-"+
				day;
	}
	
	
	
	public static String TimeString(Calendar cal) {
		String hour="";
		if(cal.get(Calendar.HOUR)<10) {
			hour = "0" +cal.get(Calendar.HOUR);
		}else {
			hour = String.valueOf(cal.get(Calendar.HOUR));
		}
		//
		String minute="";
		if(cal.get(Calendar.MINUTE)<10) {
			minute = "0" +cal.get(Calendar.MINUTE);
		}else {
			minute = String.valueOf(cal.get(Calendar.MINUTE));
		}
		//
		String second="";
		if(cal.get(Calendar.SECOND)<10) {
			second = "0" +cal.get(Calendar.SECOND);
		}else {
			second = String.valueOf(cal.get(Calendar.SECOND));
		}
		
		
		return hour+":"+
				minute+":"+
				second;
	}
}
