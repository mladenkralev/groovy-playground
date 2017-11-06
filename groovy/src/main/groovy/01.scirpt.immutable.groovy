import groovy.transform.Immutable

/**
 * Created by MLKR on 01/11/2017.
 */
@Immutable class GroovyBook extends Book {
    String title = "groovy"
}

def normalBook = new Book(
        title: "Groovy",
        id: 10);

def groovyBook = new GroovyBook()
// not going to consider this   groovyBook.title = "MAMA-MIA"

println(groovyBook.title)

// groovyBook.title = "Not allowed";

println(groovyBook.title)




