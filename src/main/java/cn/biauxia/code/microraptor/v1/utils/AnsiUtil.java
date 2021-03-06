/*
 * Copyright 2019-2029 geekidea(https://github.com/geekidea)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.biauxia.code.microraptor.v1.utils;

import cn.biauxia.code.microraptor.v1.core.common.Constants;
import lombok.extern.slf4j.Slf4j;
import org.fusesource.jansi.Ansi;
import org.springframework.core.env.Environment;

/**
 * Ansi 工具
 */
@Slf4j
public class AnsiUtil {

    private static boolean enableAnsi;

    static {
        Boolean value = false;
        try {
            Environment environment = SpringContextUtil.getBean(Environment.class);
            value = environment.getProperty(Constants.MICRORAPTOR_ENABLE_ANSI, boolean.class);
            value = value != null && value;
        } catch (Exception e) {
            e.printStackTrace();
        }
        enableAnsi = value;
    }

    public static String getAnsi(Ansi.Color color, String text) {

        if (enableAnsi) {
            return Ansi.ansi().eraseScreen().fg(color).a(text).reset().toString();
        }
        return text;
    }

    public static String getAnsi(Ansi.Color color, String text, boolean flag) {
        if (flag) {
            return Ansi.ansi().eraseScreen().fg(color).a(text).reset().toString();
        }
        return text;
    }
}
