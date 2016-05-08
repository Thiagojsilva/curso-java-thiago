package com.excript.contas;
import java.util.Scanner;

public class Contas {
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	double  num1, num2, soma, subtracao;
	System.out.println("Qual o valor? ");
	num1=in.nextDouble();
	System.out.println("Mais um numero ");
	num2=in.nextDouble();
	soma=num1+num2;
	System.out.println("Somando da: "+ soma);
	subtracao=num1-num2;
	System.out.println("Subtraindo deu: "+ subtracao);
	
}

}
