package com.baitett.se2einzelphase;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Checks whether text in tbInputBox is a palindrome and displays a Message Box.
     * @param view
     */
    public void checkPalindrome(View view) {
        EditText inputBox = (EditText) findViewById(R.id.tbInputBox);
        String input = inputBox.getText().toString();
        String output = "";
        if (input.length() < 5)
            output = "Please enter more than 5 characters!";
        else if (StringUtils.isPalindrome(input))
            output = input + " is a palindrome";
        else
            output = input + " is not a palindrome";

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Result")
                .setMessage(output)
                .setNeutralButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                    }
                })
                .show();
    }
}
