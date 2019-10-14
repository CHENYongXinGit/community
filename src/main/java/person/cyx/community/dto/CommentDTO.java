package person.cyx.community.dto;

import lombok.Data;
import person.cyx.community.model.User;

/**
 * @program: community
 * @description
 * @author: chenyongxin
 * @create: 2019-10-13 15:28
 **/
@Data
public class CommentDTO {
    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private Integer commentCount;
    private String content;
    private User user;
}
