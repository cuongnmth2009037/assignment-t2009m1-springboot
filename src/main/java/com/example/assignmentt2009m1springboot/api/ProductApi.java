package com.example.assignmentt2009m1springboot.api;

import com.example.assignmentt2009m1springboot.entity.Product;
import com.example.assignmentt2009m1springboot.entity.dto.ProductDto;
import com.example.assignmentt2009m1springboot.entity.enums.ProductSimpleStatus;
import com.example.assignmentt2009m1springboot.repository.ProductRepository;
import com.example.assignmentt2009m1springboot.util.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/products")
public class ProductApi {
    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> save(@RequestBody ProductDto productDtO) {
        Product product = new Product();
        product.setName(productDtO.getName());
        product.setDescription(product.getDescription());
        product.setPrice(productDtO.getPrice());
        product.setSlug(StringHelper.toSlug(productDtO.getName()));
        product.setStatus(ProductSimpleStatus.ACTIVE);
        productRepository.save(product);
        productDtO.setId(product.getId());
        productDtO.setCreatedAt(product.getCreatedAt() == null ? "" : product.getCreatedAt().toString());
        productDtO.setUpdatedAt(product.getUpdatedAt() == null ? "" : product.getUpdatedAt().toString());
        productDtO.setStatus(product.getStatus().name());
        return new ResponseEntity<>(productDtO, HttpStatus.OK);
    }
}
