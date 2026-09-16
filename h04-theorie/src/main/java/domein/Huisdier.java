package domein;

public abstract class Huisdier {
    private String naam;
    
    public Huisdier(String naam) {
    	  	
        setNaam(naam);
    } 

	public String getNaam() {
        return naam;
    }

    private void setNaam(String naam) {
        this.naam = naam;
    }
    
    public abstract String maakGeluid();
}
