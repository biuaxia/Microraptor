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
 * 配置项
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "`option`")
public class Option implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_OPTIONCATEGORY = "optionCategory";
    public static final String COL_OPTIONVALUE = "optionValue";
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;
    /**
     * 配置项分类
     */
    @TableField(value = "optionCategory")
    private String optioncategory;
    /**
     * 配置项值
     */
    @TableField(value = "optionValue")
    private String optionvalue;
}