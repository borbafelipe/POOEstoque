import Produto.Enum.Disponibilidade;
import Produto.Vestuario.Vestuario;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("---------------------------------------");

        Vestuario vestuario = new Vestuario(1, "Camiseta", "Camiseta de algodão", 50, Disponibilidade.DISPONIVEL, "123456789");

        System.out.println(vestuario.toString());

        System.out.println("---------------------------------------");
        vestuario.setQuantidadeTamanhoPP(10);
        System.out.println("---------------------------------------");
        System.out.println("Depois de definir a quantidade inicial de PP: " + vestuario.toString());

        System.out.println("---------------------------------------");
        vestuario.addTamanhoPP(5);
        System.out.println("---------------------------------------");
        System.out.println("Depois de adicionar quantidade ao tamanho PP: " + vestuario.toString());
        System.out.println("---------------------------------------");
       
        vestuario.removeTamanhoPP(3);
        System.out.println("---------------------------------------");
        System.out.println("Depois de remover quantidade do tamanho PP: " + vestuario.toString());
        System.out.println("---------------------------------------");

       
        System.out.println("ID: " + vestuario.getId());
    }
}
