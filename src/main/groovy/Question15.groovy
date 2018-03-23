public class Question15
{
    public static void main(String[] args) {

        Stack stack = new Stack()

        stack.top()
        stack.pop()

        Scanner scanner = new Scanner(System.in)
        println("enter the no. to be pushed into the stack")

        int number = scanner.nextInt()

        stack.push(number)
    }

}

class Stack
{
    List<Object> list=[1,2,3,4,5,6,7,8,9,10]


    void pop()
    {
        println("in pop")

        println("removed element is :"+list.remove(list.size()-1))
    }

    void push(int entry)
    {
       println("in push")
        list.add(entry)
        println(list)
    }

    void top()
    {
        println("in top")
        println("topmost element is "+list.last())
    }


    @Override
     String toString() {
        return "Stack{" +
                "list=" + list +
                '}'
    }
}

