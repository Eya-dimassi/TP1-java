package project;

public class point {
	private int abscisse;
	private int ordonee;
	private String nom;
	public point(int a,int o) {
		abscisse=a;
		ordonee=o;
		
		
	}
	public point (String n) {
		nom=n;
	}
	public point (String n,int a ,int o ) {
		abscisse=a;
		ordonee=o;
		nom=n;
	}

	void Getabs(int a) {
		abscisse=5;
	}
	void Getord(int o) {
		ordonee=3;
	}
	
	void Affiche() {
		System.out.println(nom+"("+abscisse+","+ordonee+")");
	}
    void TranslHoriz(int a) {
    	abscisse +=a;
    	
    }
    void TranslVert(int a) {
    	ordonee +=a;
    	
    }
    void Translation(int a,int b) {
    	int x=abscisse;
    	abscisse=ordonee;
    	ordonee=x;
    	
    }
    String getNom() {
    	return(nom);
    	
    }
    public int setAbscisse() {
    	return(abscisse);
    }
    public int setOrdonnée() {
    	return(ordonee);
    }
	public void setNom(String ch) {
		this.nom=ch;
		
	}
	public void setAbscisse(int a) {
        this.abscisse = a;
    }

    public void setOrdonnee(int a) {
        this.ordonee = a;
    }

    public int getAbscisse() {
        return abscisse;
    }

    public int getOrdonnee() {
        return ordonee;
    }
}
