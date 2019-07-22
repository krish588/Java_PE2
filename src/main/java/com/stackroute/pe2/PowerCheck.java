package com.stackroute.pe2;

public class PowerCheck {


    public String checkPower(int input){
        if(input == 0)
            return null;

        while(input != 1)
        {
            if(input % 4 != 0)
                return "not a power";

            input = input / 4;
        }
        return "power of 4";
    }
}
