package sg.edu.rp.c346.id20042741.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button btnDisplay;
    TextView tvDisplay;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // have to write these lines of codes in order to not get error
        // findViewById *** important!
        btnDisplay = findViewById(R.id.btndisplay);
        tvDisplay = findViewById(R.id.txtViewDisplay);
        editText = findViewById(R.id.txtInput);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String displayTxt = editText.getText().toString();
                tvDisplay.setText(displayTxt);

            }
        });






    }
}