package demo.repo;

import java.util.List;





import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import demo.pojo.Drycargo;
import demo.pojo.InfoOfMahout;
import demo.pojo.MahoutOfType;

public interface MahoutOfTypeRepository extends MongoRepository<MahoutOfType, String>{

	List<MahoutOfType> findAll();

	MahoutOfType findOneBySourceid(String id);
	
	MahoutOfType findOneByIndex(String index);
	
	
	
}
