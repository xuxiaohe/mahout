package demo;

import java.awt.Color;
import java.util.concurrent.atomic.AtomicLong;

public class Config {
	/**
	 * 响应码数据字典
	 */
	public final static int STATUS_200 = 200;
	public final static String MSG_200 = "正常处理，并data中有返回数据";
	public final static String MSG_CREATE_200 = "创建成功";
	public final static String MSG_DELETE_200 = "删除成功";
	public final static String MSG_UPDATE_200 = "更新成功";
	public final static String MSG_LOGIN_200 = "登录成功";
	public final static String MSG_CHECK_200 = "检查登陆成功";
	public final static String MSG_OUT_200 = "退出成功";
	public final static String KICK_OUT_200 = "踢出成功";
	public final static String MSG_JOIN_200 = "加入群成功";
	public final static String MSG_UNJOIN_200 = "管理员拒绝成员加入群组";
	public final static String MSG_TOADMIN_200 = "操作成功";
	public final static String MSG_FAV_200 = "收藏成功";
	public final static String MSG_RESTPASSWORD_200 = "密码设置成功";
	public final static String MSG_SENDSMSSUCCESS_200 = "验证码已发送，请查收";
	public final static String MSG_INVITEJOINGROUP_200 = "邀请加入群组成功";
	public final static String MSG_INVITE_200 = "邀请成功";
	public final static String MSG_CONTACTAPPLYSUCCESS_200 = "关注成功";
	public final static String MSG_DELETECONTACTSUCESS_200 = "取消关注成功";
	public final static String MSG_ADDBULACKSUCESS_200 = "添加黑名单成功";
	public final static String MSG_DELETEBULACKSUCESS_200 = "删除黑名单成功";
	public final static String MSG_SHARESUCESS_200 = "分享成功";
	public final static String MSG_REGIST_200 = "注册成功";
	public final static String MSG_CHECKED_200 = "激活成功";
	public final static String MSG_DISPALY_200 = "置顶成功";
	public final static String MSG_NODISPALY_200 = "取消置顶成功";
	public final static String MSG_ORDERCREATE_200 = "订单生成成功";
	public final static String MSG_PAY_200 = "支付成功";
	public final static String MSG_PAY_201 = "支付失败";
	public final static String MSG_ORDERCANCEL_200 = "订单取消成功";
	public final static String MSG_ORDERDELE_200 = "订单删除成功";
	public final static String MSG_REFRESH_200 = "刷新成功";
	
