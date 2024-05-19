package negocio;

import java.util.ArrayList;
import java.util.List;

import dao.PropiedadDAO;
import datos.Departamento;
import datos.Propiedad;

public class PropiedadABM {
	public static PropiedadABM instance;
	
	private PropiedadABM() {}
	
	public static PropiedadABM getInstance() {
		if(instance == null) {
			instance = new PropiedadABM();
		}
		return instance;
	}
	
	public int agregar(Propiedad Propiedad) {
		return PropiedadDAO.getInstance().agregar(Propiedad);
	}
	
	public void modificar(Propiedad Propiedad) {
		PropiedadDAO.getInstance().actualizar(Propiedad);
	}
	
	public void eliminar(Propiedad Propiedad) {
		PropiedadDAO.getInstance().eliminar(Propiedad);
	}
	
	public Propiedad traer(int idPropiedad) {
		return PropiedadDAO.getInstance().traer(idPropiedad);
	}
	
	public List<Propiedad> traer() {
		return PropiedadDAO.getInstance().traerPropiedad();
	}
	
	public List<Propiedad> traerPropiedad() {
		return PropiedadDAO.getInstance().traerPropiedad();
	}
	
	public List<Propiedad> traerPropiedad(boolean tieneAscensor){
		List<Propiedad> lista = new ArrayList<Propiedad>();
		
		for(Propiedad p: traer()) {
			if( p instanceof Departamento && ((Departamento) p).isTieneAscensor()) {
				lista.add(p);
			}
		}
		
		return lista;
	}
	
	
}