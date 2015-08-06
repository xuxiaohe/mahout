package demo.repo;

import java.util.List;




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import demo.pojo.Drycargo;
import demo.pojo.InfoOfMahout;

public interface InfoOfMahoutRepository extends MongoRepository<InfoOfMahout, String>{

	List<InfoOfMahout> findAll();

	Page<InfoOfMahout> findByUserid(String unumber,Pageable page);
	
}
