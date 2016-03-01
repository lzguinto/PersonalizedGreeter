package com.example.pbuskell.personalizedgreeter;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class BeGreeted extends AppCompatActivity {

    String strUsersFirst = "";
    String strUsersMiddle = "";
    String strUsersLast = "";

    Button btnGreetMe;
    EditText edtxtFirstName;
    EditText edtxtMiddleName;
    EditText edtxtLastName;
    TextView txtvwGreetingSpace;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_greeted);

        btnGreetMe = (Button) findViewById(R.id.btnGreetMe);
        edtxtFirstName = (EditText) findViewById(R.id.edtxtFirst);
        edtxtMiddleName = (EditText) findViewById(R.id.edtxtMiddle);
        edtxtLastName = (EditText) findViewById(R.id.edtxtLast);
        txtvwGreetingSpace = (TextView) findViewById(R.id.txtvwGreetingSpace);
    }

    public void greetTheUser(View vw)
    {
        Resources res = getResources();

        strUsersFirst = edtxtFirstName.getText().toString();
        strUsersMiddle = edtxtMiddleName.getText().toString();
        strUsersLast = edtxtLastName.getText().toString();

        txtvwGreetingSpace.setText(String.format(res.getString(R.string.strGreeting), strUsersFirst,
                strUsersMiddle, strUsersLast));
    }
}
