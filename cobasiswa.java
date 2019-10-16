public class cobasiswa
{
	public static void main(String args[])
	{
		mahasiswa mhs= new mahasiswa();
		mhs.setNRP(7201);
		mhs.setnama("Muhammad Ali");
		System.out.println("Nama Mahasiswa "+mhs.getnama()+"NRP "+mhs.getNRP());
	}
}