## design_pattern_implementing


# 4: Factory Method Pattern:

we have an Animal interface that has a GetSound method and some animals(dog, cat, and duck) implements that.
we want to create an animal but we don't want to know which animal wants to choose and we don't have to choose.
so we just want to return an Animal instance. we created an interface that has a method called CreateAnimal that should return an Animal instance.
and we have two classes that implement the CreateAnimal interface and it returns Animal with its specific algorithm.

# 5: Singleton Pattern:

this class is force to have just one Instance of its own class.
reach with make the constructor private and a public method (e.g: getInstance) that return the same Instance of that class if we made it before,
if the Instance was null we store the new Instance in a private and static Singlton Object.

# 6: Command Pattern : 
we want to encapsulate a command from the sender(Invoker) and a Receiver.
with this scenario, we can send a bunch of commands to their receivers.
with command pattern, we can implement do and undo for commands.
