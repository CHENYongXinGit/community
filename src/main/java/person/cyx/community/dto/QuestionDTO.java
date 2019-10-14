package person.cyx.community.dto;

import lombok.Data;
import person.cyx.community.model.User;

/**
 * @program: community
 * @description
 * @author: chenyongxin
 * @create: 2019-09-29 09:37
 **/
@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Long creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
