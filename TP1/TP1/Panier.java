import java.util.*;

public class Panier {
    private final Map<ProduitType, Produit> items = new LinkedHashMap<>();

    public void ajouter(ProduitType type, int qte) {
        if (qte <= 0) return;
        items.compute(type, (t, p) -> {
            if (p == null) return new Produit(t, qte);
            p.ajouter(qte);
            return p;
        });
    }

    public void retirer(ProduitType type, int qte) {
        Produit p = items.get(type);
        if (p == null) return;
        p.retirer(qte);
        if (p.getQuantite() == 0) items.remove(type);
    }

    public double total() {
        return items.values().stream().mapToDouble(Produit::prixTotal).sum();
    }

    public boolean estVide() { return items.isEmpty(); }

    public String ticket() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n===== TICKET BOULANGERIE =====\n");
        for (Produit p : items.values()) {
            sb.append(" - ").append(p.toString())
              .append(" = ")
              .append(String.format("%.2f€", p.prixTotal()))
              .append("\n");
        }
        sb.append("------------------------------\n");
        sb.append("TOTAL: ").append(String.format("%.2f€", total())).append("\n");
        sb.append("Merci, et bon appétit ! 🥖\n");
        return sb.toString();
    }
}
