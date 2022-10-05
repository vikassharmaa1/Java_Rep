package arrayHandling;

public class SecondLargest_SmallestEx {

	public static void main(String[] args) {
		int i,j,temp,n;
		int a[]={12,14,91,87,65};
		n=a.length;
		for (i = 0; i < n; i++) 
        {
            for (j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second Largest:"+a[n-2]);
        System.out.println("Smallest:"+a[0]);

	}

}
