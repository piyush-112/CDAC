import java.io.ObjectInputFilter.Status;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private static ArrayList<Task> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char choice;
        do {
            System.out.println("Task Manager");
            System.out.println("a. Add New Task");
            System.out.println("b. Delete a Task");
            System.out.println("c. Update Task Status");
            System.out.println("d. Display all Pending Tasks");
            System.out.println("e. Display all Pending Tasks for Today");
            System.out.println("f. Display all Tasks Sorted by TaskDate");
            System.out.println("x. Exit");
            System.out.print("Enter your choice: ");
            String input = scanner.nextLine();
            if (input.length() > 0) {
                choice = input.charAt(0);
                switch (choice) {
                    case 'a':
                        addTask();
                        break;
                    case 'b':
                        deleteTask();
                        break;
                    case 'c':
                        updateTaskStatus();
                        break;
                    case 'd':
                        displayPendingTasks();
                        break;
                    case 'e':
                        displayPendingTasksForToday();
                        break;
                    case 'f':
                        displayAllTasksSortedByTaskDate();
                        break;
                    case 'x':
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } else {
                System.out.println("Invalid choice!");
                choice = ' ';
            }
        } while (choice != 'x');
    }

    private static void addTask() {
        System.out.print("Enter task name: ");
        String taskName = scanner.nextLine();
        System.out.print("Enter task description: ");
        String description = scanner.nextLine();
        // For simplicity, we'll use current date as task date
        Task task = new Task(taskName, description, new Date());
        tasks.add(task);
        System.out.println("Task added successfully with ID: " + task.getTaskId());
    }

    private static void deleteTask() {
        System.out.print("Enter task ID to delete: ");
        int taskId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (Task task : tasks) {
            if (task.getTaskId() == taskId) {
                task.setActive(false);
                System.out.println("Task deleted successfully.");
                return;
            }
        }
        System.out.println("Task with ID " + taskId + " not found.");
    }

    private static void updateTaskStatus() {
        System.out.print("Enter task ID to update status: ");
        int taskId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Select new status:");
        System.out.println("1. PENDING");
        System.out.println("2. IN_PROGRESS");
        System.out.println("3. COMPLETED");
        System.out.print("Enter your choice: ");
        int statusChoice = scanner.nextInt();
        Status status = Status.PENDING;
        switch (statusChoice) {
            case 1:
                status = Status.PENDING;
                break;
            case 2:
                status = Status.IN_PROGRESS;
                break;
            case 3:
                status = Status.COMPLETED;
                break;
            default:
                System.out.println("Invalid choice! Status remains as PENDING.");
        }
        for (Task task : tasks) {
            if (task.getTaskId() == taskId) {
                task.setStatus(status);
                System.out.println("Task status updated successfully.");
                return;
            }
        }
        System.out.println("Task with ID " + taskId + " not found.");
    }

    private static void displayPendingTasks() {
        System.out.println("Pending Tasks:");
        for (Task task : tasks) {
            if (task.isActive() && task.getStatus() == Status.PENDING) {
                System.out.println(task.getTaskId() + ": " + task.getTaskName());
            }
        }
    }

    private static void displayPendingTasksForToday() {
        System.out.println("Pending Tasks for Today:");
        Date today = new Date();
        for (Task task : tasks) {
            if (task.isActive() && task.getStatus() == Status.PENDING && task.getTaskDate().equals(today)) {
                System.out.println(task.getTaskId() + ": " + task.getTaskName());
            }
        }
    }

    private static void displayAllTasksSortedByTaskDate() {
        tasks.sort((t1, t2) -> t1.getTaskDate().compareTo(t2.getTaskDate()));
        System.out.println("All Tasks Sorted by TaskDate:");
        for (Task task : tasks) {
            if (task.isActive()) {
                System.out.println(task.getTaskId() + ": " + task.getTaskName() + " (Date: " + task.getTaskDate() + ")");
            }
        }
    }
}