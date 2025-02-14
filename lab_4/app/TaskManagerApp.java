/**
 * Name of the Package is lab_4.app
 */

package lab_4.app;

/**
 * @author Kelton Thorpe
 * @version V1
 */

import lab_4.taskmanager.Task;
import lab_4.taskmanager.TaskList;


public class TaskManagerApp {
    
    public static void main(String[] args) {
        TaskList myTaskList = new TaskList(new Task[0], 5);
        myTaskList.displayTasks();
    }
}
