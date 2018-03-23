class Question13
{
    public static void main(String[] args)
    {
        String inputstr="this is an input string"
        int count=0

        int length= inputstr.size()

        Scanner sc=new Scanner(System.in)
        println("enter the character : ")

        String character =sc.next()



        for (int i in 0..length-1)
        {
            if (character.equals(inputstr[i]))
            {
                count++
            }
        }

        println("the occurance of the entered character in the string is : " + count)


    }
}
