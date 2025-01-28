
public class Cliente {
	//DATOS PRIVADOS
	private String id,nombre,apellido1,apellido2,telefono,provincia,ciudad,calle,numero,cp;
	
	//CONSTRUCTOR/ES
	public Cliente() {
		id="";
		nombre="";
		apellido1="";
		apellido2="";
		telefono="";
		provincia="";
		ciudad="";
		calle="";
		numero="";
		cp="";
	}
	
	public Cliente(String id,String nombre,String apellido1,String apellido2,String telefono,String provinia,String ciudad,String calle,String numero,String cp) {
		this.provincia=id;
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.telefono=telefono;
		this.provincia=provincia;
		this.ciudad=ciudad;
		this.calle=calle;
		this.numero=numero;
		this.cp=cp;
	}
	//GETTERS Y SETTERS	
	public String getNombre() {
		return nombre;
	}

	

	public String getApellido1() {
		return apellido1;
	}


	public String getId() {
		return id;
	}

	public String getCp() {
		return cp;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getApellido2() {
		return apellido2;
	}


	public String getTelefono() {
		return telefono;
	}


	public String getProvincia() {
		return provincia;
	}


	public String getCiudad() {
		return ciudad;
	}


	public String getCalle() {
		return calle;
	}


	public String getNumero() {
		return numero;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}
}
