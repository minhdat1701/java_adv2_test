package com.samsung.basicsecurity.controller;

import com.samsung.basicsecurity.repositories.models.Product;
import com.samsung.basicsecurity.services.ProductService;
import com.samsung.basicsecurity.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    PasswordEncoder passwordEncoder;
    @Autowired
    UserService userService;

    //Demo nen dung truc tiep product repository
    @Autowired
    ProductService productService;

    @GetMapping("/")
    public String welcome(final Model model)
    {
        List<Product> lstProducts = productService.getAllProducts();
        model.addAttribute("products", lstProducts);

        return "welcome";
    }

    @GetMapping("/home")
    public String Home()
    {
        return "welcome";
    }

    @GetMapping("/catalog{id}")
    public String getProductsByCatalog(@PathVariable Long id, Model model)
    {
        model.addAttribute("products", productService.getProductByCatalogId(id));
        return "welcome";
    }
    @GetMapping("/search")
    public String SearchProduct(@RequestParam String keyword, final Model model)
    {
        model.addAttribute("products", productService.getProductByProductName(keyword));
        return "welcome";
    }
}
