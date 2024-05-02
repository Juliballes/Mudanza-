public class Mueble implements Medible, Pesable {//Aca le estoy implementando las 2 interfaces pq en este caso necesito las 2
    //Le tengo que implementar todos los metodos que usen ambas interfaces
private int peso;
private int medida;

    public Mueble(int peso, int medida) {
        this.peso = peso;
        this.medida = medida;
    }

    @Override
    public int cualEsTuMedida() {
        return medida;
    }

    @Override
    public int cualEsTuPeso() {
        return peso;
    }

    @Override
    public String cualEsTuUnidadDePeso() {
        return "Kg";
    }
}
