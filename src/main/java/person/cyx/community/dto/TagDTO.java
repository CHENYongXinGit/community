package person.cyx.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @program: community
 * @description
 * @author: chenyongxin
 * @create: 2019-10-14 16:09
 **/
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
