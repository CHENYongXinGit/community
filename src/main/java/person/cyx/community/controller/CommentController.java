package person.cyx.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import person.cyx.community.dto.CommentDTO;
import person.cyx.community.dto.ResultDTO;
import person.cyx.community.exception.CustomizeErrorCode;
import person.cyx.community.model.Comment;
import person.cyx.community.model.User;
import person.cyx.community.service.CommentService;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: community
 * @description
 * @author: chenyongxin
 * @create: 2019-10-12 15:45
 **/
@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    @ResponseBody
    @RequestMapping(value = "/comment",method = RequestMethod.POST)
    public Object post(@RequestBody CommentDTO commentDTO,
                       HttpServletRequest request){

        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return ResultDTO.errorOf(CustomizeErrorCode.NO_LOGIN);
        }

        Comment comment = new Comment();
        comment.setParentId(commentDTO.getParentId());
        comment.setType(commentDTO.getType());
        comment.setCommentator(user.getId());
        comment.setGmtCreate(System.currentTimeMillis());
        comment.setGmtModified(System.currentTimeMillis());
        comment.setContent(commentDTO.getContent());
        commentService.insert(comment);
        return ResultDTO.okOf();
    }
}
