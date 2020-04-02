package util;

public class Administrador extends Usuario{
   public void sairSala(Sala sala){
      System.out.println("O administrador tem uma implementação diferente pois se ele estiver saindo da sala que ele criou tautomaticamente a administração da sala passa para outro usuário presente na sala");
   }
   public void removeSala(Sala sala){
      System.out.println("Remover sala é difenrente de sair da sala visto q este será o método chamado caso  o usuário administrador queira excluir alguma de suas salas do sistema");
   }
   public void addUsuario(Sala sala, Usuario usuario){
      System.out.println("Após uma validação se realmente o usuário é administrador da sala que ele passou como parâmetro então é adicionado o usuário passado como parâmetro da sala");
   }
   public void removeUsuario(Sala sala, Usuario usuario){
      System.out.println("Após uma validação se realmente o usuário é administrador da sala que ele passou como parâmetro então é removido o usuário passado como parâmetro da sala");
   }
}