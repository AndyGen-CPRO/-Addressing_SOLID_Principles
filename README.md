# Addressing SOLID Principles

## Use Cases
<b>System</b>: Citation Generator </br>
<b>Description</b>: The system is used to generate citations from different sources.

### Use Case: SRP
<b>Description</b>: The developer has defined a class for book data. </br>
<b>Scenario</b>: The developer wants to print the APA style citation based
on the book data and instead of creating a new class, the developer put
the method in the same class as the book data, giving it more responsibility
than it should have. </br>
To not violate SRP, the developer moves the printing of citation to a separate
class.

### Use Case: OCP
<b>Description</b>: The developer has defined a class to print APA citation based
on book data. </br>
<b>Scenario</b>: The developer wants to be able to print the citation in different
styles as well and added the print IEEE style method on the same class as the print
APA citation, making the citation class a class that always has to be modified
if the developer wants to print the citation in different styles. </br>
To not violate OCP, developer made the citation class into an interface that
implements the generate citation method to the now separated APA and IEEE classes.

### Use Case: ISP
<b>Description</b>: The developer has defined the citation interface that
implements the the generate citation method to different citation style classes.
The developer has also defined a class for journal data. </br>
<b>Scenario</b>: The developer wants to also be able to print the data for the
journals and added a generate citation data to the citation interface that accepts
journal data. Now the APA and IEEE classes that prints the citation for the books
are now forced to implement the generate citation method for journals which it
cannot do anything with so it returns as null. </br>
To not violate ISP, the developer made a separate interface for journal citations.
Now the citation classes will only have to implement interfaces that they will
have actual use for.

## Documentation

- <b>SRP</b>: The Single Responsibility Principle states that a class should only
have one and only one responsibility and any other responsibility that can be
thought of should be in a different class. This principle is important as it
keeps the classes contained which prevents confusion and entanglements as the
development of the software goes on. </br>
It is applied in the system as it allows the creation of multiple classes that
serves their own specific purpose. </br>
- <b>OCP</b>: The Open and Closed Principle states that a class that has already 
been written with its main purpose should be closed for any further modifications.
This principle is important as it keeps classes and methods to be used in a way
that they are initially intended. </br>
It is applied in the system as it closes classes and methods for modifications
prompting the creation of additional classes and methods instead.
- <b>ISP</b>: The Interface Segregation Principle states that classes should not
be forced to implement methods that they do not need from an interface. This
principle is important as it keeps the methods under an interface specific with
their purposes.</br>
It is applied in the system as it keeps the interfaces from having methods that
are unrelated to the others which prevents implementations that return nothing.