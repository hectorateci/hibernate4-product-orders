package edu.eci.cosw.samples.simplepersistencelayer;

import edu.eci.cosw.samples.model.Cliente;
import edu.eci.cosw.samples.model.Producto;
import java.io.InputStream;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;


public class SimplePersistenceFacade {
	
	
        /**
         * Consultar todos los productos consumidos (es decir, alguna vez pedidos) 
         * por un determinado cliente (dado su id).
         * @param s sesion de Hibernate
         * @param idcliente identificador del cliente
         * @return la lista de los productos asociados. Si no hay coincidencias
         * se retorna una lista vacia.
         */
        public List<Producto> productoConsumidos(Session s,int idcliente){
            return null;
        }
    
        
        /**
         * Listar los nombres de los clientes que han recibido mercancía 
         * mediante despacho por parte de un determinado vehículo (es decir, 
         * dada su placa).
         * @param s sesión de Hibernate
         * @param placa la placa del vehículo
         * @return la lista de los clientes asociados. Si no hay coincidencias
         * se retorna una lista vacía.
         */
        public List<Cliente> clientesAsociadosAMercancia(Session s,String placa){
            return null;
        }
    
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
