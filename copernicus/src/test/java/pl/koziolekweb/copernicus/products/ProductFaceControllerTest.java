package pl.koziolekweb.copernicus.products;

import org.fest.assertions.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import pl.koziolekweb.copernicus.data.Product;
import pl.koziolekweb.copernicus.data.dao.ProductRepository;

import java.util.Collection;
import java.util.Collections;

import static org.mockito.Mockito.when;

/**
 * TODO write JAVADOC!!!
 * User: koziolek
 */
@RunWith(MockitoJUnitRunner.class)
public class ProductFaceControllerTest {

	@Mock
	private ProductRepository repository;

	@InjectMocks
	private ProductFaceController sut;

	@Test
	public void shouldAllReturnEmpty() throws Exception {
		 // given
		when(repository.findAll()).thenReturn(Collections.emptyList());
		// when
		Collection<Product> all = sut.all();
		// then
		Assertions.assertThat(all).isEmpty();

	}
}