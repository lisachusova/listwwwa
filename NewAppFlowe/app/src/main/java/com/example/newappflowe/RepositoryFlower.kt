package com.example.newappflowe

object RepositoryFlower {
    val list: List<Flower> = listOf(
        Flower(id = 1, name = "Rose", country = "Ecuador", url = "https://www.thespruce.com/thmb/r8iKQ7wroketyY-JJdNmxoF7yHI=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/rose-colors-4175293-hero-a79624df1730467abb9396ff31db8caa.jpg"),
        Flower(id = 2, name = "Plumeria", country = "caribbean islands", url = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/Plumeria_rubra-4.JPG/800px-Plumeria_rubra-4.JPG"),
        Flower(id = 3, name = "Hyacinth", country = "Mediterranean", url = "https://www.thespruce.com/thmb/wtmDeIpqa56LouWZJ65vUUg5ZBg=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/growing-and-caring-for-hyacinth-plants-1402248-03-571d970f763b4c22ab2a77676160ee97.jpg"),
        Flower(id = 4, name = "Daisies", country = "Bulgaria", url = "https://www.thespruce.com/thmb/BK_B3_c_6n1gWSW5ueO31zczsbY=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/daisy-types-for-gardens-1316051-01-abec54c485ba434587b7786f6a7c5bab.jpg"),
    )

    fun getAllFlowers() : List<Flower> {
        return list
    }

    fun getSingleFlowerById(id: Int) : Flower {
        var flower =list.firstOrNull{flower -> flower.id == id}
        return flower!!
    }
}