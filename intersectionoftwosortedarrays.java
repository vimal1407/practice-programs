import java.util.ArrayList;
import java.util.Arrays;
public class intersectionoftwosortedarrays {
	public static void main(String[] args) {
		ArrayList<Integer> anss1 = new ArrayList<>(Arrays.asList(2,3,4,5,6,6,6,7));
		int n = anss1.size();
		ArrayList<Integer> anss2 = new ArrayList<>(Arrays.asList(1,2,2,3,4,5,6));
		int m = anss2.size();
	ArrayList<Integer> anss = findArrayIntersection(anss1,n,anss2,m);
	System.out.print(anss);
	}
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> anss1, int n, ArrayList<Integer> anss2, int m)
	{
		int i =0;
		int j =0;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		while(i<n && j<m){
			if (anss1.get(i)<anss2.get(j)){
				i++;
			}
			else if(anss2.get(j)<anss1.get(i)){
				j++;
			
			}
			else{
				ans.add(anss1.get(i));
				i++;
				j++;
			}
		}
		return ans;
	}
	
}


