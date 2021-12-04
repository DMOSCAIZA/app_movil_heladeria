package empresa.android.app_dibari.model;

public class ProductosDestacados {

  int codigo;
  int image;
  String name;
  String precio;


  public ProductosDestacados(int img, String name, String precio) {
    this.image = img;
    this.name = name;
    this.precio = precio;
  }

  public int getImage() { return image; }
  public void setImage(int image) { this.image = image; }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getPrecio() { return precio; }
  public void setPrecio(String precio) { this.precio = precio; }

}
