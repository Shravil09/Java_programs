package clearTrail;

//import java.util.HashSet;

public class CommonNumber {

	public static void main(String[] args) {
		int [] arr1 = {4,3,7,9,2,4};
		int [] arr2 = {5,1,2,3,8,7};
		
		//HashSet hs = new HashSet();
		for(int i=0; i<arr1.length; i++) 
		{
			for(int j=0; j<arr2.length; j++) 
			{
				if(arr1[i]==arr2[j]) 
				{
					System.out.println(arr1[i]);
					break;
				}
			}
		}
	}

}
