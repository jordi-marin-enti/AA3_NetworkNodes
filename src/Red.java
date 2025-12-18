 import java.util.ArrayList;

 public class Red {
        ArrayList<Nodo> nodos;

        Red() {
             // TODO: Realizar constructor
             this.nodos = new ArrayList<>();
        }

        void agregarNodo(Nodo n) {
            // TODO: añade nodo a la red
            if (!nodos.contains(n));{
                nodos.add(n);
            }
        }

        public void conectar(Nodo a, Nodo b) {
            // TODO: conecta a <-> b (bidireccional)
            a.conectar(b);
            b.conectar(a);
        }

        
        void mostrar() {
            // TODO: imprime topología (nodo -> vecinos)
            for (Nodo n : nodos){
                System.out.println(n.toString()+ " --> ");
                System.out.println(listarVecinosDe(n));
            }
        }
        
        void resetCompromisos() {
            // TODO: poner comprometido=false a todos los nodos
        }

        void escanearDesde(Nodo origen) {
            // TODO: BFS desde origen - https://www.geeksforgeeks.org/dsa/breadth-first-search-or-bfs-for-a-graph/
            // Reglas:
            // - si un nodo visitado es vulnerable => comprometido=true
            // - si un nodo visitado es firewall => NO se propaga a sus vecinos
        }

        Nodo buscarPorIP(String ip) {
            for (Nodo n : nodos)
                if (n.ip.equals(ip))
                    return n;
            return null;
        }
  
        int contarVulnerablesAlcanzables(Nodo origen) {
            // Contar vulnerables alcanzables desde origen (BFS)
            return 0;
        }

        String listarVecinosDe(Nodo n) {
            // Listar vecinos (iterar vecinos)
            return "";
        }

        ArrayList<Nodo> nodosAislados() {
            ArrayList<Nodo> aislados = new ArrayList<>();
            for (Nodo n : nodos) {
                if (n.vecinos.isEmpty()){
                    aislados.add(n);
                }
            }
            return aislados;
        }
    }
