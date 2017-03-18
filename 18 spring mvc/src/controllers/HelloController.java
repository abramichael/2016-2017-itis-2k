package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ma on 16.03.2017.
 */
@Controller
public class HelloController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    //@ResponseBody
    public String hello(ModelMap modelMap,
                        @RequestParam(value = "name", required = false)
            String blabla) {
        modelMap.put("name", blabla);
        //return new ModelAndView("hello", modelMap);
        return "hello";
    }
}
