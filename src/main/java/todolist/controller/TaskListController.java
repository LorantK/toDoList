package todolist.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kevin on 01/11/2017.
 */

@RestController()
public class TaskListController {

    @RequestMapping("/home")
    public String index() {
        return "Coucou";
    }

}
