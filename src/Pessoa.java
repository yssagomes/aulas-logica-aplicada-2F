import org.w3c.dom.ls.LSOutput;

public class Pessoa extends Animal {
    //Atributos de classe (definem a forma
    //
    String sobrenome;

    //Método da classe (comportamento
    //Dentro de um método teremos um algoritmo
    public void falar() {
        System.out.println("falei");
    }

    public String falar(String volume) {
        return "falei" + volume;
    }

    public void comer(){
        System.out.println("animal comeu");
    }
}


