package org.tyufjvbn2.productmanage.infrastructure.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.tyufjvbn2.productmanage.application.BrandService

@Controller
class BrandController(private val brandService: BrandService) {
    @GetMapping("/brands")
    fun getAllBrands(model: Model): String {
        val brands = brandService.getAllBrands()
        model.addAttribute("brands", brands)
        return "brand-list"
    }
}