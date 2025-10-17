public enum ProduitType {
    BAGUETTE("Baguette tradition", 1.20),
    CROISSANT("Croissant au beurre", 1.10),
    PAIN_CHOCOLAT("Pain au chocolat (pas chocolatine)", 1.30),
    COOKIE("Cookie XXL", 2.00),
    ECLAIR("Éclair au chocolat", 2.50);

    private final String label;
    private final double prix;

    ProduitType(String label, double prix) {
        this.label = label;
        this.prix = prix;
    }

    public String getLabel() {
        return label;
    }

    public double getPrix() {
        return prix;
    }
}
