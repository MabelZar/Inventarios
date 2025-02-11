package Angular.Inventarios.servicio;

import Angular.Inventarios.modelo.Producto;

import java.util.List;

public interface IProductoServicio {
public List<Producto> listarProductos();

public Producto buscarProductoPorId(Integer idProducto);

public void guardarProducto(Producto producto);

public void eliminarProductoPorId (Integer idProducto);
}
