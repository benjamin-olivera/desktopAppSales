package model;

public class Sales {
	private static int nextId = 3001;
    private int codigoVenta;
    private int codigoCliente;
    private int codigoProducto;
    private int cantidad;
    private double precio;
    private String fecha;

    public Sales(int codigoCliente, int codigoProducto, int cantidad, double precio, String fecha) {
        this.codigoVenta = nextId++;
        this.codigoCliente = codigoCliente;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.fecha = fecha;
    }

	public static int getNextId() {
		return nextId;
	}

	public static void setNextId(int nextId) {
		Sales.nextId = nextId;
	}

	public int getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(int codigoVenta) {
		this.codigoVenta = codigoVenta;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
    
}
