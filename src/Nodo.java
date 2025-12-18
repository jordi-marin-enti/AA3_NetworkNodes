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
        this.vecinos = new ArrayList<>();
        if (!vecinos.contains(otro))
            vecinos.add(otro);
    }

    @Override
    public String toString() {
        String estat = nombre + "(" + ip + ")";
        if (firewall) 
            estat += "[FW]";

        if (vulnerable)
             estat += "[VULN]";

        if (comprometido)
             estat += "[PWN]";
            
        return estat;
    }
}