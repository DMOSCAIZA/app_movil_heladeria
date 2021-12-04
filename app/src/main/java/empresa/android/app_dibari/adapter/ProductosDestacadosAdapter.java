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
import empresa.android.app_dibari.model.ProductosDestacados;


public class ProductosDestacadosAdapter extends RecyclerView.Adapter<ProductosDestacadosAdapter.PDViewHolder> {
  Context context;
  List<ProductosDestacados> PDList;

  public ProductosDestacadosAdapter(Context context, List<ProductosDestacados> PDList) {
    this.context = context;
    this.PDList = PDList;
  }

  @NonNull
  @Override
  public PDViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(context).inflate(R.layout.productos_destacados_row_item, parent, false);
    return new PDViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull PDViewHolder holder, int position) {
    holder.imgPD.setImageResource(PDList.get(position).getImage());
    holder.nombre.setText(PDList.get(position).getName());
    holder.precio.setText(PDList.get(position).getPrecio());
  }

  @Override
  public int getItemCount() {
    return PDList.size();
  }

  public static final class PDViewHolder extends RecyclerView.ViewHolder {
    ImageView imgPD;
    TextView nombre, precio;

    public PDViewHolder(@NonNull View itemView){
      super(itemView);
      imgPD = itemView.findViewById(R.id.imgProducto);
      nombre = itemView.findViewById(R.id.nombre);
      precio = itemView.findViewById(R.id.precio);
    }
  }
}