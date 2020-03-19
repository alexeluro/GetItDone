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

public class SignUpActivity extends AppCompatActivity {

    private EditText signUpEmail, signUpPassword, signUpConfirmPassword;
    private Button signUpBtn, topSignInSwitch, topSignUpSwitch, bottomSignInBtn;
    private ImageView topSignUpLogo, googleSignIn, facebookSignIn;
    private TextView haveAcct;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        topSignUpLogo = findViewById(R.id.top_sign_up_logo);
        topSignUpSwitch = findViewById(R.id.first_top_sign_up_switch);
        signUpEmail = findViewById(R.id.sign_up_email);
        signUpPassword = findViewById(R.id.sign_up_password);
        signUpConfirmPassword = findViewById(R.id.sign_up_confirm_password);
        signUpBtn = findViewById(R.id.sign_up_btn);
        topSignInSwitch = findViewById(R.id.top_sign_in_switch);
        bottomSignInBtn = findViewById(R.id.bottom_sign_in_btn);
        googleSignIn = findViewById(R.id.sign_up_google);
        facebookSignIn = findViewById(R.id.sign_up_facebook);
        haveAcct = findViewById(R.id.have_account);


        bottomSignInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

                Pair[] pair = new Pair[8];

                pair[0] = new Pair<View, String>(topSignUpLogo, "logo_trans");
                pair[1] = new Pair<View, String>(topSignInSwitch, "top_sign_in_trans");
                pair[2] = new Pair<View, String>(topSignUpSwitch, "top_sign_up_trans");
                pair[3] = new Pair<View, String>(signUpEmail, "email_trans");
                pair[4] = new Pair<View, String>(signUpPassword, "password_trans");
                pair[5] = new Pair<View, String>(signUpBtn, "sign_in_btn_trans");
                pair[6] = new Pair<View, String>(haveAcct, "have_an_acct_trans");
                pair[7] = new Pair<View, String>(bottomSignInBtn, "bottom_sign_up_tran");


                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SignUpActivity.this, pair);
                    startActivity(intent, options.toBundle());
                }else{
                    startActivity(intent);
                }


            }
        });

    }
}
