package ProgramacaoOrientadaObjetoSalarioFuncionario;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario funcionario = new Funcionario ();
		
		System.out.print("Nome: ");
		funcionario.Nome = sc.nextLine();
		
		System.out.print("Salario Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		funcionario.Imposto = sc.nextDouble();
		
		
		funcionario.SalarioLiquido();
		
		System.out.println( "Nome: " + funcionario.Nome + " , Salario Liquido R$ " +  funcionario.SalarioLiquido());
		
		System.out.print("Procentagem de Ajuste Salarial: ");
		
		funcionario.porcentagemAjuste = sc.nextDouble();
		funcionario.SalarioAjustado();
		
		System.out.println( "Nome: " + funcionario.Nome + " , Salario Liquido R$ " +  funcionario.SalarioAjustado());
		
		
		sc.close();
		
		
		/*
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			Employee emp = new Employee();
			System.out.print("Name: ");
			
			emp.name = sc.nextLine();
			System.out.print("Gross salary: ");
			
			emp.grossSalary = sc.nextDouble();
			System.out.print("Tax: ");
			e
			mp.tax = sc.nextDouble();
			System.out.println();
			System.out.println("Employee: " + emp);
			System.out.println();
			System.out.print("Which percentage to increase salary? ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
			System.out.println();
			System.out.println("Updated data: " + emp);
			sc.close();
			}
		*/

	}

}
