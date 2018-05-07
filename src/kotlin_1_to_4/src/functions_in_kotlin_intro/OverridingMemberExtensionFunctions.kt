package functions_in_kotlin_intro

/**
 * just like over functions, extension member functions in Kotlin can be overridden as well in their appropriate
 * subclasses.
 *
 * to allow that to happen declare the function with the open keyword!!!
 *
 *
 * */


// our super class called Element
open class Element(val name: String) {
    // we define two open functions that are available for overriding which are extension functions on our
    // Particle class and Electron class

    // Extension function on Particle class that extends with a function named react
    //
    open fun Particle.react(name: String): Unit {
        println("$name is reacting with a particle...")
    }
    // Extension function on Electron class that extends with a function named react
    open fun Electron.react(name: String): Unit {
        println("$name is reacting with an Electron....")
    }

    // Element class comes with a function called react which takes in a specific Particle
    // and it'll run the react function on that particle passing in the name of the element

    fun react(particle: Particle) {
        // when this runs it resolves statically, i.e. the only Type it knows about is whats passed in at compile
        // time which is Particle and so when it runs this at run-time because it's resolved statically
        // and because Particle is a super class which means it "wraps around Electron" it'll just run
        // Particle.react both times ...
        particle.react(name)
    }
}

// our class NobleGas that extends the ELement class
class NobleGas(name: String) : Element(name) {

    // it overrides the extension functions declared in Element with it's own
    // it doesn't react to either instantiations ...
    override fun Particle.react(name: String): Unit {
        println("$name is noblegas it doesn't react with particles ...")
    }
    override fun Electron.react(name: String): Unit {
        println("$name is noble, it doesn't react with Electrons...")
    }

    // has it's own react function that it adds because it takes in a particle but only Electron types
    fun react(particle: Electron): Unit {
        // when this runs the Compiler knows about BOTH Particle and Electron and so it's able to decipher
        // the two different Extension functions accordingly on the passed in particle
        particle.react(name)
    }
}

open class Particle {

}
class Electron : Particle() {

}


fun main(args: Array<String>) {
    val selenium = Element("Selenium")
    // here although two different instances are passed in the ELement always resolves to
    // Particle dispatch receiver (type Particle) because at this point in time the Compiler ONLY
    // knows about fun react(particle: Particle) ...
    selenium.react(Particle())
    selenium.react(Electron())

    // at this point in time, the NobleGas is a sub-class which defines an extra function that has
    // a type of Electron as well and so at this point the Compiler knows about both Electron
    // AND Particle and so it can resolve it for both and ends up in calling both Extension functions
    val neon = NobleGas("Neon")
    neon.react(Particle())
    neon.react(Electron())
}

/**
 *
 * To come back to to understand the resolving mechanism ...
 *
 * Important to note:
 *
 * Dispatch receiver type(i.e. the extension function type) will be virtual. By virtual that means
 * the runtime instance.
 *
 * The Extension receiver type (i.e. the one actually EXECUTING the extension function) is resolved statically. Meaning
 * that it's type is resolved at compile time.
 *
 * So in this example here, the dispatch receivers are: the two extension functions of Particle.react and
 * Electron.react.
 *
 * The extension receivers are the react() methods defined within NobleGas and Element.
 *
 * On Element, no matter what the Particle is, it always reacts with the Particle class when the extension
 * function runs (Element react()) which then calls the specific extension functions (dispatch receivers). At this point
 * because Element is the super class it is the original Extension receiver and so the only type it knows at Compile
 * time is Particle, thus it resolves to Particle.
 *
 * In NobleGas, we defined an EXTRA function (note the different parameter of Electron) and so at runtime
 * when this extension function is run, the Compiler is able to look through the extension functions declared
 * and finds the one that defines itself with Electron and runs both extension functions accordingly.
 *
 *
 * ***Come back to this later
 * */