package juegogato;

import java.util.ArrayList;

/**
 *
 * @author Adrian
 */
public class AccionesGato {
    private TableroGanador tg;
    private final ArrayList<TableroGanador> listaTablero;
    
    public AccionesGato(){
        listaTablero = new ArrayList();
        crearTableros();
    }        
    
    /**
     * El método verificarEjes analiza los ejes posibles, el cual, se puede ganar el juego.
     * @param partida, representa el vector donde se almacena los turnos de O & X.
     * @param s, representa el valor almacenado a evaluar (O || X) 0 para máquina, 1 para jugador.
     * @return true si existe ganador; false si aun no hay ganador.
     */
    public final boolean verificarEjes(int[][] partida, int s) {                             
        for (int i = 0; i < partida.length; i++) {
            //Empezamos con los ejes horizontales
            if (partida[i][0] == s && partida[i][1] == s && partida[i][2] == s) 
                return true;
            else //Ahora con los ejes verticales
                if (partida[0][i] == s && partida[1][i] == s && partida[2][i] == s) 
                    return true;
        }
        //Ahora con las diagonales
        if ((partida[0][0] == s && partida[1][1] == s && partida[2][2] == s)) 
            return true;
         else if ((partida[0][2] == s && partida[1][1] == s && partida[2][0] == s)) 
            return true;
        return false;
    }
    
    /**
     * El método verificarEmpate verifica si el vector de la partida se ha completado.
     * @param partida, representa el vector donde se almacena los turnos de O & X.
     * @return true si existe empate; false si aun no se acaba el juego.
     */
    public final boolean verificarEmpate(int[][] partida){
        for (int[] partida1 : partida) {
            for (int j = 0; j < partida1.length; j++) {
                if (partida1[j] == -1)  
                    return false;
            }
        }
        return true;
    }
    
    /**
     * El método existeRaya verifica si el vector de la partida se ha completado.
     * @param partida, representa el vector donde se almacena los turnos de O & X.
     * @return true si existe empate; false si aun no se acaba el juego.
     */
    public int[] existeRaya(int[][] partida){
        for (int i = 0; i < partida.length; i++) {
            for (int j = 0; j < partida.length; j++) {
                if (partida[i][j] == -1)
                    return new int[]{i,j};
            }
        }
        return null;
    }    
    
    /**
     * El método bloquearJuego bloquea las casilla del jugador donde tiene una jugada.
     * @param partida, representa el vector donde se almacena los turnos de O & X.
     * @param s, representa el valor almacenado a evaluar (O || X) 0 para máquina, 1 para jugador.
     * @param ss, valor en contra de s
     * @return un vector de coordena x,y para bloquear en el tablero
     */
    public int[] bloquearJuego(int[][] partida, int s, int ss){        
        for (int i = 0; i < partida.length; i++) {
             //Empezamos a recorre los ejes horizontales
            //Empezamos a recorre los ejes verticales
            if (partida[i][0] == s && partida[i][1] == s && partida[i][2] != ss) 
                return new int[]{i,2};                      //i = 0,2 - 1,2 - 2,2
            else if (partida[i][0] == s && partida[i][2] == s && partida[i][1] != ss) 
                return new int[]{i,1};                      //i = 0,1 - 1,1 - 2,1
            else if (partida[i][1] == s && partida[i][2] == s && partida[i][0] != ss) 
                return new int[]{i,0};                      //i = 0,0 - 1,0 - 2,0
           else if (partida[0][i] == s && partida[1][i] == s && partida[2][i] != ss) 
                return new int[]{2,i};                      //i = 2,0 - 2,1 - 2,2
           else if (partida[0][i] == s && partida[2][i] == s && partida[1][i] != ss) 
                return new int[]{1,i};                      //i = 1,0 - 1,1 - 1,2
            else if (partida[1][i] == s && partida[2][i] == s && partida[0][i] != ss) 
                return new int[]{0,i};                      //i = 0,0 - 0,1 - 0,2
        }
        //Ahora recorremos las diagonales
        if ((partida[0][0] == s && partida[2][2] == s && partida[1][1] != ss) || 
                (partida[0][2] == s && partida[2][0] == s && partida[1][1] != ss)) 
                return new int[]{1,1};                      //i = 1,1
        else if (partida[0][0] == s && partida[1][1] == s && partida[2][2] != ss) 
                return new int[]{2,2};                      //i = 2,2
        else if (partida[1][1] == s && partida[2][2] == s && partida[0][0] != ss) 
                return new int[]{0,0};                      //i = 0,0
        else if (partida[0][2] == s && partida[1][1] == s && partida[2][0] != ss) 
                return new int[]{2,0};                      //i = 2,0
        else if (partida[1][1] == s && partida[2][0] == s && partida[0][2] != ss) 
                return new int[]{0,2};                      //i = 0,2
        return null;
    }    
    /**
     * El método vsTablero determina el tablero contrincante a jugar
     * @return un tablero aleatorio para jugar
     */
    public int[][] vsTablero(){        
        int i = (int) Math.floor(Math.random()*(listaTablero.size()));
        return listaTablero.get(i).getTablero();
    }
    
    /**
     * El método crearTableros crea los tableros ganadores de la máquina.
     */
    private void crearTableros(){
            //Tablero ganador 1
            tg = new TableroGanador();
            tg.setTablero(new int[][]{{0, -1, 0}, {0, 0, -1}, {0, -1, 0}});
            listaTablero.add(tg);
            
            //Tablero ganador 2
            tg = new TableroGanador();
            tg.setTablero(new int[][]{{0, 0, 0}, {-1, 0, -1}, {0, -1, 0}});
            listaTablero.add(tg);
            
            //Tablero ganador 3
            tg = new TableroGanador();
            tg.setTablero(new int[][]{{0, -1, 0}, {-1, 0, 0}, {0, -1, 0}});
            listaTablero.add(tg);
            
            //Tablero ganador 4
            tg = new TableroGanador();
            tg.setTablero(new int[][]{{0, -1, 0}, {-1, 0, -1}, {0, 0, 0}});
            listaTablero.add(tg);
            
            //Tablero ganador 5
            tg = new TableroGanador();
            tg.setTablero(new int[][]{{-1, 0, -1}, {0, 0, 0}, {-1, 0, -1}});
            listaTablero.add(tg);
    
    }
    
}
