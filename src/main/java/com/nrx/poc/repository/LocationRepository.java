package com.nrx.poc.repository;
import com.nrx.poc.domain.Location;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Location.class)
public interface LocationRepository {

    List<Location> findAll();
}
