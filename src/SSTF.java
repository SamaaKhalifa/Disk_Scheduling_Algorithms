import java.util.ArrayList;
import java.util.Collections;

public class SSTF extends Shared_algorithm implements Disk_Scheduling_Algorithm {
    SSTF(ArrayList<Integer>inputCylindrs,int head){
        super(inputCylindrs,head);
    }

    int getClosestCylinder (final ArrayList<Integer> list, int head){
        ArrayList<Integer> cyliders=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            cyliders.add(list.get(i));


        }
        for (int i = 0; i <cyliders.size() ; i++) {
            cyliders.set(i,Math.abs(cyliders.get(i)-head));

        }

        System.out.print("diffrence ");
        System.out.println(cyliders);
        sort(cyliders);
        return cyliders.get(0);
    }

    @Override
    public void scheduling() {
        int size = input_cylinders.size();
        int currentHead = head_start;
        for (int i = 0; i <size ; i++) {
            System.out.println("currentHead befor" +currentHead);
            int closest =getClosestCylinder(input_cylinders, currentHead);
            System.out.println("closest" + closest);
            Total_Movement += closest;
            currentHead = currentHead + closest;
            cylinders.add(currentHead);
            System.out.println(currentHead);
            System.out.println(input_cylinders);
            input_cylinders.remove(input_cylinders.indexOf(currentHead));


        }

        System.out.print("SSTF algorithm = ");
        for (Integer cylinder : cylinders) System.out.print(cylinder + " ");
        System.out.print("\t");
        System.out.println("Total Movement = "+ Total_Movement);



    }
}
