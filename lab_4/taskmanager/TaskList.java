/**
 * Name of the Package is lab_4.taskmanager
 */

package lab_4.taskmanager;

/**
 * @author Kelton Thorpe
 * @version V1
 */

public class TaskList {
    
    Task[] tasks; 
    int maxTasks;


    public TaskList(Task[] initialTasks, int maxTasks) {
        Task[] taskArray = new Task[maxTasks];
        for(int i = 0; i < initialTasks.length; i++) {
            taskArray[i] = initialTasks[i];
        }

        this.tasks = taskArray;
        this.maxTasks = maxTasks;
    }

    public void addTask(Task newTask) {
        for(int i = 0; i < tasks.length; i++) {
            if(tasks[i] == null) {
                tasks[i] = newTask;
                break;
            }
        }
    }

    public void displayTasks() {
        boolean empty = true;
        for(int i = 0; i < tasks.length; i++) {
            if(tasks[i] != null) {
                System.out.println(tasks[i].toString());
                empty = false;
            }
        }
        if(empty) {
            System.out.println("No tasks to display.");
        }
    }


}
