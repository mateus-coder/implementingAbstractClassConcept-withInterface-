package util;

public class Sala implements Customizavel{
   private Administrador administrador;
   private Usuario [] usuarios;
   private int id;
   private boolean modoNoturno;
   
   public Sala(){
      this.modoNoturno = false;
   }
   
   public void alterarModo(){
      System.out.println("Alterar modo!!!");
      this.modoNoturno = true;
   }
   public void editarConfiguracoes(){
      System.out.println("Editar Configurações!!!");
   }
   public void editarDados(){
      System.out.println("Editar Dados!!!");
   }
   public static void main(String [] args){
      Sala sala = new Sala();
      sala.alterarModo();
      System.out.println("modo noturno ? " + sala.modoNoturno);
   }
}