package ikoin.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import ikoin.springframework.spring5webapp.domain.Author;

/**
 * 
 * @author i.koinaris
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Long>{

}
