package proyecto.t2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.t2.model.Libro;
import proyecto.t2.repository.LibroRepository;

@Service
public class LibroServiceImp implements ILibroService{
	@Autowired
	LibroRepository repositorio;

	@Override
	public List<Libro> listarLibro() {		
		return repositorio.findAll();
	}

	@Override
	public Libro guardarLibro(Libro libro) {
		return this.repositorio.save(libro);
	}

	@Override
	public Libro buscarLibro(int codigo) {
	    return repositorio.findById(codigo).orElse(null);
	}
	@Override
	public void eliminarLibro(int codigo) {
		repositorio.deleteById(codigo);
	}

}
