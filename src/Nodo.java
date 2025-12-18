import java.util.ArrayList;

public class Nodo {
    String nombre;
    String ip;
    boolean firewall;
    boolean vulnerable;
    boolean comprometido;
    ArrayList<Nodo> vecinos;

    Nodo(String nombre, String ip, boolean firewall, boolean vulnerable) {
        this.nombre = nombre;
        this.ip = ip;
        this.firewall = firewall;
        this.vecinos = new ArrayList<>();
        this.vulnerable = vulnerable;
        this.comprometido = false;
    }

        
    void conectar(Nodo otro) {
        // TODO: conecta este nodo con "otro" (sin duplicados)
    }

    @Override
    public String toString() {
        // TODO: devolver algo tipo:
        // "WebServer (172.16.0.10) [VULN] [PWN]" etc.
        return "";
    }
}