package taskHello;
import java.util.*;

public class Tokai {

	public static void main(String[] args) {
		Map<String, Integer> areas = new HashMap<String, Integer>();
		areas.put ("愛知", 755);
		areas.put("岐阜", 199 );
		areas.put("三重", 178);
		
		for(String key : areas.keySet()){
			int value = areas.get(key);
		System.out.println(key + "県の人口は" + value + "万人です"); 
		
		}

	}

}
