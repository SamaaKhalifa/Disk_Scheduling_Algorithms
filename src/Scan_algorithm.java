import java.util.ArrayList;

public class Scan_algorithm extends Shared_algorithm implements Disk_Scheduling_Algorithm{

    private final ArrayList<Integer> input_temp;

    Scan_algorithm(ArrayList<Integer> input_cylinders, int head){
        super(input_cylinders,head);
        input_temp=new ArrayList<>(input_cylinders);
    }


    @Override
    public void scheduling() {
        int counter=0,size=input_temp.size(),start=head_start;
        boolean f=true;

        cylinders.add(start);
        for(int i=start;i>=0;i--)
        {
            if(counter==size)
            {
                f=false;
                break;
            }
            if(input_temp.contains(i))
            {
                Total_Movement += (start-i);
                start=i;
                cylinders.add(start);
                counter++;

                input_temp.remove((Integer) i);
            }
        }

        Total_Movement +=start;
        start=0;
        cylinders.add(start);

        if(f)
        {
            for(int i=start;i<200;i++)
            {
                if(counter==size)
                {
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
        }

        System.out.print("Scan algorithm : ");
        for(int i=0;i<cylinders.size()-1;i++)
        {
            System.out.print(cylinders.get(i)+"->");
        }
        System.out.print(cylinders.get(cylinders.size()-1));

        System.out.println("\t Total movement= "+Total_Movement);
    }
}
