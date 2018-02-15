package com.example.matt.numbersapp;

/**
 * Created by Matt on 11/13/2017.
 */

public class Numbers
{

        int numberEntered;

        public boolean isTriangular()
        {
            int x = 1;

            int triangularNumber = 1;

            while (triangularNumber < numberEntered)
            {
                x++;

                triangularNumber = triangularNumber + x;

            }

            if (triangularNumber == numberEntered)
            {
                return true;
            }else
            {
                return false;
            }


        }

        public boolean isSquare()
        {
            double squareRoot = Math.sqrt(numberEntered);

            if (squareRoot == Math.floor(squareRoot))
            {
                return true;
            }else
            {
                return false;
            }

        }

//    public boolean isBoth()
//    {
//        if (isTriangular() = true && boolean isSquare() = true)
//        {
//            return true;
//        }else
//        {
//            return false;
//        }
//
//
//    }



}


