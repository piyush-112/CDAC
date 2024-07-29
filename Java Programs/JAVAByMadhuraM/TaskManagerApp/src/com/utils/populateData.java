package com.utils;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.Tasks.task;

public class populateData {
//populated task data for time utilization
	public static Map<Integer, task> populatedata() {
		HashMap<Integer, task> mymap = new HashMap<>();
		mymap.put(1, new task("Notes", "Preapre the java notes", LocalDate.parse("2023-12-13")));
		mymap.put(2, new task("Coding", "Complete the SQL Assignment", LocalDate.parse("2024-02-02")));
		mymap.put(3, new task("Trekking", "Complete the Mt.Kalasubai Trek", LocalDate.parse("2024-12-12")));
		mymap.put(4, new task("Shopping", "Buy groceries", LocalDate.parse("2022-03-17")));
		return mymap;
	}

}
