package com.gn.practice10.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.gn.practice10.model.vo.Planet;

public class Main {
	public static void main(String[] args) {
	
		Map<String,Planet> solarSystem = new HashMap<String,Planet>();
        solarSystem.put("Mercury", new Planet("수성", 4879, 0.24));
        solarSystem.put("Venus", new Planet("금성", 12104, 0.62));
        solarSystem.put("Earth", new Planet("지구", 12742, 1.0));
        solarSystem.put("Mars", new Planet("화성", 6779, 1.88));
        
        
        System.out.println("*** keySet() 사용 ***");
        Set<String> keys = solarSystem.keySet();
        Iterator<String> keyIterator = keys.iterator();
        while (keyIterator.hasNext()) {
            String key = keyIterator.next();
            Planet planet = solarSystem.get(key);
            System.out.println("행성 이름: " + key +"("+planet.getName()+")"
            		+ ", 지름: " + planet.getDiameter() + " km, 공전주기: " 
            		+ planet.getPeriod() + "년");
        }
        
        System.out.println("*** entrySet() 사용 ***");
        Set<Map.Entry<String, Planet>> entries = solarSystem.entrySet();
        Iterator<Map.Entry<String, Planet>> entryIterator = entries.iterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Planet> entry = entryIterator.next();
            System.out.println("키: " + entry.getKey() + ", 값: " + entry.getValue());
        }

	}
}
