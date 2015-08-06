package demo.repo;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import demo.pojo.Fav;

public interface FavRepository extends MongoRepository<Fav, String>{
	Page<Fav> findByAppKeyAndSourceIdAndFavType(String appkey,String sourceId,int  favType,Pageable pageable);
	Fav findByUserIdAndAppKeyAndSourceIdAndFavType(String userId,String appkey,String sourceId,int favType);
	int countByAppKeyAndSourceIdAndFavType(String appkey,String sourceId,int favType);
	//用户关于某个类别的收藏列表
	Page<Fav> findByUserIdAndAppKeyAndFavTypeOrUserIdAndAppKeyAndFavType(String userId,String appkey,String favType,String userId1,String appkey1,String favType1,Pageable pageable);
	Page<Fav> findByUserIdAndAppKeyAndFavType(String userId,String appkey,String favType,Pageable pageable);
	//获得某一课程下的用户收藏列表
	Page<Fav> findBySourceIdAndDomain(String groupCourseId, String domain,Pageable pageable);
	Page<Fav> findByUserId(String userId, Pageable pageable);
	List<Fav> findByFavType(String type);
	List<Fav> findByFavTypeIn(List<Object> types);
	Fav findByUserIdAndSourceId(String uid,String sid);
}
