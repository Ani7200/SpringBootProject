

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.hibernate.jpahibernate.demo.AniruddhaCourse;


@Repository
@Transactional
public class CourseRepository {
	
	@Autowired
	 
	EntityManager em;
	
	public AniruddhaCourse findById(Long id) {
		return em.find(AniruddhaCourse.class,id);
	}
	 
/*	public void deleteById(Long id) {
		
		Course course = findById(11);
		em.remove(course);
	}
	 
  */
}
