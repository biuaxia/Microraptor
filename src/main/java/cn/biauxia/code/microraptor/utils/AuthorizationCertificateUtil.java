package cn.biauxia.code.microraptor.utils;

import cn.biauxia.code.microraptor.core.common.Constants;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedInputStream;
import java.io.File;
import java.nio.charset.StandardCharsets;

/**
 * 授权凭证
 */
@Slf4j
public class AuthorizationCertificateUtil {

    /**
     * 读取配置文件
     */
    public static void readFormFile(String filepath) {
        String absolutePath = StrUtil.format("{}{}{}",
                Constants.THE_LOCATION_OF_THE_STARTUP_CLASS,
                File.separator,
                filepath);
        if (!FileUtil.exist(absolutePath)) {

            log.error("授权凭证文件 [{}] 不存在", absolutePath);
            return;
        }
        BufferedInputStream inputStream = FileUtil.getInputStream(absolutePath);
        String read = IoUtil.read(inputStream, StandardCharsets.UTF_8);
        log.info("授权凭证文件读取结果: [{}]", read);
    }

}
