public class Main {
    public static void main(String[] args) {
        Animal[] animales = new Animal[]{
                new Perro("Bombom", 12, "Cony", "Pincher"),
                new Gato("Romeo", 5, "Estefania", false),
                new Ave("Lupe", 3, "Wilson", 350.0),
        };


        for(int i = 0; i<animales.length; i++){
            animales[i].imprimirFicha();
        }
        Perro perro =(Perro)animales[0];
        Gato gato = (Gato)animales[1];
        perro.registrarVacuna("vacuna 2");
        perro.registrarVacuna("vacuna 1");
        gato.registrarVacuna("vacuna 3");
        Clinica clinica = new  Clinica("Clinica","Cll 22 76");
        Asegurable[] asegurables = new Asegurable[]{
                perro,
                gato,
                clinica,
        };
        for(int i = 0; i<asegurables.length; i++){
            System.out.printf("Numero de poliza: %s \n", asegurables[i].obtenerNumeroPoliza());
            System.out.printf("Prima anual: %f \n", asegurables[i].calcularPrimaSeguro());
        }
    }
}