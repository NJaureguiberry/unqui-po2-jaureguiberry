package ar.unq.po2.tp5;

public class Mascota extends SerVivo {
	private String race;

	public Mascota(String name, String aRace) {
		super(name);
		this.setRace(aRace);
	}

	public String getRace() {
		return race;
	}

	public void setRace(String aRace) {
		this.race = aRace;
	}
}
