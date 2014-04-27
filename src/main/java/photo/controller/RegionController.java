package photo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import photo.domain.Region;
import photo.domain.repository.RegionRepository;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class RegionController {

    @Autowired
    RegionRepository regionRepository;

    @RequestMapping(value = "/regions", method = GET)
    public List<Region> getRegions() {
        return regionRepository.findAll();
    }

}
