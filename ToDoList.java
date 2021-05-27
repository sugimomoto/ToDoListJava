import java.util.List;

public class ToDoList{
    public static void main(String[] args){

        TaskManagement taskManagement = new TaskManagement();

        Task task = new Task();
        task.id = 1;
        task.title = "Hello";
        task.priority = "A";
        
        taskManagement.AddTask(task);

        task = new Task();
        task.id = 2;
        task.title = "World";
        task.priority = "B";

        taskManagement.AddTask(task);

        task = new Task();
        task.id = 3;
        task.title = "Hi";
        task.priority = "C";

        taskManagement.AddTask(task);

        task.title = "Update";
        task.priority = "F";

        taskManagement.UpdateTask(task);

        taskManagement.DeleteTask(1);

        List<Task> tasks = taskManagement.GetTasks();

        for (Task result : tasks) {
            System.out.println(result.title);
        }
    }
}


