import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresar la primera fecha
        int dia1 = scanner.nextInt();
        int mes1 = scanner.nextInt();
        int anio1 = scanner.nextInt();

        // Ingresar la segunda fecha
        int dia2 = scanner.nextInt();
        int mes2 = scanner.nextInt();
        int anio2 = scanner.nextInt();

        // Validar las fechas ingresadas
        if (!fechaValida(dia1, mes1, anio1) || !fechaValida(dia2, mes2, anio2)) {
            System.out.println("false");
            return;
        }

        // Calcular la diferencia en días
        int diferencia = diferenciaEnDias(dia1, mes1, anio1, dia2, mes2, anio2);
        System.out.println(diferencia);
    }

    // Método para verificar si una fecha es válida
    public static boolean fechaValida(int dia, int mes, int anio) {
        if (mes < 1 || mes > 12 || dia < 1 || dia > diasEnMes(mes, anio)) {
            return false;
        }
        return true;
    }

    // Método para obtener la cantidad de días en un mes
    public static int diasEnMes(int mes, int anio) {
        int[] diasPorMes = {31, 28 + esBisiesto(anio), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return diasPorMes[mes - 1];
    }

    // Método para verificar si un año es bisiesto
    public static int esBisiesto(int anio) {
        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    // Método para calcular la diferencia en días entre dos fechas
    public static int diferenciaEnDias(int dia1, int mes1, int anio1, int dia2, int mes2, int anio2) {
        int dias = 0;

        // Convertir ambas fechas a días desde el 1 de enero del año 0
        int fecha1 = diaANumero(dia1, mes1, anio1);
        int fecha2 = diaANumero(dia2, mes2, anio2);

        // Calcular la diferencia absoluta entre las dos fechas
        dias = Math.abs(fecha1 - fecha2);

        return dias;
    }

    // Método para convertir una fecha a días desde el 1 de enero del año 0
    public static int diaANumero(int dia, int mes, int anio) {
        int dias = 0;

        // Sumar días de años completos
        for (int i = 0; i < anio; i++) {
            dias += 365 + esBisiesto(i);
        }

        // Sumar días de meses completos
        for (int i = 1; i < mes; i++) {
            dias += diasEnMes(i, anio);
        }

        // Sumar días del mes actual
        dias += dia;

        return dias;
    }
}