	public final static int STATUS_201 = 201;
	public final static String MSG_201 = "正常处理，但 data中没有返回数据";
	public final static String MSG_NOTMOBILE_201="填写的手机号码错误，请重新填写";
	public final static String MSG_NOMSGCODE_201="请输入正确的短信验证码";
	public final static String MSG_REGISTSMS_201="抱歉,您今天请求注册短信条数过多";
	public final static String MSG_CHANGEPWD_201="抱歉,您今天请求更改密码短信条数过多";
	public final static String MSG_NOSMSNUM_201="抱歉,短信余额不足，请联系客服";
	public final static String MSG_CREATE_201 = "小组名称已被抢注，请重填";
	public final static String MSG_DELETE_201 = "解散失败，权限不够";
	public final static String MSG_UPLOAD_201 = "上传失败";
	public final static String MSG_UPDATE_201 = "更新失败";
	public final static String MSG_UPDATENOUSER_201 = "更新失败，没有此用户存在";
	public final static String MSG_NODATA_201 = "无此数据";
	public final static String MSG_SHARE_201 = "分享失败";
	public final static String MSG_ATTENTION_201 = "分享失败";
	public final static String MSG_JOINFALSEPWD_201 = "加入群组失败，密码错误";
	public final static String MSG_CANNOTAGREE_201 = "无权限同意申请者入群";
	public final static String MSG_NOSECNOA_201 = "无权限拒绝申请者入群";
	public final static String MSG_USERMESSAGE_201 = "同步用户推送消息列表失败";
	public final static String MSG_USERISLIVE_201 = "已经加入过该群";
	public final static String MSG_NOPERMISSION_201 = "无权限修改";
	public final static String MSG_NOACESS_201 = "无权限操作";
	public final static String MSG_GROUPNOPWD_201="没有上传群组密码";
	public final static String MSG_ISOPENERR_201="群组权限设置错误";
	public final static String MSG_NULLGROUPID_201="群组ID为空";
	public final static String MSG_PASSWORD_201="两次密码输入的不同";
	public final static String MSG_NOUSER_201="填写的手机号码错误，请重新填写";
	public final static String MSG_ISMEMBER_201="您已经加入此群组";
	public final static String MSG_CREATEERROR_201="创建失败";
	public final static String MSG_SKILL_201="此技能已经添加过，请重新选择";
	public final static String MSG_GROUPNAME_201="请设置小组名称";
	public final static String MSG_ISNOTUSER_201="手机号未注册，请重填";
	public final static String MSG_QRCODE_CREATEFAILS_201="抱歉，二维码生成失败";
	public final static String MSG_ALREADFriend_201="此用户已经为您的好友";
	public final static String MSG_ALREADAPPLY_201="此用户已关注";
	public final static String MSG_BLACKFriend_201="对方设置黑名单，无法关注";
	public final static String MSG_ALREADBLACK_201="已经对此用户设置黑名单";
	public final static String MSG_NOTHISGROUP_201="此群组已经解散";
	public final static String MSG_USERNOTFIND_201="未找到此注册用户";
	public final static String MSG_USERINFOERROR_201="用户信息错误";
	public final static String MSG_PROPERTIESERROR_201="请求参数信息错误";
	public final static String MSG_NOTINGROUP_201="请先加入群组";
	public final static String MSG_COURSEHADSHARE_201="此课程已经分享";
	public final static String MSG_COURSEHADFAV_201="此课程已经收藏";
	public final static String MSG_NOTHISFAVCOURSE_201="无此类收藏课程";
	public final static String MSG_XUEYE_201 = "您已经上传过该炫页";
	public final static String MSG_DRYCARGO_201 = "您已经上传过该干货";
	public final static String MSG_NOREGIST_201="此用户未注册";
	public final static String MSG_NOLOGIN_201="此用户无权限登陆";
	public final static String MSG_KNGMODIFY_201="没有权限修改该知识";
	public final static String MSG_ACTIVELINKERROR_201="此激活链接失效";
	public final static String MSG_ACTIVED_201="此用户已经激活";
	public final static String MSG_NOTEMAIL_201="填写的email错误，请重新填写";
	public final static String MSG_NOTEMAIL_202="该二级分类下有数据，不能删除";
	
	
	public final static String MSG_PUSHFAIL_201="消息推送失败";
	
	public final static String MSG_POSITION_201="获取地理坐标失败";
	
	public final static String MSG_ERRORCODE_201="填写的验证码错误，请重新获取";
	public final static String MSG_ERRORTOMUCH_201="手机验证码多次错误，请重新获取新的短信验证码";
	public final static String MSG_FREQUENT_201="请等待60秒再次发送短信验证码";
	public final static String MSG_SENDMSGERROR_201="发送短信验证码失败";
	public final static String MSG_CODEFAILURE_201="请输入正确的验证码";
	
	public final static String MSG_FAV_201="您已经收藏过此课程";
	public final static String MSG_FAVDAY_201="您已经收藏过此干货";
	public final static String MSG_JOB_201="当前岗位与感兴趣岗位不允许相同，请重新选择";
	public final static String MSG_VERSION_201="当前版本已经存在";
	public final static String MSG_NOFAVSTUDYED_201="您还没有已学完的收藏课程";
	public final static String MSG_NOFAVSTUDYING_201="您还没有正在学的收藏课程";
	public final static String MSG_NOSTUDYCOURSE_201="您还没有学习课程";
	public final static String MSG_MAILTEMPLE_ERROR="邮件模板生成失败";
	public final static String MSG_ERROP_ADDCITEMS_201="调用转码回调接口时 参数非法";
	public final static String MSG_ERROP_ADDCITEMFINDK_201="调用转码回调接口时 通过cid没有找到知识";
	public final static String MSG_ERROP_GETKNGP_201="获取知识信息是 参数非法";
	public final static String MSG_ERROCKEY_201="云存储配置信息有误";
	public final static String MSG_DRYCAROGEXIT_201="该干货已经被分享过";
	public final static String MSG_REGISTFAIL_201 = "您输入的用户名与类型不匹配";
	public final static String MSG_EMAILUSER_201 = "该email已经注册过，请登录";
	public final static String MSG_EMAILUSERNOCHECK_201 = "该email注册过，未激活，请先激活";
	public final static String MSG_THRIDFAILURE_201 = "无此登录方式";
	public final static String MSG_REGISTTYPE_201 = "注册类型不匹配";
	public final static String MSG_REGISTNOCHECK_201 = "该用户未被激活";
	public final static String MSG_XUANYEGEXIT_201="该炫页已经被分享过";
	public final static String MSG_PASSWORDERROR_201 = "密码不正确";
	public final static String MSG_NEWGROUPCOURSENULL_201 = "群组课程数据异常";
	public final static String MSG_DISPALY_201 = "置顶失败，权限不够";
	public final static String MSG_NODISPALY_201 = "取消置顶失败，权限不够";
	public final static String MSG_DISPALYCOUNT_201 = "置顶数量已经超限";
	public final static String MSG_NOFAV_201="您还收藏课程";
	
	
	
