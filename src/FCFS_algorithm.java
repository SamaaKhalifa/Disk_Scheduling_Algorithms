import java.util.ArrayList;

public class   FCFS_algorithm  extends Shared_algorithm implements Disk_Scheduling_Algorithm{
    FCFS_algorithm(ArrayList<Integer> input_cylinders, int head){ super(input_cylinders,head); }

    @Override
    public void scheduling() {
        int start=head_start;
        for (Integer input_cylinder : input_cylinders) {
            Total_Movement += Math.abs(start - input_cylinder);
            cylinders.add(input_cylinder);
            start = input_cylinder;
        }

        System.out.print("FCFS_algorithm = ");
        for (Integer cylinder : cylinders) System.out.print(cylinder + " ");
        System.out.print("\t");
        System.out.println("Total Movement = "+Total_Movement);
    }
}
