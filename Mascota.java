public class Mascota implements Pesable {
private int peso;

    public Mascota(int peso) {
        this.peso = peso;
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

