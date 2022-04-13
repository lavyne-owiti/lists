fun main(){
println(evenStrings(listOf("Lavyne","Ganter","Finter","Gilton","Alix","Kenna","Unter","Link"
    ,"Ski","Milon")))
  var people= heightOfPeople(listOf(3,5,7,8,6,9),"meters")
    val value=" meters"
    print(people.sum())
    println(value)
    print(people.average())
    println(value)

    var a=Person("Lavyne",26,7.5,64)
    var b=Person("Lanto",23,6.4,52)
    var c=Person("Lavy",24,5.5,73)
    var d=Person("Liyne",21,7.1,94)
    var e=Person("Lane",22,7.8,68)
    var person= listOf(a,b,c,d,e)
    println(person)
    var sorted= person.sortedByDescending { person -> person.age }
    println(sorted)
     var x=Personobject("PLavyne",30,4.8,50)
     var y=Personobject("Zinnto",23,6.4,52)
    var z=Personobject("Zavy",24,5.5,73)
    var personobject= listOf(x,y,z)
    println(personobject)

    var n=Personobject("zavyne",40,7.8,40)
    var m=Personobject("zanto",33,5.4,102)
    var persons= listOf(n,m)
    println(persons.plus(personobject))

    var f= Cars("KAX 432",120)
    var g=Cars("KBS 422",80)
    var h=Cars("KAS 442",180)
    var r=Cars("KAZ 232",190)
    var cars= listOf(f,g,h,r)
    println(mile(cars))


}



fun evenStrings(names:List<String>):List<String>{

    names.forEachIndexed { index, name ->
        if (index % 2==0)
            println(name)
    }
    return names
}

fun heightOfPeople(height:List<Int>,value:String):List<Int>{
    return height

}
data class Person(var name:String,var age:Int,var height:Double,var weight:Int)

data class Personobject(var name:String,var age:Int,var height:Double,var weight:Int)

 data class Cars(var registration:String,var mileage:Int)

     fun mile(car: List<Cars>): Int {
         var add = 0
         car.forEach { miles ->
             miles.mileage
             add += miles.mileage
         }
         var averagesum = add / car.count()
         return averagesum

 }