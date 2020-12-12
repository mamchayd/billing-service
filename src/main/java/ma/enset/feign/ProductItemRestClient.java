package ma.enset.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


import ma.enset.model.Prodect;

@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductItemRestClient {
	@GetMapping(path = "/products")
    PagedModel<Prodect> pageProducts(@RequestParam(value = "page") int page, @RequestParam(value = "size") int size);

    @GetMapping(path = "/products/{id}")
    Prodect getProductById(@PathVariable(name = "id") Long id);
}
