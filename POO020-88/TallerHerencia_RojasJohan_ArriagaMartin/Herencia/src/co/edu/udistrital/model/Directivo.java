package co.edu.udistrital.model;

public class Directivo extends Empleado {
    private int a�osExperiencia;
    private String areaEncargada;

    public Directivo(String nombre, int edad, String cedula, double salario, int a�osExperiencia, String areaEncargada) {
        super(nombre, edad, cedula, salario);
        this.a�osExperiencia = a�osExperiencia;
        this.areaEncargada = areaEncargada;
    }

	public int getA�osExperiencia() {
		return a�osExperiencia;
	}

	public void setA�osExperiencia(int a�osExperiencia) {
		this.a�osExperiencia = a�osExperiencia;
	}

	public String getAreaEncargada() {
		return areaEncargada;
	}

	public void setAreaEncargada(String areaEncargada) {
		this.areaEncargada = areaEncargada;
	}

	@Override
	public String toString() {
		return "Directivo [a�osExperiencia=" + a�osExperiencia + ", areaEncargada=" + areaEncargada + "]";
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
