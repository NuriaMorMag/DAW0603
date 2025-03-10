import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class GestorTiendaTest {
	
	private static GestorTienda gestorTienda;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		gestorTienda = new GestorTienda();
	}

	@Test
	void testCalcularDescuento() {
		assertEquals(10.0, gestorTienda.calcularDescuento(100.0, 10));
		
		assertEquals(5.0, gestorTienda.calcularDescuento(100.0, 5)); //100*0.05=5
		
		assertEquals(0.0, gestorTienda.calcularDescuento(100.0, 4));
		
	}

	@Test
	void testCategorizarProducto() {
		assertEquals("Económico", gestorTienda.categorizarProducto(5.0)); //5.0 porque es double

        assertEquals("Estándar", gestorTienda.categorizarProducto(30.0));

        assertEquals("Premium", gestorTienda.categorizarProducto(70.0));
	}

	@Test
	void testBuscarProducto() {
		 String[] inventario = {"aguacate", "platano", "MELON", "sandia"};
		 
		  assertEquals("aguacate", gestorTienda.buscarProducto(inventario, "Aguacate"));
	      
		  assertEquals("MELON", gestorTienda.buscarProducto(inventario, "melon"));

	      assertNull(gestorTienda.buscarProducto(inventario, "manzana"));
		 
	}

}
