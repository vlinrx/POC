package com.nrx.poc.repository;
import com.nrx.poc.domain.Attribute;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = Attribute.class)
public interface AttributeRepository {

    List<Attribute> findAll();
}
