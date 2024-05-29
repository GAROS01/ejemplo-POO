public class Clientes {
    private int id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String fechaUltimaCita;
    private String fechaProximaCita;

    public Clientes(int idCliente, String nombre, String apellido, String telefono, String correo, String fechaUltimaCita) {
        this.id = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.fechaUltimaCita = fechaUltimaCita;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaUltimaCita() {
        return fechaUltimaCita;
    }

    public void setFechaUltimaCita(String fechaUltimaCita) {
        this.fechaUltimaCita = fechaUltimaCita;
    }

    public String getFechaProximaCita() {
        return fechaProximaCita;
    }

    public void setFechaProximaCita(String fechaProximaCita) {
        this.fechaProximaCita = fechaProximaCita;
    }

}