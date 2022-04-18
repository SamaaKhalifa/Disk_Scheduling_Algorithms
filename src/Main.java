import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> example1=new ArrayList<>(Arrays.asList(98,183,37,122,14,124,65,67));
        ArrayList<Integer> example2=new ArrayList<>(Arrays.asList(38,180,130,10,50,15,190,90,150));


        Disk_Scheduling_Algorithm look=new Look_algorithm(example1,53);
        Disk_Scheduling_Algorithm C_look=new C_look_algorithm(example1,53);
        Disk_Scheduling_Algorithm FCFS=new FCFS_algorithm(example1,53);
        Disk_Scheduling_Algorithm NewlyOptimized = new NewlyOptimizedAlgorithm(example2);
        Disk_Scheduling_Algorithm SSTF = new SSTF(example2,120);

        //look.scheduling();
        //C_look.scheduling();
       // FCFS.scheduling();
     //   NewlyOptimized.scheduling();
        SSTF.scheduling();

    }
}
