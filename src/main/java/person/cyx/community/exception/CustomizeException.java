package person.cyx.community.exception;

/**
 * @program: community
 * @description
 * @author: chenyongxin
 * @create: 2019-10-12 14:03
 **/
public class CustomizeException extends RuntimeException {

    private Integer code;
    private String message;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
