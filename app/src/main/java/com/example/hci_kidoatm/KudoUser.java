package com.example.hci_kidoatm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class KudoUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kudo_user);
    }

    public void clickk(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(KudoUser.this);
        builder.setMessage("Do you want to exit ?");
        builder.setTitle("Student Info");
       // builder.setCancelable(false);
        builder.setPositiveButton("Yes",new DialogInterface.OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which)
                            {
                                finish();
                            }
                        });

        // Set the Negative button with No name
        // OnClickListener method is use
        // of DialogInterface interface.
        builder.setNegativeButton("No",new DialogInterface
                                .OnClickListener() {

                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which)
                            {

                                // If user click no
                                // then dialog box is canceled.
                                dialog.cancel();
                            }
                        });

        // Create the Alert dialog
        AlertDialog alertDialog = builder.create();

        // Show the Alert Dialog box
        alertDialog.show();
    }
}
