package lab2.AnimalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog rona = new Dog();
        rona.setName("Rona");
        rona.setHeightInCm(145);
        rona.setAge(5);
        rona.setBreed("amstaff");
        rona.setWeight(20);
        rona.setColor("brown");

        Dog1 tyson = new Dog1();
        tyson.setName("Tyson");
        tyson.setHeightInCm(160);
        tyson.setAge(8);
        tyson.setBreed("labrador");
        tyson.setWeight(35);
        tyson.setColor("yellow");
        tyson.setHealth(8);
        tyson.setFavoriteFood("royalcanin");
        tyson.setHungry(10);
        tyson.setStateOfMind(10);
        tyson.setRecreationActivity("sleeping");





        Girl ana = new Girl();
        ana.setName("Ana");
        ana.setAge(10);
        ana.setHaircolor("blond");
        ana.setMoneyavailable(100);


        Doctor dr = new Doctor();
        dr.setName("Peter");
        dr.setAge(40);
        dr.setSpecialization("surgeon");


        System.out.println("Pe catelul meu il cheama "+ rona.getName()+
                ", si are inaltimea in cm "+ rona.getHeightInCm()+
                ", si are varsta de "+ rona.getAge()+ " ani"+
                ", si face parte din rasa "+ rona.getBreed()+
                ", si are greutatea de "+ rona.getWeight()+ " kg"+
                ", si are culoarea "+ rona.getColor()
        );


        System.out.println("Pe catelul meu il cheama "+ tyson.getName()+
                ", si are inaltimea in cm "+ tyson.getHeightInCm()+
                ", si are varsta de "+ tyson.getAge()+ " ani"+
                ", si face parte din rasa "+ tyson.getBreed()+
                ", si are greutatea de "+ tyson.getWeight()+ " kg"+
                ", si are culoarea "+ tyson.getColor()+
                " Activitatea favorita este "+ tyson.getRecreationActivity()+
                " Mancarea favorita este "+ tyson.getFavoriteFood()+
                " Are indicele de sanatate "+ tyson.getHealth()+
                " Indicele starii de spirit este de "+ tyson.getStateOfMind()

        );


        System.out.println("Pe fetita mea o cheama "+ ana.getName()+
                ", si are varsta de "+ ana.getAge()+ " ani"+
                ", si are culoarea parului "+ ana.getHaircolor()+
                ", si are la dispozitie "+ ana.getMoneyavailable()+ " lei pentru a adopta un catelus"

        );

        System.out.println("Pe medicul veterinar il cheama "+ dr.getName()+
                ", si are varsta de "+ dr.getAge()+ " ani"+
                ", si are specializarea de medic "+ dr.getSpecialization()

        );

    }

     Labrador rex = new Labrador();
     rex.

}
