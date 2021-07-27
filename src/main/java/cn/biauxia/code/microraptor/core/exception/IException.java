package cn.biauxia.code.microraptor.core.exception;

import cn.biauxia.code.microraptor.core.common.web.ApiCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 自定义异常基类
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class IException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private Integer errorCode;
    private String message;

    public IException() {
        super();
    }

    public IException(String message) {
        super(message);
        this.message = message;
    }

    public IException(Integer errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
        this.message = message;
    }

    public IException(ApiCode apiCode) {
        super(apiCode.getMessage());
        this.errorCode = apiCode.getCode();
        this.message = apiCode.getMessage();
    }

    public IException(String message, Throwable cause) {
        super(message, cause);
    }

    public IException(Throwable cause) {
        super(cause);
    }

}