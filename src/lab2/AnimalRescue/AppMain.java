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



}
