package todolist;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import todolist.model.Task;
import todolist.repository.TaskRepository;

/**
 * Created by Kevin on 01/11/2017.
 */

@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(TaskRepository taskRepository){
        return (evt) -> taskRepository.save(new Task("Ceci est un test"));
    }

}
