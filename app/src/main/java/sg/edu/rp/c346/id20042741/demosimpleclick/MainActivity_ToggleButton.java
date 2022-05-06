package sg.edu.rp.c346.id20042741.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity_ToggleButton extends AppCompatActivity {

    Button btnDisplay;
    TextView tvDisplay;
    EditText editText;
    ToggleButton btnToggle;
    Boolean checked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__toggle_button);

        // have to write these lines of codes in order to not get error
        // findViewById *** important!
        btnDisplay = findViewById(R.id.btndisplay);
        tvDisplay = findViewById(R.id.txtViewDisplay);
        editText = findViewById(R.id.txtInput);
        btnToggle = findViewById(R.id.toggleBtn);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String displayTxt = editText.getText().toString();
                tvDisplay.setText(displayTxt);
            }
        });

        btnToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checked = btnToggle.isChecked();
                if(checked == false){
                    editText.setEnabled(false);
                    btnDisplay.setEnabled(false);
                }
                else{
                    editText.setEnabled(true);
                    btnDisplay.setEnabled(true);
                }
            }
        });





    }
}