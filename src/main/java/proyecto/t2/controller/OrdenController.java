package proyecto.t2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import proyecto.t2.model.Libro;
import proyecto.t2.model.Orden;
import proyecto.t2.service.LibroServiceImp;
import proyecto.t2.service.OrdenServiceImp;

@Controller
public class OrdenController {

	@Autowired
	private OrdenServiceImp servicioO;
	@Autowired
	private LibroServiceImp servicioL;
	
		@GetMapping({"/ordenes"})
	public String listarOrdenes(Model modelo) {
		modelo.addAttribute("ordenes", servicioO.listarOrden());
		return "ordenes";
	}
	
	@GetMapping({"/nuevaOrden"})
	public String newOrden(Model modelo) {
		modelo.addAttribute("orden", new Orden());
		return "ordenes";
	}
	
	@PostMapping({"/saveOrden"})
	public String saveOrden(@RequestParam int idLibro, Orden orden) {	
	    Libro libro = servicioL.buscarLibro(idLibro);
	    orden.setLibro(libro);
	    
	    servicioO.guardarOrden(orden);
	    return "redirect:/ordenes";
	}
	
	@GetMapping("/editarOrden/{codigo}")
	public String editOrden(@PathVariable int codigo, Model modelo) {
		modelo.addAttribute("orden", servicioO.buscarOrden(codigo));
		return "formOrdenes";
	}
	
	@PostMapping("/actualizarOrden")
    public String actualizarOrden(@RequestParam int idLibro, @RequestParam int codigo, Orden orden) {
        Libro libro = servicioL.buscarLibro(idLibro);
        orden.setLibro(libro);
        orden.setIdOrden(codigo);

        servicioO.guardarOrden(orden);
        return "redirect:/ordenes";
    }
	
	@GetMapping("/eliminarOrden/{codigo}")
	public String deleteOrden(@PathVariable int codigo) {
		servicioO.eliminarOrden(codigo);
		return "redirect:/ordenes";
	}
		
	
}
