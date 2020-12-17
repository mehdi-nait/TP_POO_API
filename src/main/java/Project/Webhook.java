package Project;

public class Webhook {
	private String nom;
	private String Description;
	private String nomApplicationAppelante;
	private WebhookAction action;
	public String getNom() {
		return nom;
		
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getNomApplicationAppelante() {
		return nomApplicationAppelante;
	}
	public void setNomApplicationAppelante(String nomApplicationAppelante) {
		this.nomApplicationAppelante = nomApplicationAppelante;
	}
	public WebhookAction getAction() {
		return action;
	}
	public void setAction(WebhookAction action) {
		this.action = action;
	}
	
	
	
	
	
}
