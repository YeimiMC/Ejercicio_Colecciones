package colecciones;

//import java.util.Set; //papá
//import java.util.HashSet; //hijo

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;


public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Declarando mi primer arreglo de Java []
		//Primero el tipo de dato que voy a almacenar, le pongo los corchetes cuadrados, después el nombre de mi arreglo y por último la instancia
		
		
		String[] listaCompras = new String[] {"leche", "pan", "frutas"}; 
		
		//Impresión de mi array
		System.out.println(listaCompras);
		
		//forEach para imprimir cada elemento de mi lista de compras
		//para nuestros datos del tipo String, que se almacenen en una variable temporal llamada ProductoTemporal, que se está llenando de un arreglo llamado listaCompras, vas a imprimir ese productoTemporal
		for(String productoTemporal : listaCompras) {
			System.out.println(productoTemporal);
		}
		
		//Declaro mi arreglo de habitaciones de un hotel
		String[] habitaciones = new String[10];
		
		
		//Asigno valores a cada indice
		habitaciones[0] = "101";
		habitaciones[1] = "102";
		habitaciones[2] = "103";
		habitaciones[3] = "104";
		habitaciones[4] = "105";
		habitaciones[5] = "106";
		habitaciones[6] = "107";
		habitaciones[8] = "109";
		habitaciones[9] = "110";
		
		
		//habitaciones[10] = "111"; Si tratamos de acceder a un elemento más allá de los elementos declarados al principio, tendremos una excepción que solo veremos cuando se ejecute el programa
		
		//Cuando imprimimos un elemento que no está siendo definidio dentro del arreglo, veremos un null. Esto pasa porque para Java es preferible tener un elemento nulo a uno indefinido
		System.out.println(habitaciones[8]);
		
		//En caso de querer usar un for each para imprimir los elementos, solo se imprimirán 7 elementos.
		
		for(String habitacionTemporal : habitaciones) {
			System.out.println(habitacionTemporal);
		}//for
		
		
		//ArrayList (llamamos a su padre que es List) para una lista de contactos
		
		//Uso la interface List que almacena Contactos(objeto), se llama listaDeContactos e instancia un arrayList para manerjar los mismos tipos de datos (Contacto)
		List<Cliente> listaDeClientes = new ArrayList<>();
		
		
		
		//Primero crear mis objetos y luego agregrarlos ó
		//Hacer lo mismo, en una sola línea
		//Vamos a agregar e instanciar al mismo tiempo con:
		
		//Instancio un objeto de la clase Cliente(nombre, cuenta, saldo, nip)
		Cliente Felipe = new Cliente("Felipe Maqueda", "ABC123", 156.50f, "1234");
		
		//Agrego el cliente a mi lista de clientes con el método .add
		listaDeClientes.add(Felipe);
		
		//Agrego el cliente y lo instancio a mi lista
		listaDeClientes.add(new Cliente("Naruto", "XXX111", 100.00f, "0000"));
		
		
		//Imprimo la información de mi lista (pero este no sirve)
		System.out.println("Lista completa"); 
		
		
		//Para sacar un elemento de la lista y asignarlo a una variable
		System.out.println("Elemento en el índice 0");
		Cliente datoDeLaLista = listaDeClientes.get(0); //es un array de objetos en donde estamos indicando el indice 0
		
		//Imprimir elemento de la lista con un dato específico con el getter
		System.out.println("Impresión de un elemento de la lista");
		System.out.println(datoDeLaLista.getSaldo());
		
		//Eliminar elementos de la lista
		listaDeClientes.remove(0);
		
		System.out.println();
		//Imprimir la información de mi lista (utilizar métodos)
		System.out.println(listaDeClientes);
		
		
		//Conjunto para servicios de un hotel
		Set<String> roomService = new HashSet<>();
		
		//Agregamos elementos a nuestro HashSet
		roomService.add("Chilaquiles");
		roomService.add("Agua mineral");
		roomService.add("Wi-fi");
		
		
		//Hotel con promoción (si pidieron agua mineral aplicamos un descuento del 50%)
		
		if (roomService.contains("Agua mineral")) {
			System.out.println("Obtienes un descuento del 50%");
		}
		
		//¿Qué pasa su imprimo mi roomSeervice
		
		//Borramos toda la lista de roomService
		//roomService.clear();
		
		System.out.println(roomService);
		
		
		//HashMap para mi sistema de reservas del hotel
		Map<String, Cliente> reservaHabitacion = new HashMap<>();
		
		reservaHabitacion.put("101", new Cliente ("Jesus", "135JJJ", 1890.87f, "0011"));
		reservaHabitacion.put("102", new Cliente ("Bugs Bunny", "BGSB12", 1890.87f, "7777"));
			
		
		//Impresión de reserva
		Cliente reservaBugsBunny = reservaHabitacion.get("102"); //Obtener un daton del HashMap
		
		//Qué pasa sí imprimo la variable reservaHabitación

	}//main

} //Colecciones

/*
 Colecciones


- Arrays
Un array es una estructura de datos linea que contiene elementos del mismo tipo. La longitud de un array se establece al momento de crearlo y no puede cambiar. No cuentan con métodos adicionales para agregar o eliminar elementos. Los elementos están almacenados de forma contigua en memoria, y se puede acceder a ellos a través de un índice. Sus principales características son:

1. Tamaño fijo
2. Acceso rápido
3. Coste elevado para insertar o eliminar elementos


- ArrayList
Es una implementación de una colección llamada List (interface superior), y se utiliza mucho para almacenar elementos de una forma dinámica. Las principales características de un ArrayList son:

1. Tamaño dinámico
2. Acceso rápido
3. Coste elevado para insertar o eliminar elementos

- Set
Es una estructura de datos que almacena elementos únicos sin orden específico. Las principales características de un Set son:

	1. No hay elementos duplicados en los conjuntos (como en los array y arrayList).
	2. No hay orden específico
	3. Búsqueda es más rápida (key-value)

- HashMap

Es una implementación de la interfaz Map de Java, que permite que la información se almacene en pares clave-valor. Sus principales características son:

	1. Almacenamiento K y V
	2. Sin orden específico
	3. Búsqueda rápida
	4. Iteración rápida (for each)
	5. No sincronización (hilos)
*/





