package person.cyx.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import person.cyx.community.dto.QuestionDTO;
import person.cyx.community.service.QuestionService;

/**
 * @program: community
 * @description
 * @author: chenyongxin
 * @create: 2019-10-10 17:02
 **/
@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/question/{id}")
    public String profile(Model model,
                          @PathVariable(name = "id") Long id){

        QuestionDTO questionDTO = questionService.getById(id);

        //累加阅读数
        questionService.incView(id);

        model.addAttribute("question",questionDTO);
        return "question";
    }
}
