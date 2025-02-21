package org.tyufjvbn2.productmanage.models

import jakarta.persistence.*

@Entity
@Table(name = "products")
data class Product(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,

    @ManyToOne
    @JoinColumn(name="brand_id", nullable=false)
    var brand: Brand,

    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    var category: Category,

    @Column(nullable = false)
    var price: Int
)
