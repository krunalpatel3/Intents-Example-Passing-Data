package krunal.com.example.intentsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView mTextViewFirstName,mTextViewLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();

        String FirstName = i.getStringExtra("Firstname");
        String LastName = i.getStringExtra("Lastname");

        mTextViewFirstName = findViewById(R.id.GetFirstName);

        mTextViewLastName = findViewById(R.id.GetLastName);

        if (FirstName.matches("") && LastName.matches("")){
            Toast.makeText(this,"There is no Data!",Toast.LENGTH_LONG).show();
        }else {
            mTextViewFirstName.setText(FirstName);
            mTextViewLastName.setText(LastName);
        }

    }


}
