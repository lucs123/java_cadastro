import java.util.Scanner;

public class Principal{
    public static void main(String[] args)
     {
        Scanner in = new Scanner(System.in);
 
        System.out.println("Digite a opção desejada:\n1-Logar como administrador\n2-Logar como denunciante\n3-Cadastrar novo administrador\n4-Cadastrar novo denunciante");
 
        int opt = in.nextInt();
        System.out.println("You entered integer " + opt);
 
        switch(opt){
            case 1:
                logarPessoa();
                break;
            case 2:
                logarDenunciante();
                break;
            case 3:
                cadastrarPessoa();
                break;
            case 4:
                cadastrarDenunciante();
                break;
        }

     }

    public static void cadastrarPessoa(){
        Pessoa pessoa = new Pessoa();
        pessoa.cadastrarPessoa();        
    }

    public static void cadastrarDenunciante(){
        Denunciante denunciante = new Denunciante();
        denunciante.cadastrarDenunciante();
    }

    public static void logarPessoa(){
        Pessoa pessoa = new Pessoa();
        pessoa.logarPessoa();
    }

    public static void logarDenunciante(){
        Denunciante denunciante = new Denunciante();
        denunciante.logarDenunciante();
    }

}
