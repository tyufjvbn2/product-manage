package org.tyufjvbn2.productmanage.dtos

// brand, category, product 모두 join 한 객체
data class EnrichProductDto(
    val id: Int,    // product의 id
    val category_id: Int,
    val category_name: String,
    val brand_id: Int,
    val brand_name: String,
    val price: Int
)
