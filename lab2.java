import java.util.*;
public class lab2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,j,avwt=0,avtat=0;
        int bt[]=new int[20];
        int wt[]=new int[20];
        int tat[]=new int[20];
        System.out.print("Enter total number of processes(maximum 20): ");
        n=sc.nextInt();
        System.out.println("Enter burst time :");
        for(i=0;i<n;i++){
            System.out.printf("P[%d] : ",i+1);
            bt[i]=sc.nextInt();
        }
        for(i=1;i<n;i++){
            for(j=0;j<i;j++){
                wt[i]+=bt[j];
            }
        }
        System.out.printf("\nProcess\t\tBurst Time\tWaiting Time\tTurnaround Time"); 
        for(i=0;i<n;i++){ 
            tat[i]=bt[i]+wt[i]; 
            avwt+=wt[i]; 
            avtat+=tat[i]; 
            System.out.printf("\nP[%d]\t\t%d\t\t%d\t\t%d",i+1,bt[i],wt[i],tat[i]); 
        }
        avwt/=i; 
        avtat/=i;  

        System.out.printf("\n\nAverage Waiting Time:%d",avwt); 
        System.out.printf("\nAverage Turnaround Time:%d",avtat);
        sc.close();
    }
}