	public final static int STATUS_202 = 202;
	public final static String MSG_202 = "退出失败！";

	public final static int STATUS_203 = 203;
	public final static String MSG_203 = "认证失败,token和token_secret没有记录或缺失导致";
	
	public final static int STATUS_204 = 204;
	public final static String MSG_204 = "申请加入成功，请等待管理员同意";
	
	public final static int STATUS_205 = 205;
	public final static String MSG_205 = "您不在该群内，无法参加话题讨论，请先加入该群";
	
	public final static int STATUS_206 = 206;
	public final static String MSG_ALREADY_206 = "已操作过";

	public final static int STATUS_400 = 400;
	public final static String MSG_400 = "手机号已注册，请重填";
	
	public final static int STATUS_401 = 401;
	public final static String MSG_401 = "邮箱已注册，请重填";

	public final static int STATUS_403 = 403;
	public final static String MSG_403 = "未授权，当前发起请求的用户没有访问此接口的权限";

	public final static int STATUS_404 = 404;
	public final static String MSG_404 = "账号或密码错误，请重填";

	public final static int STATUS_405 = 405;
	public final static String MSG_405 = "当前发起请求的用户已经被禁止";

	public final static int STATUS_406 = 406;
	public final static String MSG_406 = "根据当前提供的输入信息无法找到对应的资源";

	public final static int STATUS_500 = 500;
	public final static String MSG_500 = "请求参数无效";

	public final static int STATUS_501 = 501;
	public final static String MSG_501 = "缺失设备硬件信息";

	public final static int STATUS_502 = 502;
	public final static String MSG_502 = "缺失地理位置信息";

	public final static int STATUS_503 = 503;
	public final static String MSG_503 = "请求超时";

	public final static int STATUS_505 = 505;
	public final static String MSG_505 = "服务器端发生错误";

	public final static int STATUS_510 = 510;
	public final static String MSG_510 = "请求参数的长度非法";
	
	public final static int STATUS_504=504;
	public final static String MSG_504="数据中心接口请求发送未知错误";

	public final static int STATUS_600 = 600;
	public final static String MSG_600 = "请求的接口失效";
	
	public final static int STATUS_601 = 601;
	public final static String MSG_NOGROUP_601 = "该群已解散";
	

	/**
	 * 响应主体数据处理模式定义
	 */

	public final static int RESP_MODE_10 = 10;
	public final static String RESP_MODE_10_DESC = "data 主体数据即没有加密，也没有压缩";

	public final static int RESP_MODE_11 = 11;
	public final static String RESP_MODE_11_DESC = "data 主体数据没有加密，但被压缩";

	public final static int RESP_MODE_12 = 12;
	public final static String RESP_MODE_12_DESC = "data 主体数据被加密，但没有压缩";

	public final static int RESP_MODE_13 = 13;
	public final static String RESP_MODE_13_DESC = "data 主体数据即被加密，又被压缩";
	
	
	public final static String ISOPEN_FREE = "0";   //自由加入群
	
	public final static String ISOPEN_ADMIN_AGREE = "1";   //需要有管理员同意
	
