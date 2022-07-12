import java.util.ArrayList;
import java.util.List;
public class App {
    /*
     * Criar uma função que receba uma lista de animais (espécie, isVoador) e uma função como parâmetro e retorne os animais que sabem voar ou não usando expressões lambda.
     */
    public static void main(String[] args) throws Exception {
        Animal animal1 = new Animal();
        animal1.setVoador(true);
        Animal animal2 = new Animal();
        animal2.setVoador(false);

        List<Animal> animais = new ArrayList<>();
        animais.add(animal1);
        animais.add(animal2);

        //Animais que voam
        System.out.println("Animais que voam: ");
        System.out.println(filtra(animais, Animal::isVoador));
        
        
    }

    public static List<Animal> filtra(List<Animal> animais, VerificaVoador verificador) {
        List<Animal> animaisFiltrados = new ArrayList<>();
        for (Animal animal : animais) {
            if (verificador.verificar(animal)) {
                animaisFiltrados.add(animal);
            }
        }
        return animaisFiltrados;
    }
}
