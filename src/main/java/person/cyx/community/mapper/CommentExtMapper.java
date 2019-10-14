package person.cyx.community.mapper;

import person.cyx.community.model.Comment;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}