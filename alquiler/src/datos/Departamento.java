package datos;

public class Departamento extends Propiedad{
	private int cantidadAmbientes;
	private int nroPiso;
	private boolean tieneAscensor;
	
	public Departamento() {}

	public Departamento(int cantidadAmbientes, int nroPiso, boolean tieneAscensor, double precioBase, String direccion) {
		super(precioBase, direccion);
		this.cantidadAmbientes = cantidadAmbientes;
		this.nroPiso = nroPiso;
		this.tieneAscensor = tieneAscensor;
	}

	public int getCantidadAmbientes() {
		return cantidadAmbientes;
	}

	public void setCantidadAmbientes(int cantidadAmbientes) {
		this.cantidadAmbientes = cantidadAmbientes;
	}

	public int getNroPiso() {
		return nroPiso;
	}

	public void setNroPiso(int nroPiso) {
		this.nroPiso = nroPiso;
	}

	public boolean isTieneAscensor() {
		return tieneAscensor;
	}

	public void setTieneAscensor(boolean tieneAscensor) {
		this.tieneAscensor = tieneAscensor;
	}

	@Override
	public String toString() {
		return "Departamento [cantidadAmbientes=" + cantidadAmbientes + ", nroPiso=" + nroPiso + ", tieneAscensor="
				+ tieneAscensor + ", toString()=" + super.toString() + "]";
	};
	
	@Override
	public double precioPorNoche() {
		
		return (double)(this.precioBase + (cantidadAmbientes * 100));
		
	}
	
}