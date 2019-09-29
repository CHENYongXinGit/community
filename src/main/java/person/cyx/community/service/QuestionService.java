package person.cyx.community.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import person.cyx.community.dto.QuestionDTO;
import person.cyx.community.mapper.QuestionMapper;
import person.cyx.community.mapper.UserMapper;
import person.cyx.community.model.Question;
import person.cyx.community.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: community
 * @description
 * @author: chenyongxin
 * @create: 2019-09-29 14:58
 **/
@Service("questionService")
public class QuestionService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private QuestionMapper questionMapper;

    public List<QuestionDTO> list() {
        List<Question> questions = questionMapper.list();
        List<QuestionDTO> questionDTOList = new ArrayList<>();
        for (Question question : questions) {
            User user = userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question,questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        return questionDTOList;
    }
}
