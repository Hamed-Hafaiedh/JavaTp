package Td2.ex2;

public class XYZ {
        private int x;
        private static int y;
        private int z;
        public XYZ() {
            x = 0;
            y++;
            z = y;
        }
        public XYZ( int x ){
            this.x = x ;
            y++ ;
            z = y ;
        }
        void affiche ( ) {
            System.out.println ( "x = " + x +" y ="+ y +"z ="+ z) ;
        }
    }