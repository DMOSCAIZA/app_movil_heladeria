package empresa.android.app_dibari.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import empresa.android.app_dibari.R;
import empresa.android.app_dibari.adapter.CategoriaAdapter;
import empresa.android.app_dibari.adapter.ProductosDestacadosAdapter;
import empresa.android.app_dibari.model.Categoria;
import empresa.android.app_dibari.model.ProductosDestacados;
import androidx.recyclerview.widget.RecyclerView;

public class HomeFragment extends Fragment {

  RecyclerView categoriaRecycler, productosDestacadosRecycler;
  CategoriaAdapter categoriaAdapter;
  ProductosDestacadosAdapter productosDestacadosAdapter;

  public static HomeFragment newInstance() {
    Bundle args = new Bundle();
    HomeFragment fragment = new HomeFragment();
    fragment.setArguments(args);
    return fragment;
  }

  @Override
  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    //Aqui se añade la lista de las categorias
    List<Categoria> categoriaList = new ArrayList<>();
    categoriaList.add(new Categoria( /*image*/ R.drawable.ic_ice_cream, "Helados Artesanales"));
    categoriaList.add(new Categoria( /*image*/ R.drawable.ic_hamburger, "Hamburgesas y Sanguches"));
    categoriaList.add(new Categoria( /*image*/ R.drawable.ic_icon_bebidas, "Bebidas"));
    categoriaList.add(new Categoria( /*image*/ R.drawable.ic_salchipapa, "Salchipapas Y Broasters"));
    categoriaList.add(new Categoria( /*image*/ R.drawable.ic_abarrotes, "Abarrotes"));

    //Aqui se añade la lista de los productos destacados
    List<ProductosDestacados> productosDestacadosList = new ArrayList<>();
    productosDestacadosList.add(new ProductosDestacados( /*image*/ R.drawable.vaso_2_bolas_helado, "Vaso 2 Bolas", "4.00"));
    productosDestacadosList.add(new ProductosDestacados( /*image*/ R.drawable.pavo_milanesa, "Sanguche de Pavo", "6.00"));
    productosDestacadosList.add(new ProductosDestacados( /*image*/ R.drawable.helado_medio_litro, "Helado 1/2 Litro", "12.00"));

    //Estos métodos sirven para hacer las respectivas modificaiones que ya se establecieron a cada item
    setCategoriaRecycler(categoriaList);
    setProdRecycler(productosDestacadosList);
  }

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  private void setCategoriaRecycler(List<Categoria> categoriaList){
    categoriaRecycler = getView().findViewById(R.id.recyclerCategorias);
    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);
    categoriaRecycler.setLayoutManager(layoutManager);
    categoriaAdapter = new CategoriaAdapter(getActivity(), categoriaList);
    categoriaRecycler.setAdapter(categoriaAdapter);
  }

  private void setProdRecycler(List<ProductosDestacados> productosDestacadosList){
    productosDestacadosRecycler = getView().findViewById(R.id.recyclerProductosDestacados);
    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
    productosDestacadosRecycler.setLayoutManager(layoutManager);
    productosDestacadosAdapter = new ProductosDestacadosAdapter(getActivity(), productosDestacadosList);
    productosDestacadosRecycler.setAdapter(productosDestacadosAdapter);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_home, container, false);
  }
}