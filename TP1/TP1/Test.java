public class Test {
    private String texte ;

    public Test(String wooooww){
        this.texte = (wooooww == null) ? "" : wooooww ;
    }

    public String getTexte() {
        return this.texte ;
    }

    public void setTexte(String nouveau) {
        this.texte = (nouveau == null) ? "" : nouveau ;
    }

    public void append(String more) {
        if (more != null) {
            this.texte = this.texte + more ;
        }
    }

    public String toUpper() {
        return this.texte.toUpperCase() ;
    }

    public int length() {
        return this.texte.length() ;
    }

    @Override
    public String toString(){
        return "Test{" + "texte='" + this.texte + "'" + "}" ;
    }
}
