package proyecto.t2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import proyecto.t2.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>{

}
