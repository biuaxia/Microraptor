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
 * 用户表
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "`user`")
public class User implements Serializable {
    public static final String COL_ID = "id";
    public static final String COL_USERNAME = "userName";
    public static final String COL_USERURL = "userURL";
    public static final String COL_USERROLE = "userRole";
    public static final String COL_USERAVATAR = "userAvatar";
    public static final String COL_USERB3KEY = "userB3Key";
    public static final String COL_USERGITHUBID = "userGitHubId";
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;
    /**
     * 用户名
     */
    @TableField(value = "userName")
    private String username;
    /**
     * 用户链接地址
     */
    @TableField(value = "userURL")
    private String userurl;
    /**
     * 用户角色，管理员：adminRole，普通用户：defaultRole，访客用户：visitorRole
     */
    @TableField(value = "userRole")
    private String userrole;
    /**
     * 用户头像图片链接地址
     */
    @TableField(value = "userAvatar")
    private String useravatar;
    /**
     * B3log Key
     */
    @TableField(value = "userB3Key")
    private String userb3key;
    /**
     * 用户 GitHub Open Id，社区端用户 id
     */
    @TableField(value = "userGitHubId")
    private String usergithubid;
}