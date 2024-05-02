public class Main {
    public static void main(String[] args) {

        //Crear Persona
        Persona julieta = new Persona(56);
        //Obtener el peso de julieta
        int pesoJulieta = julieta.cualEsTuPeso();
        System.out.println("El peso de julieta es: "+ pesoJulieta);
        //Obtener la unidad de peso
        String unidadPesoJulieta = julieta.cualEsTuUnidadDePeso();
        System.out.println("La unidad de peso de julieta es: "+ unidadPesoJulieta);
        //resultado:
        //El peso de julieta es: 56
        //La unidad de peso de julieta es: Kg

        //Crear Mueble
        Mueble silla = new Mueble(110,75);
        int pesoSilla = silla.cualEsTuPeso();
        System.out.println("El peso de la silla es: " + pesoSilla);
        String unidadPesoSilla = silla.cualEsTuUnidadDePeso();
        System.out.println("La unidad de peso de la silla es: "+ unidadPesoSilla);


    }










}