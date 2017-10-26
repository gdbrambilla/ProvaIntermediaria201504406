package ftce.usjt.br.provaintermediaria201504406;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {  //Gabriel Domingues Brambilla - RA 201504406

    public static final 

    int inumero1;
    int inumero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void startActivityTwo(View view)
    {
        EditText numero1 = (EditText)findViewById(R.id.linha1);
        EditText numero2 = (EditText)findViewById(R.id.linha2);

        String snumero1 = numero1.getText().toString();
        String snumero2 = numero2.getText().toString();

        inumero1 = Integer.parseInt(snumero1);
        inumero2 = Integer.parseInt(snumero2);

        Intent intent = new Intent(this,MainActivity2.class);

        startActivity(intent);
    }


}
