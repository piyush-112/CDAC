package com.tester;

import com.Tasks.*;
import com.utils.*;
import java.time.LocalDate;
import java.util.*;
import java.util.Scanner;

public class taskTester {
	public static void main(String x[]) {
		try(Scanner sc=new Scanner(System.in)){
			boolean exit=false;
			//Create the empty map with populated data
			Map<Integer,task> myTask=populateData.populatedata();
			while(!exit) {
				System.out.println("Option:\n"
								   + "1. Add New Task\n"
								   + "2. Delete a task\n"
								   + "3. Update task status\n"
								   + "4. Display all pending tasks\n"
								   + "5. Display all pending tasks for today\n"
								   + "6. Display all tasks sorted by taskDate\n"
								   + "7 Exit");
				System.out.println("Enter Your Choice:");
				try {
					switch (sc.nextInt()) {
					
					//case for adding the new task:
					case 1:   
						System.out.println("Enter Task Name:");
						String taskName=sc.next();
						System.out.println("Enetet the Task description:");
						String taskDescription=sc.next();
						System.out.println("Enter the Task Date:YYYY-MM-DD");
						LocalDate taskdate=LocalDate.parse(sc.next());
						//adding the info
						task t=new task(taskName,taskDescription,taskdate);
						myTask.put(t.getTaskId(),t);
						System.out.println("Task Added Successfully!");
						break;
						
					//case for delete the task
					case 2:
						System.out.println("Enter the Task Id:");
						int id=sc.nextInt();
						myTask.values().removeIf(s -> s.getTaskId()==id);
						System.out.println("Ooh Task Deleted");
						break;
						
					//case for Update task status
					case 3:
						System.out.println("Enter the task Id");
						int id1=sc.nextInt();
						System.out.println("Enter the task Status:PENDING, INPROGRESS ,COMPLETED");
						StatusApp status=StatusApp.valueOf(sc.next().toUpperCase());
						myTask.values().stream()
						.filter(s -> s.getTaskId()==id1)
						.forEach(s -> s.setStatus(status));
						System.out.println("Status update Successfully!");
						break;
						
					//case for Display all pending task
					case 4:
						myTask.values().stream()
						.filter(s->s.getStatus()==StatusApp.PENDING)
						.forEach(s -> System.out.println(s));
						break;
						
					//case  for Display all pending task for today
					case 5:
						myTask.values().stream()
						.filter(s -> s.getStatus() == StatusApp.PENDING && s.getTaskDate().equals(LocalDate.now()))
						.forEach(s -> System.out.println(s));
						break;
						
					//case for Display all tasks sorted by taskDate
					case 6:
						myTask.values().stream()
						.sorted((s1,s2) -> s1.getTaskDate().compareTo(s2.getTaskDate()))
						.forEach(s -> System.out.println(s));
						break;
						
					//case for exit from the application
					case 7:
						exit=true;
						System.out.println("Exit Successfully");
						break;
						
					default:
						System.out.println("Mistacally You entered Wrong input:( ");
						break;
					}
					
				}catch(Exception ex) {
					sc.next();
					System.out.println(ex);
					System.out.println("Please Try Again!");
				}
			}
		}
	}
}
