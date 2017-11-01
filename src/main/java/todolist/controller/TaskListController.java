package todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import todolist.model.Task;
import todolist.repository.TaskRepository;

/**
 * Created by Kevin on 01/11/2017.
 */

@RestController()
public class TaskListController {

    private TaskRepository taskRepository;

    @Autowired
    TaskListController(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @RequestMapping(method= RequestMethod.GET, value ="/index")
    public String showTasks() {
       StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(Task t : taskRepository.findAll()) {
           sb.append(t.toString());
           sb.append(",");
       }
       sb.append("]");
       return sb.toString();
    }

}
