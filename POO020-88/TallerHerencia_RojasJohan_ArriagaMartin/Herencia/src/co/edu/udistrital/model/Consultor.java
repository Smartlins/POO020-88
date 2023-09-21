package co.edu.udistrital.model;

public class Consultor extends Empleado {
    private int a�osExperiencia;
    private int equiposDesarrolloLiderados;

    public Consultor(String nombre, int edad, String cedula, double salario, int a�osExperiencia, int equiposDesarrolloLiderados) {
        super(nombre, edad, cedula, salario);
        this.a�osExperiencia = a�osExperiencia;
        this.equiposDesarrolloLiderados = equiposDesarrolloLiderados;
    }

	public int getA�osExperiencia() {
		return a�osExperiencia;
	}

	public void setA�osExperiencia(int a�osExperiencia) {
		this.a�osExperiencia = a�osExperiencia;
	}

	public int getEquiposDesarrolloLiderados() {
		return equiposDesarrolloLiderados;
	}

	public void setEquiposDesarrolloLiderados(int equiposDesarrolloLiderados) {
		this.equiposDesarrolloLiderados = equiposDesarrolloLiderados;
	}

	@Override
	public String toString() {
		return "Consultor [a�osExperiencia=" + a�osExperiencia + ", equiposDesarrolloLiderados="
				+ equiposDesarrolloLiderados + "]";
	}

	public void aumentarSalario(double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calcularBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

}
