class Question5
{
    public static void main(String[] args) {

        List list=[1,2,4,5,7]
int index=0

        Closure closure={int index1 ,list1-> list1.each {
                                                  $it-> if(index1%2!=0)
                                                  {
                                                      println($it)
                                                  }
                                                         index1++}


            }
        println("odd elements of the list are: -> ")
        closure(index,list)
    }


}
