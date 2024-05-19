package datos;

public class Casa extends Propiedad{
	private boolean tienePatio;
	
	public Casa() {}

	public Casa(boolean tienePatio ,double precioBase, String direccion) {
		super(precioBase, direccion);
		this.tienePatio = tienePatio;
	}

	public boolean isTienePatio() {
		return tienePatio;
	}

	public void setTienePatio(boolean tienePatio) {
		this.tienePatio = tienePatio;
	}

	@Override
	public String toString() {
		return "Casa [tienePatio=" + tienePatio + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public double precioPorNoche() {
		double precio = this.precioBase;
		
		if(isTienePatio()) {
			precio = precio + (this.precioBase * 0.10);
		}
		
		return precio;
	}
	
}
