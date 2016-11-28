package controller;
import model.*;

public class Cadastro {

	public static void main(String[] args) {
		/*Carro car = new Carro();
		car.ano="1998";
		car.fabricante="VolksWagen";
		car.cor="Vermelho";
		car.modelo="Golf MKII";
		System.out.println(car.ano);
		
		Carro car1 = new Carro();
		car1.ano="1997";
		car1.cor="Amarelo";
		car1.fabricante="Fiat";
		car1.modelo="Uno";
		System.out.println(car1.ano);
		*/
		
		Funcionario func1 = new Funcionario();
		Funcionario func2 = new Funcionario();
		Funcionario func3 = new Funcionario();
		
		func1.matricula = 1;
		func2.matricula = 2;
		func3.matricula = 3;
		
		System.out.println(func1.matricula);
		System.out.println(func2.matricula);
		System.out.println(func3.matricula);
	}

}
