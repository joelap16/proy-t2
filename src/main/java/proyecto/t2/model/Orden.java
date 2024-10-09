package proyecto.t2.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_Orden")
public class Orden {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idOrden;
	
	@Column(name = "id_cliente")
	private int idCliente;
	
	@ManyToOne
	@JoinColumn(name = "id_libro", referencedColumnName = "idLibro")
	private Libro libro;
	
	@Column(name = "fecha_orden")
	private LocalDate fechaOrden;

	public Orden() {
		super();
	}

	public Orden(int idOrden, int idCliente, Libro libro, LocalDate fechaOrden) {
		super();
		this.idOrden = idOrden;
		this.idCliente = idCliente;
		this.libro = libro;
		this.fechaOrden = fechaOrden;
	}

	public int getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(int idOrden) {
		this.idOrden = idOrden;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public LocalDate getFechaOrden() {
		return fechaOrden;
	}

	public void setFechaOrden(LocalDate fechaOrden) {
		this.fechaOrden = fechaOrden;
	}
	
}
