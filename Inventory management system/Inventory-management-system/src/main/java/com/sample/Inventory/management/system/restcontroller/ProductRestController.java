package com.sample.Inventory.management.system.restcontroller;

import com.sample.Inventory.management.system.entity.Product;
import com.sample.Inventory.management.system.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductRestController {
    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/allProduct", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<Product> getAllProduct() {
        List<Product> listProduct = productService.getAllProducts();
        return listProduct;
    }

    @RequestMapping(value = "/getProductById/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
    public Product getProduct(@PathVariable("id") String id) {
        Product product = productService.getProduct(Integer.parseInt(id));
        return product;
    }

    @RequestMapping(value = "/addProduct", method = RequestMethod.POST, headers = "Accept=application/json")
    public Product saveProduct(@RequestBody Product p) {
        productService.createProduct(p);
        return p;
    }

    @RequestMapping(value = "/updateProduct", method = RequestMethod.PUT)
    public Product updateProduct(@RequestBody Product p) {
        productService.editProduct(p);
        return p;
    }

    @RequestMapping(value = "/deleteProduct/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
    public Product deleteProduct(@PathVariable("id") String id) {
        productService.deleteProduct(Integer.parseInt(id));
        Product p = new Product();
        return p;
    }
}
