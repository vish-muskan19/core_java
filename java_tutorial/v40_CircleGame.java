package java_tutorial;
class circle1 {
    private float radius;
    private float area;
    private float perimeter;

    public void setRadius(float r) {
        radius = r;
    }

    public void setArea(float a) {
        area = a;
    }

    public float getArea() {
        area = 3.14f * radius * radius;
        return area;
    }

    public void setPerimeter(float p) {
        perimeter = p;
    }

    public void isCorrectlySet()
    {
        if (area == 3.14f * radius * radius) {
            System.out.println("Area is set correctly");

        }
        else
        {
            System.out.println("Area is not set in accordance with the radius");
        }
        if (perimeter == 2 * 3.14f * radius)
        {
            System.out.println("Perimeter is set correctly");

        }
        else
        {
            System.out.println("Perimeter is not set in accordance with the radius");
        }

    }
}
public class v40_CircleGame
{
    public static void main(String[] args) {
        circle1 newCircle = new circle1();
        newCircle.setRadius(2);
        newCircle.setArea(12.26f);
        newCircle.setPerimeter(12.76f);
        newCircle.isCorrectlySet();
    }
}

