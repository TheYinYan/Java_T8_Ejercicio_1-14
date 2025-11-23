public class Mates {
    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    /**
     * Dada una base y un exponente devuelve la potencia.
     * 
     * @param base      de la potencia
     * @param exponente de la potencia
     * @return Potencia
     */
    public static int potencia(int base, int exponente) {
        int num = base;
        for (int i = 1; i <= exponente; i++) {
            if (i == 1)
                num = base;
            else
                num = num * base;
        }
        return num;
    }

    /**
     * Devuelve verdadero si el número que se pasa como parámetro es capicúa
     * y falso en caso contrario.
     * 
     * @param num Numero
     * @return True o False
     */
    public static boolean esCapicua(int num) {
        boolean capicua = false;
        if (num == voltear(num))
            capicua = true;
        return capicua;
    }

    /**
     * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
     * 
     * @param num Numero
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
     * @param num Numero
     * @return True o False
     */
    public static boolean esPrimo(int num) {
        boolean primo = true;
        if (num == 1)
            primo = false;
        for (int i = 2; i < num; i++) {
            if ((double) (num % i) == 0)
                primo = false;
        }
        return primo;
    }

    /**
     * Le quita a un número n dígitos por detrás (por la derecha).
     * 
     * @param num     Numero
     * @param digitos a quitar
     * @return Numeros con los digitos quitados
     */
    public static int quitaPorDetras(int num, int digitos) {
        for (int i = 0; i < digitos; i++) {
            num /= 10;
        }
        return num;
    }

    /**
     * Le quita a un número n dígitos por delante (por la izquierda).
     * 
     * @param num Numero
     * @param digito a quitar
     * @return Numeros con los digitos quitados
     */
    public static int quitaPorDelante(int num, int digito) {
        int digitoTotal = digitos(num);
        return num % (int) Math.pow(10, digitoTotal - digito);
    }

    /**
     * Da la posición de la primera ocurrencia de un dígito dentro de un número
     * entero.
     * Si no se encuentra, devuelve -1.
     * 
     * @param num    Numero
     * @param digito del numero
     * @return Posición del digito o -1 si digito no esta en el numero
     */
    public static int posicionDeDigito(int num, int digito) {
        int posicion = 1;
        int voteado = voltear(num);
        boolean correcto = false;
        while (voteado > 0 && !correcto) {
            int digitos = voteado % 10;
            if (digitos == digito)
                correcto = true;
            else
                posicion++;
            voteado /= 10;
        }
        if (!correcto)
            posicion = -1;
        return posicion;
    }

    /**
     * Devuelve el dígito que está en la posición n de un número entero.
     * Se empieza contando por el 0 y de izquierda a derecha.
     * 
     * @param num      Numero
     * @param posicion del numero
     * @return Digito en la posición del numero
     */
    public static int digitoN(int num, int posicion) {
        int digito = 0;
        int voteado = voltear(num);
        for (int i = 0; i < digitos(num); i++) {
            if (i == posicion)
                digito = voteado % 10;
            voteado /= 10;
        }
        return digito;
    }

    /**
     * Le da la vuelta a un número
     * 
     * @param num Numero
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
     * @param num Numero
     * @return Cantidad de digitos
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
}
