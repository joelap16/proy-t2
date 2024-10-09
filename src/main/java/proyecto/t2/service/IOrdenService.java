package proyecto.t2.service;

import java.util.List;
import java.util.Optional;

import proyecto.t2.model.Orden;

public interface IOrdenService {
		
	public List<Orden> listarOrden();
	
	public Orden guardarOrden(Orden orden);
	
	public Orden buscarOrden(int codigo);
	
	public void eliminarOrden(int codigo);

}
