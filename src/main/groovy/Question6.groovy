class Question6 {

    public static void main(String[] args) {

        List list = [1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10]

        //  println(list.class)
        list.each {
            println("element : ${list.class}")
        }

        println("output of list.get(6).get(9) "+ list.get(6))
    }
}
