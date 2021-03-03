package taskHello;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class FutureWeek02 {

	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.now();
		dt.getDayOfWeek();
		LocalDateTime ft = dt.plusYears(3);
		DateTimeFormatter cal = DateTimeFormatter.ofPattern("E");
		String date = ft.format(cal);
		System.out.println("3年後の今日は" + date + "曜日です");
	
	}

}
