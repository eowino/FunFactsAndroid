package com.evansowino.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FunFactsActivity extends AppCompatActivity {
    // Declare our view variables
    private static final String TAG = FunFactsActivity.class.getSimpleName();
    private TextView mFactTextView;
    private Button mShowFactBtn;
    private RelativeLayout mRelativeLayout;
    private FactBook mFactBook = new FactBook();
    private ColourPicker mColourPicker = new ColourPicker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        mFactTextView = findViewById(R.id.factTextView);
        mShowFactBtn = findViewById(R.id.showFactButton);
        mRelativeLayout = findViewById(R.id.funFactActivityLayout);

        mShowFactBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // update mFactTextView with new fact
                mFactTextView.setText(mFactBook.getRandomFact());
                int color = mColourPicker.getColor();
                mRelativeLayout.setBackgroundColor(color);
                mShowFactBtn.setTextColor(color);
            }
        });

        Log.d(TAG, "Logging from onCreate method.");
    }
}

