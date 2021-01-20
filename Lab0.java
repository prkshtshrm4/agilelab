import java.util.Scanner;  
public class Lab0 {
    //funcction for finding the smallest number in the array.
    public static int getSmallest(int[] a, int total){  
        int temp;  
        for (int i = 0; i < total; i++)   
                {  
                    for (int j = i + 1; j < total; j++)   
                    {  
                        if (a[i] > a[j])   
                        {  
                            temp = a[i];  
                            a[i] = a[j];  
                            a[j] = temp;  
                        }  
                    }  
                }  
               return a[0];  
        }  
    public static void main(String[] args)   
{  
int n=10;
int d;  
Scanner sc=new Scanner(System.in);  
 
int[] array = new int[10];  
System.out.println("Enter 10 elements: ");  
for(int i=0; i<n; i++)  
{  
   
array[i]=sc.nextInt();//Here we are reading array elements.  
}   
d = array.length;//here we are calculating the lenth of the array and and putting it in variable d.
System.out.println("Smallest: "+getSmallest(array,d)); 

}  
}
