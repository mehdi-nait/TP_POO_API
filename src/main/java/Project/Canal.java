package Project;

import java.util.*;
import Exceptions.*;

public class Canal implements Comparable<Canal>,Destinataire{
	private Map<Role,List<Utilisateur>> mapping_role_utilisateurs = new HashMap<Role,List<Utilisateur>>();
	private int ordre;
	private List<Webhook> webhooks;
	private String nom;
	private Map<Role,List<Habilitation>> mapping_role_habilitations = new HashMap<Role,List<Habilitation>>();
	private List<Message> Historiques = new ArrayList<Message>();
	
	
	
	

	
	public Canal() {
		super();
		
	}
	
	
	
	public Map<Role, List<Utilisateur>> getMapping_role_utilisateurs() {
		return mapping_role_utilisateurs;
	}
	public void setMapping_role_utilisateurs(Map<Role, List<Utilisateur>> mapping_role_utilisateurs) {
		this.mapping_role_utilisateurs = mapping_role_utilisateurs;
	}
	public int getOrdre() {
		return ordre;
	}
	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
	public List<Webhook> getWebhooks() {
		return webhooks;
	}
	public void setWebhooks(List<Webhook> webhooks) {
		this.webhooks = webhooks;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Map<Role, List<Habilitation>> getMapping_role_habilitations() {
		return mapping_role_habilitations;
	}
	public void setMapping_role_habilitations(Map<Role, List<Habilitation>> mapping_role_habilitations) {
		this.mapping_role_habilitations = mapping_role_habilitations;
	}
	public List<Message> getHistoriques() {
		return Historiques;
	}
	public void setHistoriques(List<Message> historiques) {
		Historiques = historiques;
	}
	
	
	/**
	 * Envoyer un message dans le Canal
	 * @param utilisateur
	 * @param message
	 * @throws ActionNonAutoriseeException
	 */
	public void ecrireMessage(Utilisateur utilisateur, Message message) throws ActionNonAutoriseeException{
		List<Role> roles_utilisateur = new ArrayList<Role>();
		boolean can_write = false;
		//recuperer tous les roles de l'utilisateur
		for(Role role :mapping_role_utilisateurs.keySet()) {
			if(this.getMapping_role_utilisateurs().get(role).contains(utilisateur)) {
				roles_utilisateur.add(role);
			}
		}
		//verifier si il a droit a l'ecriture
		for(Role role: roles_utilisateur) {
			if(this.getMapping_role_habilitations().get(role).contains(Habilitation.ECRITURE)) {
				can_write = true;
				break;
			}
			
		}
		if(can_write ==false) {
			throw new ActionNonAutoriseeException();
		}
		
		if(can_write ==true) {
			this.Historiques.add(message);
		}
	}



	@Override
	public int compareTo(Canal o) {
		if(this.ordre>o.ordre) {
			return 1;
		}
		else if(this.ordre<o.ordre) {
			return -1;
		}
		return 0;
	}
	
	

}
