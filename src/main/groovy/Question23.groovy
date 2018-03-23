class Question23 {
    public static void main(String[] args) {

        String str= "http://www.google.com?name=johny&age=20&hobby=cricket"

        List list1= str.tokenize("?")
        println ("after tokenizing with '?' we get :-> "+list1)

        List list2= list1.get(1).tokenize("&")
        println ("after tokenizing second part with '&' we get :-> "+list2)

        String str1= list2.toString()
        println("converting into string we get :-> "+str1)

        str1=str1.replace('[','')
        str1= str1.replace(']','')
        str1= str1.replace('=',',')
        str1= str1.replace(' ','')

        println("After performing replacement :-> "+str1)

        List list3 = str1.tokenize(",")
        println("tokenizing further on ',' we get :-> "+list3)

        Map<String,String> map= new HashMap<>()
        map.put(list3.get(0),list3.get(1))
        map.put(list3.get(2),list3.get(3))
        map.put(list3.get(4),list3.get(5))

        println("\n final output :->")

        println(map)


    }
}
