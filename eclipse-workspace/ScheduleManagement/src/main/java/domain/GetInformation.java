package domain;

import java.time.*;
import java.util.Calendar;
import javax.persistence.Entity;


public class GetInformation {
	
	Calendar calendar = Calendar.getInstance();
	int year = calendar.get(Calendar.YEAR);
	int month = calendar.get(Calendar.MONTH);
	int day = calendar.get(calendar.DATE);
	
	
	
	
	LocalDate time = LocalDate.now(); 

}
