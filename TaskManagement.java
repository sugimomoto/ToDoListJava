import java.util.ArrayList;
import java.util.List;

public class TaskManagement {

    private List<Task> tasks;

    public TaskManagement(){
        tasks = new ArrayList<Task>();
    }

    public void AddTask(Task task){
        tasks.add(task);
    }

    public void UpdateTask(Task task){
    }

    public void DeleteTask(Task task){
    }

    public List<Task> GetTasks(){
        return tasks;
    }

    public Task GetTask(Integer id){
        return tasks.get(id);
    }
}
