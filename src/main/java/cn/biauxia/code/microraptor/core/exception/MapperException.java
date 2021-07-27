package cn.biauxia.code.microraptor.core.exception;

import cn.biauxia.code.microraptor.core.common.web.ApiCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Mapper异常
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class MapperException extends IException {

    private static final long serialVersionUID = 1L;

    public MapperException(String message) {
        super(message);
    }

    public MapperException(Integer errorCode, String message) {
        super(errorCode, message);
    }

    public MapperException(ApiCode apiCode) {
        super(apiCode);
    }

}
