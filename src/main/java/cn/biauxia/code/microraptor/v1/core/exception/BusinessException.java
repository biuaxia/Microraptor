package cn.biauxia.code.microraptor.v1.core.exception;

import cn.biauxia.code.microraptor.v1.core.common.web.ApiCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Mapper异常
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessException extends IException {

    private static final long serialVersionUID = 1L;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(Integer errorCode, String message) {
        super(errorCode, message);
    }

    public BusinessException(ApiCode apiCode) {
        super(apiCode);
    }

}
