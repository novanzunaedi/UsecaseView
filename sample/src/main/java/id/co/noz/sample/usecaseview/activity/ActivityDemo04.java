package id.co.noz.sample.usecaseview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import id.co.noz.sample.usecaseview.R;
import id.co.noz.usecaseview.view4.MaterialShowcaseView4;

public class ActivityDemo04 extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private static final String SHOWCASE_ID = "sequence example";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo04);

        button = (Button) findViewById(R.id.btncoba);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btncoba:
                setUseCaseView();
                break;
            default:
                break;
        }
    }

    private void setUseCaseView() {
        new MaterialShowcaseView4.Builder(this)
                .setTarget(button)
//                    .setMarginTopContent(50)
//                    .setTriangle1Visible(true)
                .setTittleText("Filter Your Selection")
                .setDismissText("Ok, It is!")
                .setContentText("Narrow down your preferences by filtering the type of cuisine," +
                        "location, collection date, pax, and price range.")
                .setDelay(0) // optional but starting animations immediately in onCreate can make them choppy
                .singleUse(SHOWCASE_ID) // provide a unique ID used to ensure it is only shown once
                .withRectangleShape()
                .show();

    }
}
