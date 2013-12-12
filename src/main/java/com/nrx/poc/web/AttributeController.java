package com.nrx.poc.web;
import com.nrx.poc.domain.Attribute;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;

@RequestMapping("/attributes")
@Controller
@RooWebScaffold(path = "attributes", formBackingObject = Attribute.class)
@RooWebJson(jsonObject = Attribute.class)
public class AttributeController {
}
