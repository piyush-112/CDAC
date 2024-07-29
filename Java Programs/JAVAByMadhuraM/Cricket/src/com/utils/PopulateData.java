package com.utils;

import java.util.HashMap;

import com.cricket.Cricketer;

public class PopulateData 
{
	public static HashMap<String, Cricketer> populatePlayers()
	{
		HashMap<String, Cricketer> myPlayers = new HashMap<>();
		myPlayers.put("Virat", new Cricketer("Virat", 32, "abc@gmail.com", "9075938091", 10));
		myPlayers.put("Rohit", new Cricketer("Rohit", 32, "def@gmail.com", "1234567890", 9));
		myPlayers.put("Shubhman", new Cricketer("Shubhman", 32, "ghi@gmail.com", "0789456123", 8));
		myPlayers.put("Ruturaj", new Cricketer("Ruturaj", 32, "jkl@gmail.com", "4567891230", 8));
		
		
		return myPlayers;
	}
}
