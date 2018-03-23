class Question21
{
    public static void main(String[] args)
    {
        int countkey=0,count1=0

        Map m = ["Computing" : ["Computing" : 600, "Information Systems" : 300], "Engineering" : ["Civil" : 200, "Mechanical" : 100], "Management" : ["Management" : 800] ]

        int length= m.size()

        for(int i in 1..length)
        {
            if (m.keySet())
            {
                countkey++
            }

        }

        println("There are "+countkey+" departments in the university and they are : "+m.keySet())

        println("There are ${m.get("Computing").keySet().size()} programs delivered bythe Computing department are : "+m.get("Computing").keySet())

        println("Number of students in civil engineering programs are:"+m.Engineering.Civil)





    }
}
