/* @autor: Edgar Falcó, Raúl Garrido, Abel Jornet
 * Fecha modificación: 08/02/2021
 */
package clases;

public class Inserciones {

	public static String tablaCajeros = "(Codigo int unsigned NOT NULL AUTO_INCREMENT, "
			+ "NomApels varchar(255) DEFAULT NULL, "
			+ "PRIMARY KEY (Codigo));";

	public static String tablaMaquinas = "(Codigo int unsigned NOT NULL AUTO_INCREMENT, "
			+ "Piso int DEFAULT NULL, "
			+ "PRIMARY KEY (Codigo));";
	
	public static String tablaProductos = "(Codigo int unsigned NOT NULL AUTO_INCREMENT, "
			  + "Nombre varchar(100) DEFAULT NULL, "
			  + "Precio int DEFAULT NULL, "
			  + "PRIMARY KEY (Codigo));";
	
	public static String tablaVenta = "(Cajero int unsigned NOT NULL, "
			  + "Maquina int unsigned NOT NULL, "
			  + "Producto int unsigned NOT NULL, "
			  + "PRIMARY KEY (Cajero, Maquina, Producto), "
			  + "KEY Maquina (Maquina), "
			  + "KEY Producto (Producto), "
			  + "CONSTRAINT Venta_ibfk_1 FOREIGN KEY (Cajero) REFERENCES Cajeros (Codigo), "
			  + "CONSTRAINT Venta_ibfk_2 FOREIGN KEY (Maquina) REFERENCES Maquinas_Registradoras (Codigo), "
			  + "CONSTRAINT Venta_ibfk_3 FOREIGN KEY (Producto) REFERENCES Productos (Codigo)"
			  + "ON DELETE CASCADE);";
				
	public static String insercionTablaCajeros = "(NomApels) values "
			+ "('Oriol Miro'),"
			+ "('Cristian Pizarro'),"
			+ "('Edgar Falco'),"
			+ "('Eduard Lopez'),"
			+ "('Pepe Mago');";
	
	public static String insercionTablaMaquinas = "(Piso) values "
			+ "(1),"
			+ "(2),"
			+ "(3),"
			+ "(4),"
			+ "(5);";
	
	public static String insercionTablaProductos = "(Nombre, Precio) values "
			+ "('Platano', 1),"
			+ "('Manzana', 2),"
			+ "('Naranja', 2),"
			+ "('Leche', 4),"
			+ "('Zumo', 5);";
	
	public static String insercionTablaVenta = "(Cajero, Maquina, Producto) values "
			+ "(1, 1 , 1),"
			+ "(2, 2 , 2),"
			+ "(3, 3 , 3),"
			+ "(4, 4, 4),"
			+ "(5, 5, 5);";
}
