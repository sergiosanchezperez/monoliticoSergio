
import java.util.Scanner;

/**
 * @author sergio sanchez perez
 * @version 1.0 8/3/2016
 * un juego que genera un numero aleatorio y el usuario debe introducir numeros
 * para averiguarlo en el menor numero de intentos posibles
 */
public class Aciertos {

    public static void main(String[] args) {
        int n = 0,cont = 0;
        int x = (int) (500 *Math.random());
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {
            pideNumero();
            n = sc.nextInt();
            cont++;
            
        } while (compara(n,x)==false);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );

    }
/**
 * metodo que imprime el texto para que el usuario intrudozca el numero
 */

	private static void pideNumero() {
		System.out.print("\nIntroduce el valor de X: ");
	}
	
	/**
	 * metodo que compara el valor aleatorio con el introducido por el usuario
	 * 
	 * @param n valor del usuario
	 * @param x valor aleatorio
	 * @return devuelve false si son numeros distintos
	 * devuelve true si son valores iguales
	 */
	private static boolean compara(int n, int x){
	
			    if (n > x) {
	                System.out.print("Te pasaste Amigo");
	                return false;
	            } else if (n < x){
	                System.out.print("Casi cerca ...");
	                return false;
	            }
			
		return true;
	}
	
}