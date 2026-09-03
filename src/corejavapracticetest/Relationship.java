package corejavapracticetest;

public class Relationship{
    //Association vs Aggregation vs Composition
    //HAS - A relationships

    //For each one, explain why.

    //A.Teacher teaches Student
    // This is an association.because a teacher can exist without student and student can exist without one teacher
    //one object interacts with other object and both objects can exist independently
    //objects are loosely coupled.this is a weakest relationship



    //B.Department has Employees
    //This is an Aggregation.because one object exist if other object gets deleted
    //here if dept gets deleted .Employes object still exist.
    //An employee can continue to exist even if the department is deleted.
    //It is a weak association and objects are loosely coupled.



    //C.House has Rooms
    //A room is considered part of the house and doesn't meaningfully exist independently in this model.
    //this is a composition.because child object cannot exist without parent object
    // A house has rooms and Rooms are part of house
    //this is strong association. one object completely depends on another object



}
