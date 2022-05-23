package br.com.dio.javafundamental.exerciciometodos3;

import static br.com.dio.javafundamental.exerciciometodos3.SobrecargaReturn.area;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculo da area de uma circuferência: ");
        double areaCircuferencia = area(5);
        System.out.printf("A area dessa circuferência será: %.2f cm\n\n", areaCircuferencia);

        System.out.println("Calculo de um Retangulo: ");
        double areaRetangulo = area(5d,8d);
        System.out.printf("A area desse retangulo será de: %.2f cm\n\n",areaRetangulo);

        System.out.println("Calculo da area de um triângulo: ");
        double areaTrigangulo = area(6f,7d);
        System.out.printf("A area desse triângulo será de: %.2f cm\n\n",areaTrigangulo);

        System.out.println("Calculo da area de um paralelogramo");
        double areaParalelogramo = area(5d,9f);
        System.out.printf("A area desse paralelogramo será de: %.2f cm\n",areaParalelogramo);
    }
}
