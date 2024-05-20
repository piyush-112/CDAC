package tester;
import java.time.LocalDate;
import java.util.*;

class Task {
    private static int nextId = 1;
    private int taskId;
    private String taskName;
    private String description;
    private LocalDate taskDate;
    private String status;
    private boolean active;

    public Task(String taskName, String description, LocalDate taskDate) {
        this.taskId = nextId++;
        this.taskName = taskName;
        this.description = description;
        this.taskDate = taskDate;
        this.status = "PENDING";
        this.active = true;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", taskName='" + taskName + '\'' +
                ", description='" + description + '\'' +
                ", taskDate=" + taskDate +
                ", status='" + status + '\'' +
                ", active=" + active +
                '}';
    }
}

public class TaskManager {

    private static Map<Integer, Task> taskMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add New Task");
            System.out.println("2. Delete a task");
            System.out.println("3. Update task status");
            System.out.println("4. Display all pending tasks");
            System.out.println("5. Display all pending tasks for today");
            System.out.println("6. Display all tasks sorted by taskDate");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addNewTask();
                    break;
                case 2:
                    deleteTask();
                    break;
                case 3:
                    updateTaskStatus();
                    break;
                case 4:
                    displayPendingTasks();
                    break;
                case 5:
                    displayPendingTasksForToday();
                    break;
                case 6:
                    displayAllTasksSortedByDate();
                    break;
                case 7:
                    System.out.println("Thank you for using the TaskManager!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice!= 7);

        scanner.close();
    }

    private static void addNewTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter task name: ");
        String taskName = scanner.nextLine();
        System.out.print("Enter description: ");
        String description = scanner.nextLine();
        System.out.print("Enter task date (yyyy-MM-dd): ");
        LocalDate taskDate = LocalDate.parse(scanner.nextLine());

        Task task = new Task(taskName, description, taskDate);
        taskMap.put(task.getTaskId(), task);

        System.out.println("Task added successfully!");
    }

    private static void deleteTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter task ID to delete: ");
        int taskId = scanner.nextInt();

        if (taskMap.containsKey(taskId)) {
            taskMap.get(taskId).setActive(false);
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Task not found.");
        }
    }

    private static void updateTaskStatus() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter task ID to update status: ");
        int taskId = scanner.nextInt();

        if (taskMap.containsKey(taskId)) {
            System.out.print("Enter new status (PENDING/IN PROGRESS/COMPLETED): ");
            String newStatus = scanner.nextLine().toUpperCase();

            if (newStatus.equals("PENDING") || newStatus.equals("IN PROGRESS") || newStatus.equals("COMPLETED")) {
                taskMap.get(taskId).setStatus(newStatus);
                System.out.println("Task status updated successfully!");
            } else {
                System.out.println("Invalid status. Please try again.");
            }
        } else {
            System.out.println("Task not found.");
        }
    }

    private static void displayPendingTasks() {
        System.out.println("Pending Tasks:");
        taskMap.values().stream()
              .filter(task -> task.getStatus().equals("PENDING") && task.isActive())
              .forEach(System.out::println);
    }

    private static void displayPendingTasksForToday() {
        LocalDate today = LocalDate.now();
        System.out.println("Pending Tasks for Today:");
        taskMap.values().stream()
              .filter(task -> task.getStatus().equals("PENDING") && task.isActive() && task.getTaskDate().equals(today))
              .forEach(System.out::println);
    }

    private static void displayAllTasksSortedByDate() {
        System.out.println("All Tasks Sorted by Date:");
        taskMap.values().stream()
              .sorted(Comparator.comparing(Task::getTaskDate))
              .forEach(System.out::println);
    }
}