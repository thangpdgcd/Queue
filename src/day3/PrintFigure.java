package day3;

public class PrintFigure {
    public static void main( String[] args ) {
        // printLineOfChars( 5, '*' );
        // printLineOfChars( 4, '*' );
        // printLineOfChars( 3, '*' );
        // printLineOfChars( 2, '*' );
        // printLineOfChars( 1, '*' );
        //
        // //
        //
        // printLineOfChars( 1, '#' );
        // printLineOfChars( 2, '#' );
        // printLineOfChars( 3, '#' );
        // printLineOfChars( 4, '#' );
        // printLineOfChars( 5, '#' );

        printFigure( 5 );

    }

    public static void printFigure(int n){
        // base condition
        if (n == 0){
            return;
        }
        // System.out.println( n );
        printLineOfChars( n, '*' ); // pre-action
        printFigure(n - 1); // recursive call
        printLineOfChars( n, '#' ); // post-action
        // System.out.println( n );
    }

    public static void printLineOfChars(int n, char ch){
        for ( int i = 0; i < n; i++ ){
            System.out.print( ch );
        }
        System.out.println( );
    }

}
