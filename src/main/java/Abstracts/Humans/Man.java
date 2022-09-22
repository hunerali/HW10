package Abstracts.Humans;


import Abstracts.Enums.DayOfWeeks;
import Abstracts.Family;
import Abstracts.Human;

import java.util.Map;

public final class Man extends Human {
    public void smoking() {

    }

    public Man() {
    }

    public Man(String name, String surname, String date, int iq){
        super(name,surname,date,iq);
    }

    public Man(String name, String surname, String  birthDate, int iq, Map<DayOfWeeks, String> schedule, Family family) {
        super(name, surname, birthDate, iq, schedule, family);
    }


    public Man(String name, String surname, String  year) {
        super(name, surname, year);
    }

    @Override
    public void greetPet() {
        System.out.println("Man greeting pet");
    }
}
