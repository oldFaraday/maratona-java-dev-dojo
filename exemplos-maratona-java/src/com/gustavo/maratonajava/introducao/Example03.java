/*
Prática

Crie variáveis para os campos descritos abaixo entre e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>

*/

package com.gustavo.maratonajava.introducao;

public class Example03 {
    static void main(String[] args) {
        //Variables
        String name = "Gustavo";
        String address = "Rua dos Limoeiros, Nº4";
        double wage = 2800.00;
        String date = "30/10/2026";

        //Print
        System.out.println("Eu " + name + ", morando no endereço " + address + ", confirmo que recebi o salário de " + wage + ", na data " +date+ ".");
    }
}