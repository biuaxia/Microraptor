package cn.biauxia.code.microraptor.core.conf;

import cn.biauxia.code.microraptor.core.common.Constants;
import cn.biauxia.code.microraptor.utils.AuthorizationCertificateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class EngineStaredConf implements CommandLineRunner {

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        AuthorizationCertificateUtil.readFormFile(Constants.AUTHORIZATION_CERTIFICATE_FILE);
    }

}
