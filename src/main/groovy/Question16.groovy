class Question16
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in)

        Map map = new HashMap()

      //  map.put("a",21)

        for(int i in 1..10)
        {
            println("enter name")
            String name = sc.next()

            println("enter age")
            Integer age = sc.nextInt()

            map.put(name,age)
        }


          println("name : "+ map.keySet()+" age :"+map.values())

    }
}