	public final static String ISOPEN_PASSWORD = "2";	//需要密码验证
	
	
	
//	public final static String contextPath = "http://s1.xuewen.yunxuetang.com";
//	public final static String groupPicturyPath = "/Users/nes/Develop/xuewen/group/";
//	public final static String userPicturyPath = "/Users/nes/Develop/xuewen/user/";
//	public final static String IMAGESPath="/var/www/html";
//	public final static String IMAGESPath="/Users/hjn/Downloads/yxt";
//	public final static String IMAGESURLPath="/images";
//	public final static String adminPicturyPath = "/Users/nes/Develop/xuewen/user/";
//	public final static String SPACE="/var/www/html/space";
//	public final static String SPEECH="/var/www/html/speech";
//	public final static String COURSE="/var/www/html/course";
//	public final static String COURSE="/Users/hjn/Downloads/yxt";
//	public final static String COURSEURL="/course";
//	public final static String SPEECH="/Users/hjn/var/www/html/speech";
//	public final static String SPACE="/Users/hjn/var/www/html/space";
	//public final static String openfireProperty = "/Users/nes/properties/test.properties";
//	public final static String TOPICFILELOCAL="/var/www/html/topic";
//	public final static String TOPICFILEURL="http://s1.xuewen.yunxuetang.com/topic";
//	public final static String POSTFILELOCAL="/var/www/html/post";
//	public final static String POSTFILEURL="http://s1.xuewen.yunxuetang.com/post";
//	public final static String TOPICFILELOCAL="/Users/nes/Develop/xuewen/user/";
//	public final static String TOPICFILEURL="/Users/nes/Develop/xuewen/user/";
//	public final static String POSTFILELOCAL="/Users/nes/Develop/xuewen/user/";
//	public final static String POSTFILEURL="/Users/nes/Develop/xuewen/user/";
//	public final static String DRYCARGOFILELOCAL="/var/www/html/drycargo";
//	public final static String DRYCARGOFILEURL="http://s1.xuewen.yunxuetang.com/drycargo";
	public final static int IMAGL=800;
	public final static int IMAGM=400;
	public final static int IMAGS=108;
//	public final static String QINIU_IMG="http://yxt-bj.qiniudn.com/";
	
//	public final static String CONTEXT = "s1.xuewen.yunxuetang.com";
	
	
	public final static String COUNTCOURSE_TYPE_TREE="tree";
	public final static String COUNTCOURSE_TYPE_FAV="fav";
	public final static String COUNTCOURSE_TYPE_STUDY="study";
	
	public final static int POSTHASSUBPOST=3;
	
	
//	public static Map<String,User>  map = new ConcurrentHashMap<String,User>();
	
	public  static AtomicLong counter = new AtomicLong();
	/**
	 * 相关课程数量
	 */
	public static int REFCOURSE_DEFAULT=3;
	
	
	/**
	 * openfire 常量
	 */
	
	public final static String groupServer = "conference.chat.ztiao.cn";
	
	public final static String openfireAdrr = "chat.ztiao.cn";
	
	//public final static String openadmin = "naenshunadmin";
	public final static String openadmin = "backend";
	
	
	
	 //二维码 logo默认边框颜色
    public static final Color DEFAULT_BORDERCOLOR = Color.WHITE;
    //二维码 logo默认边框宽度
    public static final int DEFAULT_BORDER = 2;
    //二维码 logo大小默认为照片的1/5
    public static final int DEFAULT_LOGOPART = 5;
    
    //二维码 logo 默认高度
    public static final int QRCODE_LOGO_HIGH=100;
    //二维码 logo 默认宽度
    public static final int QRCODE_LOGO_WEIGHT=100;
    //二维码 logo 缩放图片存放地址
//    public static final String QRCODE_LOGO_ZOOM_LOCAL="/var/www/html/qrcode/logo/zoom";
    //二维码 增加logo之前的临时存放地址
//    public static final String QRCODE_TEMPORARY="/var/www/html/qrcode/temporary";
    //二维码 logo 缩放图片存放地址(本地测试)
//    public static final String QRCODE_LOGO_ZOOM_LOCAL="/Users/hjn/Downloads/yxt/zxingtest";
    //二维码 增加logo之前的临时存放地址（本地测试）
//    public static final String QRCODE_TEMPORARY="/Users/hjn/Downloads/yxt/zxingtest";
    
    //二维码 默认高度
    public static final int QRCODE_HIGH=300;
    //二维码 默认宽度
    public static final int QRCODE_WEIGHT=300;
    
    
    
	
	
	/**
	 * 设备名称
	 * 
	 */
	public final static String IOS="ios";
	public final static String Android="android";
	public final static String WinPhone="winphone";
	/**
	 * 内容中心api地址
	 */
	public final static String CENTER_BASEURL="http://api.yunxuetang.cn/ym/";
	/**
	 * 内容中心 apikey
	 */
	public final static String CENTER_APIKEY="67fe52dd-ec25-4ebe-97fb-98f067c13665";
	/**
	 * 内容中心secret
	 */
	public final static String CENTER_SECRET="";
	
