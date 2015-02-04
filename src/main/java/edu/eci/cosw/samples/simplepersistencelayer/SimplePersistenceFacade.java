package edu.eci.cosw.samples.simplepersistencelayer;

import edu.eci.cosw.samples.model.Cliente;
import edu.eci.cosw.samples.model.Producto;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;


public class SimplePersistenceFacade {
	
	    
	/**
	 * Hacer persistente un nuevo pedido, creado a partir del identificador de cliente dado, los identificadores
	 * de los productos, sus cantidades, y la fecha.
	 * @pre identificadorProductos.lenght==cantidades.lenght
	 * @param idCliente identificador del cliente que hace el pedido
	 * @param identificadoresProductos conjunto de identificadores de los productos que componen el pedido
	 * @param cantidades conjunto de cantidades de los productos pedidos. La cantidad i, ser� entonces, 
	 *        la cantidad asociada al producto i.
	 */
	public static void registrarPedido(Session s, int idCliente, int[] identificadoresProductos, int[] cantidades, Date fecha){            
            
	}
	
	/**
	 * Registrar un despacho de un pedido
	 * @param idPedido identificador del pedido ya existente
	 * @param idVehiculo identificador del veh�culo a asociar con el despacho
	 * @param qrCode flujo de bytes de la im�gen de c�digo QR generado para el despacho
	 */
	public void registrarDespacho(Session s, int idPedido, int idVehiculo, InputStream qrCode){
		
	}

	
	
}
