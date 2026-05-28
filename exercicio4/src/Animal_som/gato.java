package Animal_som;

public class gato extends Animal{
   private String nome;

   public gato(String nome, String som){
       super(som);
       this.nome=nome;

   }
   public String getnome(){
       return nome;
   }
   public void setnome(String nome){
       this.nome=nome;
   }
   @Override
    public void exibirsom(){
       System.out.println("nome do gato: " + getnome());
       System.out.println("som do gato: "+ super.getSom());
   }

}
