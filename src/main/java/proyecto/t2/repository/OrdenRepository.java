package proyecto.t2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.t2.model.Orden;

@Repository
public interface OrdenRepository extends JpaRepository<Orden, Integer>{

}
