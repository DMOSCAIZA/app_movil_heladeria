package empresa.android.app_dibari.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import empresa.android.app_dibari.R;
import empresa.android.app_dibari.model.Categoria;

public class CategoriaAdapter extends RecyclerView.Adapter<CategoriaAdapter.CategoriaViewHolder> {

  Context context;
  List<Categoria> categoriaList;

  public CategoriaAdapter(Context context, List<Categoria> categoriaList) {
    this.context = context;
    this.categoriaList = categoriaList;
  }

  @NonNull
  @Override
  public CategoriaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

    View view = LayoutInflater.from(context).inflate(R.layout.categoria_row_item, parent, false);
    return new CategoriaViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull CategoriaViewHolder holder, int position) {
    holder.svgCategoria.setImageResource(categoriaList.get(position).getImage());
    holder.nombre.setText(categoriaList.get(position).getName());
  }

  @Override
  public int getItemCount() {
    return categoriaList.size();
  }

  public static final class CategoriaViewHolder extends RecyclerView.ViewHolder{
    ImageView svgCategoria;
    TextView nombre;

    public CategoriaViewHolder(@NonNull View itemView){
      super(itemView);
      svgCategoria = itemView.findViewById(R.id.svgCategoria);
      nombre = itemView.findViewById(R.id.nombre);
    }
  }
}
