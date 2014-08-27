package edu.eci.cosw.samples.model;

// Generated Feb 5, 2013 5:52:11 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * AlmProductos generated by hbm2java
 */
@Entity
@Table(name = "ALM_PRODUCTOS" )
public class Producto implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4224112129753973637L;
	private int idproducto;
	private String nombre;
	private long precio;
	private Set<DetallePedido> almDetallesPedidos = new HashSet<DetallePedido>(0);

	public Producto() {
	}

	public Producto(int idproducto, String nombre, long precio) {
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto(int idproducto, String nombre, long precio,
			Set<DetallePedido> almDetallesPedidos) {
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.precio = precio;
		this.almDetallesPedidos = almDetallesPedidos;
	}

	@Id
	@Column(name = "idproducto", unique = true, nullable = false)
	public int getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}

	@Column(name = "nombre", nullable = false, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "precio", nullable = false)
	public long getPrecio() {
		return this.precio;
	}

	public void setPrecio(long precio) {
		this.precio = precio;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "almProductos")
	public Set<DetallePedido> getAlmDetallesPedidos() {
		return this.almDetallesPedidos;
	}

	public void setAlmDetallesPedidos(Set<DetallePedido> almDetallesPedidos) {
		this.almDetallesPedidos = almDetallesPedidos;
	}

}
