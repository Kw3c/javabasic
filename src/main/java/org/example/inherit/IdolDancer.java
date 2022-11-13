package org.example.inherit;

import org.example.encap.Dancer;
import org.example.encap.Grade;

public class IdolDancer extends Dancer {
    public IdolDancer(String crewName, Grade grade, String myName) {
        super(crewName,grade,myName);
    }

    public void dance() {
        System.out.println("dance with winks.");
    }
}
