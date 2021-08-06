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
 * 存档-文章关联表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "ref_archivedate_article")
public class RefArchivedateArticle implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_ARCHIVEDATE_ID = "archiveDate_id";
    public static final String COL_ARTICLE_ID = "article_id";
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;
    /**
     * 存档日期 id
     */
    @TableField(value = "archiveDate_id")
    private String archivedateId;
    /**
     * 文章 id
     */
    @TableField(value = "article_id")
    private String articleId;
}