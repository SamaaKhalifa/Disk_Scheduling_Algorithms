import java.util.ArrayList;

public class   FCFS_algorithm  extends Shared_algorithm implements Disk_Scheduling_Algorithm{
    FCFS_algorithm(ArrayList<Integer> input_cylinders, int head){ super(input_cylinders,head); }

    @Override
    public ArrayList<Integer> scheduling() {
        int start=head_start;
        cylinders.add(start);
        for (Integer input_cylinder : input_temp) {
            Total_Movement += Math.abs(start - input_cylinder);
            cylinders.add(input_cylinder);
            start = input_cylinder;
        }

        System.out.println("FCFS_algorithm Total Movement = "+Total_Movement);
        return cylinders;
    }
}
