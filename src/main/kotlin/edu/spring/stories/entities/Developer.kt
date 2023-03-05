package edu.spring.stories.entities

import jakarta.persistence.*


@Entity

open class Developer () {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    open var id = 0;
    @Column
    open var firstname : String? = null;
    @Column
    open var lastname : String? = null;
    constructor (firstname:String,lastname:String) : this(){
        this.firstname = firstname
        this.lastname = lastname
    }
    @OneToMany (cascade = [
        CascadeType.PERSIST,
        CascadeType.MERGE]
    )
    val stories = mutableSetOf<Story>()
    // stories = colonne pour la table
    //Story est le type de stories
    // contient toutes les stories d'un devellopeur
    public fun addStory (story: Story) : Boolean{
        if (this.stories.contains(story)==true) {
            return false
        }
        this.stories += story
        story.developer = this
        return true
    }

    public fun giveUpStory (story: MutableList<Story>) : Boolean { // une story d'un dev
        if (this.stories.contains(story)){
            this.stories -= story
            return true
        }
        story.developer = null
        return false
    }

    @PreRemove
    public fun preRemove () : Unit { // toutes les story du dev
        for (story in this.stories) {
            story.developer =null
            this.stories -= story
        }
    }

}