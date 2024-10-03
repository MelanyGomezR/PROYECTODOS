package programacionproyecto;

	public class CargaJSON implements EstrategiaCarga {
	    @Override
	    public List<Producto> cargar(String archivo) {
	        Gson gson = new Gson();
	        try (FileReader reader = new FileReader(archivo)) {
	            Type tipoListaProductos = new TypeToken<List<Producto>>() {}.getType();
	            return gson.fromJson(reader, tipoListaProductos);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
	}


