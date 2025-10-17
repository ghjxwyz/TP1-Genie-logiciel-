public class BakeryMain {
    public static void main(String[] args) {
        Boulanger b = new Boulanger("Camille Feuillet");
        b.direBonjour();
        b.recommander();
        b.blaguer();

        Panier panier = new Panier();
        panier.ajouter(ProduitType.BAGUETTE, 2);
        panier.ajouter(ProduitType.CROISSANT, 3);
        panier.ajouter(ProduitType.PAIN_CHOCOLAT, 1);

        // Oups, trop de croissants, on en retire 1
        panier.retirer(ProduitType.CROISSANT, 1);

        System.out.println(panier.ticket());
        System.out.println("Astuce Git: modifie les quantités, ajoute un nouveau produit dans ProduitType, commit & push !");
    }
}
