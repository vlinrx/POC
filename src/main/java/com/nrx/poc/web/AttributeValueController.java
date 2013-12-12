package com.nrx.poc.web;
import com.nrx.poc.domain.AttributeValue;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/attributevalues")
@Controller
@RooWebScaffold(path = "attributevalues", formBackingObject = AttributeValue.class)
@RooWebJson(jsonObject = AttributeValue.class)
public class AttributeValueController {
}
