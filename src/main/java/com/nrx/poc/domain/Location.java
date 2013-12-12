package com.nrx.poc.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.layers.repository.mongo.RooMongoEntity;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import org.springframework.roo.addon.json.RooJson;

@RooJavaBean
@RooToString
@RooMongoEntity
@RooJson
public class Location {

    /**
     */
    @NotNull
    @Column(unique = true)
    @Size(min = 2)
    private String erpCode;

    /**
     */
    @Size(max = 256)
    private String name;

    /**
     */
    private String tag;

    /**
     */
    private Integer serialNumber;

    /**
     */
    @NotNull
    private String plant;

    /**
     */
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<AttributeValue> attributeValues = new HashSet<AttributeValue>();
}
