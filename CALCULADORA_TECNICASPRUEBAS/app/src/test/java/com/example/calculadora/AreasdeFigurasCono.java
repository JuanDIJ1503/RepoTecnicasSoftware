package com.example.calculadora;

public class AreasdeFigurasCono {

    public static void main(String[] args) {
        // Ejemplo de cálculo de área de un cono
        double radio = 3.0;
        double generatriz = 5.0;

        // Calcular área total del cono
        double areaTotalCono = calcularAreaTotalCono(radio, generatriz);
        System.out.println("El área total del cono con radio " + radio + " y generatriz " + generatriz +
                " es: " + areaTotalCono);
    }

    // Método para calcular el área total de un cono
    public static double calcularAreaTotalCono(double radio, double generatriz) {
        double areaLateral = Math.PI * radio * generatriz;
        double areaBase = Math.PI * radio * radio;
        return areaLateral + areaBase;
    }
}
