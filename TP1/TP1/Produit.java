public class Produit {
    private final ProduitType type;
    private int quantite;

    public Produit(ProduitType type, int quantite) {
        if (type == null) throw new IllegalArgumentException("type ne peut pas être null");
        if (quantite <= 0) throw new IllegalArgumentException("quantité doit être > 0");
        this.type = type;
        this.quantite = quantite;
    }

    public ProduitType getType() { return type; }
    public int getQuantite() { return quantite; }
    public void ajouter(int q) { if (q > 0) this.quantite += q; }
    public void retirer(int q) { if (q > 0) this.quantite = Math.max(0, this.quantite - q); }
    public double prixTotal() { return type.getPrix() * quantite; }

    @Override
    public String toString() {
        return quantite + " x " + type.getLabel() + " @ " + String.format("%.2f€", type.getPrix());
    }
}
