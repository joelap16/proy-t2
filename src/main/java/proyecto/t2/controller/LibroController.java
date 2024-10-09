package proyecto.t2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import proyecto.t2.model.Libro;
import proyecto.t2.service.LibroServiceImp;

@Controller
public class LibroController {

	@Autowired
	private LibroServiceImp servicio;
	
	@GetMapping("/")
    public String index() {
         return "index";
    }
		
	@GetMapping({"/libros"})
	public String listarLibros(Model modelo) {
		modelo.addAttribute("libros", servicio.listarLibro());
		return "libros";
	}
	
	@GetMapping({"/nuevoLibro"})
	public String newLibro(Model modelo) {
		modelo.addAttribute("libro", new Libro());
		return "libros";
	}
	
	@PostMapping({"/saveLibro"})
	public String saveLibro(Libro libro) {
		servicio.guardarLibro(libro);
		return "redirect:/libros";
	}
	
	@GetMapping("/editarLibro/{codigo}")
	public String editLibro(@PathVariable int codigo, Model modelo) {
		modelo.addAttribute("libro", servicio.buscarLibro(codigo));
		return "libros";
	}
	
	@GetMapping("/eliminarLibro/{codigo}")
	public String deleteLibro(@PathVariable int codigo) {
		servicio.eliminarLibro(codigo);
		return "redirect:/libros";
	}
	
}
