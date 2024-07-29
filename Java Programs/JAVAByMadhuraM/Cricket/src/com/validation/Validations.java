package com.validation;

import java.util.Map;

import com.cricket.Cricketer;

public class Validations 
{
	public static String validateName(Map<String, Cricketer> myPlayers,String name) throws CricketException
	{
		if(myPlayers.containsKey(name))
		{
			return name;			
		}
		throw new CricketException("Invalide Name!!!!");
	}
	public static String validName(Map<String, Cricketer> myPlayers,String name) throws CricketException
	{
		if(myPlayers.containsKey(name))
		{
			throw new CricketException("Invalide Name!!!!");
		}
		return name;			
	}
}
