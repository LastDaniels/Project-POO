package PConexiones;
public interface ConexionDataSource {
    boolean existe();
    ArrayList<Conexion> listar();
    void escribir(Conexion conexion, boolean anexar);
    Conexion buscar(String buscar);
    boolean buscar(Conexion conexion);
    void crear();
}