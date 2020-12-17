package Project;

public class Message {
	private Utilisateur auteur;
	private Destinataire destinataire;
	private String Text;
	
	
	/**
	 * Getters and setters
	 * @return
	 */
	public Utilisateur getAuteur() {
		return auteur;
	}
	public void setAuteur(Utilisateur auteur) {
		this.auteur = auteur;
	}
	public Destinataire getDestinataire() {
		return destinataire;
	}
	public void setDestinataire(Destinataire destinataire) {
		this.destinataire = destinataire;
	}
	public String getText() {
		return Text;
	}
	public void setText(String text) {
		Text = text;
	}
	
	
	
	
}
