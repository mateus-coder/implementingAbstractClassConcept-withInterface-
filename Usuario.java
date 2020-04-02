package util;

public abstract class Usuario{
   private String apelido;
   private String senha;
   private String email;
   private boolean premium;
   private Sala [] salas;
   
   public abstract void sairSala(Sala sala);
   
   public void entrarSala(Sala sala){
      System.out.println("Entrando na sala !!");
   }
   public Sala buscarSala(int id){
      System.out.println("Buscando sala !!");
      return new Sala();
   }
   public void criarSala(){
      System.out.println("Criando sala !!");
   }
}