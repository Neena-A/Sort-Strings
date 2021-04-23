import java.util.*;

class qsdemo{
    int n;
    Scanner scan = new Scanner(System.in);
    ArrayList <String> l= new ArrayList<String>();
    void create(){
        System.out.println("enter the no. of elements in the list: ");
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter element " +(i+1)+ " :");               
            String s = scan.next();
            l.add(s);  
        }
        System.out.println("elements in the list are: ");
        System.out.println(l);
        quick(0 , n-1);
    }  
    public void quick(int low , int high) {
        if (low < high)
        {
            int mid= partition(low,high);
            quick(low,mid-1);
            quick(mid+1,high);
        }
    }
    public int partition(int low, int high) {
        int i=low,j=high;
        String s = l.get(low) ;
        String temp;
        while (i<=j)
        {
            while ((i< high+1 ) && ((l.get(i).compareTo(s))<=0))
                i++;
            while (j>=0 && ((l.get(j).compareTo(s))>0))
                j--;
            if (i<j)
            {
                temp = l.get(i);
                l.set(i,l.get(j));
                l.set(j,temp);
            }
            else
            {
                temp = l.get(low);
                l.set(low,l.get(j));
                l.set(j,temp);
            }
        }
       return j;
    } 
    void dis()
    {
        System.out.println("Sorted list : " + l);
    }    
}

public class quicksort {
        public static void main(String[] args) {
            qsdemo o = new qsdemo();
            o.create();
            o.dis();
    }
}




 