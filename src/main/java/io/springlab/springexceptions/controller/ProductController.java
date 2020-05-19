package io.springlab.springexceptions.controller;


import io.springlab.springexceptions.exception.InvalidFieldException;
import io.springlab.springexceptions.model.Product;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v3/api")
public class ProductController {

    @PostMapping("/products")
    public String saveProductInfo(@RequestBody Product product){
                if(StringUtils.isEmpty(product.getProducer())){
                    throw new InvalidFieldException("producer info is mandatory!!");
                }
                return "product saved";
    }

    @ExceptionHandler
    public String handleInvalidFieldException(InvalidFieldException e){
        return e.getMessage();
    }
}
