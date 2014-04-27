package photo;

import com.mongodb.MongoURI;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import photo.domain.Photographer;
import photo.domain.Region;
import photo.domain.repository.PhotographerRepository;
import photo.domain.repository.RegionRepository;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public InitializingBean populateTestData(RegionRepository repository, PhotographerRepository photographerRepo) {
        return () -> {
            Region r = new Region("almeria", "Almeria");
            repository.save(new Region("almeria", "Almeria"));
            repository.save(new Region("madrid", "Madrid"));
            repository.save(new Region("barcelona", "Barcelona"));

            List<String> services = new ArrayList<>();
            services.add("Photograph");

            photographerRepo.save(new Photographer("Super photo ltd",
                    "Carlos",
                    "Porro",
                    "porro@example.com", r,
                    "http://www.fotografosparatuboda.com",
                    "hola", services));

            repository.findAll().forEach(System.err::println);
        };
    }

    @Bean
    public GridFsTemplate gridFsTemplate(MongoProperties properties, MongoTemplate mongo) throws Exception {

        MongoURI mongoURI = new MongoURI(properties.getUri());
        SimpleMongoDbFactory simpleMongoDbFactory = new SimpleMongoDbFactory(mongoURI);
        return new GridFsTemplate(simpleMongoDbFactory, mongo.getConverter());
    }
}
