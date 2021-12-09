
package Reto2.Reto2.interfaces;
import Reto2.Reto2.modelo.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
	
public interface InterfaceUser extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
}
