package person.cyx.community.dto;

import lombok.Data;

/**
 * @program: community
 * @description
 * @author: chenyongxin
 * @create: 2019-10-12 15:50
 **/
@Data
public class CommentCreateDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
