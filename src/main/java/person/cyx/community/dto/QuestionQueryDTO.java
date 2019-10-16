package person.cyx.community.dto;

import lombok.Data;

/**
 * @program: community
 * @description
 * @author: chenyongxin
 * @create: 2019-10-16 19:05
 **/
@Data
public class QuestionQueryDTO {
    private String search;
    private Integer page;
    private Integer size;
}
