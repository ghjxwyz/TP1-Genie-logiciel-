import java.time.LocalTime;

public class Boulanger {
    private final String nom;

    public Boulanger(String nom) {
        this.nom = (nom == null || nom.isBlank()) ? "esteban " : nom;
    }

    public void direBonjour() {
        String salut = LocalTime.now().isBefore(LocalTime.NOON) ? "Bonjour" : "Bon après-midi";
        System.out.println(salut + ", je suis " + nom + ", votre boulanger préféré. Aujourd'hui, tout est croustillant !");
    }

    public void recommander() {
        System.out.println("Recommandation du chef: un croissant et un café. Le café n'est pas au menu, mais on fait semblant ☕.");
    }

    public void blaguer() {
        System.out.println("Blague du jour: Pourquoi la baguette était triste? Parce qu'elle se faisait toujours croquer... 😢🥖");
    }
}
