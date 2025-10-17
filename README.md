# Génie Logiciel

## Petit guide Git (rapide)

Pré-requis: un dépôt Git initialisé et un remote GitHub créé.

- Initialiser (si pas déjà fait):
	- `git init`
	- `git branch -M main`
	- `git remote add origin https://github.com/<user>/<repo>.git`

- Vérifier l'état:
	- `git status`

- Ajouter des fichiers:
	- `git add .`  (ou bien des chemins précis)

- Valider (commit):
	- `git commit -m "message clair"`

- Pousser sur GitHub:
	- `git push -u origin main`

- Récupérer des changements:
	- `git pull`

- Créer une branche pour une feature:
	- `git checkout -b feature/ma-feature`
	- ... modifications, `git add`, `git commit`
	- `git push -u origin feature/ma-feature`

- Fusionner (via Pull Request sur GitHub de préférence).

## Compiler/Exécuter (Java)

Depuis le dossier racine du projet:

1. Compiler:
	- `javac TP1/TP1/*.java`
2. Exécuter l'un des points d'entrée:
	- `java -cp TP1/TP1 TestMain`
	- `java -cp TP1/TP1 Main`
	- `java -cp TP1/TP1 BakeryMain` (mini appli boulangerie rigolote)

Modifiez le code, rejouez ces commandes, puis utilisez `git add`, `git commit`, `git push` pour pratiquer.

### Mini-app: Boulangerie

Des classes simples et cohérentes:
- `ProduitType` (enum) définit le nom et le prix des produits
- `Produit` (type + quantité)
- `Panier` (ajout/retrait, calcul du total, génération de ticket)
- `Boulanger` (bonjour, recommandation, petite blague)
- `BakeryMain` exécute un petit scénario et imprime un ticket

Idées de commits:
- Ajouter un nouveau produit dans `ProduitType`
- Changer les quantités dans `BakeryMain`
- Ajouter une remise si total > 10€ dans `Panier`
