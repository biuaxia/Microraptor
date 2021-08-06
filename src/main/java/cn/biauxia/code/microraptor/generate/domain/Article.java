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
 * 文章表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "article")
public class Article implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_ARTICLETITLE = "articleTitle";
    public static final String COL_ARTICLEAUTHORID = "articleAuthorId";
    public static final String COL_ARTICLEPERMALINK = "articlePermalink";
    public static final String COL_ARTICLEPUTTOP = "articlePutTop";
    public static final String COL_ARTICLECREATED = "articleCreated";
    public static final String COL_ARTICLEUPDATED = "articleUpdated";
    public static final String COL_ARTICLERANDOMDOUBLE = "articleRandomDouble";
    public static final String COL_ARTICLESIGNID = "articleSignId";
    public static final String COL_ARTICLEVIEWPWD = "articleViewPwd";
    public static final String COL_ARTICLEIMG1URL = "articleImg1URL";
    public static final String COL_ARTICLESTATUS = "articleStatus";
    public static final String COL_ARTICLEABSTRACT = "articleAbstract";
    public static final String COL_ARTICLEABSTRACTTEXT = "articleAbstractText";
    public static final String COL_ARTICLETAGS = "articleTags";
    public static final String COL_ARTICLECONTENT = "articleContent";
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;
    /**
     * 文章标题
     */
    @TableField(value = "articleTitle")
    private String articletitle;
    /**
     * 文章作者 id
     */
    @TableField(value = "articleAuthorId")
    private String articleauthorid;
    /**
     * 文章访问路径
     */
    @TableField(value = "articlePermalink")
    private String articlepermalink;
    /**
     * 文章是否置顶
     */
    @TableField(value = "articlePutTop")
    private String articleputtop;
    /**
     * 文章创建时间戳
     */
    @TableField(value = "articleCreated")
    private Long articlecreated;
    /**
     * 文章更新时间戳
     */
    @TableField(value = "articleUpdated")
    private Long articleupdated;
    /**
     * 文章随机数，用于快速查询随机文章列表
     */
    @TableField(value = "articleRandomDouble")
    private Double articlerandomdouble;
    /**
     * 文章关联的签名档 id
     */
    @TableField(value = "articleSignId")
    private String articlesignid;
    /**
     * 文章浏览密码，留空为不设置访问密码
     */
    @TableField(value = "articleViewPwd")
    private String articleviewpwd;
    /**
     * 文章首图地址
     */
    @TableField(value = "articleImg1URL")
    private String articleimg1url;
    /**
     * 文章状态，0：已发布，1：草稿
     */
    @TableField(value = "articleStatus")
    private Integer articlestatus;
    /**
     * 文章摘要 Markdown
     */
    @TableField(value = "articleAbstract")
    private String articleabstract;
    /**
     * 文章摘要纯文本
     */
    @TableField(value = "articleAbstractText")
    private String articleabstracttext;
    /**
     * 文章标签，英文逗号分隔
     */
    @TableField(value = "articleTags")
    private String articletags;
    /**
     * 文章正文内容
     */
    @TableField(value = "articleContent")
    private String articlecontent;
}