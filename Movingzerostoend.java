public class Movingzerostoend {
	 public static int[] moveZeros(int n, int []a) {
	        int j = -1;
	        for(int i =0;i<n;i++){
	            if(a[i]==0){
	                j = i;
	                break;
	            }
	        }
	        if (j==-1){
	            return a;
	        }
	        for(int i=j+1;i<n;i++){
	            if(a[i]!=0){
	                int tmp = a[i];
	                a[i] = a[j];
	                a[j] = tmp;
	                j++;
	            }
	        }
	        return a;
	    }

	public static void main(String[] args) {
	int a[] = {2,0,5,0,8,0,0,6};
	int n = a.length;
	int b[]=moveZeros(n,a);   
	for(int i =0;i<b.length;i++) {
		System.out.print(b[i]);
	}
	}

	}

