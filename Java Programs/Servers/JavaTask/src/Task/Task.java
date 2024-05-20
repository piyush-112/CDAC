package Task;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Task {
    private static int taskIdCounter = 1;
    private int taskId;
    private String taskName;
    private String description;
    private Date taskDate;
    private Status status;
    private boolean active;

    public Task(String taskName, String description, Date taskDate) {
        this.taskId = taskIdCounter++;
        this.taskName = taskName;
        this.description = description;
        this.taskDate = taskDate;
        this.status = Status.PENDING;
        this.active = true;
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getDescription() {
        return description;
    }

    public Date getTaskDate() {
        return taskDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}

enum Status {
    PENDING,
    IN_PROGRESS,
    COMPLETED
}

