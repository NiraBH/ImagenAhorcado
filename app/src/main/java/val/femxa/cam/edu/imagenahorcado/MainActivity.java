package val.femxa.cam.edu.imagenahorcado;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import static val.femxa.cam.edu.imagenahorcado.R.anim.fade_in;

public class MainActivity extends AppCompatActivity {

    private int[] array_pics = {R.drawable.ic_cuerda, R.drawable.ic_cabeza, R.drawable.ic_cuerpo, R.drawable.ic_brazo, R.drawable.ic_brazos, R.drawable.ic_pierna};
    private Spinner spCategorias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.imagenesAhorcado);
        //imageView.setImageResource(array_pics[1]);
        imageView.setBackgroundResource(R.drawable.progress_animation);


        AnimationDrawable progressAnimation = (AnimationDrawable) imageView.getBackground();
        progressAnimation.start();



    }


    public void victoria (View view) {
       startActivity(new Intent(this,VictoriaActivity.class));


    }



    public void derrota (View view) {
        startActivity(new Intent(this,DerrotaActivity.class));
    }




}


       // if ("Metodo Teclado""Letra acertada")
       // {
//
       // }else







