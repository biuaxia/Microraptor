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
 * 链接表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "link")
public class Link implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_LINKADDRESS = "linkAddress";
    public static final String COL_LINKDESCRIPTION = "linkDescription";
    public static final String COL_LINKORDER = "linkOrder";
    public static final String COL_LINKTITLE = "linkTitle";
    public static final String COL_LINKICON = "linkIcon";
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;
    /**
     * 链接地址
     */
    @TableField(value = "linkAddress")
    private String linkaddress;
    /**
     * 链接描述
     */
    @TableField(value = "linkDescription")
    private String linkdescription;
    /**
     * 链接展现的排序
     */
    @TableField(value = "linkOrder")
    private Integer linkorder;
    /**
     * 链接标题
     */
    @TableField(value = "linkTitle")
    private String linktitle;
    /**
     * 链接图标链接地址
     */
    @TableField(value = "linkIcon")
    private String linkicon;
}