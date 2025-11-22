public class App {
    /**
     * Devuelve verdadero si el número que se pasa como parámetro es capicúa
     * y falso en caso contrario.
     * 
     * @param num --> Numero
     * @return True o False
     */
    public static boolean esCapicua(int num) {
        boolean capicua = false;
        if (num == voltear(num)) {
            capicua = true;
        }
        return capicua;
    }

    /**
     * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
     * 
     * @param num --> Numero
     * @return El siguente primo
     */
    public static int siguientePrimo(int num) {
        int nextPrimo = num + 1;
        while (esPrimo(nextPrimo) == false) {
            nextPrimo++;
        }
        return nextPrimo;
    }

    /**
     * Devuelve verdadero si el número que se pasa como parámetro es primo y falso
     * en caso contrario
     * 
     * @param num --> Numero
     * @return True o False
     */
    public static boolean esPrimo(int num) {
        boolean primo = true;
        if (num == 1) {
            primo = false;
        }
        for (int i = 2; i < num; i++) {
            if ((double) (num % i) == 0) {
                primo = false;
            }
        }
        return primo;
    }

    /**
     * Le da la vuelta a un número
     * 
     * @param num --> Numero
     * @return Numero volteado
     */
    public static int voltear(int num) {
        int voltear = 0;
        int digitos = digitos(num);
        while (digitos > 0) {
            int digito = num % 10;
            voltear = voltear * 10 + digito;
            num /= 10;
            digitos--;
        }
        return voltear;
    }

    /**
     * Cuenta el número de dígitos de un número entero.
     * 
     * @param num --> Numero
     * @return Numero de digitos
     */
    public static int digitos(int num) {
        num = num * 10 + 1;
        int digitos = 0;
        while (num > 0) {
            digitos++;
            num /= 10;
        }
        digitos--;
        return digitos;
    }

    public static void main(String[] args) throws Exception {
        boolean salir = false;
        do {
            System.out.println("""

                    0. Salir
                    1. digitos
                    2. Voltea
                    3. esCapicua
                    4. esPrimo
                    5. siguientePrimo
                    6. 
                    """);
            int opcion = Integer.parseInt(System.console().readLine("Opción "));
            int num = Integer.parseInt(System.console().readLine("Introduzca numero "));

            switch (opcion) {
                case 0:
                    salir = true;
                    break;

                case 1:
                    System.out.printf("El numero %d tiene %d dígito/s%n", num, digitos(num));
                    break;

                case 2:
                    System.out.printf("El %d volteado es %d%n", num, voltear(num));
                    break;

                case 3:
                    System.out.printf("El %d%s es capicua%n", num, ((esCapicua(num)) ? "" : " no"));
                    break;

                case 4:
                    System.out.printf("El %d%s es primo%n", num, ((esPrimo(num)) ? "" : " no"));
                    break;

                case 5:
                    System.out.printf("El siguiente primo mayor a %d es %d%n", num, siguientePrimo(num));
                    break;

                case 6:
                    break;

                case 7:
                    break;

                case 8:
                    break;

                case 9:
                    break;

                case 10:
                    break;

                case 11:
                    break;

                case 12:
                    break;

                case 13:
                    break;

                case 14:
                    break;
                
                default:
                    System.out.println("Introduce una opcion correcta");
                    break;
            }
        } while (!salir);

    }
}
