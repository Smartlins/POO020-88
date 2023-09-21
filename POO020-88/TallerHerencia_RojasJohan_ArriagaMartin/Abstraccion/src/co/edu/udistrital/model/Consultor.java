package co.edu.udistrital.model;

public class Consultor extends Empleado {
    private int a�osExperiencia;
    private int equiposDesarrolloLiderados;

    public Consultor(String nombre, int edad, String cedula, double salarioBase, int a�osExperiencia, int equiposDesarrolloLiderados) {
        super(nombre, edad, cedula, salarioBase);
        this.a�osExperiencia = a�osExperiencia;
        this.equiposDesarrolloLiderados = equiposDesarrolloLiderados;
    }

    @Override
    public double calcularBonificacion() {
        if (equiposDesarrolloLiderados > 8) {
            return salarioBase * 0.5; // 50% de bonificaci�n
        } else if (equiposDesarrolloLiderados > 5) {
            return salarioBase * 0.25; // 25% de bonificaci�n
        }
        return 0;
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

	public void aumentarSalario(double d) {
		// TODO Auto-generated method stub
		
	}

}
