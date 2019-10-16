package person.cyx.community.dto;

import lombok.Data;

/**
 * @program: community
 * @description
 * @author: chenyongxin
 * @create: 2019-10-15 17:00
 **/
@Data
public class NotificationDTO {

    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}
