/*----------------------------------------------------------------------------------------
 * Copyright (c) vierundsechzig.de. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package de.vierundsechzig.app;

public class App {

    private static int v=1;
    
    public static void doStuff(int x) {
        v++; 
        x+=v;
    }
    
    public static void main(String[] args) {
        int num = 10;
        doStuff(num);
        System.out.println("Result is " + num);
    }
}
