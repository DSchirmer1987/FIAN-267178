package musterloesungen.ausflugsplanungKB;

public abstract class Ausflugsziele {

	private boolean wochentag;
	private boolean wochenende;
	private boolean schoenesWetter;
	private boolean schlechtesWetter;
	private boolean schulzeit;
	private boolean ferien;
	private boolean amTag;
	private boolean amAbend;
	private boolean mitKind;
	
	
	public Ausflugsziele() {
		
	}
	
	public Ausflugsziele(boolean wochentag, boolean wochenende, boolean schoenesWetter, boolean schlechtesWetter,
			boolean schulzeit, boolean ferien, boolean amTag, boolean amAbend, boolean mitKind) {
		super();
		this.wochentag = wochentag;
		this.wochenende = wochenende;
		this.schoenesWetter = schoenesWetter;
		this.schlechtesWetter = schlechtesWetter;
		this.schulzeit = schulzeit;
		this.ferien = ferien;
		this.amTag = amTag;
		this.amAbend = amAbend;
		this.mitKind = mitKind;
	}

	@Override
	public String toString() {
		return "Ausflugsziele [wochentag=" + wochentag + ", wochenende=" + wochenende + ", schoenesWetter="
				+ schoenesWetter + ", schlechtesWetter=" + schlechtesWetter + ", schulzeit=" + schulzeit + ", ferien="
				+ ferien + ", amTag=" + amTag + ", amAbend=" + amAbend + ", mitKind=" + mitKind + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (amAbend ? 1231 : 1237);
		result = prime * result + (amTag ? 1231 : 1237);
		result = prime * result + (ferien ? 1231 : 1237);
		result = prime * result + (mitKind ? 1231 : 1237);
		result = prime * result + (schlechtesWetter ? 1231 : 1237);
		result = prime * result + (schoenesWetter ? 1231 : 1237);
		result = prime * result + (schulzeit ? 1231 : 1237);
		result = prime * result + (wochenende ? 1231 : 1237);
		result = prime * result + (wochentag ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		
		Ausflugsziele other = (Ausflugsziele) obj;
		if (amAbend != other.amAbend)
			return false;
		if (amTag != other.amTag)
			return false;
		if (ferien != other.ferien)
			return false;
		if (mitKind != other.mitKind)
			return false;
		if (schlechtesWetter != other.schlechtesWetter)
			return false;
		if (schoenesWetter != other.schoenesWetter)
			return false;
		if (schulzeit != other.schulzeit)
			return false;
		if (wochenende != other.wochenende)
			return false;
		if (wochentag != other.wochentag)
			return false;
		return true;
	}

	public boolean isWochentag() {
		return wochentag;
	}

	public void setWochentag(boolean wochentag) {
		this.wochentag = wochentag;
	}

	public boolean isSchoenesWetter() {
		return schoenesWetter;
	}

	public void setSchoenesWetter(boolean schoenesWetter) {
		this.schoenesWetter = schoenesWetter;
	}

	public boolean isSchlechtesWetter() {
		return schlechtesWetter;
	}

	public void setSchlechtesWetter(boolean schlechtesWetter) {
		this.schlechtesWetter = schlechtesWetter;
	}

	public boolean isSchulzeit() {
		return schulzeit;
	}

	public void setSchulzeit(boolean schulzeit) {
		this.schulzeit = schulzeit;
	}

	public boolean isAmTag() {
		return amTag;
	}

	public void setAmTag(boolean amTag) {
		this.amTag = amTag;
	}

	public boolean isMitKind() {
		return mitKind;
	}

	public void setMitKind(boolean mitKind) {
		this.mitKind = mitKind;
	}

	public boolean isWochenende() {
		return wochenende;
	}

	public void setWochenende(boolean wochenende) {
		this.wochenende = wochenende;
	}

	public boolean isFerien() {
		return ferien;
	}

	public void setFerien(boolean ferien) {
		this.ferien = ferien;
	}

	public boolean isAmAbend() {
		return amAbend;
	}

	public void setAmAbend(boolean amAbend) {
		this.amAbend = amAbend;
	}

}
