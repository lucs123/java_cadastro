import java.util.HashMap;
import java.util.ArrayList; 

class Pessoas{
    ArrayList<HashMap> pessoas = new ArrayList<HashMap>();

    public Pessoas(){
        HashMap<String, String> pessoa = new HashMap<String, String>();
        pessoa.put("email", "teste");
        pessoa.put("senha", "teste");
        pessoas.add(pessoa);
    }

    public void cadastrarPessoa(String email, String senha){
        HashMap<String, String> pessoa = new HashMap<String, String>();
        pessoa.put("email", email);
        pessoa.put("senha", senha);
        pessoas.add(pessoa);
    }


    public boolean logarPessoa(String email, String senha){
        boolean auth = false;

        HashMap<String, String> pessoa = new HashMap<String, String>();
        for (int i = 0; i < pessoas.size(); i++) {
            pessoa = pessoas.get(i);
            if(pessoa.get("email").equals(email) && pessoa.get("senha").equals(senha)){
                System.out.println(pessoa);
                auth = true;
            }
        }
        
        return auth;
    }

    public void consultarPessoas(){
        HashMap<String, String> pessoa = new HashMap<String, String>();
        for (int i = 0; i < pessoas.size(); i++) {
            pessoa = pessoas.get(i);
            System.out.println(pessoa);
        }
    }
}
