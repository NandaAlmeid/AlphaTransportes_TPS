public class Cartao_de_credito {
 private int cvv; 
   private String nome_do_titular; 
   private String senha; 

   public int getCvv(){
      return this.cvv;
   }
   public void setCvv(int cvv){
     this.cvv = cvv; 
   }
   public String getNome_do_titular(){
    return this.nome_do_titular;
   }
   public void setNome_do_titular(String nome_do_titular){
    this.nome_do_titular = nome_do_titular;; 
   }
   public String getSenha(){
     return this.senha;
   }
   public void setSenha(String senha){
    this.senha = senha; 
   }
   

}

