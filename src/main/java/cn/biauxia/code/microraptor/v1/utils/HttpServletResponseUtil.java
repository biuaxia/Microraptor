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
import cn.hutool.json.JSONUtil;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * 输出Json
 */
public final class HttpServletResponseUtil {


    private HttpServletResponseUtil() {
        throw new AssertionError();
    }

    public static void printJson(HttpServletResponse response, Object object, Boolean isPretty) throws Exception {
        response.setCharacterEncoding(Constants.UTF8);
        response.setContentType(Constants.CONTENT_TYPE);
        PrintWriter printWriter = response.getWriter();
        if (isPretty) {
            printWriter.write(JSONUtil.toJsonPrettyStr(object));
        } else {
            printWriter.write(JSONUtil.toJsonStr(object));
        }
        printWriter.flush();
        printWriter.close();
    }

    public static void printJson(HttpServletResponse response, Object object) throws Exception {
        printJson(response, object, false);
    }

}
