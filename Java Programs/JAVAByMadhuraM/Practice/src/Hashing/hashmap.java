package Hashing;

import java.util.*;

//TO create the map to strore the key vale pair
public class hashmap {
	public static void main(String x[]) {
		Map<String,Integer> mp=new HashMap<>();
		mp.put("Ram", 21);   //put() is used to insert the value into map;
		mp.put("Shyam", 22);
		mp.put("Radha",19);
//		System.out.println("The key of the Ram is"+mp.get("Ram")); //21
		System.out.println("The key of the Rakesh is:"+mp.get("Rakesh"));//null
		mp.put("Ram",22);     //updating the value of the key;
		System.out.println("The key of the Ram is"+mp.get("Ram"));
		mp.remove("Ram");   //Remove the key;
		System.out.println(mp.remove("Kishan")); //If key is not present return null
		System.out.println(mp);
		System.out.println(mp.containsKey("Shyam"));   //Check if contains or not if yes return true;
		mp.putIfAbsent("Rana", 45);       // insert element if not present
		System.out.println(mp);     
		//To print the only keys from map
		System.out.println(mp.keySet());
		//To print only the values from the map
		System.out.println(mp.values());
		//To print the all the map with the keys and values;
		System.out.println(mp.entrySet());
		//Traversing the map using the for-each
		for(String key:mp.keySet()) {
			System.out.printf("The name of %s with age %d\n",key,mp.get(key));
		}
	}
}
