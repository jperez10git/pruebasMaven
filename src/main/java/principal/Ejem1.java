package principal;
//Ejemplo con herencia
import javax.swing.*;
/**
 * clase Ejem1 de josema
 * @author josema
 *
 */
public  class Ejem1 extends JFrame {
// Constantes y componentes (objetos)
	/**
	 * constructor de Ejem1
	 */
public Ejem1(){
super("Ejemplo 00");
// Configurar Componentes ;
// Configurar Manejadores Eventos ;
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
// Terminar la aplicacion al cerrar la ventana.
/**
 * método main
 * @param args
 */
public static void main(String args[]){
Ejem1 aplicacion = new Ejem1();
}
}