package arrayHandling;

public class SortEvenOddEx {

	public static void main(String[] args) {
		int i,j=0,k=0;
		int a[]={12,18,19,41,56,92,108,2,3,4};
		int even[]={};
		int odd[]={};
		int n=a.length;
		
		   for(i = 0; i < n; i++)
	        {
	            if(a[i] % 2 != 0)
	            {
	                odd[j] = a[i];
	                j++;
	            }
	            else
	            {
	                even[k] = a[i];
	                k++;
	            }
	        }
	        System.out.print("Odd:");
	        if(j > 1)
	        {
	            for(i = 0;i < (j-1); i++)
	            {
	                System.out.print(odd[i]+",");
	            }
	            System.out.print(odd[j-1]);
	        }
	        else
	        {
	            System.out.println("No number");
	        }
	        System.out.println("");
	        System.out.print("Even:");
	        if(k > 1)
	        {
	            for(i = 0; i < (k-1); i++)
	            {
	                System.out.print(even[i]+",");
	            }
	        System.out.print(even[k-1]);
	        }
	        else
	        {
	            System.out.println("No number");
	        }
	    }
	

	}


