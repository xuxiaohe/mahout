package demo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import demo.pojo.User;


/**
 * user template mongo数据持久层操作 
 * @author hjn
 *
 */
@Service
@Component
public class UserTemplate {

	@Autowired
	private MongoTemplate mongoTemplate;
	
	public UserTemplate(){
		super();
	}
	
	/**
	 * 根据用户ID返回联系人列表所需的用户信息，包括ID，userName,nickName,sex,logoUrl,phoneNumber,email,intro,openFireUser等，其他字段为空
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public User getContactOfRspUserById(String id)throws  Exception{
		Query query=new Query(Criteria.where("id").is(id));
		query.fields().include("id").include("userName").include("nickName").include("sex").include("logoURL").include("phoneNumber").include("email").include("intro").include("openFireUser");
		return mongoTemplate.findOne(query, User.class);
	}
	
	/**
	 * 根据用户名判断用户是否存在
	 * @author hjn
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	public boolean isExiseByUserName(String userName)throws Exception{
		Query query=new Query(Criteria.where("userName").is(userName));
		return mongoTemplate.exists(query, User.class);
	}
	
	/**
	 * 根据用户名查找用户，只返回用户ID
	 * @author hjn
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	public User findByUserNameRspOnlyId(String userName)throws Exception{
		Query query=new Query(Criteria.where("phoneNumber").is(userName).and("isPhoneChecked").is(true));
		query.fields().include("userName");
		return mongoTemplate.findOne(query, User.class);
	}
	/**
	 * 根据手机号查找出来此手机号码已经校验过的账户Id
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	public User findByPhoneAndPhoneCheckedRspOnlyId(String phoneNumber)throws Exception{
		Query query=new Query(Criteria.where("phoneNumber").is(phoneNumber).and("isPhoneChecked").is(true));
		query.fields().include("userName");
		return mongoTemplate.findOne(query, User.class);
	}
	
	
	/**
	 * 根据用户id删除用户
	 * @author xurui
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	public boolean deleUserById(String id)throws Exception{
		try {
			Query query=new Query(Criteria.where("id").is(id));
			mongoTemplate.remove(query, User.class);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	/**
	 * 
	 * @Title: findByIdIn
	 * @Description: 根据ids找用户list
	 * @param userIds
	 * @return List<User>
	 * @throws
	 */
	public List<User> findByIdIn(List<String> userIds) {
		Query query=new Query(Criteria.where("id").in(userIds));
		return mongoTemplate.find(query, User.class);
	}
	
	
	
	/**
	 * 根据该手机用户名是否存在
	 * @author hjn
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	public boolean isExiseByPhoneNumber(String phoneNumber)throws Exception{
		Query query=new Query(Criteria.where("phoneNumber").is(phoneNumber));
		return mongoTemplate.exists(query, User.class);
	}
	
	/**
	 * 根据该email用户名是否存在
	 * @author hjn
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	public boolean isExiseByEmail(String email)throws Exception{
		Query query=new Query(Criteria.where("email").is(email));
		return mongoTemplate.exists(query, User.class);
	}
	
	/**
	 * 根据该email用户名是否激活
	 * @author hjn
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	public boolean isEmailCheckedByEmail(String email)throws Exception{
		Query query=new Query(Criteria.where("email").is(email).and("isEmailChecked").is(true));
		return mongoTemplate.exists(query, User.class);
	}
	/**
	 * 判断第三方登录账号是否存在
	 * @param openId
	 * @param registType
	 * @return
	 * @throws Exception
	 */
	public boolean isExisByOpenId(String openId,String registType)throws Exception{
		Query query=new Query(Criteria.where("openId").is(openId).and("registType").is(registType));
		return mongoTemplate.exists(query, User.class);
	}
	/**
	 * 判断手机号与密码是否正确
	 * @param phoneNumber
	 * @param passWord
	 * @return
	 * @throws Exception
	 */
	public boolean isExitByPhoneNumberForPassword(String phoneNumber,String passWord)throws Exception{
		Query query=new Query(Criteria.where("phoneNumber").is(phoneNumber).and("passWord").is(passWord));
		return mongoTemplate.exists(query, User.class);
	}
	/**
	 * 判断该手机号用户未被删除
	 * @param phoneNumber
	 * @param passWord
	 * @return
	 * @throws Exception
	 */
	public boolean isExitByPhoneNumberAndDeleFlag(String phoneNumber,int deleteFlag)throws Exception{
		Query query=new Query(Criteria.where("phoneNumber").is(phoneNumber).and("deleFlag").is(deleteFlag));
		return mongoTemplate.exists(query, User.class);
	}
	
