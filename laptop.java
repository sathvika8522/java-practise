package shivaya;

public class laptop implements Comparable<laptop> {

	private String lapName;
	private int ram;
	
	/*constructor*/
	public laptop(String lapName, int ram) {
		super();
		this.lapName = lapName;
		this.ram = ram;
	}
	/*getters setters*/
	public String getLapName() {
		return lapName;
	}
	
	public int getRam() {
		return ram;
	}
	
	@Override
	public String toString() {
		return "laptop [lapName=" + lapName + ", ram=" + ram + "]";
	}

	public int compareTo(laptop li2)
	{
		if(this.getRam()>li2.getRam())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
    

}
