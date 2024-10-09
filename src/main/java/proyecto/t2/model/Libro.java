package proyecto.t2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_Libro")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLibro;
	
	@Column(name = "titulo_libro")
	private String titulo;
	
	@Column(name = "nombre_autor")
	private String nomAutor;
	
	@Column(name = "apellido_autor")
	private String apeAutor;
	
	@Column(name = "categoria")
	private String Categoria;
	
	@Column(name = "precio")
	private double precio;

	public Libro() {
		super();
	}

	public Libro(int idLibro, String titulo, String nomAutor, String apeAutor, String categoria, double precio) {
		super();
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.nomAutor = nomAutor;
		this.apeAutor = apeAutor;
		Categoria = categoria;
		this.precio = precio;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNomAutor() {
		return nomAutor;
	}

	public void setNomAutor(String nomAutor) {
		this.nomAutor = nomAutor;
	}

	public String getApeAutor() {
		return apeAutor;
	}

	public void setApeAutor(String apeAutor) {
		this.apeAutor = apeAutor;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		Categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