	/**
	 * 内容中心SIGNATURE
	 */
	public final static String CENTER_SIGNATURE="280cef068796079ce599e62d521c77deabf8406e7d01b092e1959f403a57aca2";
   
	/**
     * 内容中心salt
     */
	public final static String CENTER_SALT="1234";
	/**
	 * 知识审核状态-处理成功
	 */
	public final static int KNOWLEDGE_STAT_PASS=2;
	/**
	 * 知识审核状态-处理失败
	 */
	public final static int KNOWLEDGE_STAT_FAILE=3;
	
	/**
	 * 知识审核状态-处理中
	 */
	public final static int KNOWLEDGE_STAT_PROCESS=1;
	
	/**
	 * 知识类型-视频
	 */
	public final static int KNOWLEDGE_KNGTYPE_VIDE0=1;
	
	/**
	 * 知识类型-文档
	 */
	public final static int KNOWLEDGE_KNGTYPE_DOC=2;
	
	/**
	 *知识转码状态-成功 
	 */
	public final static int KNOWLEDGE_CCODE_OK=0;
	
	
	/**
	 *知识转码状态-等待处理
	 */
	public final static int KNOWLEDGE_CCODE_WAIT=1;
	
	
	/**
	 *知识转码状态-正在处理
	 */
	public final static int KNOWLEDGE_CCODE_ING=2;
	/**
	 * 知识转码状态-处理失败
	 */
	public final static int KNOWLEDGE_CCODE_DOFAIL=3;
	
	/**
	 * 知识转码状态-通知处理失败
	 *
	 */
	public final static int KNOWLEDGE_CCODE_NOTICEFAIL=4;
	
	
	public final static String COURSE_STATE_WAIT="1";
	public final static String COURSE_STATE_FAIL="2";
	public final static String COURSE_STATE_OK="3";
	public final static String COURSE_STATE_PROCESS="3";



	
	public final static String CHAPTER_DEFAULE_NAME="章节";
	
	
	public final static String[] KNOW_TYPES=new String[]{"html4","pdf","swf","m3u8","mp4","flv"};
	
	/**
	 * 知识修改 类别 1 重新上传文件
	 */
	public final static int KNOWLEDGE_MODIFY_REFILE=1;
	
	
	/**
	 * 知识修改 类别 0 默认 不上传文件
	 */
	public final static int KNOWLEDGE_MODIFY_DEFAULE=0;
	
	/**
	 * 群组最大成员数
	 */
	public final static int GROUP_MAX=3000;
	
	public final static String  LOG_REG_TYPE_QD="0";
	public final static String  LOG_REG_TYPE_YQ="1";
	public final static String  LOG_VIST_TYPE_QD="2";

	
	
	
	
	/**
	 * 公共方法中，domain 域的定义
	 */
	public final static String YXTDOMAIN="yxt";
	
	public final static String APPKEY_PC="yxtpc";
	
	/**
	 * type类型
	 */
	public final static String TYPE_TOPIC = "00";    			//基础话题
	public final static String TYPE_TOPIC_GROUP = "01";    		//群组话题
	public final static String TYPE_TOPIC_POST = "02";    		//基础话题主楼评论
	public final static String TYPE_TOPIC_POST_GROUP = "03";    //群组话题主楼评论
	public final static String TYPE_COURSE = "10";    			//基础课程
	public final static String TYPE_COURSE_GROUP = "11";    	//群组课程
	public final static String TYPE_DRYCARGO = "20";   			//基础干货
	public final static String TYPE_DRYCARGO_GROUP = "21";    	//群组干货
	public final static String TYPE_KNOWLEDGE = "30";    		//基础分享
	public final static String TYPE_KNOWLEDGE_GROUP = "31";    	//群组分享
	public final static String TYPE_XUANYE = "40";    			//基础炫页
	public final static String TYPE_XUANYE_GROUP = "41";    	//群组炫页
	public final static String TYPE_GROUP="50";      //群组
	public final static String TYPE_JOINGROUP="60";  //加入群组
	

	
	/**
	 * 公共方法中，SHARE TOTYPE 类型的定义
	 * 
	 */
	public final static String TOTYPE_INAPP_GROUP="0";  //站内-群组
	public final static String TOTYPE_INAPP_USER="1";  //站内-人
	public final static String TOTYPE_OUTAPP_WEIXIN="10";  //站外-腾讯微信
	public final static String TOTYPE_OUTAPP_QQ="11";  //站外-腾讯QQ
	public final static String TOTYPE_OUTAPP_QQSPACE="12";  //站外-腾讯空间
	public final static String TOTYPE_OUTAPP_SINA="13";  //站外-新浪
	
