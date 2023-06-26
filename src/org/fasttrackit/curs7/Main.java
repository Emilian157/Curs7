package org.fasttrackit.curs7;

public class Main {
    public static void main(String[] args) {
//        Person fuego = new Person("Fuego", 50);
//        System.out.println(fuego.name);
//        System.out.println(fuego.age);
//        System.out.println("----------------------------------");
//        Person iohannis = new Person("Iohannis", 66);
//        System.out.println(iohannis.name);
//        System.out.println(iohannis.age);
//        System.out.println("----------------------------------");
//        System.out.println(fuego.name);
//        System.out.println(fuego.age);

//        Lamp myLamp = new Lamp(true);
//        Lamp secondLamp = new Lamp(false);
//        System.out.println("Is lamp turned on? " + myLamp.isTurnedOn);
//        myLamp.turnLampOff();
//        System.out.println("Is lamp turned on? " + myLamp.isTurnedOn);
//        myLamp.turnLampOn();
//        System.out.println("Is lamp turned on? " + myLamp.isTurnedOn);
//        System.out.println("--------------------------");
//
//        System.out.println("Is second lamp turned on? " + secondLamp.isTurnedOn);
//        secondLamp.turnLampOn();
//        System.out.println("Is second lamp turned on? " + secondLamp.isTurnedOn);

//        Person fuego = new Person("Fuego", 50);
//        System.out.println(fuego.prezentare());
//        Person iohannis = new Person("Iohannis", 66);
//        System.out.println(iohannis.prezentare());
//        System.out.println(iohannis.toString());

//        Lamp thirdLamp = new Lamp();
//        Lamp fourthLamp = new Lamp(true);
//        Person minor = new Person("Copil", 14);
//        Person adult = new Person("Adult", 49);
//        System.out.println("++++++++++++++++++++++");
//        Person primaComparatie = adult.compareWithADifferentPerson(minor);
//        System.out.println("prima comparatie: " + primaComparatie.getName());
//        System.out.println("++++++++++++++++++++++");
//        Person douaComparatie = minor.compareWithADifferentPerson(adult);
//        System.out.println("doua comparatie: " + douaComparatie.getName());
//        System.out.println("++++++++++++++++++++++");
//
//        Person dinFunctie = createAdultWithName("Program");
//        printIfKidOrAdult(minor, 14, "sarmale");
//        printIfKidOrAdult(adult, 19, "papanasi");
//        printIfKidOrAdult(dinFunctie, 18, "d a");
//        System.out.println("Is third lamp turned on? " + thirdLamp.getIsTurnedOn());
//
//        Person olderOfTheTwo = returnOlderPerson(minor, adult);
//        System.out.println(olderOfTheTwo.getAge());
//        System.out.println("NUmele celui mai mare este: " + olderOfTheTwo.getName());
//
//        if (thirdLamp.getIsTurnedOn()) {
//            System.out.println("Lamp is turned on");
//        } else {
//            System.out.println("Lamp is turned off");
//        }
//
//        System.out.println("STRINGS-------------");
//        String firstString = "dasdasda";
//        String secondString = new String("dasdasda");
//        System.out.println();
//
//        firstString.equals(secondString);

        Door door = new Door(false, false);
        Door door1 = new Door(false, false);
        Door[] doorArray = new Door[]{door, door1};
        door.lockDoor();
        door.closeDoor();
        System.out.println(door.isClosed());
        door.lockDoor();
        door.openDoor();

    }

//
//    public static void printIfKidOrAdult(Person person, int altaVarsta, String mancareaFavorita) {
//        if (person.getAge() >= 18) {
//            System.out.println(person.getName() + " is adult");
//        } else {
//            System.out.println(person.getName() + " is a kid");
//        }
//    }
//
//    public static Person createAdultWithName(String numeleLui) {
//        return new Person(numeleLui, 18);
//    }
//
//    public static Person returnOlderPerson(Person firstPerson, Person secondPerson) {
//        if (firstPerson.getAge() >= secondPerson.getAge()) {
//            return firstPerson;
//        } else {
//            return secondPerson;
//        }
//    }
}