# design_pattern_implementing

4: Factory Method Pattern:
we have an Animal interface that has a GetSound method and some animals(dog, cat, and duck) implements that.
we want to create an animal but we don't want to know which animal wants to choose and we don't have to choose.
so we just want to return an Animal instance. we created an interface that has a method called CreateAnimal that should return an Animal instance.
and we have two classes that implement the CreateAnimal interface and it returns Animal with its specific algorithm.
