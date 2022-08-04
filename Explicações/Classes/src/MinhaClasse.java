public class MinhaClasse {

    public static void main (String [] args){
       // System.out.print("Olá, turma. Sejam Bem-Vindos!");

        String primeiroNome = "Nicole";
        String segundoNome = "Mattes";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do métiodo " + primeiroNome.concat(" ").concat(segundoNome);
    }
}




