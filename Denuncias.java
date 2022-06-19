import java.util.HashMap;
import java.util.ArrayList; 

class Denuncias{
    ArrayList<HashMap> denuncias = new ArrayList<HashMap>();

    public Denuncias(){
        HashMap<String, String> denuncia = new HashMap<String, String>();
        denuncia.put("descricao", "Denuncia 1");
        denuncia.put("email", "roberto@gmail.com");
        denuncia.put("solucao", "Sem resposta");
        denuncia.put("numero", String.valueOf(denuncias.size() + 1));
        denuncias.add(denuncia);
    }

    public void novaDenuncia(String descricao, String email){
        HashMap<String, String> denuncia = new HashMap<String, String>();
        denuncia.put("descricao", descricao);
        denuncia.put("email", email);
        denuncia.put("solucao", "Sem resposta");
        denuncia.put("numero", String.valueOf(denuncias.size() + 1));
        denuncias.add(denuncia);
    }

    public void getDenuncia(String nDenuncia){
        HashMap<String, String> denuncia = new HashMap<String, String>();
        for (int i = 0; i < denuncias.size(); i++) {
            denuncia = denuncias.get(i);
            if(denuncia.get("numero").equals(nDenuncia)){
                System.out.println("Denuncia:");
                System.out.println(denuncia);
            }
        }
    }

    public void resolverDenuncia(String solucao, String nDenuncia){
        HashMap<String, String> denuncia = new HashMap<String, String>();
        for (int i = 0; i < denuncias.size(); i++) {
            denuncia = denuncias.get(i);
            if(denuncia.get("numero").equals(nDenuncia)){
                denuncia.put("solucao", solucao);
                denuncias.set(i, denuncia);
                System.out.println(denuncias);
            }
        }
    }

    public void consultarMinhasDenuncias(String email){
        HashMap<String, String> denuncia = new HashMap<String, String>();
        for (int i = 0; i < denuncias.size(); i++) {
            denuncia = denuncias.get(i);
            if(denuncia.get("email").equals(email)){
                System.out.println(denuncia);
            }
        }
    }

    public void consultarDenuncias(){
        HashMap<String, String> denuncia = new HashMap<String, String>();
        for (int i = 0; i < denuncias.size(); i++) {
            denuncia = denuncias.get(i);
            System.out.println(denuncia);
        }
    }
}
