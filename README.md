
![image](https://github.com/user-attachments/assets/00a88d7a-b7fe-4e38-8e90-4e6149f50cc9)

The “S” in SOLID is for **Single Responsibility Principle**, which states that every object should have a single responsibility and that all of its services should be aligned with that responsibility. “Responsibility” is defined as “a reason to change”, and Wikipedia does a pretty good job of explaining it:

</br>As an example, consider a module that compiles and prints a report. Such a module can be changed for two reasons. First, the content of the report can change. Second, the format of the report can change. These two things change for very different causes; one substantive, and one cosmetic. The single responsibility principle says that these two aspects of the problem are really two separate responsibilities, and should therefore be in separate classes or modules.
</br>It would be a bad design to couple two things that change for different reasons at different times.

</br>I'll explain SOLID principles using a family scenario that's relatable and easy to understand:

</br>**Real Life Example for Single Responsibility Principle**
</br>Imagine a mother who's also a working professional. Instead of her doing everything, the family splits responsibilities:
</br>
</br>Mom focuses on her career and financial planning 
</br>Dad handles home maintenance and repairs
</br>Kids are responsible for keeping their rooms clean
</br>They hire a house cleaner for deep cleaning
</br>
</br>This way, each family member has clear, specific responsibilities rather than one person trying to do everything.


![image](https://github.com/user-attachments/assets/c602ec83-661e-4221-b735-b8dab9af5bfb)

The “O” in SOLID is for **Open-Closed Principle**, which states that software entities – such as classes, modules, functions and so on – should be open for extension but closed for modification. The idea is that it’s often better to make changes to things like classes by adding to or building on top of them (using mechanisms like subclassing or polymorphism) rather than modifying their code.

</br>>**Real Life Example for Open/Closed Principle**
</br>Consider the family's dinner routine. They have a basic dinner rule: "Everyone must eat together at 7 PM." This rule is closed for modification. However, it's open for extension:
</br>
</br>On Fridays, they add pizza night
</br>On birthdays, they add cake and celebrations
</br>During holidays, they add special dishes
</br>
</br>The core rule doesn't change, but they extend it for special occasions.

![image](https://github.com/user-attachments/assets/e7b06043-3a98-4a14-be7d-457562effb2e)

The “L” in SOLID is for **Liskov Substitution Principle**, which states that subclases should be substitutable for the classes from which they were derived. For example, if MySubclass is a subclass of MyClass, you should be able to replace MyClass with MySubclass without bunging up the program.

</br>>**Real Life Example for Liskov Substitution Principle**
</br>Think of the role of "guardian" in the family. Whether it's:
</br>Mom
</br>Dad
</br>Grandparent
</br>Adult sibling
</br>Trusted aunt/uncle
</br>
</br>Any of these can temporarily take over parental responsibilities (helping with homework, making dinner, etc.) without disrupting the family's functioning. They can be substituted for each other while maintaining the same basic responsibilities.

![image](https://github.com/user-attachments/assets/eb1b6f6a-e792-49b9-8399-f60f128c7c07)

The “I” in SOLID is for **Interface Segregation Principle**, which states that clients should not be forced to depend on methods they don’t use. If a class exposes so many members that those members can be broken down into groups that serve different clients that don’t use members from the other groups, you should think about exposing those member groups as separate interfaces

</br>>**Real Life Example for Interface Segregation Principle**
</br>Consider children's chores. Instead of having one massive "house helper" role, they break it down into smaller, manageable responsibilities:

</br>Older child: Takes out trash and helps with groceries
</br>Middle child: Feeds pets and waters plants
</br>Younger child: Puts away toys and helps set the table
</br>
</br>Each child has specific, age-appropriate tasks rather than trying to handle everything.

![image](https://github.com/user-attachments/assets/c3605646-307b-4a8b-825c-dffbc2cf5439)

The “D” in SOLID is for **Dependency Inversion Principle**, which states that high-level modules shouldn’t depend on low-level modules, but both should depend on shared abstractions. In addition, abstractions should not depend on details – instead, details should depend on abstractions.

</br>>**Real Life Example for Dependency Inversion Principle**
</br>Instead of the family depending directly on specific solutions, they depend on general principles:

</br>Rather than depending on "Mom's cooking," they depend on "having dinner ready"
</br>Instead of relying on "Dad's car," they depend on "transportation"
</br>Rather than needing "Grandma's babysitting," they depend on "childcare"

</br>This allows flexibility in how these needs are met. If Mom can't cook, Dad can. If the car breaks down, they can use public transport. If Grandma's unavailable, they can hire a babysitter.
