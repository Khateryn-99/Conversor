import Models.Currency;
import Models.Exchange;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // REFERENCIA AL CONVERTIDOR
        Exchange exchange = new Exchange();

        // PERSISTENCIA
        while (true) {
            // MENU
            System.out.println("Bienvenido al Convertidor de Moneda.\n" +
                    "Hecho por Jenny Duque\n");
            System.out.println("1) COP a USD\n" +
                    "2) ARS a BOB\n" +
                    "3) USD a ARS\n" +
                    "4) BRL a CLP\n" +
                    "5) BRL a COP\n" +
                    "6) CLP a ARS\n" +
                    "7) Salir");


            // OPCION A ELEGIR
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escriba la opcion de moneda a convertir: ");
            int option = scanner.nextInt();

            if (option == 7) {
                System.out.println("Gracias por utilizar el convertidor.\n" +
                        "La aplicación ha finalizado.");
                break;
            }

            // LLAMANDO CURRENCY
            double currencyAmount;

            // ACTIVACION DE OPCIONES
            switch (option) {
                case 1:
                    System.out.println("Ingrese la cantidad a convertir: ");
                    currencyAmount = scanner.nextDouble();
                    Currency currency1 = exchange.locateCurrency("COP/USD", currencyAmount);
                    System.out.println("La conversión de " + currencyAmount + " COP a USD es " + currency1.conversion_result());
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a convertir: ");
                    currencyAmount = scanner.nextDouble();
                    Currency currency2 = exchange.locateCurrency("ARS/BOB", currencyAmount);
                    System.out.println("La conversión de " + currencyAmount + " ARS a BOB es " + currency2.conversion_result());
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a convertir: ");
                    currencyAmount = scanner.nextDouble();
                    Currency currency3 = exchange.locateCurrency("USD/ARS", currencyAmount);
                    System.out.println("La conversión de " + currencyAmount + " USD a ARS es " + currency3.conversion_result());
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad a convertir: ");
                    currencyAmount = scanner.nextDouble();
                    Currency currency4 = exchange.locateCurrency("BRL/CLP", currencyAmount);
                    System.out.println("La conversión de " + currencyAmount + " BRL a CLP es " + currency4.conversion_result());
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad a convertir: ");
                    currencyAmount = scanner.nextDouble();
                    Currency currency5 = exchange.locateCurrency("BRL/COP", currencyAmount);
                    System.out.println("La conversión de " + currencyAmount + " BRL a COP es " + currency5.conversion_result());
                    break;
                case 6:
                    System.out.println("Ingrese la cantidad a convertir: ");
                    currencyAmount = scanner.nextDouble();
                    Currency currency6 = exchange.locateCurrency("CLP/ARS", currencyAmount);
                    System.out.println("La conversión de " + currencyAmount + " CLP a ARS es " + currency6.conversion_result());
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
                    break;
            }
        }
    }
}

