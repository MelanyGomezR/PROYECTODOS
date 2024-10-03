package programacionproyecto;

	public class Catalogo {
	    private List<Producto> productos;
	    private EstrategiaCarga estrategiaCarga;

	    public Catalogo(EstrategiaCarga estrategiaCarga) {
	        this.estrategiaCarga = estrategiaCarga;
	        this.productos = new ArrayList<>();
	    }

	    public void cargarProductos(String archivo) {
	        productos = estrategiaCarga.cargar(archivo);
	    }

	    public void mostrarProductos() {
	        for (Producto producto : productos) {
	            System.out.println(producto);
	        }
	    }
	}


