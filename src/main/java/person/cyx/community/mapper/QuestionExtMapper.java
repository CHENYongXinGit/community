package person.cyx.community.mapper;

import person.cyx.community.model.Question;

public interface QuestionExtMapper {

    int incView(Long id);

    int incCommentCount(Question record);
}