import java.util.*;

public class matlarg {
    public static void main(String args[]){
        int n,i,j,lar;
        int a[][]=new int[10][10];
        Scanner obj=new Sanner(System.in);
        System.out.println("ENTER THE SIZE OF THE N*N MATRIX : ");
        n=obj.nextInt();
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY : ");
        for(i=0;i<n;++i){
            for(j=0;j<n;++j){
                a[i][j]=obj.nextInt();
            }
        }
        lar=a[0][0];
        for(i=0;i<n;++i){
            for(j=0;j<n;++j){
                if(a[i][j]>lar)
                    lar=a[i][j];
            }    
        }
        System.out.println("LARGEST ELEMENT : "+lar);
    }
}
