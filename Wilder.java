public class Wilder {

    //Attributs
    private String firstname;
    private boolean aware;

    //constructeurs
    public Wilder(String firstname, boolean aware){
        this.firstname=firstname;
        this.aware=aware;
    }

    //getters
    public String getFirstname(){
        return this.firstname;
    }

    public boolean isAware(){
        return this.aware;
    }

    //setters
    public void setFirstName(String firstname){
        this.firstname = firstname;
    }

    public void setAware(boolean aware){
        this.aware=aware;
    }

    //méthode whoAmI() instanciée
    public String whoAmI() {
        if (this.aware==true){
            return ("Je m'appelle " + this.getFirstname() + " et je suis aware");
        }else{
            return ("Je m'appelle " + this.getFirstname() + " et je ne suis pas aware");
        }
    }

}