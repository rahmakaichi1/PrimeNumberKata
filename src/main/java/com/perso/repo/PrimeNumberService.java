package com.perso.repo;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberService
{
    public  List<Integer> calculate( int n){

        List<Integer> primeNumbers = new ArrayList<>();
        if (n < 2 ) {
            throw new IllegalArgumentException();
        }
        for(int i = 2  ; i < n ; i ++ ){

            if( isPrime(i)){
                primeNumbers.add(i);
            }
        }


        return primeNumbers ;
    }

    private Boolean isPrime(int n ){

        Boolean isPrime = true ;
        for( int i = 2 ; i < n  ; i ++){

            if(n % i == 0){
                isPrime = false ;
                break ;
            }

        }

        return isPrime ;

    }
}
