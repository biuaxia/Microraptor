package cn.biauxia.code.microraptor.v1.core.exception;

import cn.biauxia.code.microraptor.v1.core.common.web.ApiCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 配置异常
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ConfigException extends IException {

    private static final long serialVersionUID = 1L;

    private Integer errorCode;
    private String message;

    public ConfigException() {
        super();
    }

    public ConfigException(String message) {
        super(message);
        this.message = message;
    }

    public ConfigException(Integer errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
        this.message = message;
    }

    public ConfigException(ApiCode apiCode) {
        super(apiCode.getMessage());
        this.errorCode = apiCode.getCode();
        this.message = apiCode.getMessage();
    }

    public ConfigException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConfigException(Throwable cause) {
        super(cause);
    }

}
