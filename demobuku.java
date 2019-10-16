public class demobuku
{
	public static void main (String args [])
	{
		buku a,b;
		a=new buku();
		b=new buku();
		
		a.pengarang="felix siauw";
		a.judul="beyond the inspiration";
		b.pengarang="budi raharjo";
		b.judul="mudah belajar java";
		System.out.println("judul: "+a.judul+"pengarang: "+a.pengarang);
		System.out.println("judul: "+b.judul+"pengarang: "+b.pengarang);
		
	}
}