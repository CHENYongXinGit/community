package person.cyx.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: community
 * @description
 * @author: chenyongxin
 * @create: 2019-09-27 15:02
 **/
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
