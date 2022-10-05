package arrayHandling;

public class InsertArrayEx {

	public static void main(String[] args) {
		int i,x=24,pos=5;
		int a[]={12,14,16,17,21,96,45};
		int n=a.length;
		for(i = (n-1); i >= (pos-1); i--)
        {
            a[i+1] = a[i];
        }
        a[pos-1] = x;
        System.out.print("After inserting:");
        for(i = 0; i < n; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n]);

	}

}
