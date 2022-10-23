package com.codinginflow.inputtextdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ExampleDialog.ExampleDialogListener {
    private TextView textViewUsername,textViewUsername2;
    private TextView textViewPassword,textViewPassword2;
    private Button button,button2;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewUsername =  findViewById(R.id.textview_username);
        textViewPassword =  findViewById(R.id.textview_password);
        textViewUsername2 =  findViewById(R.id.textview_username2);
        textViewPassword2 =  findViewById(R.id.textview_password2);
        button =  findViewById(R.id.button);
        button2 =  findViewById(R.id.butto2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=1;
                openDialog();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i=2;
                openDialog();
            }
        });
    }

    public void openDialog() {
        ExampleDialog exampleDialog = new ExampleDialog();
        exampleDialog.show(getSupportFragmentManager(), "example dialog");
    }

    @Override
    public void applyTexts(String username, String password) {
        if (i==1){
            textViewUsername.setText(username);
            textViewPassword.setText(password);
            i=0;
        }
        else {
            textViewUsername2.setText(username);
            textViewPassword2.setText(password);
        }

    }
}

