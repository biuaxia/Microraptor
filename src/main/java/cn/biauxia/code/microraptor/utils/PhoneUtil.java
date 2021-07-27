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

package cn.biauxia.code.microraptor.utils;


import cn.biauxia.code.microraptor.core.common.Constants;
import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * 手机号码工具
 */
@Slf4j
public class PhoneUtil {

    /**
     * 手机号码脱敏
     * 截取手机号码前三位，后4为，中间4位使用*号代替
     * 18812345678
     * 188****5678
     *
     * @param phone
     * @return
     */
    public static String desensitize(String phone) {
        // 校验手机号码
        if (StrUtil.isBlank(phone)) {
            return null;
        }
        if (phone.length() != Constants.PHONE_LENGTH) {
            log.error("手机号码不合法：" + phone);
            return phone;
        }

        String before = phone.substring(0, 3);
        String after = phone.substring(7, 11);
        String desensitizePhone = before + Constants.ASTERISK + after;
        return desensitizePhone;
    }

    public static void main(String[] args) {
        String phone = desensitize("13883408340");
        System.out.println("phone = " + phone);
    }

}
