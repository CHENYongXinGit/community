package person.cyx.community.dto;

import lombok.Data;

/**
 * @program: community
 * @description
 * @author: chenyongxin
 * @create: 2019-09-27 18:00
 **/
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}
