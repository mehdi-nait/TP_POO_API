package Project;

public class Role {
	private String nomRole;
	
	

	public Role(String nomRole) {
		super();
		this.nomRole = nomRole;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomRole == null) ? 0 : nomRole.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj )
			return true;
		if (obj == null || getClass()!=obj.getClass())
			return false;
		Role other = (Role) obj;
		if (nomRole == null || !nomRole.equals(other.nomRole)) {
			if (other.nomRole != null)
				return false;
		}
		return true;
	}

	public String getNomRole() {
		return nomRole;
	}

	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}
	
	
}
