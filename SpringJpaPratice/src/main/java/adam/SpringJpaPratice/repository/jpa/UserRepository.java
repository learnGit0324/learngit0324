package adam.SpringJpaPratice.repository.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import adam.SpringJpaPratice.pojo.UserDO;

@Repository
public interface UserRepository extends JpaRepository<UserDO, Integer>{
	
	@Query(value = "select * from Student where id = :id", nativeQuery = true)
	List<UserDO> findAllById(@Param("id") int id);

}
