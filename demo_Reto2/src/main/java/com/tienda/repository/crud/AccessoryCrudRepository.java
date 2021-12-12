
package com.tienda.repository.crud;

import com.tienda.model.Accessory;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 *
 * @author bfabian
 */
public interface AccessoryCrudRepository extends MongoRepository<Accessory, String>{
    
}
