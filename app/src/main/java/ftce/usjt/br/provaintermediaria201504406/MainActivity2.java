package ftce.usjt.br.provaintermediaria201504406;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity2 extends Activity {   //Gabriel Domingues Brambilla - RA 201504406

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        MainActivity main = new MainActivity();


        ListView lista = (ListView)findViewById(R.id.resultado);


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
}
