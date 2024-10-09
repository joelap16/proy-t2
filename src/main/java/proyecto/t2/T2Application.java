package proyecto.t2;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import proyecto.t2.model.Libro;
import proyecto.t2.model.Orden;
import proyecto.t2.repository.LibroRepository;
import proyecto.t2.repository.OrdenRepository;

@SpringBootApplication
public class T2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(T2Application.class, args);
		LibroRepository libroRepository = context.getBean(LibroRepository.class);
		OrdenRepository ordenRepository = context.getBean(OrdenRepository.class);
				
		List<Libro> libros = List.of(
				new Libro(1,"TituloLib1","Ana","Apellido1","Cat1",50.0),
				new Libro(2,"TituloLib2","Benito","Apellido2","Cat2",70.0),
				new Libro(3,"TituloLib3","Carlos","Apellido3","Cat3",100.0),
				new Libro(4,"TituloLib4","Diego","Apellido4","Cat4",80.0),
				new Libro(5,"TituloLib5","Edwin","Apellido5","Cat5",90.0)
				);
		libroRepository.saveAll(libros);
		//List<Libro> librosGuardados = libroRepository.findAll();
		
		List<Orden> ordenes = List.of(
				new Orden(1,5, libros.get(0), LocalDate.now()), 				
				new Orden(2,4, libros.get(1), LocalDate.now()),
				new Orden(3,3, libros.get(2), LocalDate.now()),
				new Orden(4,2, libros.get(3), LocalDate.now()),
				new Orden(5,1, libros.get(4), LocalDate.now())
				);
		ordenRepository.saveAll(ordenes);
		//List<Orden> ordenesGuardadas = ordenRepository.findAll();	
				
				
				
	}

}
