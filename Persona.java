public class Persona implements Pesable {

    //Es el metodo que quiero implementar
    //La diferencia entre la interfaz y la herencia, es que aca no tengo forzada una herencia
    //Entonces para no crear clases extra como Pesable y que si tuviera herencia si o si las clases hijas la tienen que usar, uso la interfaz Pesable para la clase que yo quiera que implemente estos metodos
    //A la clase que le estoy implementando la interfaz, tiene que usar la interfaz completa, usar todos los metodos que esta tenga sino da error
private int peso;

    public Persona(int peso) {
        this.peso = peso;
    }

    public int cualEsTuPeso() {
        return peso;
    }

    @Override
    public String cualEsTuUnidadDePeso() {
        return "Kg";
    }

}
