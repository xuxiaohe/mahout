package demo.repo;



import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import demo.pojo.Praise;

public interface PraiseRepository extends MongoRepository<Praise, String> {
	Praise findByUserIdAndDomainAndSourceIdAndType(String userId,String domain,String sourceId,String type);
	int countByDomainAndSourceIdAndType(String domain,String sourceId,String type);
//	boolean existsByUserIdAndAppKeyAndSourceIdAndType(String userId,String appkey,String sourceId,String type);
	Page<Praise> findByUserIdAndDomainAndType(String userId, String domain,String type, Pageable pageable);
	Page<Praise> findByDomainAndSourceId(String domain, String sourceId, Pageable pageable);
	Praise findOneByUserIdAndSourceId(String courseId, String id);
	int countBySourceId(String sourceId);
	
	List<Praise> findByTypeIn(List<Object> types);
	
}
