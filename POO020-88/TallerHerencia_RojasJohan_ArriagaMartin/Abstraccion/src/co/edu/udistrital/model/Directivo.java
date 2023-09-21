package co.edu.udistrital.model;

public class Directivo extends Empleado {
    private int a�osExperiencia;
    private String areaEncargada;

    public Directivo(String nombre, int edad, String cedula, double salarioBase, int a�osExperiencia, String areaEncargada) {
        super(nombre, edad, cedula, salarioBase);
        this.a�osExperiencia = a�osExperiencia;
        this.areaEncargada = areaEncargada;
    }

    @Override
    public double calcularBonificacion() {
        if (a�osExperiencia > 12) {
            return salarioBase * 0.5; // 50% de bonificaci�n
        } else if (a�osExperiencia > 8) {
            return salarioBase * 0.3; // 30% de bonificaci�n
        }
        return 0;
    }

	public int getA�osExperiencia() {
		return a�osExperiencia;
	}

	public void setAniosExperiencia(int a�osExperiencia) {
		this.a�osExperiencia = a�osExperiencia;
	}

	public String getAreaEncargada() {
		return areaEncargada;
	}

	public void setAreaEncargada(String areaEncargada) {
		this.areaEncargada = areaEncargada;
	}

	public void aumentarSalario(double d) {
		// TODO Auto-generated method stub
		
	}
    
}
