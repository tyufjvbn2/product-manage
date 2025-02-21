package org.tyufjvbn2.productmanage.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.tyufjvbn2.productmanage.services.BrandService

@Controller
@RequestMapping("/brand")
class BrandController(
    private val brandService: BrandService
) {
    @GetMapping("list")
    fun renderBrandList(model: Model): String {
        val brands = brandService.getAllBrands()
        model.addAttribute("brands", brands)
        return "brand/list"
    }


}