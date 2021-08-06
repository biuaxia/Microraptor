package cn.biauxia.code.microraptor.v1.core.conf;

import cn.biauxia.code.microraptor.v1.core.common.Constants;
import cn.biauxia.code.microraptor.v1.utils.AuthorizationCertificateUtil;
import cn.biauxia.code.microraptor.v1.utils.PrintApplicationInfo;
import cn.biauxia.code.microraptor.v1.utils.SpringContextUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Slf4j
// @Configuration
public class EngineStaredConf implements CommandLineRunner {

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     */
    @Override
    public void run(String... args) {
        AuthorizationCertificateUtil.readFormFile(Constants.AUTHORIZATION_CERTIFICATE_FILE);
        ApplicationContext context = SpringContextUtil.getApplicationContext();
        // 打印项目信息
        PrintApplicationInfo.print(context);
        // 打印项目提示
        PrintApplicationInfo.printTip(context);
    }

}