	/**
	 * tag对象类型 1.用户 2.课程 3.小组 4.话题 5分享 6干货  7附件  8主楼回复 9 副楼回复
	 */
	public final static String TAG_TYPE_TOPIC="4";
	public final static String TAG_TYPE_USER="1";
	public final static String TAG_TYPE_COURSE="2";
	public final static String TAG_TYPE_GROUP="3";
	public final static String TAG_TYPE_KNG="5";
	public final static String TAG_TYPE_DRYCARGO="6";
	public final static String TAG_TYPE_ATTFILE="7";
	public final static String TAG_TYPE_POST="8";
	public final static String TAG_TYPE_SUBPOST="9";
	
	/**
	 * appkey 类型定义
	 */
	public final static String APPKEY_IOS = "ios";
	public final static String APPKEY_ANDROID = "android";
	public final static String APPKEY_COMPUTER = "pc";
	public final static String APPKEY_OSS = "oss";
	/**
	 * 课时是否学完 映射
	 * 
	 */
	public final static String STUTYED="1";  //学完
	public final static String NOSTUTYED="0"; //未学完
	/**
	 * 邮件相关参数
	 */
	public final static String MAIL_TRANSPORT_PROTOCOL="smtp";
	public final static String MAIL_SMTP_HOST="smtpcloud.sohu.com";
	public final static int    MAIL_SMTP_PORT=25;
	public final static String MAIL_SMTP_AUTH="true";
	public final static int	   MAIL_SMTP_CONNECTIONTIMEOUT=180;
	public final static int    MAIL_SMTP_TIMEOUT=600;
	public final static String MAIL_MIME_ENCODEFILENAME="true";
	public final static String MAIL_API_USER="xuewen";
	public final static String MAIL_API_KEY="pxKGeV6fQjoL2gzn";
	public final static String MAIL_FROM_ADDR="zhitiao@yunxuetang.com";
	public final static String MAIL_FROM_NAME="纸条团队";
	public final static String MAIL_YXTMAILREG_SUBJECT=" 在找你，要你跟他一起传纸条";
	
	public final static String APP_VEDIO_TYPE="m3u8";
	
	
	/**
	 * 分类类型
	 * 
	 */
	public final static String CATEGORY_PRIMARY="0";  //一级分类
	public final static String CATEGORY_SENCOND="1";  //二级分类
	/**
	 * pc端默认分类id
	 */
	public final static String CATEFORY_DEFAULT_PRIMARY="54d971f3e4b0c309d84ffb75";
	public final static String CATEFORY_DEFAULT_SENCOND="54d97348e4b0c309d84ffb8a";
	
	/**
	 * 干货频道 位置定义
	 */
	public final static String DRYINDEX_MODEL_TOP_LEFT="dryleft";//上左边
	public final static String DRYINDEX_MODEL_TOP_RIGHT="dryright";//上右边
	public final static String DRYINDEX_MODEL_BOTTOM_LEFT="dryleftdown";//左下
	public final static String DRYINDEX_MODEL_BOTTOM_RIGHT="dryrightdown";//右下
	
	/**
	 * 用户注册类型
	 */
	
	public final static String USER_REGIST_PHONE="01";//01  手机注册用户 
	public final static String USER_REGIST_EMAIL="02";//02  邮箱注册用户 
	public final static String USER_REGIST_QQ="11";  //11 QQ第三方登录   
	public final static String USER_REGIST_WEIXIN="12";//12  微信第三方登录
	public final static String USER_REGIST_SINA="13";//13新浪微博第三方登录
	
	public static String regex="";
	
	/**
	 * 话题置顶
	 */
	
	public final static int DISPALY=1;//置顶
	public final static int NODISPLAY=0;//取消置顶
	public final static int DISPLAYCOUNT=3;//可置顶的数量
	
