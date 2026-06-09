package Dominio;
import java.util.HashMap;
import java.util.Map;

public class ConfiguracaoApp {
    private static String nomeDaAplicacao;
    private  static  String versao;
    private  static int maxUsuarios;
    private static Map<String, String> configuracoes = new HashMap<>();

   static  {
       System.out.println(">> Configurações carregadas!");
       ConfiguracaoApp.nomeDaAplicacao = "SistemaEstudos";
       configuracoes.put("timeout", "30s");
       configuracoes.put("idioma", "pt-BR");
       configuracoes.put("tema", "escuro");
       ConfiguracaoApp.maxUsuarios = 100;
       ConfiguracaoApp.versao = "1.0.0";

    }

         public static void imprimirConfiguracoes(){
           System.out.println("=== Configurações da Aplicação ===");
           System.out.println("Nome: " + ConfiguracaoApp.nomeDaAplicacao);
           System.out.println("Versão: " + ConfiguracaoApp.versao);
           System.out.println("Max Usuarios: " + ConfiguracaoApp.maxUsuarios);
           System.out.println(configuracoes.get("timeout"));
           System.out.println(configuracoes.get("idioma"));
           System.out.println(configuracoes.get("tema"));
            // for (Map.Entry<String, String> entrada : configuracoes.entrySet()) {
                 //System.out.println(entrada.getKey() + " = " + entrada.getValue());
       }






   // public static void main(String[] args) {

        //Map<String, String> mapa = new HashMap<>();

        // Adicionando pares chave → valor
       // mapa.put("nome", "Bernardo");
        //mapa.put("cidade", "Rio de Janeiro");
        //mapa.put("curso", "Java");

        // Buscando um valor pela chave
        //System.out.println(mapa.get("nome"));   // Bernardo
        //System.out.println(mapa.get("cidade")); // Rio de Janeiro

         //Percorrendo tudo
        //for (Map.Entry<String, String> entrada : mapa.entrySet()) {
            //System.out.println(entrada.getKey() + " = " + entrada.getValue());
        //}
    //}
}
