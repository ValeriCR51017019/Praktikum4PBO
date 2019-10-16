class acaratv
{
	public String StasiunTV;
	public String Acara;
	
	public String getStasiunTV()
	{
		return StasiunTV;
	}
	public void setStasiunTV(String StasiunTV)
	{
		this.StasiunTV=StasiunTV;
	}
	public String getAcara()
	{
		return Acara;
	}
	public void setAcara(String Acara)
	{
		this.Acara=Acara;
	}
	public void cetak()
	{
		System.out.println("Acara "+Acara+"StasiunTV "+StasiunTV);
	}
}