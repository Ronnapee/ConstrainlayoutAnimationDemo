package solution.devdd.constrainlayoutanimationdemo;

import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout constraintLayout;
    private ConstraintSet applyConstraintSet = new ConstraintSet();
    private ConstraintSet resetConstraintSet = new ConstraintSet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        constraintLayout = (ConstraintLayout)findViewById(R.id.main);
        applyConstraintSet.clone(constraintLayout);
        resetConstraintSet.clone(constraintLayout);

    }

    public void onApplyClick(View view) {
        applyConstraintSet.setMargin(R.id.button1,ConstraintSet.START,8);
        applyConstraintSet.applyTo(constraintLayout);
    }

    public void onResetClick(View view) {
        resetConstraintSet.applyTo(constraintLayout);
    }
}
