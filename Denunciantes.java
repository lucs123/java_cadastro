import java.util.HashMap;
import java.util.ArrayList; 

class Denunciantes{
    ArrayList<HashMap> denunciantes = new ArrayList<HashMap>();

    public Denunciantes(){
        HashMap<String, String> denunciante = new HashMap<String, String>();
        denunciante.put("email", "teste");
        denunciante.put("senha", "teste");
        denunciantes.add(denunciante);
    }

    public void cadastrarDenunciante(String email, String senha){
        HashMap<String, String> denunciante = new HashMap<String, String>();
        denunciante.put("email", email);
        denunciante.put("senha", senha);
        denunciantes.add(denunciante);
    }


    public boolean logarDenunciante(String email, String senha){
        boolean auth = false;

        HashMap<String, String> denunciante = new HashMap<String, String>();
        for (int i = 0; i < denunciantes.size(); i++) {
            denunciante = denunciantes.get(i);
            if(denunciante.get("email").equals(email) && denunciante.get("senha").equals(senha)){
                System.out.println(denunciante);
                auth = true;
            }
        }
        
        return auth;
    }

    public void consultarDenunciantes(){
        HashMap<String, String> denunciante = new HashMap<String, String>();
        for (int i = 0; i < denunciantes.size(); i++) {
            denunciante = denunciantes.get(i);
            System.out.println(denunciante);
        }
    }
}
