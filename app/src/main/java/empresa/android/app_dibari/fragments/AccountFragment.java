package empresa.android.app_dibari.fragments;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import empresa.android.app_dibari.R;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class AccountFragment extends Fragment {

  private SharedPreferences prefs;

  public static AccountFragment newInstance() {
    Bundle args = new Bundle();
    AccountFragment fragment = new AccountFragment();
    fragment.setArguments(args);
    return fragment;
  }

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    prefs = this.getActivity().getSharedPreferences("Preferences", Context.MODE_PRIVATE);

  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_account, container, false);
  }


  public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
    super.onCreateOptionsMenu(menu, inflater);
  }

  @Override
  public boolean onOptionsItemSelected(@NonNull MenuItem item) {
    switch (item.getItemId()) {
      /*case R.id.menu_logout:
        return true;*/

      case R.id.menu_forget_logout:
        removeSharedPreferences();
        return true;
      default:
        return super.onOptionsItemSelected(item);
    }
  }

  private void removeSharedPreferences(){
    prefs.edit().clear().apply();
  }

}