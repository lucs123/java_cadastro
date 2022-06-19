class Pessoa{
    private String username;
    private String senha;
    private String email;

    public Pessoa(String username){
        this.username = username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getusername(){
        return this.username;
    }

    public String getEmail(){
        return this.email;
    }

}
