package demo.repo;

import java.util.List;




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import demo.pojo.MahoutOfGroup;
import demo.pojo.XueWenGroup;
import java.lang.String;

public interface MahoutOfGroupRepository extends MongoRepository<MahoutOfGroup, String> {
	List<MahoutOfGroup> findByUsernumber(String usernumber);
}
