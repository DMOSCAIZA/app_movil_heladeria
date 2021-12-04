package empresa.android.app_dibari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    getSupportActionBar().hide();

    setContentView(R.layout.activity_main);
    //Animaciones
    Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_arriba);
    Animation animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamiento_abajo);
    ImageView logoView = findViewById(R.id.logoView);
    TextView empresaView = findViewById(R.id.empresaView);
    TextView heladeriaView = findViewById(R.id.heladeriaView);
    logoView.setAnimation(animacion1);
    empresaView.setAnimation(animacion2);
    heladeriaView.setAnimation(animacion2);

    new Handler().postDelayed(new Runnable(){
      @Override
      public void run() {
        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(intent);
        finish();
      }
    }, 3500);
  }
}