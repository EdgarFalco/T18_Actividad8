 /* @autor: Edgar Falcó, Raúl Garrido, Abel Jornet
 * Fecha modificación: 08/02/2021
 */
package main;

import clases.*;

public class T18_Act8App {

	public static void main(String[] args) {
		
		Mysql.openConnection();
		Mysql.createDB("GrandesAlmacenes");

		Mysql.createTable("GrandesAlmacenes", "Cajeros", Inserciones.tablaCajeros);
		Mysql.createTable("GrandesAlmacenes", "Maquinas_Registradoras", Inserciones.tablaMaquinas);
		Mysql.createTable("GrandesAlmacenes", "Productos", Inserciones.tablaProductos);
		Mysql.createTable("GrandesAlmacenes", "Venta", Inserciones.tablaVenta);
		
		Mysql.insertData("GrandesAlmacenes", "Cajeros", Inserciones.insercionTablaCajeros);
		Mysql.insertData("GrandesAlmacenes", "Maquinas_Registradoras", Inserciones.insercionTablaMaquinas);
		Mysql.insertData("GrandesAlmacenes", "Productos", Inserciones.insercionTablaProductos);
		Mysql.insertData("GrandesAlmacenes", "Venta", Inserciones.insercionTablaVenta);
		
		Mysql.getValues("GrandesAlmacenes", "Productos");
		Mysql.deleteRecord("GrandesAlmacenes", "Productos", 1);
		Mysql.getValues("GrandesAlmacenes", "Productos");
		
		Mysql.closeConnection();
	}
}
