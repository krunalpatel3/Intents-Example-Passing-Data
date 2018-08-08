package krunal.com.example.intentsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    private TextView mTextViewFirstName,mTextViewLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent i = getIntent();
        Bundle b = i.getBundleExtra("PersonBundle");
        String FirstName = b.getString("First Name Bundle");
        String LastName = b.getString("Last Name Bundle");


        mTextViewFirstName = findViewById(R.id.GetFirstNameBundle);
        mTextViewLastName = findViewById(R.id.GetLastNameBundle);

        assert FirstName != null;
        assert LastName != null;

        if (FirstName.matches("") && LastName.matches("")){
            Toast.makeText(this,"There is no Data!",Toast.LENGTH_LONG).show();
        }else {
            mTextViewFirstName.setText(FirstName);
            mTextViewLastName.setText(LastName);
        }

    }
}
