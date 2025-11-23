public class App {
    public static void main(String[] args) throws Exception {
        boolean salir = false;
        do {
            System.out.println("""

                    Elige una opción

                    0.  Salir
                    1.  Digitos
                    2.  Voltea
                    3.  esCapicua
                    4.  esPrimo
                    5.  siguientePrimo
                    6.  Potencia
                    7.  digitoN
                    8.  posicionDeDigito
                    9.  quitaPorDetras
                    10. quitaPorDelante
                    11. pegaPorDetras
                    12. pegaPorDelante
                    13. trozoDeNumero
                    14. juntaNumeros
                    """);
            int opcion = Integer.parseInt(System.console().readLine("Opción "));
            int num = 0;
            int num2 = 0;
            int num3 = 0;

            if (opcion > 0 && opcion <= 14) num = Integer.parseInt(System.console().readLine("Introduzca numero "));

            if (opcion == 6 || opcion == 7 || opcion == 8 || opcion == 9 || opcion == 10 || opcion == 11 || opcion == 12 || opcion == 13 || opcion == 14)
                num2 = Integer.parseInt(System.console().readLine("Introduzca otro numero "));

            if (opcion == 13) num3 = Integer.parseInt(System.console().readLine("Introduzca otro numero más "));

            switch (opcion) {
                case 0:
                    salir = true;
                    Mates.limpiarPantalla();
                    break;

                case 1:
                    System.out.printf("El numero %d tiene %d dígito/s%n", num, Mates.digitos(num));
                    break;

                case 2:
                    System.out.printf("El %d volteado es %d%n", num, Mates.voltear(num));
                    break;

                case 3:
                    System.out.printf("El %d%s es capicua%n", num, ((Mates.esCapicua(num)) ? "" : " no"));
                    break;

                case 4:
                    System.out.printf("El %d%s es primo%n", num, ((Mates.esPrimo(num)) ? "" : " no"));
                    break;

                case 5:
                    System.out.printf("El siguiente primo mayor a %d es %d%n", num, Mates.siguientePrimo(num));
                    break;

                case 6:
                    System.out.printf("%d^%d = %d%n", num, num2, Mates.potencia(num, num2));
                    break;

                case 7:
                    System.out.printf("En la posición %d del numero %d esta el %d%n", num2, num,
                            Mates.digitoN(num, num2));
                    break;

                case 8:
                    System.out.printf("En el %d, el dígito %d está en la posición %d", num, num2,
                            Mates.posicionDeDigito(num, num2));
                    break;

                case 9:
                    System.out.printf("Si el %d, se le quita por detras %d dígito , se queda como %d%n", num, num2,
                            Mates.quitaPorDetras(num, num2));
                    break;

                case 10:
                    System.out.printf("Si el %d, se le quita por delante %d dígito , se queda como %d%n", num, num2,
                            Mates.quitaPorDelante(num, num2));
                    break;

                case 11:
                    System.out.printf("Si al %d le pegas por detras el %d da el %d%n", num, num2,
                            Mates.pegaPorDetras(num, num2));
                    break;

                case 12:
                    System.out.printf("Si al %d le pegas por delante el %d da el %d%n", num, num2,
                            Mates.pegaPorDelante(num, num2));
                    break;

                case 13:
                    System.out.printf("Al %d le cojo el trozo que va de la posición %d a la %d : %d%n", num, num2,num3,
                            Mates.trozoDeNumero(num, num2,num3));
                    break;

                case 14:
                    System.out.printf("Juntando el %d y el %d da el %d",num,num2,Mates.juntaNumeros(num, num2));
                    break;

                default:
                    System.out.println("Introduce una opción correcta");
                    break;

            }
        } while (!salir);

    }
}