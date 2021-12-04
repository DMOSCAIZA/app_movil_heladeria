package empresa.android.app_dibari;

import androidx.annotation.ColorLong;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import empresa.android.app_dibari.fragments.AccountFragment;
import empresa.android.app_dibari.fragments.HomeFragment;
import empresa.android.app_dibari.fragments.ShopFragment;

public class HomeActivity extends AppCompatActivity {

  BottomNavigationView bottomNavigationView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    showSelectedFragment(new HomeFragment());
    getSupportActionBar().setTitle( Html.fromHtml("<font color='#000000'>Bienvenid@</font>"));

    bottomNavigationView = (BottomNavigationView) findViewById(R.id.nav_view);
    bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
      @Override
      public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.nav_home){
          showSelectedFragment(new HomeFragment());
          getSupportActionBar().setTitle( Html.fromHtml("<font color='#000000'>Bienvenid@</font>"));
        }
        if(item.getItemId() == R.id.nav_shop){
          showSelectedFragment(new ShopFragment());
          getSupportActionBar().setTitle( Html.fromHtml("<font color='#000000'>Mi Carrito</font>"));
        }
        if(item.getItemId() == R.id.nav_account){
          showSelectedFragment(new AccountFragment());
          getSupportActionBar().setTitle( Html.fromHtml("<font color='#000000'>Iniciar Sesión</font>"));
        }
        return false;
      }
    });
  }

  private void showSelectedFragment(Fragment fragment){
    getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .commit();
  }
}