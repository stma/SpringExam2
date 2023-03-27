package com.progmatic.springpot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Exam:
 *
 * 1) Készíts egy model réteget amiben két entitás legyen, egy "Person" és egy "Group"
 *      Egy Group-hoz tobb Person tartozik, es egy Person-hez több Group is lehet
 *      Person legyen neve String,
 *      Group legyen leírása, neve String
 *
 * 2) Készíts Repository interfészeket amik Spring Data JPA segítségével hozzáférést
 *      biztosítanak az Entitás osztályok által megfogalmazott adatbázisban tárolt adatokhoz.
 *      Használj Crud vagy Jpa repository-t.
 *
 * 3) Készíts egy egyszerű megjelenítő oldalt ahol le tudod kérdezni a Person adatait.
 *      Itt használj template a megjelenítéshez. Person minden adatát és a kapcsolódó
 *      Group-ok nevét is írd ki.
 *
 * 4) Készíts egy egyszerű REST megjelenítő oldalt ahol le tudod kérdezni a Person adatait.
 *      Itt a visszaadott JSON egy Person hibrid osztályból álljon elő ami tartalmazza a
 *      Person nevet es a csoportjai neveit amikben szerepel.
 *
 * 5) Készíts egy egyszerű REST api endpointot ahol törölni tudjuk az egyes Group-ot.
 *
 * plus:
 * 6) A tavoli jovoben minden parnak max 2 gyermeke lehet. Hogyan kezelned le ezt a
 *    programon belul entitas (Model) szintjen? A megoldasodhoz a minimalis kodot ird meg
 *    ill. irj hozza kommentet mi az otlet es hogyan hasznalnad.
 *
 */

@SpringBootApplication
public class SpringPotApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPotApplication.class, args);
    }

}
