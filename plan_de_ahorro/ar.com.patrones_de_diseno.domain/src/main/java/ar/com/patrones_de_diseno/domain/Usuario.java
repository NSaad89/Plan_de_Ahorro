package ar.com.patrones_de_diseno.domain;

public class Usuario {
	
	private Integer id;
    
    private String nombre;
    
    private String apellido;
    
    private String auto;
    
    public Usuario(String nombre, String apellido, String auto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.auto = auto;
    }
    
    public Usuario(Integer id, String nombre, String apellido, String auto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.auto = auto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", auto=" + auto + '}';
    }

}
