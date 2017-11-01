package todolist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Kevin on 01/11/2017.
 */

@RestController
public class ToDoListController {

    @RequestMapping("/")
    public String index() {
        return "Coucou";
    }

}