	/**
	 * 邮件邀请模板名称
	 */
	public final static String MAIL_TEMP_VI="VMAIL";
	/**
	 * 邮件注册激活名称
	 */
	public final static String MAIL_TEMP_REG="RMAIL";
	/**
	 * 邮件绑定模板
	 */
	public final static String MAIL_TEMP_BMAIL="BMAIL";
	/**
	 * 邮件验证码
	 */
	public final static String MAIL_TEMP_CODEMAIL="CODEMAIL";
	/**
	 * 邮件验证码有效期
	 */
	public static final long MAILCODE_DEFAUT_OUTTIME = 24*60*60*60*1000;
	/**
	 * 手机修改密码
	 */
	public static final int MODIFYPWD_TYPE_PHONE = 1;
	/**
	 * 邮件修改密码
	 */
	public static final int MODIFYPWD_TYPE_EMAIL = 2;
	/**
	 * 校验是否为数字
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNumber(String str) {
		java.util.regex.Pattern pattern = java.util.regex.Pattern
				.compile("[0-9]*");
		java.util.regex.Matcher match = pattern.matcher(str);
		if (match.matches() == false) {
			return false;
		} else {
			return true;
		}
	}
	/**
	 * 广告位
	 */
	public static final String MSG_ADSELLER_ID = "渠道商ID已存在";
	public static final String MSG_ADSELLER_NAME = "渠道商名称已存在";
	public static final String MSG_201_PAGRM_ERRO = "参数不能为空";
	
	/**
	 * 推送类型
	 * 
	 */
	public final static String PUSH_NORMAL_TYPE="0";//广播
	public final static String PUSH_HEADLINE_TYPE="100";//通知
	public final static String PUSH_SETUPADMIN_TYPE="9";//提升管理员
	public final static String PUSH_CANCELADMIN_TYPE="10";//取消管理员
	public final static String PUSH_REMOVEGROUP_TYPE="11";//移出群组
	public final static String PUSH_JOINGROUP_TYPE="12";//加入群组
	public final static String PUSH_DELETEGROUP_TYPE="13";//解散群组
	public final static String PUSH_INVITEINGROUP_TYPE="14";//邀请加入群组
	public final static String PUSH_APPLYUSER_TYPE="15";//关注
	public final static String PUSH_TOPICPOST_TYPE="16";//话题回复
	public final static String PUSH_TOPICSUBPOST_TYPE="17";//副楼回复
	public final static String PUSH_TOPICSUBPOSTTOAUTHER_TYPE="18";//副楼回复通知主题创建人
	public final static String PUSH_AGREEINGROUPTOAPPLY_TYPE="19";//管理员同意申请人进入群组，推送给申请人
	public final static String PUSH_UNAGREEINGROUPTOAPPLY_TYPE="20";//管理员拒绝申请人进入群组，推送给申请人
	public final static String PUSH_APPTYTOGROUP_TYPE="21";//申请加入群组，推送给所有群管理员
	public final static String PUSH_AGREEINGROUP_TYPE="22";//管理员同意申请人进入群组通知，推送给管理员
	public final static String PUSH_UNAGREEINGROUP_TYPE="23";//管理员拒绝申请人进入群组通知,推送给管理员
	public final static String PUSH_QUITGROUP_TYPE="8";//退出群组
//	public final static String PUSH_APPLY_TYPE="9";//关注
//	public final static String PUSH_LIKE_TYPE="10";//点赞
//	public final static String PUSH_POST_TYPE="11";//回复
	public final static String PUSH_APPLYJOINGROUP_TYPE="6";//邀请加入群组
	public static final String MSG_201_ARGS_ERRO = "请求参数非法";
	public static final String MSG_REGISTFAIL_BLACK_201 = "请换一个账号试试！";
	
	/**
	 * 图片默认大小
	 * 
	 */
	public static final int PIC_HEIGHT = 144;
	public static final int PIC_WIDTH = 300;
	
	
	/**
	 * 赞类型
	 */
	public final static String LIKE_TYPE_INC="0"; //递增
	public final static String LIKE_TYPE_DIM="1";//递减
	
	/**
	 * 支付中心路径
	 */
	public static String YXTSERVER3 = "http://chat.yunxuetang.com:8087/";
	public static String ORDER_MERGE_URL="order/mergeOrderInfo";
	
	
	/**
	 * 红包服务路径
	 */
	public static String COUPON_COURSEACTIVITYS_URL="coupon/course/activitys";
	public static String COUPON_COURSEACOUPONS_URL="coupon/course/coupons";
}
