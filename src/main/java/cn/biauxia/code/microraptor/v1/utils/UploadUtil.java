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

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.file.FileNameUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 文件上传工具
 */
@Slf4j
public final class UploadUtil {

    /**
     * 上传文件，默认文件名格式，yyyyMMddHHmmssS
     */
    public static String upload(String uploadPath, MultipartFile multipartFile) throws Exception {
        return upload(uploadPath, multipartFile, new DefaultUploadFileNameHandleImpl());
    }

    /**
     * 上传文件
     */
    public static String upload(String uploadPath, MultipartFile multipartFile, UploadFileNameHandle uploadFileNameHandle) throws Exception {
        // 获取输入流
        InputStream inputStream = multipartFile.getInputStream();
        // 文件保存目录
        File saveDir = new File(uploadPath);
        // 判断目录是否存在，不存在，则创建，如创建失败，则抛出异常
        if (!saveDir.exists()) {
            boolean flag = saveDir.mkdirs();
            if (!flag) {
                throw new RuntimeException("创建" + saveDir + "目录失败！");
            }
        }

        String originalFilename = multipartFile.getOriginalFilename();
        String saveFileName;
        if (uploadFileNameHandle == null) {
            saveFileName = new DefaultUploadFileNameHandleImpl().handle(originalFilename);
        } else {
            saveFileName = uploadFileNameHandle.handle(originalFilename);
        }
        log.info("saveFileName = " + saveFileName);

        File saveFile = new File(saveDir, saveFileName);
        // 保存文件到服务器指定路径
        IoUtil.copy(inputStream, FileUtil.getOutputStream(saveFile));
        return saveFileName;
    }

    /**
     * 删除删除的文件
     */
    public static void deleteQuietly(String uploadPath, String saveFileName) {
        File saveDir = new File(uploadPath);
        File saveFile = new File(saveDir, saveFileName);
        log.debug("删除文件：[{}] 开始", saveFile);
        boolean del = FileUtil.del(saveFile);
        log.debug("删除文件：[{}] 结束, 结果：[{}]", saveFile, del);
    }


    public static interface UploadFileNameHandle {
        /**
         * 回调处理接口
         */
        String handle(String originalFilename);
    }

    public static class DefaultUploadFileNameHandleImpl implements UploadFileNameHandle {

        @Override
        public String handle(String originalFilename) {
            // 文件后缀
            String fileExtension = FileNameUtil.extName(originalFilename);
            // 这里可自定义文件名称，比如按照业务类型/文件格式/日期
            // 此处按照文件日期存储
            String dateString = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS"));
            return dateString + "." + fileExtension;
        }
    }

}
