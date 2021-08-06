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
 * 分类表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "category")
public class Category implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_CATEGORYTITLE = "categoryTitle";
    public static final String COL_CATEGORYURI = "categoryURI";
    public static final String COL_CATEGORYORDER = "categoryOrder";
    public static final String COL_CATEGORYTAGCNT = "categoryTagCnt";
    public static final String COL_CATEGORYDESCRIPTION = "categoryDescription";
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;
    /**
     * 分类标题
     */
    @TableField(value = "categoryTitle")
    private String categorytitle;
    /**
     * 分类访问路径
     */
    @TableField(value = "categoryURI")
    private String categoryuri;
    /**
     * 分类展现的排序
     */
    @TableField(value = "categoryOrder")
    private Integer categoryorder;
    /**
     * 分类下聚合的标签计数
     */
    @TableField(value = "categoryTagCnt")
    private Integer categorytagcnt;
    /**
     * 分类描述
     */
    @TableField(value = "categoryDescription")
    private String categorydescription;
}