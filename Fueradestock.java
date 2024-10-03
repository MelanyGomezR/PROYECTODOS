package programacionproyecto;


	public class FueraDeStock implements EstadoProducto {
	    @Override
	    public void aplicarDescuento(Producto producto) {
	        System.out.println("No se puede aplicar descuento. Producto fuera de stock.");
	    }
	}


