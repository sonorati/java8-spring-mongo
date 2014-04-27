package photo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import photo.domain.Photographer;
import photo.domain.repository.PhotographerRepository;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class PhotographerController {

    @Autowired
    PhotographerRepository repository;

    @RequestMapping(value = "/photographers", method = GET)
    public List<Photographer> getRegions() {
        return repository.findAll();
    }
}
