package edu.spring.stories.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne

@Entity
open class Story {
    @Column
    val tags: MutableList<Tag>? = null

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    open var id = 0;
    @Column
    open var name : String? = null;
    constructor(name:String) {
        this.name = name
    }
    @ManyToOne
    var developer : Developer? = null

}