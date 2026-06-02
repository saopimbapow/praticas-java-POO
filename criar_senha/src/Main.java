import VerificarSenha.Senha;

import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Senha senhas = new Senha();

        System.out.println("\nA senha deve conter:\n.Um caracter maiusculo;\n.Um numero;\n.Um caracter minusculo;\n.Um caracter especial;\n.Mais de 6 caracteres ");

        System.out.println("digite uma senha: ");
        String senha = scanner.nextLine();
        senhas.setSenha(senha);

        senhas.mostarSenha();
        senhas.verificarSenha();





    }
}