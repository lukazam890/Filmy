package pl.zajecia.filmy.dao;

import org.springframework.data.repository.CrudRepository;
import pl.zajecia.filmy.dao.entity.VideoCassete;

public interface VideoCasseteRepo extends CrudRepository<VideoCassete,Long> {

}
