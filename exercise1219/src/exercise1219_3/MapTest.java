package exercise1219_3;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class MapTest {

	public static void main(String[] args) {
		MapTest mT = new MapTest();
		Map<String, Inventory> map = new HashMap<String, Inventory> ();
		
		map.put("삼성 갤럭시S7", new Inventory("삼성 갤럭시S7", new GregorianCalendar(2016,2,15).getTime(), 30));
		map.put("LG G5", new Inventory("LG G5", new GregorianCalendar(2016,1,25).getTime(), 20));
		map.put("애플 아이패드 Pro", new Inventory("애플 아이패드 Pro", new GregorianCalendar(2016,12,23).getTime(), 15));
		
		Set<Map.Entry<String, Inventory>> s = map.entrySet();
		Inventory []i = new Inventory[s.size()];
		Iterator<Entry<String, Inventory>> list = s.iterator();
		
		int x = 0;
		while(list.hasNext()) {
			Map.Entry<String, Inventory> ent = list.next();
			String key = ent.getKey();
			Inventory value = ent.getValue();
			System.out.println(value);
			
			String pName = value.getProductName();
			Date pD = value.getPutDate();
			int iAmount = value.getPutAmount();
			
			i[x] = new Inventory(pName, pD, iAmount);
			i[x].setGetDate(new Date());
			
			try {
				i[x].setGetAmount(10);	
			} catch(AmountNotEnough e) {
				System.out.println(e.getMessage());
			}
			
			x ++;
		}
		
		System.out.println("\n== 출고수량 10 적용시 ==================================================");
		int y = 0;
		while(y < i.length) {
			System.out.println(i[y].toString());
			
			y ++;
		}
		System.out.println("\n== 출고수량 부족시 =====================================================");
		i[0].setPutAmount(0);
		try {
			i[0].setGetAmount(20);
		} catch(AmountNotEnough e1) {
			System.out.println(e1.getMessage());
		}

	}

}
