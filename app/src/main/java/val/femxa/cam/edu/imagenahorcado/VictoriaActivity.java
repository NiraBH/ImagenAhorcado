package val.femxa.cam.edu.imagenahorcado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VictoriaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_victoria);





    }
    public void victoria(View view) {
        startActivity(new Intent(this,MainActivity.class));
    }


}
