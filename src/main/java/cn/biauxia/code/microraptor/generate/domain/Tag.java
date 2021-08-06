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
 * 标签表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "tag")
public class Tag implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_TAGTITLE = "tagTitle";
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;
    /**
     * 标签标题
     */
    @TableField(value = "tagTitle")
    private String tagtitle;
}