package ma.ensa.model;
// Generated 18 déc. 2016 21:13:46 by Hibernate Tools 5.2.0.CR1

/**
 * LigneCmdClt generated by hbm2java
 */
public class LigneCmdClt implements java.io.Serializable {

	private LigneCmdCltId id;
	private CommandeClient commandeClient;
	private Produit produit;

	public LigneCmdClt() {
	}

	public LigneCmdClt(LigneCmdCltId id, CommandeClient commandeClient, Produit produit) {
		this.id = id;
		this.commandeClient = commandeClient;
		this.produit = produit;
	}

	public LigneCmdCltId getId() {
		return this.id;
	}

	public void setId(LigneCmdCltId id) {
		this.id = id;
	}

	public CommandeClient getCommandeClient() {
		return this.commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}

	public Produit getProduit() {
		return this.produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

}
