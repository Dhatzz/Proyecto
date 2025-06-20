
package t1examen;

public class Matricula {
    private String nombre;
    private String apellido;
    private String ciclo;
    private double pensionant;
    private int numcursos;
    private String carrera;
    private double promediopon;

    public Matricula(String nombre, String apellido, String ciclo, double pensionant, int numcursos, String carrera, double promediopon) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciclo = ciclo;
        this.pensionant = pensionant;
        this.numcursos = numcursos;
        this.carrera = carrera;
        this.promediopon = promediopon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public double getPensionant() {
        return pensionant;
    }

    public void setPensionant(double pensionant) {
        this.pensionant = pensionant;
    }

    public int getNumcursos() {
        return numcursos;
    }

    public void setNumcursos(int numcursos) {
        this.numcursos = numcursos;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromediopon() {
        return promediopon;
    }

    public void setPromediopon(double promediopon) {
        this.promediopon = promediopon;
    }
    
    // Métodos
    
    public double CalcularPension(double promediopon, double pensionant){
       if (promediopon > 18.5) {
        return pensionant * 0.85;
        } else if (promediopon > 16.5) {
        return pensionant * 0.90;
        } else if (promediopon > 14.5) {
        return pensionant;
        } else {
        return pensionant * 1.20;
         }     
    }
    
    public String DeterminarTurno(String ciclo){
       if(ciclo.equals("I") || ciclo.equals("II")) {
        return "Mañana";
    } else if (ciclo.equals("III") || ciclo.equals("IV")) {
        return "Tarde";
    } else {
        return "Noche";
    }
           
     }
    public String CalcularLocal(String carrera) {
      if (carrera.equalsIgnoreCase("Ingeniería de Sistemas Computacionales")) {
        return "San Isidro";
         } else if (carrera.equalsIgnoreCase("Administración") || carrera.equalsIgnoreCase("Contabilidad")) {
        return "Av. Ejército";
        } else {
        return "Virtualidad";
        }
    }
    
    public int CalcularCursos(int numcursos, double promediopon, String carrera) {
    if (carrera.equalsIgnoreCase("Derecho")) {
        return 5;
    }

    if (numcursos == 4 && promediopon > 16) {
        return numcursos + 1;
    }

    if (numcursos == 6 && promediopon <= 14.5) {
        return numcursos - 2;
    }

    return numcursos;
    }   
    
    
}

