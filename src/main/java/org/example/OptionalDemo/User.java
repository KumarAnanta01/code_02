package org.example.OptionalDemo;

import java.util.Optional;

public class User {
    public String getUsernameById(Integer id)
//            Integer=input
//            String =output
    {
        if (id == 100) {
            return "Raju";
        } else if (id == 101) {
            return "Rani";
        } else if (id == 102) {
            return "john";
        } else {
            return null;
        }
    }

        public Optional<String> getUsername(Integer id){
//            Integer=input
//            String =output
                String name=null;
        {
            if (id == 100) {
                name = "Raju";
            } else if (id == 101) {
                name = "Rani";
            } else if (id == 102) {
                name = "John";
            }
            return Optional.ofNullable(name);




        }
}}
