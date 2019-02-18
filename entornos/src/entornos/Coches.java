package entornos;

public class Coches {
	private String matricula;

	public Coches(String matricula) {
		super();
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Coches [matricula=" + matricula + "]";
	}

	public String getMatricula() {
		return matricula;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coches other = (Coches) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	
	
	
}
