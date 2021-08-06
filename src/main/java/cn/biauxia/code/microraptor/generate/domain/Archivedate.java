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
 * 存档日期表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "archivedate")
public class Archivedate implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_ARCHIVETIME = "archiveTime";
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;
    /**
     * 存档日期时间，该月份第一天的时间戳
     */
    @TableField(value = "archiveTime")
    private Long archivetime;
}