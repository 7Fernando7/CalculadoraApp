import java.util.Scanner;

public class CalculadoraApp {

    /** psvm tabulador para crear la clase main
     *  sout tabulador = System.out.println();
     * */

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while(true) {
            System.out.println("**** Aplicación Calculadora ****");
            System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    """);
            System.out.print("Operación a realizar?");
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //Revisar que este dentro de las operaciones mencionadas
                if (operacion >= 1 && operacion <= 4) {
                    System.out.print("Proporcione valor operando1: ");
                    var operando1 = Integer.parseInt(consola.nextLine());
                    System.out.print("Proporcione valor operando2: ");
                    var operando2 = Integer.parseInt(consola.nextLine());
                    int resultado;
                    switch (operacion) {
                        case 1 -> {
                            resultado = operando1 + operando2;
                            System.out.println("Resultado Suma: " + resultado);
                        }
                        case 2 -> {
                            resultado = operando1 - operando2;
                            System.out.println("Resultado Resta: " + resultado);
                        }
                        case 3 -> {
                            resultado = operando1 * operando2;
                            System.out.println("Resultado Multiplicación: " + resultado);
                        }
                        case 4 -> {
                            resultado = operando1 / operando2;
                            System.out.println("Resultado División: " + resultado);
                        }
                        default -> System.out.print("Operación no existe: " + operacion);
                    }
                } else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Operación no existe: " + operacion);
                }
                //Imprimimos un salto antes de repetir el ciclo
                System.out.println();
            } //Fin Try
            catch (Exception e){
                System.out.println("Ocorrio un error: " + e.getMessage());
            }//Fin catch
        }//Fin while
    }//Fin main
}//Fin clase
