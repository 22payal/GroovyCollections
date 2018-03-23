import org.w3c.dom.ranges.Range

class Question1
{
    public static void main(String[] args) {

        List list=[]
        list.putAt(11,"myelement")

        println("output of println l[11] is : "+list[11])
        println("output of println l.get(5) is: "+ list.get(5))
        println("output of println l is: "+ list)
        println("output of Initialize a list using a range and find all elements which are even.")

        def myIntRange = 11..15
        for ( n in myIntRange) {
            if (n%2==0)
            println n
        }
    }


}
