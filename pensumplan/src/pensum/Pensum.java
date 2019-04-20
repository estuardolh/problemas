package pensum;

public class Pensum {
	public String org;
	public String sub;
	public String spec;
	
	public Cycle[] cycles;

	
	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public Cycle[] getCycles() {
		return cycles;
	}

	public void setCycles(Cycle[] cycles) {
		this.cycles = cycles;
	}
}
