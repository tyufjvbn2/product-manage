package org.tyufjvbn2.productmanage.controllers

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.tyufjvbn2.productmanage.repositories.BrandRepository

@Controller
@RequestMapping("/brand")
class BrandController(
    private val brandRepository: BrandRepository
) {
    @GetMapping("")
    fun getBrands(model: Model): String {
        val brands = brandRepository.findAll()
        model.addAttribute("brands", brands)
        return "brands"
    }
}