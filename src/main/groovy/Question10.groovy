class Question10 {
    public static void main(String[] args) {
        def n = 1..10

        println("All elemets in the range are : " +n)
        println("first element of the range : "+n.get(0))
        println("second element of the range : "+n.get(1))

        int last_index= n.size()
        println("last element of the range is :"+ n.get(last_index-1))
    }
}
