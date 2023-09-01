package ProgramacaoOrientadaObjetoSalarioFuncionario;

public class Funcionario {

	public String Nome;
	public double salarioBruto;
	public double Imposto;
	public double porcentagemAjuste;
	
	public double SalarioLiquido () {
		return salarioBruto - Imposto;
		
	}
	
	public double SalarioAjustado () {
		return (salarioBruto * porcentagemAjuste / 100) + salarioBruto - Imposto;
		
	}
	
}
/*
package entities;
public class Employee {
public String name;
public double grossSalary;
public double tax;
public double netSalary() {
return grossSalary - tax;
}
public void increaseSalary(double percentage) {
grossSalary += grossSalary * percentage / 100.0;
}
public String toString() {
return name + ", $ " + String.format("%.2f", netSalary());
}
}
*/
