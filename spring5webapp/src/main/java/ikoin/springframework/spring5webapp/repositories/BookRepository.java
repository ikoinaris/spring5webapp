package ikoin.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import ikoin.springframework.spring5webapp.domain.Book;

/**
 * 
 * @author i.koinaris
 *
 */
public interface BookRepository extends CrudRepository<Book, Long>{

}
