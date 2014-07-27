package webXml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MessageController {

    @Autowired
    MyMessage messageFromWebContainerBean;

    @Autowired
    MyMessage messageFromSpringContainerBean;

    @Autowired
    MyMessage messageFromApplicationContext;

    @RequestMapping(method = RequestMethod.GET)
    public String hello(ModelMap model){
        model.addAttribute("messageFromWebContainerBean", messageFromWebContainerBean.getMessage());
        model.addAttribute("messageFromSpringContainerBean", messageFromSpringContainerBean.getMessage());
        model.addAttribute("messageFromApplicationContext", messageFromApplicationContext.getMessage());
        return "hello.jsp";
    }
}
