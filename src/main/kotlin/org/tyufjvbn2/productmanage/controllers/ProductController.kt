package org.tyufjvbn2.productmanage.controllers

import org.springframework.ui.Model
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.tyufjvbn2.productmanage.services.ProductService

@Controller
class ProductController(private val productService: ProductService) {
    @GetMapping("/lowest-price")
    fun getLowestProductOfEachCategory(model: Model): String {
        val product_summary = productService.getLowestProduct()
        model.addAttribute("products", product_summary.products)
        model.addAttribute("total_price", product_summary.total_price)

        return "lowest-product"
    }
}