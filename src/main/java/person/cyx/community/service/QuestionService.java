package person.cyx.community.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import person.cyx.community.dto.PaginationDTO;
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

    public PaginationDTO list(Integer page, Integer size) {
        Integer offset = size * (page - 1);
        List<Question> questions = questionMapper.list(offset, size);
        List<QuestionDTO> questionDTOList = new ArrayList<>();
        PaginationDTO paginationDTO = new PaginationDTO();
        for (Question question : questions) {
            User user = userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question,questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        paginationDTO.setQuestions(questionDTOList);
        Integer count = questionMapper.count();
        paginationDTO.setPagination(count, page, size);
        return paginationDTO;
    }
}
