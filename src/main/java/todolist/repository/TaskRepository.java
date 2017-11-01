package todolist.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import todolist.model.Task;

/**
 * Created by Kevin on 01/11/2017.
 */
@RepositoryRestResource
public interface TaskRepository extends CrudRepository<Task, Long> {
}
