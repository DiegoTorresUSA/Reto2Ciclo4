
package com.tienda.repository.crud;

import com.tienda.model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 *
 * @author bfabian
 */
public interface UserCrudRepository extends MongoRepository<User,Integer>{
    public Optional <User> findByEmail(String email);
    
    public Optional<User> findByEmailAndPassword(String email, String password);
    
}
