package cn.biauxia.code.microraptor.core.common;

public class Constants {

    /**
     * 授权凭证文件
     */
    public static final String AUTHORIZATION_CERTIFICATE_FILE = "microraptor.license";

    /**
     * 启动类所在位置
     * <p>
     * jar包所在位置
     * <p>
     * 或
     * <p>
     * 启动类所在位置
     */
    public static final String THE_LOCATION_OF_THE_STARTUP_CLASS = System.getProperty("user.dir");

    /* 配置类常量定义 开始*/
    public static final String MICRORAPTOR_ENABLE_ANSI = "microraptor.enable-ansi";
    /* 配置类常量定义 结束*/

    /* 代码常量定义 开始*/
    /**
     * 手机号码长度
     */
    public static final int PHONE_LENGTH = 11;

    /**
     * 脱敏 *号
     */
    public static final String ASTERISK = "****";

    /**
     * unknown
     */
    public static final String UNKNOWN = "unknown";

    /**
     * 本地 IPV6 地址
     */
    public static final String IPV6_LOCAL = "0:0:0:0:0:0:0:1";

    /**
     * UTF-8编码
     */
    public static final String UTF8 = "UTF-8";

    /**
     * JSON
     */
    public static final String CONTENT_TYPE = "application/json";

    /**
     * 默认页码为1
     */
    public static final Long DEFAULT_PAGE_INDEX = 1L;

    /**
     * 默认页大小为10
     */
    public static final Long DEFAULT_PAGE_SIZE = 10L;

    /**
     * 分页总行数名称
     */
    public static final String PAGE_TOTAL_NAME = "total";

    /**
     * 分页数据列表名称
     */
    public static final String PAGE_RECORDS_NAME = "records";

    /**
     * 分页当前页码名称
     */
    public static final String PAGE_INDEX_NAME = "pageIndex";

    /**
     * 分页当前页大小名称
     */
    public static final String PAGE_SIZE_NAME = "pageSize";

    /**
     * 登录用户
     */
    public static final String LOGIN_SYS_USER = "loginSysUser";

    /**
     * 登录token
     */
    public static final String JWT_DEFAULT_TOKEN_NAME = "token";

    /**
     * JWT用户名
     */
    public static final String JWT_USERNAME = "username";

    /**
     * JWT刷新新token响应状态码
     */
    public static final int JWT_REFRESH_TOKEN_CODE = 460;

    /**
     * JWT刷新新token响应状态码，
     * Redis中不存在，但jwt未过期，不生成新的token，返回361状态码
     */
    public static final int JWT_INVALID_TOKEN_CODE = 461;

    /**
     * JWT Token默认密钥
     */
    public static final String JWT_DEFAULT_SECRET = "666666";

    /**
     * JWT 默认过期时间，3600L，单位秒
     */
    public static final Long JWT_DEFAULT_EXPIRE_SECOND = 3600L;

    /**
     * 默认头像
     */
    public static final String DEFAULT_HEAD_URL = "";

    /**
     * 管理员角色名称
     */
    public static final String ADMIN_ROLE_NAME = "管理员";

    public static final String ADMIN_LOGIN = "adminLogin";

    /**
     * 验证码token
     */
    public static final String VERIFY_TOKEN = "verifyToken";

    /**
     * 图片
     */
    public static final String IMAGE = "image";

    /**
     * JPEG
     */
    public static final String JPEG = "JPEG";

    /**
     * base64前缀
     */
    public static final String BASE64_PREFIX = "data:image/png;base64,";

    /**
     * ..
     */
    public static final String SPOT_SPOT = "..";

    /**
     * ../
     */
    public static final String SPOT_SPOT_BACKSLASH = "../";

    /**
     * SpringBootAdmin登录信息
     */
    public static final String ADMIN_LOGIN_SESSION = "adminLoginSession";

    /**
     * 用户浏览器代理
     */
    public static final String USER_AGENT = "User-Agent";

    /**
     * 本机地址IP
     */
    public static final String LOCALHOST_IP = "127.0.0.1";

    /**
     * 本机地址名称
     */
    public static final String LOCALHOST_IP_NAME = "本机地址";

    /**
     * 局域网IP
     */
    public static final String LAN_IP = "192.168";

    /**
     * 局域网名称
     */
    public static final String LAN_IP_NAME = "局域网";

    /* 代码常量定义 结束*/

    /* 日期常量定义 开始*/
    /**
     * 年-月-日
     */
    public static final String YYYY_MM_DD = "yyyy-MM-dd";

    /**
     * 年-月-日 时:分
     */
    public static final String YYYY_MM_DD_HH_MM = "yyyy-MM-dd HH:mm";

    /**
     * 年-月-日 时:分:秒
     */
    public static final String YYYY_MM_DD_HH_MM_SS = "yyyy-MM-dd HH:mm:ss";

    /**
     * 年-月-日 时:分:秒:毫秒
     */
    public static final String YYYY_MM_DD_HH_MM_SS_S = "yyyy-MM-dd HH:mm:ss.S";

    /**
     * 时:分
     */
    public static final String HH_MM = "HH:mm";
    /**
     * 时:分:秒
     */
    public static final String HH_MM_SS = "HH:mm:ss";
    /**
     * 时:分:秒:毫秒
     */
    public static final String HH_MM_SS_S = "HH:mm:ss:S";

    /* 日期常量定义 结束*/

}
