// Clase Test - Clase principal para ejecutar el programa
public class Test {
    public static void main(String[] args) {
        // Crear un estudiante
        Estudiante estudiante1 = new Estudiante("Juan", "Pérez", 20);
        estudiante1.setCodigo("EST001");
        
        // Agregar algunas notas
        estudiante1.agregarNota(15.5);
        estudiante1.agregarNota(18.0);
        estudiante1.agregarNota(16.5);
        
        // Mostrar información del estudiante
        System.out.println("=== INFORMACIÓN DEL ESTUDIANTE ===");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Apellido: " + estudiante1.getApellido());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Código: " + estudiante1.getCodigo());
        System.out.println("Cantidad de notas: " + estudiante1.getCantidadNotas());
        System.out.println("Promedio: " + estudiante1.calcularPromedio());
        
        // Mostrar todas las notas
        System.out.println("\n=== NOTAS ===");
        double[] notas = estudiante1.getNotas();
        for (int i = 0; i < estudiante1.getCantidadNotas(); i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
    }
}

// Clase Estudiante
class Estudiante {
    // Atributos privados
    private String nombre;
    private String apellido;
    private int edad;
    private String codigo;
    private double[] notas;
    private int cantidadNotas;

    // Constructor
    public Estudiante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.codigo = "";
        this.notas = new double[5]; // Máximo 5 notas
        this.cantidadNotas = 0;
    }

    // Métodos getter
    public String getNombre() { 
        return nombre; 
    }
    
    public String getApellido() { 
        return apellido; 
    }
    
    public int getEdad() { 
        return edad; 
    }
    
    public String getCodigo() { 
        return codigo; 
    }
    
    public double[] getNotas() { 
        return notas; 
    }
    
    public int getCantidadNotas() { 
        return cantidadNotas; 
    }

    // Métodos setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    // Método para agregar nota
    public void agregarNota(double nota) {
        if (cantidadNotas < 5) {
            notas[cantidadNotas] = nota;
            cantidadNotas++;
        } else {
            System.out.println("No se pueden agregar más notas. Máximo 5 notas.");
        }
    }

    // Método para calcular promedio
    public double calcularPromedio() {
        if (cantidadNotas == 0) return 0;
        
        double suma = 0;
        for (int i = 0; i < cantidadNotas; i++) {
            suma += notas[i];
        }
        return suma / cantidadNotas;
    }
}