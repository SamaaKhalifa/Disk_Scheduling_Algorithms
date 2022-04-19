import java.util.ArrayList;
import java.util.Collections;

public class SSTF extends Shared_algorithm implements Disk_Scheduling_Algorithm {
    SSTF(ArrayList<Integer>inputCylindrs,int head){
        super(inputCylindrs,head);
    }

    int getClosestCylinder (final ArrayList<Integer> list, int head){

        ArrayList<Integer> cyliders = new ArrayList<>(list);
        for (int i = 0; i <cyliders.size() ; i++) {
            cyliders.set(i,Math.abs(cyliders.get(i)-head));
        }

        sort(cyliders);
        return cyliders.get(0);
    }

    @Override
    public void scheduling() {
        int size = input_cylinders.size();
        int currentHead = head_start;
        for (int i = 0; i <size ; i++) {
            int closest =getClosestCylinder(input_cylinders, currentHead);

            Total_Movement += closest;
            if(input_cylinders.contains(currentHead + closest))
            {
                currentHead = currentHead + closest;
            }
            else
            {
                currentHead = currentHead - closest;
            }
            cylinders.add(currentHead);
            input_cylinders.remove((Integer) currentHead);
        }

        System.out.print("SSTF algorithm : ");
        for (Integer cylinder : cylinders) System.out.print(cylinder + " ");
        System.out.print("\t");
        System.out.println("Total Movement = "+ Total_Movement);



    }
}
