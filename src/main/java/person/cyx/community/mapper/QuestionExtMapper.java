package person.cyx.community.mapper;

import person.cyx.community.model.Question;

import java.util.List;

public interface QuestionExtMapper {

    int incView(Long id);

    int incCommentCount(Question record);

    List<Question> selectRelated(Question record);
}