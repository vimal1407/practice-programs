import java.util.*;

public class unionoftwosortedarray {
	
	public static ArrayList< Integer > sortedArray(int []a, int []b) {
        int n1= a.length;
        int n2 = b.length;
        int i =0;
        int j= 0;
        ArrayList<Integer>union = new ArrayList();
        while(i<n1 && j<n2){
            if(a[i]<=b[j]){
            if(union.size()==0||union.get(union.size()-1)!=a[i])
                union.add(a[i]);
                i++;
            
            
            }
            else{
                if(union.size()==0||union.get(union.size()-1)!=b[j])
                    union.add(b[j]);
                    j++;
                
         }
        }
         while(i<n1){
              if(union.get(union.size()-1)!=a[i])
                union.add(a[i]);
                i++;
         
        }
        while(j<n2){
            if(union.get(union.size()-1)!=b[j])
                    union.add(b[j]);
                    j++;
        
    }
    
     return union;
}
	public static void main(String[] args) {
		int a[]= {1,2,4,4,8,9};
		int b[]= {3,5,6,6,7};
		ArrayList<Integer>Union =  sortedArray(a,b);
		for(int x:Union)
			System.out.print(x);
			
	}
	}
