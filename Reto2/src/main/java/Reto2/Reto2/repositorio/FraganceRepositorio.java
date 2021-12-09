
package Reto2.Reto2.repositorio;

import Reto2.Reto2.interfaces.InterfaceFragance;
import Reto2.Reto2.modelo.Fragance;
import java.util.List;
	import java.util.Optional;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	
@Repository
public class FraganceRepositorio {
    @Autowired
    private InterfaceFragance repository;

    public List<Fragance> getAll() {
        return repository.findAll();
    }

    public Optional<Fragance> getClothe(String reference) {
        return repository.findById(reference);
    }
    public Fragance create(Fragance clothe) {
        return repository.save(clothe);
    }

    public void update(Fragance clothe) {
        repository.save(clothe);
    }
    
    public void delete(Fragance clothe) {
        repository.delete(clothe);
    }
}
