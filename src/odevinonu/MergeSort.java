package odevinonu;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		
		System.out.println("KA� BOYUTLU B�R D�Z� OLU�TURACAKSINIZ ? ... =>");
		Scanner klv = new Scanner(System.in);
		int boyut = klv.nextInt();
		int [] alinacaklar = new int [boyut];
		
		System.out.println("SIRALANMASINI �STED���N�Z DE�ERLER� G�R�N�Z ... =>");
		for (int i = 0; i < boyut; i++) {
            alinacaklar[i] = klv.nextInt();
        }
		
        
		
	        mergeSort(alinacaklar, alinacaklar.length);
	        for (int i = 0; i < alinacaklar.length; i++)
	            System.out.println(alinacaklar[i]);
	    }

	    public static void mergeSort(int[] alinacaklar, int n) {
	        if (n < 2)
	            return;
	        int mid = n / 2;
	        int[] l = new int[mid];
	        int[] r = new int[n - mid];

	        for (int i = 0; i < mid; i++) {
	            l[i] = alinacaklar[i];
	        }
	        for (int i = mid; i < n; i++) {
	            r[i - mid] = alinacaklar[i];
	        }
	        mergeSort(l, mid);
	        mergeSort(r, n - mid);

	        merge(alinacaklar, l, r, mid, n - mid);
	    }

	    public static void merge(int[] alinacaklar, int[] l, int[] r, int left, int right) {

	        int i = 0, j = 0, k = 0;

	        while (i < left && j < right) {

	            if (l[i] <= r[j])
	            	alinacaklar[k++] = l[i++];
	            else
	            	alinacaklar[k++] = r[j++];

	        }

	        while (i < left)
	        	alinacaklar[k++] = l[i++];

	        while (j < right)
	        	alinacaklar[k++] = r[j++];
	    }
	}



/*System.out.println("KA� BOYUTLU B�R D�Z� OLU�TURACAKSINIZ ? ... =>");
Scanner klv = new Scanner(System.in);
int boyut = klv.nextInt();
int [] sayilar = new int [boyut];
for(int i=0;i<=boyut;i++) {
System.out.println("SIRALANMASINI �STED���N�Z DE�ERLER� G�R�N�Z ... =>");
Scanner girdi = new Scanner(System.in);
int girilenler = girdi.nextInt();

}*/


/*Scanner klavye=new Scanner(System.in);
System.out.println("KA� BOYUTLU B�R D�Z� OLU�TURACAKSINIZ ? ... =>");
int n=klavye.nextInt();
ArrayList <String> alinacaklar=new ArrayList<String>();
System.out.println("SIRALANMASINI �STED���N�Z DE�ERLER� G�R�N�Z ... => ");
for(int i=0;i<n;i++){
    alinacaklar.add(klavye.next());
} 
*/
 