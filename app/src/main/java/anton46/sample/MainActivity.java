package anton46.sample;

import com.anton46.stepsview.StepsView;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    private final String[] steps = {"Step 1", "Step 2", "Step 3", "Step 4"};

    private final String[] steps1 = {"Step 1", "Step 2", "Step 3"};

    private final String[] steps2 = {"Step 1", "Step 2", "Step 3", "Step 4", "Step 5"};

    private StepsView mStepsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mStepsView = (StepsView) findViewById(R.id.stepsView0);
        mStepsView.setLabels(steps)
                .setColorIndicator(Color.GREEN)
                .setBarColor(Color.GRAY)
                .setLabelColor(Color.BLUE)
                .setCompletedPosition(0);

        mStepsView = (StepsView) findViewById(R.id.stepsView1);
        mStepsView.setLabels(steps)
                .setColorIndicator(getResources().getColor(R.color.blue))
                .setBarColor(Color.DKGRAY)
                .setLabelColor(Color.GRAY)
                .setCompletedPosition(1);

        mStepsView = (StepsView) findViewById(R.id.stepsView2);
        mStepsView.setLabels(steps1)
                .setColorIndicator(getResources().getColor(R.color.red))
                .setCompletedPosition(2);

        mStepsView = (StepsView) findViewById(R.id.stepsView3);
        mStepsView.setLabels(steps2)
                .setColorIndicator(getResources().getColor(R.color.orange))
                .setLabelColor(getResources().getColor(R.color.orange))
                .setCompletedPosition(3);

    }

}
