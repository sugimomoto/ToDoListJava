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
        DeleteTask(task.id);
        tasks.add(task);
    }

    public void DeleteTask(Integer taskId){
        Task taskResult = GetTask(taskId);
        int index = tasks.indexOf(taskResult);
        tasks.remove(index);

    }

    public List<Task> GetTasks(){
        return tasks;
    }

    public List<Task> GetTasks(Integer fromIndex, Integer toIndex){
        return tasks.subList(fromIndex, toIndex);
    }

    public Task GetTask(Integer taskId){
        return tasks.stream().filter(task -> taskId.equals(task.id)).findAny().orElse(null);
    }
}
