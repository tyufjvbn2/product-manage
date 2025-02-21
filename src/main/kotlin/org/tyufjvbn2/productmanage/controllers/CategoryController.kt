package org.tyufjvbn2.productmanage.controllers

import org.springframework.ui.Model
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.tyufjvbn2.productmanage.services.ProductService

@Controller()
@RequestMapping("/category")
class CategoryController (private val productService: ProductService) {
    @GetMapping("/lowest-price")
    fun getLowestPriceProductOfEachCategory(model: Model): String {
        val productSummary = productService.getLowestPriceProductOfEachCategory()
        model.addAttribute("products", productSummary.products)
        model.addAttribute("total_price", productSummary.totalPrice)

        return "category/lowest-price"
    }
}