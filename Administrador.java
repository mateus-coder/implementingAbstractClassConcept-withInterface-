package util;

public class Administrador extends Usuario{
   public void sairSala(Sala sala){
      System.out.println("O administrador tem uma implementa��o diferente pois se ele estiver saindo da sala que ele criou tautomaticamente a administra��o da sala passa para outro usu�rio presente na sala");
   }
   public void removeSala(Sala sala){
      System.out.println("Remover sala � difenrente de sair da sala visto q este ser� o m�todo chamado caso  o usu�rio administrador queira excluir alguma de suas salas do sistema");
   }
   public void addUsuario(Sala sala, Usuario usuario){
      System.out.println("Ap�s uma valida��o se realmente o usu�rio � administrador da sala que ele passou como par�metro ent�o � adicionado o usu�rio passado como par�metro da sala");
   }
   public void removeUsuario(Sala sala, Usuario usuario){
      System.out.println("Ap�s uma valida��o se realmente o usu�rio � administrador da sala que ele passou como par�metro ent�o � removido o usu�rio passado como par�metro da sala");
   }
}