package com.nrx.poc.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.persistence.ManyToOne;
import org.springframework.roo.addon.json.RooJson;

@RooJavaBean
@RooToString
@RooMongoEntity
@RooJson
public class AttributeValue {

    /**
     */
    @NotNull
    private String attValue;

    /**
     */
    @NotNull
    @ManyToOne
    private Attribute attribute;
}
