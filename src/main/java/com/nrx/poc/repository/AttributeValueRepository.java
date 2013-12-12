package com.nrx.poc.repository;
import com.nrx.poc.domain.AttributeValue;
import java.util.List;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoRepository;

@RooMongoRepository(domainType = AttributeValue.class)
public interface AttributeValueRepository {

    List<AttributeValue> findAll();
}
