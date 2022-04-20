import java.util.ArrayList;

public class C_scan_algorithm extends Shared_algorithm implements Disk_Scheduling_Algorithm{

    private final ArrayList<Integer> input_temp;

    C_scan_algorithm(ArrayList<Integer> input_cylinders, int head){
        super(input_cylinders,head);
        input_temp=new ArrayList<>(input_cylinders);
    }

    @Override
    public ArrayList<Integer> scheduling() {
        int counter=0,size=input_temp.size(),start=head_start;
        boolean f=true;
        cylinders.add(start);
        while(true)
        {
            for(int i=start;i<200;i++)
            {
                if(counter==size)
                {
                    f=false;
                    break;
                }
                if(input_temp.contains(i))
                {
                    Total_Movement += (i-start);
                    start=i;
                    cylinders.add(start);
                    counter++;

                    input_temp.remove((Integer) i);
                }
            }
            if(!f) break;

            Total_Movement +=(199-start);
            start=199;
            cylinders.add(start);

            Total_Movement +=start;
            start=0;
            cylinders.add(start);
        }

        System.out.println("C_Scan algorithm Total movement= "+Total_Movement);

        return cylinders;
    }
}
