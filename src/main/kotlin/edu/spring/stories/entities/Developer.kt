package edu.spring.stories.entities

import jakarta.persistence.CascadeType
import jakarta.persistence.Entity
import jakarta.persistence.OneToMany
import org.springframework.stereotype.Controller

@Entity
class Developer {
    val id = 0;
    var firstname =" " ;
    var lastname = " ";
    constructor (firstname:String,lastname:String){
        this.firstname = firstname
        this.lastname = lastname
    }
    @OneToMany (cascade = [
        CascadeType.PERSIST,
        CascadeType.MERGE]
    )
    val stories = mutableSetOf<Story>()
}