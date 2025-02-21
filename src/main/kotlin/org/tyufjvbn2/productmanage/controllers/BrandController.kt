package org.tyufjvbn2.productmanage.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.tyufjvbn2.productmanage.services.BrandService
import org.tyufjvbn2.productmanage.services.ProductService

@Controller
@RequestMapping("/brand")
class BrandController(
    private val brandService: BrandService,
    private val productService: ProductService
) {
    // 미완성입니다...
//    @GetMapping("lowest-price/{id}")
//    fun getLowestProductOfBrand(@PathVariable(value = "id") id: Int, model: Model): String {
//        val productSummary = productService.getLowestProductOfBrand(id)
//        model.addAttribute("brand_name", productSummary.brandName)
//        model.addAttribute("products", productSummary.products)
//        model.addAttribute("total_price", productSummary.totalPrice)
//
//        return "brand/lowest-price"
//    }

}