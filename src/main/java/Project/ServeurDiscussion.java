package Project;

import java.util.List;
import java.util.Map;
/**
 * 
 * @author Mehdi_Nait
 *
 */
public class ServeurDiscussion {
	private Map<Role,List<Utilisateur>> mapping_role_utilisateur;
	private List<Canal> canaux;
	private String nom;
	private Map<Role,List<Habilitation>> mapping_role_habilitation;
	
	public static void main(String[]args) {
		System.out.println("hello world");
	}
	public Map<Role, List<Utilisateur>> getMapping_role_utilisateur() {
		return mapping_role_utilisateur;
	}


	public void setMapping_role_utilisateur(Map<Role, List<Utilisateur>> mapping_role_utilisateur) {
		this.mapping_role_utilisateur = mapping_role_utilisateur;
	}


	public List<Canal> getCanaux() {
		return canaux;
	}


	public void setCanaux(List<Canal> canaux) {
		this.canaux = canaux;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Map<Role, List<Habilitation>> getMapping_role_habilitation() {
		return mapping_role_habilitation;
	}


	public void setMapping_role_habilitation(Map<Role, List<Habilitation>> mapping_role_habilitation) {
		this.mapping_role_habilitation = mapping_role_habilitation;
	}


	public ServeurDiscussion() {
		super();
	}
	
	
}
