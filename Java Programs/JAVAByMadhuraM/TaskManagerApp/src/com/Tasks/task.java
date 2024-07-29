package com.Tasks;
//Main class for declaration of all information about the task
import java.time.LocalDate;

public class task {
	private static int counter=1;   // for Auto updation of the taskId
	private int taskId;
	private String taskName;
	private String description;
	private LocalDate taskDate;
	private StatusApp status;
	private boolean active;
	
	//Parameterized constructor
	public task(String taskName, String description, LocalDate taskDate) {
		super();
		this.taskId = counter;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.status = status.PENDING;
		this.active = true;
		counter++;
	}
	//Object class toString() for showing the output
	@Override
	public String toString() {
		return "task [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description + ", taskDate="
				+ taskDate + ", status=" + status + ", active=" + active + "]";
	}
	//generate the getter setter
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		task.counter = counter;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getTaskDate() {
		return taskDate;
	}
	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}
	public StatusApp getStatus() {
		return status;
	}
	public void setStatus(StatusApp status) {
		this.status = status;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
