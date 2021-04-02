import kotlin.math.sign


class  Point(private var x :Double, private var y :Double)
{


    override fun toString(): String {
        return "( $x , $y )"
    }


    override fun hashCode(): Int {
        return super.hashCode()+10
    }


    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if(this.x == other.x && this.y== other.y){
                return true;
            }else{
                return false
            }
        }
        return super.equals(other);

    }



    fun ThirdDavalebaMoveY(){

        this.y =  this.y * -1;
    }
}


fun main(){

   val firstPoint : Point = Point(10.0,0.0)
    val secondPoint : Point = Point(10.0,20.0);
    val thirdPoint : Point = Point(10.0,20.0)


    println(firstPoint.equals(secondPoint))
    println(secondPoint.equals(thirdPoint))

    println(secondPoint.toString())
    secondPoint.ThirdDavalebaMoveY();
    println(secondPoint.toString())


    println(secondPoint.hashCode())

}