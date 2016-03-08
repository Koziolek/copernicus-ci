package pl.koziolekweb.copernicus.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.koziolekweb.copernicus.data.Product;
import pl.koziolekweb.copernicus.data.dao.ProductRepository;

import java.util.Collection;

/**
 * TODO write JAVADOC!!!
 * User: koziolek
 */
@RestController
public class ProductFaceController {

	@Autowired
	private ProductRepository repository;

	@RequestMapping(path = "/product")
	public Collection<Product> all(){
		      return repository.findAll();
	}
}
