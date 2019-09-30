package com.example.hci_kidoatm;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class KudoDashboard extends AppCompatActivity {

    final Context context = this;
    private Button button;
    private EditText result;
    private int balance=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kudo_dashboard);
    }

    public void userClick(View view) {
        String s1 = "Name: Kido User";
        String s2 = "Contact no: 8286145591";
        String s3 = "Age: 16";
        String s5 = "Balance: 1000rs";
        String s4 = s1 + "\n" + s2 + "\n" + s3+ "\n" + s5;
        AlertDialog.Builder builder = new AlertDialog.Builder(KudoDashboard.this);
        builder.setMessage(s4);
        builder.setTitle("Your Information:");
        // builder.setCancelable(false);
        builder.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog,
                                int which) {
                //finish();
                dialog.cancel();
            }
        });

        // Set the Negative button with No name
        // OnClickListener method is use
        // of DialogInterface interface.
//        builder.setNegativeButton("Confirm",new DialogInterface
//                .OnClickListener() {
//
//            @Override
//            public void onClick(DialogInterface dialog,
//                                int which)
//            {
//
//                // If user click no
//                // then dialog box is canceled.
//                dialog.cancel();
//            }
//        });

        // Create the Alert dialog
        AlertDialog alertDialog = builder.create();

        // Show the Alert Dialog box
        alertDialog.show();
    }

    public void userLang(View view) {
        String s1 = "English";
        AlertDialog.Builder builder = new AlertDialog.Builder(KudoDashboard.this);
        builder.setMessage(s1);
        builder.setTitle("Your Language:");
        // builder.setCancelable(false);
        builder.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog,
                                int which) {
                //finish();
                dialog.cancel();
            }
        });

        // Set the Negative button with No name
        // OnClickListener method is use
        // of DialogInterface interface.
//        builder.setNegativeButton("Confirm",new DialogInterface
//                .OnClickListener() {
//
//            @Override
//            public void onClick(DialogInterface dialog,
//                                int which)
//            {
//
//                // If user click no
//                // then dialog box is canceled.
//                dialog.cancel();
//            }
//        });

        // Create the Alert dialog
        AlertDialog alertDialog = builder.create();

        // Show the Alert Dialog box
        alertDialog.show();
    }

    public void userAdd(View view) {

        // components from main.xml
        button = (Button) findViewById(R.id.ButtomImageView3);
        //result = (EditText) findViewById(R.id.editTextResult);

        // get prompts.xml view
        LayoutInflater li = LayoutInflater.from(context);
        View promptsView = li.inflate(R.layout.kudoprompt, null);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                context);

        // set prompts.xml to alertdialog builder
        alertDialogBuilder.setView(promptsView);

        final EditText userInput = (EditText) promptsView
                .findViewById(R.id.editTextDialogUserInput);

        //Toast.makeText(KudoDashboard.this, "AMount"+num1 , Toast.LENGTH_SHORT).show();

        // set dialog message
        alertDialogBuilder
                .setCancelable(false)
                .setPositiveButton("Add Amount",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // get user input and set it to result
                                // edit text
                                //result.setText(userInput.getText());
                                String input=userInput.getText().toString();

                                int num1=Integer.parseInt(userInput.getText().toString());
                                balance=balance+num1;



                                Toast.makeText(KudoDashboard.this, "Amount Deposited: "+input, Toast.LENGTH_SHORT).show();
                            }
                        })
                .setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                Toast.makeText(KudoDashboard.this, "Amount not Deposited!!", Toast.LENGTH_SHORT).show();
                            }
                        });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();

    }

    public void userWithdraw(View view) {

        // components from main.xml
        button = (Button) findViewById(R.id.ButtomImageView3);
        //result = (EditText) findViewById(R.id.editTextResult);

        // get prompts.xml view
        LayoutInflater li = LayoutInflater.from(context);
        View promptsView = li.inflate(R.layout.kudoprompt, null);

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                context);

        // set prompts.xml to alertdialog builder
        alertDialogBuilder.setView(promptsView);

        final EditText userInput = (EditText) promptsView
                .findViewById(R.id.editTextDialogUserInput);

        // set dialog message
        alertDialogBuilder
                .setCancelable(false)
                .setPositiveButton("Remove Amount",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                // get user input and set it to result
                                // edit text
                                //result.setText(userInput.getText());
                                String input=userInput.getText().toString();

                                int num1=Integer.parseInt(userInput.getText().toString());
                                balance=balance-num1;

                                Toast.makeText(KudoDashboard.this, "Amount Taken"+input, Toast.LENGTH_SHORT).show();
                            }
                        })
                .setNegativeButton("Cancel",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                Toast.makeText(KudoDashboard.this, "Amount not Taken!!", Toast.LENGTH_SHORT).show();
                            }
                        });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();

    }

    public void userBalance(View view){

        String newBalance=Integer.toString(balance) ;
        Toast.makeText(KudoDashboard.this, "Your Total Balance: "+newBalance, Toast.LENGTH_SHORT).show();
    }

    public void userMoneyTrans(View view) {
        String s1 = "Added: 100rs.";
        String s2 = "Removed: 20rs.";
        String s3 = "Balance: 80rs.";
        String s4 = s1 + "\n" + s2 + "\n" + s3;
        AlertDialog.Builder builder = new AlertDialog.Builder(KudoDashboard.this);
        builder.setMessage(s4);
        builder.setTitle("Money Details:");
        // builder.setCancelable(false);
        builder.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog,
                                int which) {
                //finish();
                dialog.cancel();
            }
        });

        // Set the Negative button with No name
        // OnClickListener method is use
        // of DialogInterface interface.
//        builder.setNegativeButton("Confirm",new DialogInterface
//                .OnClickListener() {
//
//            @Override
//            public void onClick(DialogInterface dialog,
//                                int which)
//            {
//
//                // If user click no
//                // then dialog box is canceled.
//                dialog.cancel();
//            }
//        });

        // Create the Alert dialog
        AlertDialog alertDialog = builder.create();

        // Show the Alert Dialog box
        alertDialog.show();
    }
}
