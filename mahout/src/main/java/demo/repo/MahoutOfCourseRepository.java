package demo.repo;

import java.util.List;






import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import demo.pojo.Drycargo;
import demo.pojo.InfoOfMahout;
import demo.pojo.MahoutOfCourse;
import demo.pojo.MahoutOfType;

public interface MahoutOfCourseRepository extends MongoRepository<MahoutOfCourse, String>{

	List<MahoutOfCourse> findAll();

	MahoutOfCourse findOneBySourceid(String id);
	
	MahoutOfCourse findOneByIndex(String index);
	
	
	
}
