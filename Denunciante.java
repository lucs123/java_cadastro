import java.util.Scanner;

class Denunciante{
    private String senha;
    private String email;
    private boolean authenticated = false;
    Denuncias denuncias = new Denuncias();
    Denunciantes denunciantes = new Denunciantes();
    Scanner in = new Scanner(System.in);

    public void menu(){
 
        System.out.println("Digite a opção desejada:\n1-Nova denuncia\n2-Consultar minhas denuncias\n3-Sair");
 
        int opt = in.nextInt();
 
        switch(opt){
            case 1:
                novaDenuncia();
                break;
            case 2:
                consultarDenuncias();
                break;
            default:
                break;
        }
    }

    public void cadastrarDenunciante(){
        // Scanner in = new Scanner(System.in);
 
        System.out.println("Digite o email:");
        String email = in.nextLine();

        System.out.println("Digite a senha:");
        String senha = in.nextLine();

        denunciantes.cadastrarDenunciante(email, senha);

        this.email = email;
        this.senha = senha;

        menu();
    }
    
    public void logarDenunciante(){
        Scanner in = new Scanner(System.in);
 
        System.out.println("Digite o email:");
        String email = in.nextLine();

        System.out.println("Digite a senha:");
        String senha = in.nextLine();

        boolean auth = denunciantes.logarDenunciante(email, senha);

        if(auth){
            this.email = email;
            this.senha = senha;

            menu();
        }
    }

    public void novaDenuncia(){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a denuncia:");
        String denuncia = in.nextLine();

        denuncias.novaDenuncia(denuncia, this.email);
        menu();
    }

    public void consultarDenuncias(){
        denuncias.consultarMinhasDenuncias(this.email);
        menu();
    }

}
