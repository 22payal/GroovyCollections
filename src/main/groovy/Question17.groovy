class Question17
{
    public static void main(String[] args)
    {
        Map map1 =new HashMap()

        Map map2= new HashMap()

        Map map3 =new HashMap()

        map1.put("a",12)
        map1.put("b",13)
        map1.put("c",11)

        map2.put("x",15)
        map2.put("y",16)
        map2.put("z",18)

        map3=map1+map2

        println(" keys in map3 : "+map3.keySet())

        println("values in map3 :"+map3.values())

        println("question 18 :")
        println ("output of println map.class is :"+map1.class)
        println ("output of println map.getClass() is :"+map1.getClass())



    }
}
