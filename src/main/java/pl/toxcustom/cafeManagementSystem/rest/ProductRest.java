package pl.toxcustom.cafeManagementSystem.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.toxcustom.cafeManagementSystem.wrapper.ProductWrapper;

import java.util.List;
import java.util.Map;

@RequestMapping("/product")
public interface ProductRest {

    @PostMapping("/add")
    ResponseEntity<String> addNewProduct(@RequestBody(required = true) Map<String, String> requestMap);

    @GetMapping("/get")
    ResponseEntity<List<ProductWrapper>> getAllProduct();

    @PostMapping("/update")
    ResponseEntity<String> updateProduct(@RequestBody(required = true) Map<String, String> requestMap);

    @PostMapping("/delete/{id}")
    ResponseEntity<String> deleteProduct(@PathVariable Integer id);

    @PostMapping("/updateStatus")
    ResponseEntity<String> updateStatus(@RequestBody(required = true) Map<String, String> requestMap);

    @GetMapping("/getByCategory/{id}")
    ResponseEntity<List<ProductWrapper>> getByCategory(@PathVariable Integer id);

    @GetMapping("/getById/{id}")
    ResponseEntity<ProductWrapper> getProductById(@PathVariable Integer id);

}
