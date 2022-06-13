package ch_09;

import java.util.Objects;

/**
 * Exercise9_1
 */
public class Exercise9_2 {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1,2,3);
        Point3D p2 = new Point3D(1,2,3);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}

class Point3D {
   int x, y, z;

   Point3D(int x, int y, int z) {
       this.x = x;
       this.y = y;
       this.z = z;
   }

   Point3D() {
       this(0,0,0);
   }

   @Override
   public boolean equals(Object obj) {
        if(!(obj instanceof Point3D)) return false;

        Point3D p3 = (Point3D)obj;

        return this.x == p3.x && this.y == p3.y && this.z == p3.z;
   }

   @Override
   public String toString() {
       return "[ " + x +", " + y  +", " + z +" ]" ;
   }
}