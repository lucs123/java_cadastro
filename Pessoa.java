import java.util.Scanner;

class Pessoa{
    private String senha;
    private String email;
    private boolean authenticated = false;
    Denuncias denuncias = new Denuncias();
    Pessoas pessoas = new Pessoas();
    Scanner in = new Scanner(System.in);

    public void menu(){
 
        System.out.println("Digite a opção desejada:\n1-Resolver denuncia\n2-Consultar denuncias\n3-Sair");
 
        int opt = in.nextInt();
 
        switch(opt){
            case 1:
                resolverDenuncia();
                break;
            case 2:
                consultarDenuncias();
                break;
            default:
                break;
        }
    }

    public void cadastrarPessoa(){
        // Scanner in = new Scanner(System.in);
 
        System.out.println("Digite o email:");
        String email = in.nextLine();

        System.out.println("Digite a senha:");
        String senha = in.nextLine();

        pessoas.cadastrarPessoa(email, senha);

        this.email = email;
        this.senha = senha;

        menu();
    }
    
    public void logarPessoa(){
        Scanner in = new Scanner(System.in);
 
        System.out.println("Digite o email:");
        String email = in.nextLine();

        System.out.println("Digite a senha:");
        String senha = in.nextLine();

        boolean auth = pessoas.logarPessoa(email, senha);

        if(auth){
            this.email = email;
            this.senha = senha;

            menu();
        }
    }

    public void resolverDenuncia(){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o numero da denuncia:");
        String nDenuncia = in.nextLine();

        denuncias.getDenuncia(nDenuncia);

        System.out.println("Digite a solução:");
        String solucao = in.nextLine();

        denuncias.resolverDenuncia(solucao, nDenuncia);
        menu();
    }

    public void consultarDenuncias(){
        denuncias.consultarDenuncias();
        menu();
    }

}
