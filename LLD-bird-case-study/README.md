## SRP and OCP:
* Bird class is violating the SRP(Single Responsibility Principle) and OCP(Open-Close Principle)
* SRP: Bird performing many responsibility like for different birds we have different logics. so many 
   if/else and monster methods indicate SRP is violating.
* OCP: Classes should be open for extension but closed for modification.
* so here if we add new bird 'parrot' we need to modify fly() of Bird class. this is violating the OCP.
  We can add new classes/Methods as a new feature but can't modify existing code base.


## Solution for SRP and OCP violation
* Make Bird class as abstract Bird class and add only common attributes and behavior which will be in all birds.

## Liskov Substitution
* No child class should deserve any special treatment
* All object of child class should be able to be substituted/stored in a variable of parent class without requiring any code change in further code

#### But in the version v1, we can see penguin can't fly. so in this case we have to provide special treatment for penguin. That's violating the Liskov Substitution principle

## Solution for the Liskov violation
* Create different absract classes for FlyableBird and NonFlyableBird that extends Bird and remove fly and makeSound method that are forcing every bird to fly and make sound
* Add other use case like
   * Bird can fly and make sound `FlyableMakeSoundBird`
   * Bird can fly but cannot make sound `FlyableNonMakeSoundBird`
   * Bird cannot fly but can make sound `NonFlyableMakeSoundBird`
   * Bird neither fly nor make sound `NonFlyableNonMakeSoundBird`
#### Another problem
* Class Explosion
   * Here for 2 behaviour we are creating 4 classes and for 10 behavior we will be creating 2^10 classes.
* Not Possible to get List of all bird that can fly 
#### Solution
* Create interfaces for behaviour like `FlyableBird` and `MakeSoundBird` and implement when accordingly.

## Interface Segregation Principle
* The interface should be as light as possible.
* Make interface as specific as possible (should have very less methods ideally only one).

## Dependency Inversion
* No two concrete classes should directly depend on each other. They should depend on each other via an interface in between them.
* If two classes are dependent on each other, then they would have tight coupling.

#### Problem in previous design-v3
* Code Duplication: 
  * Let's say if two bird fly in similar way then there will be code duplication in fly method.
### Solution for code duplication
* Make Another common classes like `PegionSparrowFlyWay` and `EagleCrowFlyWay`.
* This will remove code duplication.

### Problem in previos version v4 (violation of Dependency Inversion)
* Here Concrete classes `Pegion`, `Sparrow`, `Eagle` and `Crow` are directly depend on another concrete class `PegionSparrowFlyWay` and `EagleCrowFlyWay`.
* Later if any bird wants to fly in different way, this would lead to many changes on production level. 
### Solution 
* Create interface `BirdFlyWays` and all the common fly way classes must implements this interface.
* Now all the Birds are dependent on the concrete classes via interface between them.