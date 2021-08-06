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
 * 自定义页面表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "page")
public class Page implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_PAGEORDER = "pageOrder";
    public static final String COL_PAGEPERMALINK = "pagePermalink";
    public static final String COL_PAGETITLE = "pageTitle";
    public static final String COL_PAGEOPENTARGET = "pageOpenTarget";
    public static final String COL_PAGEICON = "pageIcon";
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;
    /**
     * 页面展现排序
     */
    @TableField(value = "pageOrder")
    private Integer pageorder;
    /**
     * 页面访问路径
     */
    @TableField(value = "pagePermalink")
    private String pagepermalink;
    /**
     * 页面标题
     */
    @TableField(value = "pageTitle")
    private String pagetitle;
    /**
     * 页面打开方式
     */
    @TableField(value = "pageOpenTarget")
    private String pageopentarget;
    /**
     * 页面展示用小图标
     */
    @TableField(value = "pageIcon")
    private String pageicon;
}