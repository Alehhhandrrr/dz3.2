fun main(){
    val t: Equilateral_triangle = Equilateral_triangle(5.0F,3.0F)
    val s: Square = Square(3F)
    val c: Circle = Circle(6.5F)
    println(t.area())
    println(c.perimeter())
    println(s.area())
    println(c.toString())
}

//abstract classes of figures
abstract class Figure_square {

    abstract fun perimeter(): Float

    abstract fun area(): Float
}

data class Square(val width: Float) : Figure_square()
{

    override fun perimeter(): Float{
        return width * 4;
    }

    override fun area(): Float{
        return width * width;
    }

    override fun toString(): String {
        return "Square width $width"
    }
}

abstract class Figure_equilateral_triangle {

    abstract fun perimeter(): Float

    abstract fun area(): Float
}

class Equilateral_triangle(val height: Float, val side: Float) : Figure_equilateral_triangle()
{

    override fun perimeter(): Float{
        return height * 3;
    }

    override fun area(): Float{
        return (height * side / 2);
    }

    override fun toString(): String {
        return "Triangle height = $height /h Triangle side = $side"
    }

}

abstract class Figure_circle {

    abstract fun perimeter(): Float

    abstract fun area(): Float
}

class Circle(val radius: Float) : Figure_circle()
{

    override fun perimeter(): Float{
        return 2 * 3.14F * radius;
    }

    override fun area(): Float{
        return 3.14F * radius;
    }

    override fun toString(): String {
        return "Circle radius = $radius"
    }

}

