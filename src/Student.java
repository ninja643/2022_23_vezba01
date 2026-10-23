public class Student
{
	int brojIndeksa;
	String ime;
	String prezime;
	String username;
	String password;

	private static String settings;

	static
	{
		System.out.println("Izvrsava se staticni blok za inicijalizaciju");
		configure("student.properties");
	}

	{
		System.out.println("Izvrsava se blok za inicijalizaciju");
	}

	public Student(final int brojIndeksa, final String ime, final String prezime)
	{
		this(brojIndeksa, ime, prezime, "user", "user.123");
	}

	public Student(final int brojIndeksa, final String ime, final String prezime, final String username, final String password)
	{
		this.brojIndeksa = brojIndeksa;
		this.ime = ime;
		this.prezime = prezime;
		this.username = username;
		this.password = password;
	}

	public static void configure(final String filename)
	{
		System.out.println("Configuring class Student from file " + filename);
	}

	public int getBrojIndeksa()
	{
		return brojIndeksa;
	}

	public void setBrojIndeksa(final int brojIndeksa)
	{
		this.brojIndeksa = brojIndeksa;
	}

	public String getIme()
	{
		return ime;
	}

	public void setIme(final String ime)
	{
		this.ime = ime;
	}

	public String getPrezime()
	{
		return prezime;
	}

	public void setPrezime(final String prezime)
	{
		this.prezime = prezime;
	}

	@Override
	public String toString()
	{
		return "Student{" +
				"brojIndeksa=" + brojIndeksa +
				", ime='" + ime + '\'' +
				", prezime='" + prezime + '\'' +
				'}';
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(final String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(final String password)
	{
		this.password = password;
	}
}
