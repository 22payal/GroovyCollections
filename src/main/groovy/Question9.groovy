class Question9 {
    public static void main(String[] args) {

        String string = "this string needs to be split"


        println ("output of :"+string.tokenize(" "))
        println ("output of :"+string.tokenize())
        println ("output of :"+string.split(" "))


        println ("output of :"+string.split(/\s/))

        println ("output of :"+string.tokenize(/\s/))


        String s = "are.you.trying.to.split.me.mister.?"

        println("difference between tokenize and split")
        println("tokenize -> "+s.tokenize("."))
        println("split ->"+s.split("."))

    }
}
