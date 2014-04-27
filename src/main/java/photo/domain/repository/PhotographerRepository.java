package photo.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import photo.domain.Photographer;

public interface PhotographerRepository extends MongoRepository<Photographer,String> {
}
