package factory;

public class FactoryLogistic {
	
    // El método Factory
    public static Transport createTransport(String tipo) {
        if ("TIERRA".equalsIgnoreCase(tipo)) return new Camion();
        if ("MAR".equalsIgnoreCase(tipo)) return new Barco();
        if ("AIRE".equalsIgnoreCase(tipo)) return new Avion();
        return null;
    }
	
    // Método Main dentro de la misma clase
    public static void main(String[] args) {
        System.out.println("Probando fábrica desde la propia clase...");

        Transport t1 = FactoryLogistic.createTransport("TIERRA");
        t1.entregar();

        // Probando el Barco
        Transport t2 = FactoryLogistic.createTransport("MAR");
        if (t2 != null) {
            t2.entregar();
        }

        // Caso no encontrado
        Transport t3 = FactoryLogistic.createTransport("AIRE");
        if (t3 != null) {
            t3.entregar();
        } else {
            System.out.println("Tipo de transporte 'AIRE' no encontrado.");
        }
    }
}
