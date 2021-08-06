package cn.biauxia.code.microraptor.generate.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 插件表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "plugin")
public class Plugin implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_STATUS = "status";
    public static final String COL_VERSION = "version";
    public static final String COL_AUTHOR = "author";
    public static final String COL_SETTING = "setting";
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;
    /**
     * 插件名称
     */
    @TableField(value = "`name`")
    private String name;
    /**
     * 插件状态，启用：ENABLED，禁用：DISABLED
     */
    @TableField(value = "`status`")
    private String status;
    /**
     * 插件版本
     */
    @TableField(value = "version")
    private String version;
    /**
     * 插件作者
     */
    @TableField(value = "author")
    private String author;
    /**
     * 插件配置，JSON 字符串
     */
    @TableField(value = "setting")
    private String setting;
}