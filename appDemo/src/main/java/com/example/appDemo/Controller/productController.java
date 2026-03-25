    package com.example.appDemo.Controller;

    import com.example.appDemo.Services.productService;
    import com.example.appDemo.models.products;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;

    @RestController
    public class productController {
        @Autowired
        private productService productService;
        @GetMapping("/products")
        public List<products> getProduct(){
            return productService.getProducts();
        }
        @GetMapping("/products/{prodId}")
        public products getProductById(@PathVariable int prodId){
            return productService.getProductById(prodId);
        }

        @PostMapping("/products")
        public void addProduct(@RequestBody products prod){
            productService.addProduct(prod);
        }

        @PutMapping("/products/{proId}")
        public void updateProduct(@RequestBody products prod){
            productService.updateProduct(prod);
        }

        @DeleteMapping("/products/{proId}")
        public void deleteProduct(@PathVariable int proId){
            productService.deleteProduct(proId);
        }
    }
