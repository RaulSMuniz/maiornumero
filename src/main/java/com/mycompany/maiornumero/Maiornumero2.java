/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maiornumero;

public class Maiornumero2 {
    public double num1, num2, num3, maior;
    public double numeros(){
        // verifica se num1 é maior que num2
        if (num1 > num2){
            if (num1 > num3){ // verifica se num1 é maior que num3
                maior = num1;
            } else{ // se num1 é menor que num3, num3 é o maior
                maior = num3;
            }
        } else if (num2 > num3){ // se num1 for menor que num2, verifica se num2 é maior que num3
            maior = num2;
        } else { // se num2 for menor que num3, num3 é maior
            maior = num3;
        }
    return maior;
    }
    public void print(){
        numeros();
        System.out.println("O maior número é: "+maior);
    }
}

