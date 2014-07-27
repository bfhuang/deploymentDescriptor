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
//    MyMessage messageFromSpringContainerBean;

    @Autowired
    MyMessage messageFromRedefinedApplicationContextOfSpring;

    @Autowired
    MyMessage messageFromDefaultApplicationContextOfSpring;

    @RequestMapping(method = RequestMethod.GET)
    public String hello(ModelMap model) {
//        model.addAttribute("messageFromSpringContainerBean", messageFromSpringContainerBean.getMessage());
        model.addAttribute("messageFromRedefinedApplicationContextOfSpring", messageFromRedefinedApplicationContextOfSpring.getMessage());
        model.addAttribute("messageFromDefaultApplicationContextOfSpring", messageFromDefaultApplicationContextOfSpring.getMessage());
        return "hello.jsp";
    }
}
