package com.example.demo;

import java.util.Scanner;

public class AA {
public static void main(String[]args) {


    Scanner input = new Scanner(System.in);

    String[][]names= {{"DanaDog","wallyDog","JessieDog","AlexisDog","LuckyDog"},{"BibsCat ","DoodleCat","MileCat","SimonCat"},
            {"coileFish", "GoldieFish","OscarFish","ZippyFish", "TedFish"},{"RascalMule","Georgemule","Graciemule","MontyMule",
            "BuckMule","RosieMule"}};

   for(int i = 0; i < names.length; i++)
   {
       System.out.print(names[i][1] + ":");

     for(int j = 1; j< names[i].length; j++)
     {
         System.out.print(names[i][j]+"");
    }
System.out.println();
   }

}

}
