package Angular.Inventarios.controlador;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("inventario-app")
//para usar con Angular
@CrossOrigin(value = "http:/localhost:4200")


public class ProductoControlador {


}
