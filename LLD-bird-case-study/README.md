## Note:
* Bird class is violating the SRP(Single Responsibility Principle) and OCP(Open-Close Principle)
* SRP: Bird performing many responsibility like for different birds we have different logics. so many 
   if/else and monster methods indicate SRP is violating.
* OCP: Classes should be open for extension but closed for modification.
* so here if we add new bird 'parrot' we need to modify fly() of Bird class. this is violating the OCP.
  We can add new classes/Methods as a new feature but can't modify existing code base.



