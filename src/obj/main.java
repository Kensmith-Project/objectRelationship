package obj;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Table table1 = new Table("Steel Desk");
        Table table2 = new Table("Diamond");
        Table table3 = new Table("Golden");
        Table table4 = new Table("Violent");
        List<Table> mytable = new ArrayList<>();
        mytable.add(table1);
        mytable.add(table2);
        mytable.add(table3);
        mytable.add(table4);


        Classroom classroom = new Classroom(mytable, 30,"projector");
        System.out.println(classroom.tableList. get(0).color);
/*
*How these objects are related
* The key relationship between the two objects , campus and classroom is HasA relationship.
* classroom is a component of Campus, so it is siad that classroom has classroom.
*   THIS ALSO APPLIES TO TABLE. T able is a unit of classroom and it can be siad that classroom has table.
* On the other hand there is  loose connection between the child element of classroom to the campus . That is, the table is related to the campus by aggregatio since both
* can exist as independent entity . Table aggregates to make a campus.
*
*
*
*
*
* Second Assignments
* When Objects Relate
* Objects are said to be related when they inherit ot transfer properties . such type of relationship is inheritance. It is said that objectA isA this. That is the relationship between child and parent.
* Objects are siad to be related When they form units make up a bigger component, item or object. Such relationship is found in composition.
*
*
*  Why Objects
* For the purpose of relationships in an object is their existence.
* So each object has a property and object can also part of the properties of another object.
* Objects can also aggregate to for a complete object unit.
*
 */






    }



}
