package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class App {

public static void main(String[] args) {

	Conta contaVagnerLima;
	Conta contaPedro;
	
	contaVagnerLima = new Conta();
	contaPedro = new Conta();
	
	// Conta do Vagner		
	contaVagnerLima.numero = "111-0";
	contaVagnerLima.titular = "Vagner Augusto dos Santos Lima";
	contaVagnerLima.tipo = "Corrente;";
	contaVagnerLima.ativa = true;
	contaVagnerLima.depositar(100);
	contaVagnerLima.consultarSaldo();
	contaVagnerLima.depositar(300);
	contaVagnerLima.consultarSaldo();
	contaVagnerLima.depositar(-50);
	contaVagnerLima.consultarSaldo();

	
	// Conta do Pedro	
	contaPedro.numero = "222-0";
	contaPedro.titular = "Pedro Cabral";
	contaPedro.tipo = "Poupan�a;";
	contaPedro.ativa = true;
	


	
}

		
		
		
	}