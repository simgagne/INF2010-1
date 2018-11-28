
public class Main {
	public static void main(String[] args) {
		// Exerice 1: creation de graphe � partir du fichier 
		Graph g = new Graph();
		g.readFromFile("./graphe.txt",",");
		// Exerice 2: calcul du plus court chemin de source vers tous les sommet
		Bellman bl = new Bellman(g);
		Node source=g.getNodeByName("B");
		bl.setSourceNode(source);
		bl.shortestPath();
		bl.displayTables();
		// Exerice 3: affichage des plus courts chemins
		bl.diplayShortestPaths();
	}
}
