package proyecto.t2.service;

import java.util.List;
import java.util.Optional;

import proyecto.t2.model.Libro;

public interface ILibroService {

	public List<Libro> listarLibro();
	
	public Libro guardarLibro(Libro libro);
	
	public Libro buscarLibro(int id);
	
	public void eliminarLibro(int codigo);
	
}
