package person.cyx.community.enums;

/**
 * @program: community
 * @description
 * @author: chenyongxin
 * @create: 2019-10-15 16:38
 **/
public enum NotificationStatusEnum {
    UNREAD(0),
    READ(1)
    ;

    private int status;

    public int getStatus() {
        return status;
    }

    NotificationStatusEnum(int status) {
        this.status = status;
    }
}
