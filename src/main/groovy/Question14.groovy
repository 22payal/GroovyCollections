class Question14
{
    public static void main(String[] args)
    {
                for (int i in 1..16)
                {
                    if(i%3==0)
                    {
                        if (i%5==0)
                            println("FizzBuzz")

                        else
                        println("Fizz")

                    }

                    else if (i%5==0)
                    {

                        println("Buzz")
                    }

                    else
                        println(i)


                }
    }
}
