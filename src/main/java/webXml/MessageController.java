package webXml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MessageController {

//    @Autowired
//    MyMessage messageFromDefaultSuperSpringContainerConfig;

    @Autowired
    MyMessage messageFromSubSpringContainerConfig;

    @Autowired
    MyMessage messageFromSuperSpringContainerConfig;

    @RequestMapping(method = RequestMethod.GET)
    public String hello(ModelMap model) {
//        model.addAttribute("messageFromDefaultSuperSpringContainerConfig", messageFromDefaultSuperSpringContainerConfig.getMessage());
        model.addAttribute("messageFromSubSpringContainerConfig", messageFromSubSpringContainerConfig.getMessage());
        model.addAttribute("messageFromSuperSpringContainerConfig", messageFromSuperSpringContainerConfig.getMessage());
        return "message.jsp";
    }
}
