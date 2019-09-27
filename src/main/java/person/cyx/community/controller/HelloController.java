package person.cyx.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: community
 * @description
 * @author: chenyongxin
 * @create: 2019-09-27 15:02
 **/
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name",required = false) String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