	/**
	 * 判断该手机号用户是否被激活
	 * @param phoneNumber
	 * @param passWord
	 * @return
	 * @throws Exception
	 */
	public boolean isExitByPhoneNumberAndIsPhoneChecked(String phoneNumber)throws Exception{
		Query query=new Query(Criteria.where("phoneNumber").is(phoneNumber).and("isPhoneChecked").is(true));
		return mongoTemplate.exists(query, User.class);
	}
	
	/**
	 * 判断该email用户未被删除
	 * @param phoneNumber
	 * @param passWord
	 * @return
	 * @throws Exception
	 */
	public boolean isExitByEmailAndDeleFlag(String email,int deleteFlag)throws Exception{
		Query query=new Query(Criteria.where("email").is(email).and("deleFlag").is(deleteFlag));
		return mongoTemplate.exists(query, User.class);
	}
	
	/**
	 * 判断email与密码是否正确
	 * @param phoneNumber
	 * @param passWord
	 * @return
	 * @throws Exception
	 */
	public boolean isExitByEmailForPassword(String email,String passWord)throws Exception{
		Query query=new Query(Criteria.where("email").is(email).and("passWord").is(passWord));
		return mongoTemplate.exists(query, User.class);
	}
	/**
	 * 根据用户Id和token返回用户token过期时间和是否邮箱激活标示
	 * @param userId
	 * @param token
	 * @return
	 * @throws Exception
	 */
	public User getOneByEmailAndToken(String email,String token)throws Exception{
		Query query=new Query(Criteria.where("email").is(email).and("token").is(token));
		query.fields().include("expireTime").include("isEmailChecked");
		return mongoTemplate.findOne(query, User.class);
	}
	
	/**
	 * 只查询出密码
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public User checkIsSetPassword(String userId)throws Exception{
		Query query=new Query(Criteria.where("id").is(userId));
		query.fields().include("passWord");
		return mongoTemplate.findOne(query, User.class);
	}
	
	/**
	 * 根据ID 设置此用户，手机号为未绑定状态
	 * @param userId
	 * @throws Exception
	 */
	public void setPhoneNotChecked(String userId)throws Exception{
		Query query=new Query(Criteria.where("id").is(userId));
		Update update=new Update();
		update.set("isPhoneChecked", false);
		mongoTemplate.updateMulti(query, update,User.class);
	}
	
	/**
	 * 将其他绑定此手机号的账号，设置为未绑定
	 * @param phoneNumber
	 * @throws Exception
	 */
	public void setAllPhoneNotChecked(String phoneNumber)throws Exception{
		Query query=new Query(Criteria.where("phoneNumber").is(phoneNumber));
		Update update=new Update();
		update.set("isPhoneChecked", false);
		update.set("phoneNumber", "");
		mongoTemplate.updateMulti(query, update,User.class);
	}
	
	/**
	 * 根据Id，绑定手机号，并校验通过
	 * @param userId
	 * @throws Exception
	 */
	public void setPhoneChecked(String userId,String phoneNumber,String passWord)throws Exception{
		Query query=new Query(Criteria.where("id").is(userId));
		Update update=new Update();
		update.set("isPhoneChecked", true);
		update.set("phoneNumber", phoneNumber);
		update.set("passWord", passWord);
		mongoTemplate.updateMulti(query, update,User.class);
	}
	/**
	 * 根据用户ID获取用户昵称
	 * @param userId
	 * @return
	 * @throws Exception
	 */
	public User getUserNickNameByUserId(String userId)throws Exception{
		Query query=new Query(Criteria.where("id").is(userId));
		query.fields().include("nickName");
		return mongoTemplate.findOne(query, User.class);
	}
	
}
