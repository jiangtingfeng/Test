package com.how2java;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println( "Hell1谁说的o World!" );
    }
}
