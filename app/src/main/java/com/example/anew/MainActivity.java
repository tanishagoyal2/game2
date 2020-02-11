package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bu5,bu1,bu2,bu3,bu4,bu7,bu6,bu8,bu9;
    String st1,st2,st3,st4,st5,st6,st7,st8,st9;
    TextView tp1,tp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tp1=(TextView) findViewById(R.id.t1);
        tp2=(TextView) findViewById(R.id.t2);
    }
    public int playert=1;
    public int xscore=0;
    public int oscore=0;

    public void b5ActionPerformed(View v) {
        bu5=(Button)v;
        st5=bu5.getText().toString();
        if (st5.equals("")){
            if (playert%2==0){
                bu5.setText("O");
            }
            else{
                bu5.setText("X");
            }

        }
        bu5.setEnabled(false);
        playert+=1;
        check();

    }
    public void b1ActionPerformed(View v) {
        bu1=(Button)v;
        st1=bu1.getText().toString();
        if (st1.equals("")){
            if (playert%2==0){
                bu1.setText("O");
            }
            else{
                bu1.setText("X");
            }
        }
        bu1.setEnabled(false);
        playert+=1;
        check();

    }
    public void b2ActionPerformed(View v) {
        bu2=(Button)v;
        st2=bu2.getText().toString();
        if (st2.equals("")){
            if (playert%2==0){
                bu2.setText("O");
            }
            else{
                bu2.setText("X");
            }
        }
        bu2.setEnabled(false);
        playert+=1;
        check();

    }
    public void b3ActionPerformed(View v) {
        bu3=(Button)v;
        st3=bu3.getText().toString();
        if (st3.equals("")){
            if (playert%2==0){
                bu3.setText("O");
            }
            else{
                bu3.setText("X");
            }
        }
        bu3.setEnabled(false);
        playert+=1;
        check();

    }
    public void b4ActionPerformed(View v) {
        bu4=(Button)v;
        st4=bu4.getText().toString();
        if (st4.equals("")){
            if (playert%2==0){
                bu4.setText("O");
            }
            else{
                bu4.setText("X");
            }
        }
        bu4.setEnabled(false);
        playert+=1;
        check();
    }
    public void b6ActionPerformed(View v) {
        bu6=(Button)v;
        st6=bu6.getText().toString();
        if (st6.equals("")){
            if (playert%2==0){
                bu6.setText("O");
            }
            else{
                bu6.setText("X");
            }
        }
        bu6.setEnabled(false);
        playert+=1;
        check();
    }
    public void b7ActionPerformed(View v) {
        bu7=(Button)v;
        st7=bu7.getText().toString();
        if (st7.equals("")){
            if (playert%2==0){
                bu7.setText("O");
            }
            else{
                bu7.setText("X");
            }
        }
        bu7.setEnabled(false);
        playert+=1;
        check();
    }
    public void b8ActionPerformed(View v) {
        bu8=(Button)v;
        st8=bu8.getText().toString();
        if (st8.equals("")){
            if (playert%2==0){
                bu8.setText("O");
            }
            else{
                bu8.setText("X");
            }
        }
        bu8.setEnabled(false);
        playert+=1;
        check();
    }
    public void b9ActionPerformed(View v) {
        bu9=(Button)v;
        st9=bu9.getText().toString();
        if (st9.equals("")){
            if (playert%2==0){
                bu9.setText("O");
            }
            else{
                bu9.setText("X");
            }
        }
        bu9.setEnabled(false);
        playert+=1;
        check();
    }
    private void setscore() {
        tp1.setText(""+xscore);
        tp2.setText(""+oscore);
        u1.setEnabled(false);
        u2.setEnabled(false);
        u3.setEnabled(false);
        u4.setEnabled(false);
        u5.setEnabled(false);
        u6.setEnabled(false);
        u7.setEnabled(false);
        u8.setEnabled(false);
        u9.setEnabled(false);
    }

    public void check(){
        enabl();
        if(ut1==("X") && ut2==("X") && ut3==("X")){
            xscore+=1;
            setscore();
            Toast toast = Toast.makeText(getApplicationContext(), "PLAYER X WINS", Toast.LENGTH_LONG);

            toast.show();
        }
        if(ut1==("O") && ut2==("O") && ut3==("O")){
            oscore+=1;
            setscore();
            Toast toast = Toast.makeText(getApplicationContext(), "PLAYER O WINS", Toast.LENGTH_LONG);

            toast.show();
        }
        if(ut1==("O") && ut5==("O") && ut9==("O")){
            oscore+=1;
            setscore();
            Toast toast = Toast.makeText(getApplicationContext(), "PLAYER O WINS", Toast.LENGTH_LONG);

            toast.show();
        }
        if(ut1==("X") && ut5==("X") && ut9==("X")){
            xscore+=1;
            setscore();
            Toast toast = Toast.makeText(getApplicationContext(), "PLAYER X WINS", Toast.LENGTH_LONG);

            toast.show();
        }
        if(ut1==("O") && ut4==("O") && ut7==("O")){
            oscore+=1;
            setscore();
            Toast toast = Toast.makeText(getApplicationContext(), "PLAYER O WINS", Toast.LENGTH_LONG);

            toast.show();
        }
        if(ut1==("X") && ut4==("X") && ut7==("X")){
            xscore+=1;
            setscore();
            Toast toast = Toast.makeText(getApplicationContext(), "PLAYER X WINS", Toast.LENGTH_LONG);

            toast.show();
        }
        if(ut2==("X") && ut5==("X") && ut8==("X")){
            xscore+=1;
            setscore();
            Toast toast = Toast.makeText(getApplicationContext(), "PLAYER X WINS", Toast.LENGTH_LONG);
            toast.show();
        }
        if(ut2==("O") && ut5==("O") && ut8==("O")){
            oscore+=1;
            setscore();
            Toast toast = Toast.makeText(getApplicationContext(), "PLAYER O WINS", Toast.LENGTH_LONG);

            toast.show();
        }
        if(ut3==("X") && ut6==("X") && ut9==("X")){
            xscore+=1;
            setscore();
            Toast toast = Toast.makeText(getApplicationContext(), "PLAYER X WINS", Toast.LENGTH_LONG);

            toast.show();
        }
        if(ut3==("O") && ut6==("O") && ut9==("O")){
            oscore+=1;
            setscore();
            Toast toast = Toast.makeText(getApplicationContext(), "PLAYER O WINS", Toast.LENGTH_LONG);

            toast.show();
        }
        if(ut4==("X") && ut5==("X") && ut6==("X")){
            xscore+=1;
            setscore();
            Toast toast = Toast.makeText(getApplicationContext(), "PLAYER X WINS", Toast.LENGTH_LONG);

            toast.show();
        }
        if(ut4==("O") && ut5==("O") && ut6==("O")){
            oscore+=1;
            setscore();
            Toast toast = Toast.makeText(getApplicationContext(), "PLAYER 0 WINS", Toast.LENGTH_LONG);

            toast.show();
        }
        if(ut7==("X") && ut8==("X") && ut9==("X")){
            xscore+=1;
            setscore();
            Toast toast = Toast.makeText(getApplicationContext(), "PLAYER X WINS", Toast.LENGTH_LONG);

            toast.show();
        }
        if(ut7==("O") && ut8==("O") && ut9==("O")){
            oscore+=1;
            setscore();
            Toast toast = Toast.makeText(getApplicationContext(), "PLAYER O WINS", Toast.LENGTH_LONG);

            toast.show();
        }
        if(ut7==("X") && ut5==("X") && ut3==("X")){
            xscore+=1;
            setscore();
            Toast toast = Toast.makeText(getApplicationContext(), "PLAYER X WINS", Toast.LENGTH_LONG);

            toast.show();
        }
        if(ut7==("O") && ut5==("O") && ut3==("O")){
            oscore+=1;
            setscore();
            Toast toast = Toast.makeText(getApplicationContext(), "PLAYER O WINS", Toast.LENGTH_LONG);

            toast.show();
        }
        if(playert==9){
            Toast toast = Toast.makeText(getApplicationContext(), "MATCH IS DRAWN", Toast.LENGTH_LONG);

            toast.show();
        }
    }

    Button u1,u2,u3,u4,u5,u6,u7,u8,u9;
    String ut1,ut2,ut3,ut4,ut5,ut6,ut7,ut8,ut9;
    public void enabl(){
        u1=(Button)findViewById(R.id.b1);
        ut1= (String) u1.getText();
        u2=(Button)findViewById(R.id.b2);
        ut2= (String) u2.getText();
        u3=(Button)findViewById(R.id.b3);
        ut3= (String) u3.getText();
        u4=(Button)findViewById(R.id.b4);
        ut4= (String) u4.getText();
        u5=(Button)findViewById(R.id.b5);
        ut5= (String) u5.getText();
        u6=(Button)findViewById(R.id.b6);
        ut6= (String) u6.getText();
        u7=(Button)findViewById(R.id.b7);
        ut7= (String) u7.getText();
        u8=(Button)findViewById(R.id.b8);
        ut8= (String) u8.getText();
        u9=(Button)findViewById(R.id.b9);
        ut9= (String) u9.getText();
    }
    public void reset(View v){
        xscore=0;
        oscore=0;
        u1.setText("");
        u2.setText("");
        u3.setText("");
        u4.setText("");
        u5.setText("");
        u6.setText("");
        u7.setText("");
        u8.setText("");
        u9.setText("");
        tp1.setText(""+xscore);
        tp2.setText(""+oscore);
        u1.setEnabled(true);
        u2.setEnabled(true);
        u3.setEnabled(true);
        u4.setEnabled(true);
        u5.setEnabled(true);
        u6.setEnabled(true);
        u7.setEnabled(true);
        u8.setEnabled(true);
        u9.setEnabled(true);
    }

    public void playagain(View v){
        u1.setText("");
        u2.setText("");
        u3.setText("");
        u4.setText("");
        u5.setText("");
        u6.setText("");
        u7.setText("");
        u8.setText("");
        u9.setText("");
        playert=1;
        u1.setEnabled(true);
        u2.setEnabled(true);
        u3.setEnabled(true);
        u4.setEnabled(true);
        u5.setEnabled(true);
        u6.setEnabled(true);
        u7.setEnabled(true);
        u8.setEnabled(true);
        u9.setEnabled(true);
    }
}

