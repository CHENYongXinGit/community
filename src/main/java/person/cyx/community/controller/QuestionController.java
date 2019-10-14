package person.cyx.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import person.cyx.community.dto.CommentDTO;
import person.cyx.community.dto.QuestionDTO;
import person.cyx.community.enums.CommentTypeEnum;
import person.cyx.community.service.CommentService;
import person.cyx.community.service.QuestionService;

import java.util.List;

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
    @Autowired
    private CommentService commentService;

    @GetMapping("/question/{id}")
    public String profile(Model model,
                          @PathVariable(name = "id") Long id){

        QuestionDTO questionDTO = questionService.getById(id);

        List<QuestionDTO> relatedQuestions = questionService.selectRelated(questionDTO);

        List<CommentDTO> comments = commentService.listByTargetId(id, CommentTypeEnum.QUESTION);

        //累加阅读数
        questionService.incView(id);

        model.addAttribute("question",questionDTO);
        model.addAttribute("comments",comments);
        model.addAttribute("relatedQuestions",relatedQuestions);

        return "question";
    }
}
