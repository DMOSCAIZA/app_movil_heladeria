package empresa.android.app_dibari.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import empresa.android.app_dibari.R;

public class ShopFragment extends Fragment {

  public static ShopFragment newInstance() {
    Bundle args = new Bundle();
    ShopFragment fragment = new ShopFragment();
    fragment.setArguments(args);
    return fragment;
  }
  
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_shop, container, false);
  }
}