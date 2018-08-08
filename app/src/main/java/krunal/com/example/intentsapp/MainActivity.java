package krunal.com.example.intentsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTextFirstName,mEditTextLastName;

    private Button mSendBtn,mSendBundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextFirstName = findViewById(R.id.editTextFirstName);

        mEditTextLastName = findViewById(R.id.editTextLastName);

        mSendBundle = findViewById(R.id.SendBundle);
        mSendBtn = findViewById(R.id.Send);

        mSendBtn.setOnClickListener(v -> {

            String getFirstName = mEditTextFirstName.getText().toString();

            String getLastName = mEditTextLastName.getText().toString();

            if (getFirstName.matches("") || getLastName.matches("")){
                Toast.makeText(this,"Enter FirstName and LastName",Toast.LENGTH_LONG).show();
            }else {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("Firstname", getFirstName);
                i.putExtra("Lastname",getLastName);
                startActivity(i);
            }
        });

        mSendBundle.setOnClickListener(v -> {

            String getFirstName = mEditTextFirstName.getText().toString();
            String getLastName = mEditTextLastName.getText().toString();

            if (getFirstName.matches("") || getLastName.matches("")){
                Toast.makeText(this,"Enter FirstName and LastName",Toast.LENGTH_LONG).show();
            }else {
                Intent i = new Intent(MainActivity.this, ThirdActivity.class);
                Bundle b = new Bundle();
                b.putString("First Name Bundle" , getFirstName);
                b.putString("Last Name Bundle", getLastName);
                i.putExtra("PersonBundle", b);

                startActivity(i);
            }


        });

    }
}
