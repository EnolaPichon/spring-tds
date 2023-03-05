package edu.spring.stories.repositories

import edu.spring.stories.entities.Developer
import edu.spring.stories.entities.Story
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StoryRepository : CrudRepository <Story, Int>{
    public fun findByDeveloperIsNull () : MutableList<Story>
    public fun findByNameAndDeveloperId( name : String , ID : Int) : MutableList<Story>
}