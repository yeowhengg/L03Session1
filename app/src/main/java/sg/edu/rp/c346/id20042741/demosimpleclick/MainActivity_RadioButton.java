package sg.edu.rp.c346.id20042741.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioButton;
import android.widget.ToggleButton;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity_RadioButton extends AppCompatActivity {


    RadioGroup rgGender;
    RadioButton rgbMale;
    RadioButton rgbFemale;
    TextView tvDisplay;
    Button btnDisplay;
    ToggleButton btnToggle;
    EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__radio_button);

        rgGender = findViewById(R.id.radioGroupGender);
        rgbMale = findViewById(R.id.radioGroupMale);
        rgbFemale = findViewById(R.id.radioGroupFemale);
        tvDisplay = findViewById(R.id.txtViewDisplay);
        btnDisplay = findViewById(R.id.btndisplay);
        btnToggle = findViewById(R.id.toggleBtn);
        editText = findViewById(R.id.txtInput);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String displayTxtM = ("He says" + editText.getText().toString());
                String displayTxtF = ("She says" + editText.getText().toString());
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.radioGroupMale){
                    tvDisplay.setText(displayTxtM);
                }
                else{
                    tvDisplay.setText(displayTxtF);
                }


            }
        });

    }
}