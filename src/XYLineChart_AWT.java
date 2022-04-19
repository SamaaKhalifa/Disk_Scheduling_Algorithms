import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import java.util.ArrayList;
import java.util.Arrays;

public class XYLineChart_AWT extends ApplicationFrame {

    public XYLineChart_AWT( String applicationTitle, String chartTitle ,ArrayList<Integer> sequence) {
        super(applicationTitle);
        JFreeChart xylineChart = ChartFactory.createXYLineChart(
                chartTitle ,
                "Sequence" ,
                "Cylenders" ,
                createDataset(sequence) ,
                PlotOrientation.VERTICAL ,
                true , true , false);

        ChartPanel chartPanel = new ChartPanel( xylineChart );
        chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
        final XYPlot plot = xylineChart.getXYPlot( );

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );


        NumberAxis domain = (NumberAxis) plot.getDomainAxis(); //x axis
        domain.setRange(0, 10);
        domain.setTickUnit(new NumberTickUnit(1));


        NumberAxis range = (NumberAxis) plot.getRangeAxis(); // y axis
        range.setRange(0, 200);
        range.setTickUnit(new NumberTickUnit(20));

//

        plot.setRenderer( renderer );
        setContentPane( chartPanel );

    }

    private XYDataset createDataset(ArrayList<Integer> sequence) {
        final XYSeries line = new XYSeries( "algorithm name" );

        for (int i = 0; i < sequence.size(); i++) {
            line.add(i,sequence.get(i));

        }
        final XYSeriesCollection dataset = new XYSeriesCollection( );
        dataset.addSeries( line );

        return dataset;
    }

    public static void main( String[ ] args ) {
        ArrayList<Integer> example2=new ArrayList<>(Arrays.asList(38,180,130,10,50,15,190,90,150));

        XYLineChart_AWT chart = new XYLineChart_AWT("SCheduling",
                "algorithm name",example2);
        chart.pack( );
        RefineryUtilities.centerFrameOnScreen( chart );
        chart.setVisible( true );
    }
}