package Angular.Inventarios.servicio;

import Angular.Inventarios.modelo.Producto;
import Angular.Inventarios.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio implements IProductoServicio {


    //estamos conectando la capa del servicio con el repositorio (el repo se conecta a la entidad y la entidad a la bd
    //inyectar las dependdencias de spring
    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Override
    public List<Producto> listarProductos() {
        return this.productoRepositorio.findAll();
    }


    @Override
    public Producto buscarProductoPorId(Integer idProducto) {
        Producto producto=this.productoRepositorio.findById(idProducto).orElse(null);
        return producto;
    }

    @Override
    public void guardarProducto(Producto producto) {
        this.productoRepositorio.save(producto);

    }

    @Override
    public void eliminarProductoPorId(Integer idProducto) {
        this.productoRepositorio.deleteById(idProducto);

    }
}
