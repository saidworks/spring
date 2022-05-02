package demo1;

import java.util.*;

public class MapInterface {

	public static void main(String[] args) {
		Map<Integer,String> myMap = new HashMap<Integer, String>();
		myMap.put(1,"Tom");
		myMap.put(2,"Sam");
		myMap.put(3,"Peter");
		myMap.put(4,"Patrick");
		myMap.put(5,"Tom");
		
		
		System.out.println("My map" + myMap);
		
		System.out.println(myMap.get(1));
		
		 System.out.println("My map keyset " + myMap.keySet());
		 
		 System.out.println("The set is: " + myMap.entrySet());
		
		
		Set <Integer>mySet = myMap.keySet();
		
		for(Integer k: mySet)
			System.out.println(myMap.get(k));
		
		
		
		System.out.println();
		
		for (Map.Entry<Integer,String> e : myMap.entrySet())
            System.out.println("Key: " + e.getKey()
                               + " Value: " + e.getValue());
		

	}

}
