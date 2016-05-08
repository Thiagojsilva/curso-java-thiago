package com.excript.entradaesaida; 
import java.util.Scanner;

public class EntradaeSaida { public static void main(String[] args){
	System.out.println("Contas de multiplicação. escolha um numero e multiplique por 9: ");
	Scanner in = new Scanner(System.in);
	int Contadevezes = in.nextInt();
	Contadevezes = Contadevezes * 9;
	System.out.println("Sua conta deu " + Contadevezes + " é isso ai");
}

}
