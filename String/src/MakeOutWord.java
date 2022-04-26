
public class MakeOutWord 
{
	public String math(String out, String word) 
	{
		System.out.println(out.substring(0,2) + word + out.substring(2));
		return out;
		
	}

	public static void main(String[] args) {
		new MakeOutWord().math("<<>>", "Shravil");
		//System.out.println(mo);
	}

}
