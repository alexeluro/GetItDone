package com.inspiredcoda.getitdone;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    private EditText signInEmail, signInPassword;
    private Button signInBtn, topSignInSwitch, topSignUpSwitch, bottomsignUpBtn;
    private ImageView topSignInLogo, googleSignIn, facebookSignIn;
    private TextView dontHaveAcct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


//        View Hooks
        topSignInLogo = findViewById(R.id.sign_in_logo_solo);
        topSignInSwitch = findViewById(R.id.first_top_sign_in);
        signInEmail = findViewById(R.id.sign_in_email);
        signInPassword = findViewById(R.id.sign_in_password);
        signInBtn = findViewById(R.id.sign_in_btn);
        topSignUpSwitch = findViewById(R.id.top_sign_up_switch);
        dontHaveAcct = findViewById(R.id.dont_have_account);
        bottomsignUpBtn = findViewById(R.id.bottom_sign_up_btn);
        googleSignIn = findViewById(R.id.sign_in_google);
        facebookSignIn = findViewById(R.id.sign_in_facebook);

        bottomsignUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);

                Pair[] pair = new Pair[8];

                pair[0] = new Pair<View, String>(topSignInLogo, "logo_trans");
                pair[1] = new Pair<View, String>(topSignInSwitch, "top_sign_in_trans");
                pair[2] = new Pair<View, String>(topSignUpSwitch, "top_sign_up_trans");
                pair[3] = new Pair<View, String>(signInEmail, "email_trans");
                pair[4] = new Pair<View, String>(signInPassword, "password_trans");
                pair[5] = new Pair<View, String>(signInBtn, "sign_in_btn_trans");
                pair[6] = new Pair<View, String>(dontHaveAcct, "have_an_acct_trans");
                pair[7] = new Pair<View, String>(bottomsignUpBtn, "bottom_sign_up_tran");

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SignInActivity.this, pair);
                    startActivity(intent, options.toBundle());
                }else{
                    startActivity(intent);
                }

            }
        });
    }


}
