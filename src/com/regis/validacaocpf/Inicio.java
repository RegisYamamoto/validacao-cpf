package com.regis.validacaocpf;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String CPF;

		System.out.printf("Informe um CPF: ");
		CPF = ler.next();

		System.out.printf("\nResultado: ");
		// usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
		if (ValidaCpf.isCPF(CPF) == true)
			System.out.printf("%s\n", ValidaCpf.imprimeCPF(CPF) + " válido");
		else
			System.out.printf("Erro, CPF invalido !!!\n");
	}

}