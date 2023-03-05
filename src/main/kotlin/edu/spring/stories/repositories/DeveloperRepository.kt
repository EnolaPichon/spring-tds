package edu.spring.stories.repositories

import edu.spring.stories.entities.Developer

interface DeveloperRepository {
    public fun save(developer: Developer): Developer
    public fun count(): Int
    public fun deleteById(id: Int) : Boolean
    public fun findByStoriesName(story: String): Developer
    public fun findByFirstnameAndLastname(firstName: String, lastName: String): Developer
}