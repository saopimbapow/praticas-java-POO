package VerificarSenha;
import java.util.regex.Pattern;

public class Senha {
    private String senha;
    public boolean verificar = false;
    public boolean verificar2 = false;
    public boolean verificar3 = false;
    public boolean verificar4 = false;

    public Senha() {
        this.senha = " ";
    }
    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    public void mostarSenha(){
        System.out.println("senha: " + senha);
    }
    public void verificarSenha(){


        if(senha.length() < 6){
            System.out.println("Senha deve ter no minimo 6 caracteres ❌");
        }
        else{
            System.out.println("Possui mais de 6 caracteres ✅ ");
        }
        for(int i=0; i< senha.length(); i++){
            if(Character.isUpperCase(senha.charAt(i))){
                verificar = true;
            }
            if(Character.isLowerCase(senha.charAt(i))){
                verificar2 = true;

            }
            if(Character.isDigit(senha.charAt(i))){
                verificar3 = true;
            }
            if(Character.isLetterOrDigit(senha.charAt(i))){
                verificar4 = true;
            }
        }
        if(verificar){
                System.out.println("Possui um caracter maiusculo ✅ ");
            }
        else {
            System.out.println("Não possui um caracter maiusculo ❌ ");
        }
        if(verificar2){
            System.out.println("Possui um caracter minusculo ✅ ");
        }
        else {
            System.out.println("Não possui um caracter minusculo ❌ ");
        }
        if(verificar3){
            System.out.println("Possui um numero ✅ ");
        }
        else {
            System.out.println("Não possui um numero ❌ ");
        }
        if(verificar4){
            System.out.println("Possui um caracter especial ✅ ");

        }
        else {
            System.out.println("Não possui um caracter especial ❌ ");
        }

        if(verificar == true && verificar3 == true && verificar2 == true && verificar4 == true){

            System.out.println("Senha valida!");
        }
        else{
            System.out.println("Senha invalida!");
        }

    }
}
