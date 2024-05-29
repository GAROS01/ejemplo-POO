public class Citas {
    private int id;
    private String fecha;
    private String hora;
    private String servicio;
    private Clientes cliente;
    private Manicuristas manicurista;

    public Citas(int id, String fecha, String hora, String servicio, Clientes cliente, Manicuristas manicurista) {
        this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.servicio = servicio;
        this.cliente = cliente;
        this.manicurista = manicurista;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
// getters y setters para cliente y manicurista

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Manicuristas getManicurista() {
        return manicurista;
    }

    public void setManicurista(Manicuristas manicurista) {
        this.manicurista = manicurista;
    }

    public String getId() {
        return String.valueOf(id);
    }
}