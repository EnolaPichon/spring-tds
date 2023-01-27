package edu.spring.td1.controllers

import edu.spring.td1.models.Item
import org.springframework.web.bind.annotation.ModelAttribute

class ItemsController {

    @get:ModelAttribute("items")
    val items : Set<Item>
        get() {
            var elements = HashSet<Item>()
            elements.add(Item("Foo"))
            return elements
        }
}