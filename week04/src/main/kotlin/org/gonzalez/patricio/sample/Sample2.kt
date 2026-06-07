package org.gonzalez.patricio.sample



// packages names recommended to start with reversed domain name
import org.gonzalez.patricio.sample.data.Person as ComplexPerson
import org.gonzalez.patricio.sample.data2.Person as SimplePerson
// can alias imported type in case of a conflict

// it need to be imported
val complexPerson = ComplexPerson(name = "Scott", age = 55)
val simplePerson = SimplePerson("Scott")

// you can show as the full route
//val person2 = org.gonzalez.patricio.sample.data2.Person(name = "Scott")