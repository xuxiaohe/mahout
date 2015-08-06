package demo.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;

import demo.pojo.User;
/**
 * 用户repo，与数据库进行交互
 * @author nes
 *
 */
public interface UserRepository extends MongoRepository<User, String> {
	List<User> findByUserName(String userName);
	 
	List<User> findByphoneNumber(String phoneNumber);
	User findOneByUserNameAndPassWordAndUdid(String userName, String passWord, String udid);
	User findOneByUserNameAndPassWord(String userName, String passWord);
	User findOneByUdidAndToken(String udid, String token);
	User findOneByUdidAndPhoneNumber(String udid,String phoneNumber);
	User findOneById(String id);
	//@Query(value="{'user':?0}",fields="{'_id':1,'nickName':2,'logoURL':3}")
	List<User>  findByIdIn(List<Object> user);
//	List<User>  findByIdIn(List<Object> user,Pageable pageable);
	List<User> findByLocationNear(Point p,Sort st, Distance distance);
	User findOneByPhoneNumber(String phoneNumber);
	User findOneByUserName(String userName);
	User findOneByUdidAndPassWord(String udid,String passWord);
	Page<User> findByRobotAndUserNameRegexOrRobotAndNickNameRegex(int robot,String userName,int robot1,String nikeName, Pageable pageable);
	//xurui
	Page<User> findByRobotAndUserNameRegexAndDeleFlagOrRobotAndEmailRegexAndDeleFlagOrRobotAndPhoneNumberRegexAndDeleFlagOrRobotAndNickNameRegexAndDeleFlag(int robot,String userName,int deleFlag,int robot1,String email,int deleFlag1,int robot2,String phoneNumber,int deleFlag2,int robot3,String nickName,int deleFlag3, Pageable pageable);
	List<User> findByIdInAndUserNameLike(List<Object> memberList, String userName);
	Page<User> findByIdInAndUserNameLike(List<Object> memberList, String userName, Pageable pageable);
	
	Page<User> findAllByRobotAndDeleFlag(int robot,int deleFlag,Pageable pageable);
	Page<User> findByIdIn(List<Object> memberList,Pageable pageable);
	int  countByCtimeBetween(long t2, long t1);
	User findByOpenIdAndRegistTypeAndDeleFlag(String openId,String registType,int deleFlag);
	User findOneByEmailAndPassWord(String userName, String passWord);
	User findOneByPhoneNumberAndPassWord(String userName, String passWord);
	User findOneByPhoneNumberAndIsPhoneChecked(String phoneNumber,boolean isPhoneChecked);
	User findOneByEmailAndIsEmailChecked(String email,boolean isEmailChecked);
	User findOneByEmail(String email);
	User findOneByPhoneNumberOrEmail(String phone,String email);
	User findOneByIdNotAndPhoneNumberAndIsPhoneChecked(String userId,String phoneNumber,boolean isPhoneChecked);
	int countByRegistType(String registType);
	User findByuserNumber(long number);
}
