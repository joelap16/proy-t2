package proyecto.t2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.t2.model.Orden;
import proyecto.t2.repository.OrdenRepository;

@Service
public class OrdenServiceImp implements IOrdenService{
	@Autowired
	OrdenRepository repositorio;

	@Override
	public List<Orden> listarOrden() {
		return repositorio.findAll();
	}

	@Override
	public Orden guardarOrden(Orden orden) {
		return this.repositorio.save(orden);
	}

	@Override
	public Orden buscarOrden(int codigo) {
		return repositorio.findById(codigo).orElse(null);
	}

	@Override
	public void eliminarOrden(int codigo) {
		repositorio.deleteById(codigo);
	}

}
