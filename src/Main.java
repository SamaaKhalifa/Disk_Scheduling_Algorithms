import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> ex=new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of requests: ");
        int n= in.nextInt(),x;

        System.out.println("Enter your requests: ");
        for(int i=0;i<n;i++)
        {
            x=in.nextInt();
            ex.add(x);
        }

        System.out.println("Enter position of head pointer");
        int start = in.nextInt();

        //ArrayList<Integer> ex=new ArrayList<>(Arrays.asList(98,183,37,122,14,124,65,67));
        //int start =53;
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        //ArrayList<Integer> example2=new ArrayList<>(Arrays.asList(38,180,130,10,50,15,190,90,150));
        //38 100 130 10 50 15 190 90 150


        Disk_Scheduling_Algorithm look=new Look_algorithm(ex,start);
        Disk_Scheduling_Algorithm C_look=new C_look_algorithm(ex,start);
        Disk_Scheduling_Algorithm FCFS=new FCFS_algorithm(ex,start);

        Disk_Scheduling_Algorithm NewlyOptimized = new NewlyOptimizedAlgorithm(ex);
        Disk_Scheduling_Algorithm SSTF = new SSTF(ex,start);

        Disk_Scheduling_Algorithm Scan=new Scan_algorithm(ex,start);
        Disk_Scheduling_Algorithm C_scan=new C_scan_algorithm(ex,start);

        ArrayList<Integer> output;
        output = FCFS.scheduling();
        input.add(output);

        output = SSTF.scheduling();
        input.add(output);

        output = Scan.scheduling();
        input.add(output);

        output = C_scan.scheduling();
        input.add(output);

        output = look.scheduling();
        input.add(output);

        output = C_look.scheduling();
        input.add(output);

        output = NewlyOptimized.scheduling();
        input.add(output);

        new GUI(input);
    }
}
