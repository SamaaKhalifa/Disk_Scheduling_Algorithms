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

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class XYLineChart_AWT extends JFrame {

    public XYLineChart_AWT( String applicationTitle, String chartTitle ,ArrayList<Integer> sequence) {
        super(applicationTitle);
        JFreeChart xylineChart = ChartFactory.createXYLineChart(
                chartTitle ,
                "Sequence" ,
                "Cylenders" ,
                createDataset(sequence,chartTitle) ,
                PlotOrientation.VERTICAL ,
                true , true , false);

        ChartPanel chartPanel = new ChartPanel( xylineChart );
        chartPanel.setPreferredSize( new java.awt.Dimension( 700 , 500 ) );
        final XYPlot plot = xylineChart.getXYPlot( );

        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer( );


        NumberAxis domain = (NumberAxis) plot.getDomainAxis(); //x axis
        domain.setRange(0, sequence.size()+5);
        domain.setTickUnit(new NumberTickUnit(1));


        NumberAxis range = (NumberAxis) plot.getRangeAxis(); // y axis
        range.setRange(0, 200);
        range.setTickUnit(new NumberTickUnit(20));

        plot.setRenderer( renderer );
        setContentPane( chartPanel );
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    private XYDataset createDataset(ArrayList<Integer> sequence,String title) {
        final XYSeries line = new XYSeries( title );

        for (int i = 0; i < sequence.size(); i++) {
            line.add(i,sequence.get(i));

        }
        final XYSeriesCollection dataset = new XYSeriesCollection( );
        dataset.addSeries( line );

        return dataset;
    }
}