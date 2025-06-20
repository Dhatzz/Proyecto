
package t1examen;
import java.util.Scanner;

public class T1examen {

    
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     
     System.out.println("Bienvenido a Matriculas UPN");
     System.out.println("Porfavor ingrese su nombre: ");
     String nombre =scanner.next();
     System.out.println("Ingrese sus apellidos: ");
     String apellido = scanner.next();
      System.out.println("Ingrese el ciclo (I, II, III, IV, V o superior): ");
     String ciclo = scanner.next();
    System.out.println("Ingrese su pensión anterior:");
    double pensionant = scanner.nextDouble();
    System.out.println("Ingrese el número de cursos que desea llevar:");
    int numcursos = scanner.nextInt();
    System.out.println("Ingrese su carrera");
    String carrera = scanner.next();
    System.out.println("Ingrese su promedio ponderado");
    double promediopon = scanner.nextDouble();
    
    Matricula matricula = new Matricula(nombre, apellido, ciclo, pensionant, numcursos, carrera, promediopon);

     double nuevaPension = matricula.CalcularPension(promediopon, pensionant);
        String turno = matricula.DeterminarTurno(ciclo);
        String local = matricula.CalcularLocal(carrera);
        int nuevosCursos = matricula.CalcularCursos(numcursos, promediopon, carrera);
      
      System.out.println("\n----- Resultado de la Matrícula -----");
        System.out.println("Nombre: " + matricula.getNombre() + " " + matricula.getApellido());
        System.out.println("Turno asignado: " + turno);
        System.out.println("Local asignado: " + local);
        System.out.println("Nueva pensión: S/ " + nuevaPension);
        System.out.println("Cantidad de cursos a llevar: " + nuevosCursos);
    }
    
}
